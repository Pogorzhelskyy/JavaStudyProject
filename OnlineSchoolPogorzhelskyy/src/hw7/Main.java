package hw7;

import hw7.models.Course;
import hw7.models.Lection;
import hw7.servises.LectionServ;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        char selector = ' ';
        int lectionCounter = 0;
        Scanner scanner = new Scanner(System.in);
        Course course1 = new Course(1);
        System.out.println("New Online School");

        Lection[] lection = new Lection[20];
        do {
            System.out.println("Please select object to create");
            System.out.println("(c)ourse");
            System.out.println("(l)ection");
            System.out.println("(s)tudent");
            System.out.println("(t)eacher");
            System.out.println("(e)xit");
            selector = scanner.next().charAt(0);
            switch (selector) {
                case 'c':
                    break;
                case 'l':
                    lection[lectionCounter++] = LectionServ.create();
                    System.out.println("Total created " + Lection.counter + " lection(s)");
                    break;
                case 's':
                    break;
                case 't':
                    break;
            }
        } while (selector != 'e');
    }
}