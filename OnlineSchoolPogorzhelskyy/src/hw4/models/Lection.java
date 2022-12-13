package hw4.models;

public class Lection {
    private int id;
    public static int counter;

    public Lection (int id) {
        this.id = id;
        counter ++;
    }
}
