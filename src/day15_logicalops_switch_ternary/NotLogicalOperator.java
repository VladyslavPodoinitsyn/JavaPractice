package day15_logicalops_switch_ternary;

public class NotLogicalOperator {
    public static void main(String[] args) {
        System.out.println("!true = " + (!true));
        System.out.println("!false = " + (!false));

        int age = 2;

        if (!(age > 7)) {
            System.out.println("Need to sit in child car seat. age = " + age);
        } else {
            System.out.println("Can sit on normal seat. age = " + age);
        }

        boolean smokingAllowed = false;

        if (!smokingAllowed) {
            System.out.println("Smoking is not allowed here. Exit");
        }

        boolean isAffordable = true;

        if (!isAffordable) {
            System.out.println("It's Not affordable");
        }


    }
}
