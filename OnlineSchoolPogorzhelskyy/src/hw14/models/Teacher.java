package hw14.models;

public class Teacher extends Model {

    private static int counter = 0;

    public Teacher (int id) {
        setId(id);
        counter ++;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Teacher.counter = counter;
    }

    @Override
    public String toString() {
        return "Teacher ID " + getId();
    }
}
