package day13_conditional_stetements;

public class IFWithBooleanVariable {
    public static void main(String[] args) {
        boolean isHungry = true;

        if (isHungry == true) {
            System.out.println("I am hungry I will go get something to eat.");
        } else {
            System.out.println("I am not hungry.");
        }


        double price = 200.5;
        boolean affordable = price <= 100;

        System.out.println("isAffordable = " + affordable);
        if (affordable) {
            System.out.println("I can afford it, lets buy it!");
        } else {
            System.out.println("Its too expensive.");
        }

        boolean remote = true;
        System.out.println("isRemoteJob = " + remote);
        if (remote) {
            System.out.println("Sorry I am not interested.");
        } else {
            System.out.println("Sure I am interested.");
        }

    }
}
