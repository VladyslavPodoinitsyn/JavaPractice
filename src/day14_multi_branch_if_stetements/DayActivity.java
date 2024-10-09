package day14_multi_branch_if_stetements;

public class DayActivity {
    public static void main(String[] args) {
        String weather = "sunny";

        if (weather.equals("sunny")) {
            System.out.println("Go outside");
        } else if (weather.equals("rainy")) {
            System.out.println("Stay home");
        } else if (weather.equals("snowy")) {
            System.out.println("Go snowboard");
        } else {
            System.out.println("Keep coding Java");
        }
    }
}
