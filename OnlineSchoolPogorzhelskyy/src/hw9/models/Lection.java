package hw9.models;

public class Lection {
    private int id;
    public int courseId;
    public static int counter = 0;

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
