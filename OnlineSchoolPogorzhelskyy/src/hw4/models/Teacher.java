package hw4.models;

public class Teacher {
    private int id;
    public static int counter;

    public Teacher (int id) {
        this.id = id;
        counter ++;
    }
}
