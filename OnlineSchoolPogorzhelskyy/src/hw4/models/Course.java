package hw4.models;

public class Course {
    private int id;
    public static int counter;

    public Course (int id) {
        this.id = id;
        counter ++;
    }
}
