package day24_loops;

import java.util.*;

public class GiveMe5$ {
    public static void main(String[] args) {
        System.out.println("Give me 5 dollars");

        Scanner scan = new Scanner(System.in);

        int dollar = scan.nextInt();
        while (dollar != 5) {
            System.out.println("You gave - $" + dollar);
            dollar = scan.nextInt();
        }
        System.out.println("Thank you for 5 dollars");
    }
}
