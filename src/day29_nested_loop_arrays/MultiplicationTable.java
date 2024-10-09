package day29_nested_loop_arrays;

public class MultiplicationTable {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int n = 1; n <= 10; n++) {
                System.out.print(i * n + "\t");
            }
            System.out.println();
        }
    }
}
