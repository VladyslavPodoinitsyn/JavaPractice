package day36_methods_with_return;

public class CreditScore {
    public static void main(String[] args) {
        checkEligible(700);
        checkEligible(800);
        checkEligible(566);
        //System.out.println(checkEligible(711));
        System.out.println(getCreditScore());
        System.out.println("CreditScore = " + getCreditScore());
    }

    public static void checkEligible(int creditScore) {
        if (creditScore >= 700) {
            System.out.println("You are eligible for leasing a car");
        } else {
            System.out.println("Sorry, you are not eligible for leasing a car");
        }
    }

    public static int getCreditScore() {
        return 800;
    }
}
