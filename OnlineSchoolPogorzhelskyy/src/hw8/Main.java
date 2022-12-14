package hw8;

import hw8.models.Course;
import hw8.models.Lection;
import hw8.servises.LectionServ;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        char selector = ' ';
        //int lectionCounter = 0;
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
                    lection[Lection.counter] = LectionServ.create();
                    System.out.println("Total created " + Lection.counter + " lection(s)");
                    if (Lection.counter >= 8) {
                        System.out.println("Program terminated because of 8 lections created");
                        System.exit(0);
                    }
                    break;
                case 's':
                    break;
                case 't':
                    break;
                case 'e':
                    System.out.println("Program terminated user reason");
                    break;
                default:
                    System.out.println("Incorrect enter. Please try again");
                    break;
            }
        } while (selector != 'e');
    }
}