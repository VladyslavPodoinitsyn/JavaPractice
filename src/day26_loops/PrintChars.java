package day26_loops;

public class PrintChars {
    public static void main(String[] args) {
        String word = "java";

        System.out.println(word.length());

        for(int i = 0; i <= word.length() - 1; i++){
            System.out.println(word.charAt(i));
        }

        System.out.println();

        for(int i = word.length() - 1; i >= 0; i--){
            System.out.println(word.charAt(i));
        }
    }
}
