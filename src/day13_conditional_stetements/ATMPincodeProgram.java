package day13_conditional_stetements;

import java.util.Scanner;

public class ATMPincodeProgram {
    public static void main(String[] args) {
        System.out.println("Welcome to NAME Bank ATM");
        System.out.println("To log in enter your pincode.");
        int secret = 2233;
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();


        if (secret == input) {
            System.out.println("Welcome to your account!");
            System.out.println("You can withdraw, Check Balance, Deposit.");
        } else {
            System.out.println("Incorred pincode! Please try again.");
        }
    }
}
