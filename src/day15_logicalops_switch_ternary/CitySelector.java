package day15_logicalops_switch_ternary;

public class CitySelector {
    public static void main(String[] args) {
        String city = "Tampa";
        if (city.equals("LA") || city.equals("Tampa")) {
            System.out.println("Willing to relocate to " + city);
        } else {
            System.out.println("Not considering - " + city);
        }

        String teacher = "Nadir";

        if (teacher.equals("Saim") || teacher.equals("Murodil")) {
            System.out.println("It's a java class with " + teacher);
        } else {
            System.out.println("Soft skill class with " + teacher);
        }

        String company = "Google";
        double salary = 85_000.0;

        if (company.equals("Google") || salary >= 100_000) {
            System.out.println("Accept offer from " + company);
        } else {
            System.out.println("Reject offer from " + company);
        }

        if (company.equals("Google") && salary >= 100_000) {
            System.out.println("Accept offer from " + company);
        } else {
            System.out.println("Reject offer from " + company);
        }
    }
}
