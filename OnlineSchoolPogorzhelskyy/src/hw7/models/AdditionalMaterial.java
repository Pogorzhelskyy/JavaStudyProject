package hw7.models;

public class AdditionalMaterial {
    private int id;
    public static int counter;

    public AdditionalMaterial (int id) {
        this.id = id;
        counter ++;
    }
}
