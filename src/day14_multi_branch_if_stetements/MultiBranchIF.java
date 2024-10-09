package day14_multi_branch_if_stetements;

import java.util.Scanner;

public class MultiBranchIF {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What day is today? (1,2,3, etc.) ");
        int day = scan.nextInt();
        if (day == 1) {
            System.out.println("It's Monday");
        } else if (day == 2) {
            System.out.println("It's Tuesday");
        } else if (day == 3) {
            System.out.println("It's Wednesday");
        } else {
            System.out.println("Java day");
        }
    }
}
