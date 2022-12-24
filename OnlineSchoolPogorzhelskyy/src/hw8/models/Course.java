package hw8.models;

public class Course {
    public int id;
    public static int counter;

    public int getId() {
        return id;
    }

    public Course(int id) {
        this.id = id;
        counter++;
    }
}
