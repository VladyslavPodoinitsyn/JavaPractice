package day24_loops;

import java.util.*;

public class PinCodeDoWhile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int secretPin = 1234;
        int pinCode;

        do {
            System.out.println("Enter the PinCode:");
            pinCode = scan.nextInt();
        } while (pinCode != secretPin);

        System.out.println("Welcome to your account");
    }
}
