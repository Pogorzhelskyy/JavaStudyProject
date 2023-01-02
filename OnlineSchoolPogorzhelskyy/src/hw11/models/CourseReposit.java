package hw11.models;

import java.util.Arrays;

public class CourseReposit extends Repository {
    private static Course[] course = new Course[10];

    public static void add(Course instance) {
        if (Course.getCounter() == (course.length - 1))
            course = Arrays.copyOf(course, (course.length * 3 / 2) + 1);
        course[Course.getCounter()-1] = instance;
    }

    public static void list() {
        for (Course i : course) {
            if (i != null) System.out.println(i);
        }
    }

    public static Course[] getAll() {
        return course;
    }

    public static Course getById(int id) {
        for (Course i : course) {
            if (i != null && i.getId() == id) return i;
        }
        return null;
    }

    public static void deleteById(int id){
        int j = 0;
        for (Course i : course) {
            if (i != null && i.getId() == id) {
                course[j] = course[Course.getCounter()];
                course[Course.getCounter()] = null;
                Course.setCounter(Course.getCounter()-1);
                return;
            }
            j++;
        }
    }
}
