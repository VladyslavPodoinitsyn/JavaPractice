package day15_logicalops_switch_ternary;

public class UsedCarSelector {
    public static void main(String[] args) {
        double budget = 5000.0;
        String model = "Toyota";
        double carPrice = 4900.0;

        if (carPrice <= budget && model.equals("Toyota") || model.equals("Honda") || model.equals("Tesla")) {
            System.out.println("Ready to purchase model = " + model + ", price = " + carPrice);
        } else {
            System.out.println("Not interested in Model = " + model + ", price = " + carPrice);
        }
    }
}
