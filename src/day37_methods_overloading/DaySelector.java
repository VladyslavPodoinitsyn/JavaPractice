package day37_methods_overloading;

public class DaySelector {
    public static void main(String[] args) {
        System.out.println(getDayName(1));
        System.out.println(getDayName(5));
        System.out.println(getDayName(10));

        for (int i = 1; i <= 8; i++){
            System.out.println(i + " - " + getDayName(i));
        }

        String today = getDayName(6);
        System.out.println("today = " + today);
        String someDay = getDayName(0);
        if (someDay == null) {
            System.out.println("someDay is null for invalid day");
        }

        System.out.println(getDayName2(1));
        System.out.println(getDayName2(5));
        System.out.println(getDayName2(10));
    }

    public static String getDayName (int day) {
        switch (day) {
            case 1: return "Monday";
            case 2: return "Tuesday";
            case 3: return "Wednesday";
            case 4: return "Thursday";
            case 5: return "Friday";
            case 6: return "Saturday";
            case 7: return "Sunday";
            default:
                System.out.println("ERROR: Invalid day - " + day);
                return null;
        }
    }

    public static  String getDayName2 (int day) {
        String dayName;
        switch (day) {
            case 1:
                dayName = "Moday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                System.out.println("ERROR: Invalid day - " + day);
                dayName = null;
        }
        return dayName;
    }
}
