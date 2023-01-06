package hw12.models;

public class Course extends Model {
    private static int counter = 0;

    public Course(int id) {
        setId(id);
        counter ++;;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Course.counter = counter;
    }

    @Override
    public String toString() {
        return "ID " + getId();
    }
}
