package day10_shorthand_operators;

public class ChangeBalance {
    public static void main(String[] args) {
        double balance = 1200.44;
        System.out.println("balance = " + balance);

        double baklava = 22.50;
        System.out.println("baklava = " + baklava);
        balance = balance - baklava;
        System.out.println("remaining balance = " + balance);

        double kenafe = 44.45;
        System.out.println("kenafe = " + kenafe);
        balance = balance - kenafe;
        System.out.println("remaining balance = " + balance);

        kenafe = kenafe / 2;
        System.out.println("kenafe = " + kenafe);
        balance = balance - kenafe;
        System.out.println("remaining balance = " + balance);

        double plov = 7.99;
        System.out.println("plov = " + plov);
        balance = balance - plov;
        System.out.println("remaining balance = " + balance);

        double icedTea = 3.0;
        System.out.println("IcedTea = " + icedTea);
        balance = balance - (icedTea * 4);
        System.out.println("remaining balance = " + balance);

        balance = balance + baklava;
        System.out.println("remaining balance = " + balance);
    }
}
