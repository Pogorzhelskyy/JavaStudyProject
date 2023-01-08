package hw13.models;

import java.util.Arrays;

public class TeacherReposit {
    public static Teacher[] teacher = new Teacher[5];

    public static void add(Teacher instance) {
        if (Teacher.getCounter() == (teacher.length - 1))
            teacher = Arrays.copyOf(teacher, (teacher.length * 3 / 2) + 1);
        teacher[Teacher.getCounter()-1] = instance;
    }
    public static void list() {
        for (Teacher i : teacher) {
            if (i != null) System.out.println(i);
        }
    }

    public static Teacher[] getAll() {
        return teacher;
    }

    public static Teacher getById(int id) {
        for (Teacher i : teacher) {
            if (i.getId() == id) return i;
        }
        return null;
    }

    public static void deleteById(int id){
        int j = 0;
        for (Teacher i : teacher) {
            if (i.getId() == id) {
                teacher[j] = teacher[Teacher.getCounter()];
                teacher[Teacher.getCounter()] = null;
                Teacher.setCounter(Teacher.getCounter()-1);
                return;
            }
            j++;
        }
    }

}
