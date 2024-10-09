package day25_loops;

import java.util.*;

public class StartEnd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int start = scan.nextInt();
        int end = scan.nextInt();

        if(start > end) {
            System.out.println("reverse numbering is not supported");
        } else {
            for (int i = start; i <= end; i++) {
                System.out.print(i + " ");
            }
        }
    }
}
