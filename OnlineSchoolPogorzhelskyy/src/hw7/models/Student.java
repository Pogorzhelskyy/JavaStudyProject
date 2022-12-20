package hw7.models;

public class Student {
    private int id;
    public static int counter;

    public Student (int id) {
        this.id = id;
        counter ++;
    }
}
