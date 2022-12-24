package hw9.servises;

import hw9.models.Lection;
import hw9.models.LectionReposit;

import java.util.Scanner;

public class LectionServ {
    public static void create(int courseId) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Please enter the lection ID for course " + courseId + " or e to exit");
            String selector = scanner.next();
            if (selector.charAt(0) == 'e') break;
            int lectionId = Integer.parseInt(selector);
            LectionReposit.sizeCheck();
            LectionReposit.lection[Lection.counter] = new Lection(lectionId, courseId);
        }
        // return new Lection(lectionId, courseId);


    }

    public static void initialCreate(int courseId) {
        for (int i = 0; i < 3; i++) {
            LectionReposit.lection[i] = new Lection(i, 1);
        }
    }
}
