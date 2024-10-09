package day30_arrays;

public class ArrayLoopWithConditions {
    public static void main(String[] args) {
        double[] prices = {22.9, 42.3, 42, 51.3, 432.4, 783.9, 985.0, 10.0, 70.0};

        String[] countries = {"Canada", "Japan", "Mexico", "Italy", "Australia", "Brazil", "India", "Germany", "South Africa", "Russia"};

        for (double eachprice : prices) {
            if (eachprice > 100.0) {
                System.out.println(eachprice);
            }
        }

        System.out.println("\n---- prices between 10 and 70 ----");

        for (double eachprice : prices) {
            if (eachprice >= 10 && eachprice <= 70) {
                System.out.print(eachprice + " ");
            }
        }

        System.out.println("\n---- count of prices that are more than 50 ----");

        int count = 0;

        for (double eachprice : prices) {
            if (eachprice > 50) {
                count++;
            }
        }
        System.out.println("count = " + count);

        System.out.println("\n---- countries with name length more than 7 - inclusive ----");

        for (String country : countries) {
            if (country.length() >= 7) {
                System.out.println(country);
            }
        }

    }
}
