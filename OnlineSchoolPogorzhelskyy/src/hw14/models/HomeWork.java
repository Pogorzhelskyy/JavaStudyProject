package hw14.models;

public class HomeWork extends Model {

    private static int counter = 0;
    private String task;
    private int lectionId;

    public HomeWork (int id, String task) {
        setId(id);
        this.task = task;
        counter ++;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        HomeWork.counter = counter;
    }

    public int getLectionId() {
        return lectionId;
    }

    public void setLectionId(int lectionId) {
        this.lectionId = lectionId;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }
}
