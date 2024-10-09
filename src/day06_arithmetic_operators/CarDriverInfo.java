package day06_arithmetic_operators;

public class CarDriverInfo {
    public static void main(String[] args){
        String carModel = "Dodge Charger";
        String driverName = "Donald Trump";
        String licenceNumber = "A4654BC";
        short speed = 55;
        boolean isAutomatic = true;
        char licenceClass = 'D';

        System.out.println("Car model: " + carModel);
        System.out.println("Driver: " + driverName);
        System.out.println("Licence Number: " + licenceNumber);
        System.out.println("Current Speed: " + speed + "mph");
        System.out.println("Automatic? - " + isAutomatic);
        System.out.println("Licence Class: " + licenceClass);
    }
}
