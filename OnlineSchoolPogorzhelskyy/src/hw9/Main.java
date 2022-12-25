package hw9;

import hw9.models.Course;
import hw9.models.CourseReposit;
import hw9.models.Lection;
import hw9.servises.LectionServ;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        char selector = ' ';
        Scanner scanner = new Scanner(System.in);
        CourseReposit.course[0] = new Course(10);
        LectionServ.initialCreate(1);
        System.out.println("New Online School");

        do {
            System.out.println("Please select object to create");
            System.out.println("(c)ourse");
            System.out.println("(l)ection");
            System.out.println("(s)tudent");
            System.out.println("(t)eacher");
            System.out.println("(p)rint all lections");
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
                    System.out.println("Total created " + Lection.counter + " lection(s)");
                    if (Lection.counter >= 8) {
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
                    LectionServ.list();
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