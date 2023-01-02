package hw11.models;

import java.util.Arrays;

public class PersonReposit {

    public static Person[] person = new Person[5];

    public static void add(Person instance) {
        if (Person.getCounter() == (person.length - 1))
            person = Arrays.copyOf(person, (person.length * 3 / 2) + 1);
        person[Person.getCounter()-1] = instance;
    }
    public static void list() {
        for (Person i : person) {
            if (i != null) System.out.println(i);
        }
    }

    public static Person[] getAll() {
        return person;
    }

    public static Person getById(int id) {
        for (Person i : person) {
            if (i != null && i.getId() == id) return i;
        }
        return null;
    }

    public static void deleteById(int id){
        int j = 0;
        for (Person i : person) {
            if (i != null && i.getId() == id) {
                person[j] = person[Person.getCounter()];
                person[Person.getCounter()] = null;
                Person.setCounter(Person
                        .getCounter()-1);
                return;
            }
            j++;
        }
    }
}
