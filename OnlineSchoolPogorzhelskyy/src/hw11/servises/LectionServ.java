package hw11.servises;

import hw11.models.Lection;
import hw11.models.LectionReposit;

import java.util.Scanner;

public class LectionServ {

    public static void create(int courseId) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Please enter the lection ID for course " + courseId + " or e to exit");
            String selector = scanner.next();
            if (selector.charAt(0) == 'e') break;
            int lectionId = Integer.parseInt(selector);
            LectionReposit.add(new Lection(lectionId, courseId));
        }
    }

    public static void initialCreate(int courseId) {
        for (int i = 0; i < 3; i++) {
            LectionReposit.add(new Lection( i, courseId, 0));
        }
    }

    public static void delete(){
        System.out.println("Type lection ID to delete");
        Scanner scanner = new Scanner(System.in);
        int id = scanner.nextInt();
        LectionReposit.deleteById(id);
    }
}
