package hw10.servises;

import hw10.models.Lection;
import hw10.models.LectionReposit;

import java.util.Scanner;

public class LectionServ {
    public static void create(int courseId) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Please enter the lection ID for course " + courseId + " or e to exit");
            String selector = scanner.next();
            if (selector.charAt(0) == 'e') break;
            int lectionId = Integer.parseInt(selector);
          //  LectionReposit.sizeCheck();
          //  LectionReposit.model[Lection.getCounter()] = new Lection(lectionId, courseId);
            LectionReposit.add(new Lection(lectionId, courseId));
        }
    }

    public static void initialCreate(int courseId) {
        for (int i = 0; i < 3; i++) {
            LectionReposit.model[i] = new Lection(i, 1);
        }
    }

    public static void list() {
        System.out.println("LectionID   CourseID");
        for (int i = 0; i < Lection.getCounter(); i++) {
            System.out.println(LectionReposit.model[i].getId() +
                    "           " /*+ LectionReposit.model[i].getCourseId()*/);
        }
    }
    public static void delete(){
        System.out.println("Type lection ID to delete");
        Scanner scanner = new Scanner(System.in);
        int id = scanner.nextInt();
        LectionReposit.deleteById(id);
    }
}
