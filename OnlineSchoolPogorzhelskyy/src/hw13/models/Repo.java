package hw13.models;


import java.util.Arrays;

public class Repo<E extends Model> {
    private E[] entity;

    public Repo(E[] entity) {
        this.entity = entity;
    }

    public int size() {
        return entity.length;
    }

    public boolean isEmpty() {
        for (E e : entity) {
            if (e != null) return false;
        }
        return true;
    }

    public void add(E instance) {
        //     if (E.getCounter() == (entity.length - 1))
        //         entity = Arrays.copyOf(entity, (entity.length * 3 / 2) + 1);
        //     entity[E.getCounter()-1] = instance;
        int i = 0;
        while (i < entity.length) {
            if (entity[i] == null) {
                entity[i] = instance;
                return;
            }
            i++;
        }
        entity = Arrays.copyOf(entity, (entity.length * 3 / 2) + 1);
        entity[i] = instance;
    }

    public void add(int index, E instance) {
        entity[index] = instance;
    }

    public void list() {
        for (E i : entity) {
            if (i != null) System.out.println(i);
        }
    }

    public E[] getAll() {
        return entity;
    }

    public E get(int index) {
        return entity[index];
    }

    public E getById(int id) {
        for (E i : entity) {
            if (i != null && i.getId() == id) return i;
        }
        return null;
    }

    public void deleteById(int id) {
        int j = 0;
        int aimIndex = 0;
        int lastIndex = 0;
        for (E i : entity) {
            if (i != null && i.getId() == id) {
                aimIndex = j;
                /*entity[j] = entity[E.getCounter()];
                entity[E.getCounter()] = null;
                E.setCounter(E.getCounter() - 1);
                return; */
            }
            if (i != null) lastIndex = j;
            j++;
        }
        entity[aimIndex] = entity[lastIndex];
        entity[lastIndex] = null;
    }
}
