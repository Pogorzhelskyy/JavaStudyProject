package hw13.models;

import java.util.Arrays;

public class StudentReposit {
    private static Student[] student = new Student[5];

    public static void add(Student instance) {
        if (Student.getCounter() == (student.length - 1))
            student = Arrays.copyOf(student, (student.length * 3 / 2) + 1);
        student[Student.getCounter()-1] = instance;
    }

    public static void list() {
        for (Student i : student) {
            if (i != null) System.out.println(i);
        }
    }

    public static Student[] getAll() {
        return student;
    }

    public static Student getById(int id) {
        for (Student i : student) {
            if (i.getId() == id) return i;
        }
        return null;
    }

    public static void deleteById(int id){
        int j = 0;
        for (Student i : student) {
            if (i.getId() == id) {
                student[j] = student[Student.getCounter()];
                student[Student.getCounter()] = null;
                Student.setCounter(Student.getCounter()-1);
                return;
            }
            j++;
        }
    }


}
