package hw6;

import hw6.models.Course;
import hw6.models.Lection;

public class Main {
    public static void main(String[] args) {
        System.out.println("New Online School");

        Course course1 = new Course(1);
        Lection lection1 = new Lection(1, course1.getId());
        Lection lection2 = new Lection(2, course1.getId());
        Lection lection3 = new Lection(3, course1.getId());
        Lection lection4 = new Lection(4, course1.getId());
        Lection lection5 = new Lection(5, course1.getId());
        Lection lection6 = new Lection(6, course1.getId());
        System.out.println("Lection " + lection6.getId() + " created in course " + lection6.courseId);
        System.out.println("Total created " + Lection.counter + " lection(s) in course " + course1.getId());
    }
}