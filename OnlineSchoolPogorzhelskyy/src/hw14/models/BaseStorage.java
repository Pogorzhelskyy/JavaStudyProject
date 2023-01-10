package hw14.models;

public interface BaseStorage <E extends Model> {
    void add(E instance);
    void list();
    E getById(int id);
    void deleteById(int id);
}
