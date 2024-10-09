package day14_multi_branch_if_stetements;

public class ChooseLanguage {
    public static void main(String[] args) {
        int selection = 6;

        if (selection == 1) {
            System.out.println("Hello");
        } else if (selection == 2){
            System.out.println("Hola");
        } else if (selection == 3){
            System.out.println("Merhaba");
        } else if (selection == 4){
            System.out.println("Merci");
        } else if (selection == 5){
            System.out.println("Privet");
        } else {
            System.out.println("Lets talk Java");
        }
    }
}
