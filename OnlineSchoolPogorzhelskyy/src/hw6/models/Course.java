package hw6.models;

public class Course {
    private int id;
    public static int counter;

    public int getId() {
        return id;
    }

    public Course (int id) {
        this.id = id;
        counter ++;
    }
}
