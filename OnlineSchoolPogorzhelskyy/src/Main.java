import models.Lection;

public class Main {
    public static void main(String[] args) {
        System.out.println("New Online School");
        Lection lection1 = new Lection(1);
        Lection lection2 = new Lection(2);
        Lection lection3 = new Lection(3);
        System.out.println("Total created " + Lection.counter + " lection(s)");
    }
}