package day24_loops;

import java.sql.SQLOutput;
import java.util.*;

public class CountUntil {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number to count until: ");
        int number = scan.nextInt();

        int count = 0;
        while(count <= number) {
            System.out.print(count + " ");
            count++;
        }
    }
}
