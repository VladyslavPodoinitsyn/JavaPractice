package day12_conditional_statements;

import java.util.Scanner;

public class AmazonShipping {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your price:");
        double total = scan.nextDouble();

        if (total >= 25.0) {
            System.out.println("Free shipping eligible. Your order total: $" + total);
        } else {
            System.out.println("Not eligible for free shipping eligible. Your order total: $" + total);
        }
    }
}
