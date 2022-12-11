package models;

public class HomeWork {
    private int id;
    public static int counter;

    public HomeWork (int id) {
        this.id = id;
        counter ++;
    }
}
