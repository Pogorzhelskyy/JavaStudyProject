package hw11.models;

import java.util.Arrays;
import hw11.models.Lection;

public class LectionReposit extends Repository {
    private static Lection[] lection = new Lection[5];

    public static void add(Lection instance) {
        if (Lection.getCounter() == (lection.length - 1))
            lection = Arrays.copyOf(lection, (lection.length * 3 / 2) + 1);
        lection[Lection.getCounter()-1] = instance;
    }
    public static void list() {
        for (Lection i : lection) {
            if (i != null) System.out.println(i);
        }
    }

    public static Lection [] getAll() {
        return lection;
    }

    public static Lection getById(int id) {
        for (Lection i : lection) {
            if (i != null && i.getId() == id) return i;
        }
    //    return null;
        return lection[0];
    }

    public static void deleteById(int id){
        int j = 0;
        for (Lection i : lection) {
            if (i != null && i.getId() == id) {
                lection[j] = lection[Lection.getCounter()];
                lection[Lection.getCounter()] = null;
                Lection.setCounter(Lection.getCounter()-1);
                return;
            }
            j++;
        }
    }

}
