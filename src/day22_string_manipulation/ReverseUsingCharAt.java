package day22_string_manipulation;

public class ReverseUsingCharAt {
    public static void main(String[] args) {
        String word = "java";

        System.out.print(word.charAt(3));
        System.out.print(word.charAt(2));
        System.out.print(word.charAt(1));
        System.out.print(word.charAt(0));
        System.out.println(word);

        char one = word.charAt(0);
        char two = word.charAt(1);
        char three = word.charAt(2);
        char four = word.charAt(3);

        System.out.println(four + " " + three + " " + two + " " + one);

        String word2 = four + " " + three + " " + two + " " + one;

        System.out.println("word = " + word);
        System.out.println("word2 = " + word2);

        if (word.equalsIgnoreCase(word2)) {
            System.out.println("palindrome word");
        } else {
            System.out.println("not palindrome word");
        }


    }
}
