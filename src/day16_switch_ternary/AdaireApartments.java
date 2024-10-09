package day16_switch_ternary;

public class AdaireApartments {
    public static void main(String[] args) {
        int numberOfBedrooms = 2;
        double startingPrice = 0;

        System.out.println("#####WELCOME TO ADAIRE APARTMENTS#####");

        switch(numberOfBedrooms){
            case 0:
                System.out.println("Studio apartment selected");
                startingPrice = 1454;
                System.out.println("Starting price: $" + startingPrice);
                break;
            case 1:
                System.out.println("One bedroom apartment selected");
                startingPrice = 1725;
                System.out.println("Starting price: $" + startingPrice);
                break;
            case 2:
                System.out.println("Two bedroom apartment selected");
                startingPrice = 2899;
                System.out.println("Starting price: $" + startingPrice);
                break;
            default:
                System.out.println(numberOfBedrooms + " bedroom apartment is currently unavailable");
                break;
        }

    }
}
