package day13_conditional_stetements;

import java.util.Scanner;

public class NiceDayOrNot {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("What is the outside temperature today?");
        int temp = scan.nextInt();

        if (temp >= 70) {
            System.out.println("It is a beautiful day!");
        } else {
            System.out.println("It is kind of cold today.");
        }

    }
}
