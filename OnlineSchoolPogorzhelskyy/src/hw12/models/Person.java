package hw12.models;

public class Person extends Model {
    private static int counter = 0;
    private String lastname;
    private String phone;
    private String email;
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

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person ID " + getId() + " " + role;
    }
}
