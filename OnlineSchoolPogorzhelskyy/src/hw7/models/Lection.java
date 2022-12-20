package hw7.models;

public class Lection {
    private int id;
    public int courseId;
    public static int counter;

    public int getId() {
        return id;
    }

    public Lection(int id, int courseId) {
        this.id = id;
        this.courseId = courseId;
        counter++;
    }

    public Lection(int id) {
        this.id = id;
        counter++;
    }
}
