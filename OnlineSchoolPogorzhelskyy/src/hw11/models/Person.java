package hw11.models;

public class Person extends Model {
    private static int counter = 0;
    private int courseId;
    private Role role;

    public Person(int id, Role role, int courseId) {
        setId(id);
        this.role = role;
        this.courseId = courseId;
        counter++;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public static int getCounter() {

        return counter;
    }

    public static void setCounter(int counter) {

        Person.counter = counter;
    }

    @Override
    public String toString() {
        return "Person ID " + getId() + " " + role;
    }
}
