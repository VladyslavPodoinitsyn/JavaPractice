package day09_scanner_practice;
import java.util.Scanner;
public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter hourly rate:");
        double hourlyPay = scan.nextDouble();
        double weeklyPay = hourlyPay * 40;
        double monthlyPay = weeklyPay * 52 / 12;
        double annualPay = monthlyPay * 12;

        System.out.println("Weekly Pay: " + weeklyPay);
        System.out.println("Monthly Pay: " + monthlyPay);
        System.out.println("Annual Pay: " + annualPay);
    }
}
