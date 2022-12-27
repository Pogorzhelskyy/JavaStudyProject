package hw10.models;

public class Lection extends Model{


    private int courseId;

    public Lection(int id, int courseId) {
        setId(id);
        this.courseId = courseId;
        setCounter(getCounter()+1);
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }


    @Override
    public String toString() {
        return "ID " + getId() + "   Course ID " + getCourseId();
    }
}
