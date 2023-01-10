package hw14;

import hw14.models.HomeWork;
import hw14.models.Lection;
import hw14.models.Repo;
import hw14.servises.CouseServ;
import hw14.servises.LectionServ;
import hw14.servises.PersonServ;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        char selector = ' ';
        Scanner scanner = new Scanner(System.in);
        Repo homeWorkRepo = new Repo<>(new HomeWork[5]);
        CouseServ.initialCreate();
        PersonServ.initialCreate(0);
        LectionServ.initialCreate(0);

        HomeWork homeWork = new HomeWork(0, "Do something useful");  //new homework
        homeWork.setLectionId(1);
        homeWorkRepo.add(homeWork);  //add homework to general repo
        LectionServ.getLectionRepo().getById(1).addHomeWork(homeWork); //add homework to lection 1

      /*  PersonServ.addName(PersonServ.getPersonRepo().getById(0));
        PersonServ.addLastname(PersonServ.getPersonRepo().getById(0));
        PersonServ.addEmail(PersonServ.getPersonRepo().getById(0));
        PersonServ.addPhone(PersonServ.getPersonRepo().getById(0));
        System.out.println(PersonServ.getPersonRepo().getById(0) + " " +
                PersonServ.getPersonRepo().getById(0).getName() + " " +
                PersonServ.getPersonRepo().getById(0).getLastname() + " " +
                PersonServ.getPersonRepo().getById(0).getPhone() + " " +
                PersonServ.getPersonRepo().getById(0).getEmail());*/

        System.out.println("New Online School");
        System.out.println(LectionServ.getLectionRepo().getById(1));
        System.out.println("Homeworks for lectio ID 1 are:");
        LectionServ.getLectionRepo().getById(1).printHomeWork();
        LectionServ.getLectionRepo().list();

        do {
            System.out.println("Please select object to create");
            System.out.println("(c)ourse");
            System.out.println("(l)ection");
            System.out.println("(s)tudent");
            System.out.println("(t)eacher");
            System.out.println("(p)rint all lections");
            System.out.println("(d)elete lection");
            System.out.println("(e)xit");
            selector = scanner.next().charAt(0);
            switch (selector) {
                case 'c':
                    break;
                case 'l':
                    System.out.println("New lection(s) creation");
                    System.out.println("Please enter the course ID");
                    int courseId = scanner.nextInt();
                    LectionServ.create(courseId);
                    System.out.println("Total created " + Lection.getCounter() + " lection(s)");
                    break;
                case 's':
                    break;
                case 't':
                    break;
                case 'p':
                    LectionServ.getLectionRepo().list();
                    System.out.println("Counter" + Lection.getCounter());
                    break;
                case 'd':
                    LectionServ.delete();
                    break;
                case 'e':
                    System.out.println("Program terminated user reason");
                    break;
                default:
                    System.out.println("Incorrect enter. Please try again");
                    break;
            }
        } while (selector != 'e');
    }
}