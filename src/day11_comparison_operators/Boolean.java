package day11_comparison_operators;

public class Boolean {
    public static void main(String[] args) {
        System.out.println(10 == 10);
        System.out.println(100>10);
        System.out.println(985.44 < 999);
        System.out.println(5 >= 3);
        System.out.println(3 <= 5);
        System.out.println(1 != 3);

        boolean result = 5 == 5;
        System.out.println("result = " + result);

        result = 33 > 44;
        System.out.println("result = " + result);

        result = 33 < 44;
        System.out.println("result = " + result);

        result = 33 != 44;
        System.out.println("result = " + result);

        result = 100 >= 44;
        System.out.println("result = " + result);

        result = 48 <= 53;
        System.out.println("result = " + result);

        String name = "Vlad";
        boolean checkname = name == "Vlad";
        System.out.println("checkname = " + checkname);

        checkname = name != "Nate";
        System.out.println("checkname = " + checkname);

        int n1 = 5;
        int n2 = 3;
        
        boolean check = n1 == n2;
        System.out.println("check = " + check);
//        Can use ==, >, <, etc. on mostly everything
        int num1 = 12_000_000;
        int num2 = 12000000;
        boolean check2 = num1 == num2;
        System.out.println("check2 = " + check2);
    }
}
