package day18_conditions_practice_strings_intro;

public class CarLeasingTest {
    public static void main(String[] args) {
        String make = "Mercedes";
        String model = "A";
        double leasePrice = 0.0;

        if (make.equals("Mercedes")) {
            if (model.equals("E")) {
                leasePrice = 500.0;
            } else if (model.equals("A")) {
                leasePrice = 400.0;
            }
        } else {
            System.out.println("Invalid make");
        }

        System.out.println("Make = " + make);
        System.out.println("Model = " + model);
        System.out.println("Lease Price = $" + leasePrice);
    }
}
