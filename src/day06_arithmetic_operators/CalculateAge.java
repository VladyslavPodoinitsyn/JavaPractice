package day06_arithmetic_operators;

public class CalculateAge {
    public static void main(String[] args){
        int yearOfBirth = 2001;
        int currentYear = 2022;
        int age = currentYear - yearOfBirth;
        System.out.println("You are " + age + " years old.");
    }
}
