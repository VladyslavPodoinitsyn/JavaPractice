package day13_conditional_stetements;

public class BonusCalculator {
    public static void main(String[] args) {
        double bonus = 0;
        double salesAmount = 2000.55;

        if (salesAmount <= 1000) {
            System.out.println("Good job, you qualified for Bonus!");
            bonus = 50.0;
        } else {
            System.out.println("Great job, you qualified for Gull Bonus!");
            bonus = 100.0;
        }
        System.out.println("Your Bonus is: $" + bonus);
    }
}
