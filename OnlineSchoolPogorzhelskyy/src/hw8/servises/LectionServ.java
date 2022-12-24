package hw8.servises;

import hw8.models.Lection;

import java.util.Scanner;

public class LectionServ {
    public static Lection create() {
        System.out.println("New lection creation");
        System.out.println("Please enter the course ID");
        Scanner scanner = new Scanner(System.in);
        int courseId = scanner.nextInt();
        System.out.println("Please enter the lection ID for course " + courseId);
        int lectionId = scanner.nextInt();
        return new Lection(lectionId, courseId);
    }
}
