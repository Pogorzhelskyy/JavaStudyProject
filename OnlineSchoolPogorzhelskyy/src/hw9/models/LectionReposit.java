package hw9.models;

import java.util.Arrays;

public class LectionReposit {
    public static Lection[] lection = new Lection[5];

    public static void sizeCheck() {
        if (Lection.counter == (lection.length - 1)) lection = Arrays.copyOf(lection, (lection.length * 3 / 2) + 1);
    }
}
