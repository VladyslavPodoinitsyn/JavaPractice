package day16_switch_ternary;

public class CappucinoBuyer {
    public static void main(String[] args) {
        String size = "tall";
        double price = 0.0;
        int calories = 0;

        switch(size){
            case "tall":
                System.out.println("Tall Cappucino please");
                price = 3.69;
                calories = 90;
                break;
            case "grande":
                System.out.println("Grande Cappucino please");
                price = 3.99;
                calories = 120;
            case "venti":
                System.out.println("Venti Cappucino please");
                price = 4.29;
                calories = 150;
            default:
                System.out.println("We don't serve" + size + "size of Cappucino");
                break;
        }
        System.out.println("Total price: " + price);
        System.out.println("You will consume " + calories + "calories");
    }
}
