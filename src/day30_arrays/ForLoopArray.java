package day30_arrays;

public class ForLoopArray {
    public static void main(String[] args) {
        int[] data = {32, 542, 124, 563, 67, 32, 465, 45, 789, 54};

        for (int i : data) {
            System.out.println(i);
        }

        System.out.println();

        for (int n : data) {
            System.out.print(n + " ");
        }
        System.out.println();

        System.out.println();
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i]);
        }

        System.out.println("last value: " + data[data.length - 1]);

        for (int i = data.length - 1; i >= 0; i--) {
            System.out.print(data[i] + " ");
        }
    }
}
