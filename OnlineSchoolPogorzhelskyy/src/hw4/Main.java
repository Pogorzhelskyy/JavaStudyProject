package hw4;

import hw4.models.Lection;
import hw4.models.Course;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        char selector = ' ';
        System.out.println("New Online School");
        Course course1 = new Course(1);
        /*Lection [] lection = new Lection[20];
        do {
            System.out.println("Please select object to create");
            System.out.println("(c)ourse");
            System.out.println("(l)ection");
            System.out.println("(s)tudent");
            System.out.println("(t)eacher");
            System.out.println("(e)xit");
            Scanner scaner = new Scanner(System.in);
            selector = scaner.next().charAt(0);
            switch (selector) {
                case 'c':
                    break;
                case 'l':
                    Lection lection[lection.counter] = new Lection(2);
                    break;
                case 's':
                    break;
                case 't':
                    break;
            }
        } while (selector != 'e');*/

        /*Lection lection1 = new Lection(1);
        Lection lection2 = new Lection(2);
        Lection lection3 = new Lection(3);
        Lection lection4 = new Lection(4);
        Lection lection5 = new Lection(5); */

        System.out.println("Total created " + Lection.counter + " lection(s)");
    }
}