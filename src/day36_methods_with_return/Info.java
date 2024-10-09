package day36_methods_with_return;

import java.util.*;

public class Info {
    public static void main(String[] args) {
        System.out.println("Name: " + fullName());
        System.out.println("Married: " + isMarried());
        System.out.println("Age: " + getAge());
        System.out.println("Year: " + getRandomYear());

        String name = fullName();
        boolean married = isMarried();
        int age = getAge();
        int year = getRandomYear();
        System.out.println("name = " + name);
        System.out.println("married = " + married);
        System.out.println("age = " + age);
        System.out.println("year = " + year);
    }

    public static String fullName() {
        return "Mike Smith";
    }

    public static boolean isMarried() {
        return false;
    }

    public static int getAge() {
        return 35;
    }

    public static int getRandomYear() {
        Random random = new Random();
        int randomYear = random.nextInt(2024);
        return randomYear;
    }
}
