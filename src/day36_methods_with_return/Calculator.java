package day36_methods_with_return;

public class Calculator {
    public static void main(String[] args) {
        System.out.println(add(32.5, 12.8));
        double sum = add(1, 3);
        System.out.println("sum = " + sum);

        System.out.println("minus = " + minus(13, 4));
        System.out.println("multiply = " + multiply(5, 9));
        System.out.println("divide = " + divide(98, 22));
    }

    public static double add(double num1, double num2) {
        double sum = num1 + num2;
        return sum;
    }

    public static double minus(double num1, double num2) {
        double minus = num1 - num2;
        return minus;
    }

    public static double multiply(double num1, double num2) {
        double result = num1 * num2;
        return result;
    }

    public static double divide(double num1, double num2) {
        double divide = num1 / num2;
        return divide;
    }
}
