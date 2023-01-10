package hw14.servises;

import hw14.models.Lection;
import hw14.models.Repo;

import java.util.Scanner;

public class LectionServ {
    private static Repo<Lection> lectionRepo;

    public static void create(int courseId) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Please enter the lection ID for course " + courseId + " or e to exit");
            String selector = scanner.next();
            if (selector.charAt(0) == 'e') break;
            int lectionId = Integer.parseInt(selector);
            lectionRepo.add(new Lection(lectionId, courseId));
        }
    }

    public static void initialCreate(int courseId) {
        lectionRepo = new Repo<>(new Lection[5]);
        for (int i = 0; i < 3; i++) {
            lectionRepo.add(new Lection(i, courseId, 1));
        }
    }

    public static void delete() {
        System.out.println("Type lection ID to delete");
        Scanner scanner = new Scanner(System.in);
        int id = scanner.nextInt();
        lectionRepo.deleteById(id);
    }

    public static Repo<Lection> getLectionRepo() {
        return lectionRepo;
    }
}
