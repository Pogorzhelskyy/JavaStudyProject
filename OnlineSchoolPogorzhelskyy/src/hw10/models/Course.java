package hw10.models;

public class Course extends Model{
   // static int counter = 0;
    public Course(int id) {
        setId(id);
        setCounter(getCounter()+1);
    }

}
