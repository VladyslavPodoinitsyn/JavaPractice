package day26_loops;

public class MultiplicationTable {
    public static void main(String[] args) {
        int num = 10;

        if (num < 1 || num > 10){
            System.out.println("ERROR: invalid input");
            return;
        }

        for(int i = 1;i <=10; i++){
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }
}
