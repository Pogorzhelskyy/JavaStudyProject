package hw10;

import hw10.models.*;
import hw10.servises.LectionServ;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        char selector = ' ';
        Scanner scanner = new Scanner(System.in);
        //CourseReposit.course[0] = new Course(10);
        LectionServ.initialCreate(1);
        CourseReposit.model[0] = new Course( 1);
        System.out.println("New Online School");
       // LectionReposit.list();
        CourseReposit.list();

        do {
            System.out.println("Please select object to create");
            System.out.println("(c)ourse");
            System.out.println("(l)ection");
            System.out.println("(s)tudent");
            System.out.println("(t)eacher");
            System.out.println("(p)rint all lections");
            System.out.println("(d)elete lection");
            System.out.println("(e)xit");
            selector = scanner.next().charAt(0);
            switch (selector) {
                case 'c':
                    break;
                case 'l':
                    System.out.println("New lection(s) creation");
                    System.out.println("Please enter the course ID");
                    int courseId = scanner.nextInt();
                    LectionServ.create(courseId);
                    System.out.println("Total created " + Lection.getCounter() + " lection(s)");
                    if (Lection.getCounter() >= 8) {
                        System.out.println("Program terminated because of 8 lections created");
                        System.exit(0);
                        // module have no sense, for study only
                        // will be deleted
                        // this reason no replaced to create method
                    }
                    break;
                case 's':
                    break;
                case 't':
                    break;
                case 'p':
                    LectionReposit.list();
                    System.out.println("Counter" + Lection.getCounter());
                    break;
                case 'd':
                    LectionServ.delete();
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