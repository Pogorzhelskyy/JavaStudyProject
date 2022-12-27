package hw10.models;

import java.util.Arrays;

public class Repository {
    public static Model[] model = new Model[5];

    public static void add(Model instance) {
        if (Model.getCounter() == (model.length - 1))
            model = Arrays.copyOf(model, (model.length * 3 / 2) + 1);
        model[Model.getCounter()] = instance;
    }

    public static void list() {
        for (Model i : model) {
            if (i != null) System.out.println(i);
        }
    }

    public Model[] getAll() {
        return model;
    }

    public static Model getById(int id) {
        for (Model i : model) {
            if (i.getId() == id) return i;
        }
        return null;
    }

    public static void deleteById(int id){
        int j = 0;
        for (Model i : model) {
            if (i.getId() == id) {
                model[j] = model[Model.getCounter()];
                model[Model.getCounter()] = null;
                Model.setCounter(Model.getCounter()-1);
                return;
            }
            j++;
        }
    }
}
