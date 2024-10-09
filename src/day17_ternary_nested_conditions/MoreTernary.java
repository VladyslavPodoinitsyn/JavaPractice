package day17_ternary_nested_conditions;

public class MoreTernary {
    public static void main(String[] args) {
        int hourlyRate = 50;
        String reply = (hourlyRate >= 50) ? "Accept" : "Reject";
        System.out.println("Reply = " + reply);

        String todaysClass = "java";

        String teacher = (todaysClass.equals("java")) ? "Saim|Murodil" : "Nadir";
        System.out.println("Today's teacher = " + teacher);

        boolean hasDL = true;
        String driving = (hasDL == true) ? "Yes" : "No";
        System.out.println("Can drive = " + driving);
    }
}
