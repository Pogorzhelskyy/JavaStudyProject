package hw12.models;

public class Lection extends Model {

    private static int counter = 0;
    private int courseId;
    private String description;
    private int personId;

    public Lection(int id, int courseId) {
        setId(id);
        this.courseId = courseId;
        counter++;
        /* setCounter(getCounter()+1); */
    }

    public Lection(int id, int courseId, int personId) {  //JUST FOR HW11
        setId(id);
        this.courseId = courseId;
        counter++;
        this.personId = personId;
    }

    public int getCourseId() {

        return courseId;
    }

    public void setCourseId(int courseId) {

        this.courseId = courseId;
    }

    public static int getCounter() {

        return counter;
    }

    public static void setCounter(int counter) {

        Lection.counter = counter;
    }

    public int getPersonId() {

        return personId;
    }

    public void setPersonId(int personId) {

        this.personId = personId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {

        return "Lection ID " + getId() + "  Course ID " + getCourseId() +
                " " + PersonReposit.getById(getPersonId());
    }
}
