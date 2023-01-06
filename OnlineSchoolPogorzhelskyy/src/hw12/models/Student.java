package hw12.models;

public class Student extends Model {

    private static int counter = 0;

    public Student (int id) {
        setId(id);
        counter ++;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Student.counter = counter;
    }

    @Override
    public String toString() {
        return "Student ID " + getId();
    }
}
