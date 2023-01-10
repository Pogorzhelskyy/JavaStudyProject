package hw13.servises;

import hw13.models.Lection;
import hw13.models.Person;
import hw13.models.Repo;
import hw13.models.Role;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PersonServ {

    private static Repo<Person> personRepo;

    public static void initialCreate(int courseId) {
        personRepo = new Repo<>(new Person[5]);
        for (int i = 0; i < 2; i++) {
            personRepo.add(new Person(i, Role.TEACHER, courseId));
        }
    }

    public static void addName(Person person) {
        String regex = "^[A-Z][a-z]*(\\s(([a-z]{1,3})|(([a-z]+\\')?[A-Z][a-z]*)))*$";
        Pattern pattern = Pattern.compile(regex);
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter the First Name");
            String name = scanner.nextLine();
            Matcher matcher = pattern.matcher(name);
            if (matcher.matches()) {
                person.setName(name);
                break;
            }
        }
    }

    public static void addLastname(Person person) {
        String regex = "^[A-Z][a-z]*(\\s(([a-z]{1,3})|(([a-z]+\\')?[A-Z][a-z]*)))*$";
        Pattern pattern = Pattern.compile(regex);
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter the Last Name");
            String lastname = scanner.nextLine();
            Matcher matcher = pattern.matcher(lastname);
            if (matcher.matches()) {
                person.setLastname(lastname);
                break;
            }
        }
    }

    public static void addEmail(Person person) {
        String regex = "^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z0-9-.]+$";
        Pattern pattern = Pattern.compile(regex);
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter the e-mail");
            String email = scanner.nextLine();
            Matcher matcher = pattern.matcher(email);
            if (matcher.matches()) {
                person.setEmail(email);
                break;
            }
        }
    }

    public static void addPhone(Person person) {
        String regex = "^\\+\\d{7,}$";
        Pattern pattern = Pattern.compile(regex);
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter the phone number");
            String phone = scanner.nextLine();
            Matcher matcher = pattern.matcher(phone);
            if (matcher.matches()) {
                person.setPhone(phone);
                break;
            }
        }
    }

    public static Repo<Person> getPersonRepo() {
        return personRepo;
    }
}
