package day24_loops;

import java.util.*;

public class GuessTheNumberGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random randomNum = new Random();
        int guessingNumber = 0;
        int secretNumber = randomNum.nextInt(101);

        do {
            System.out.println("Guess the secret number");
            guessingNumber = scan.nextInt();

            if (guessingNumber > secretNumber) {
                System.out.println("Wrong, your number is too Large");
            } else if (guessingNumber < secretNumber) {
                System.out.println("Wrong, your number is too Small");
            }
        } while (secretNumber != guessingNumber);
        System.out.println("Congratulations, you won! secret number: " + secretNumber);
    }
}
