package day29_nested_loop_arrays;

public class StringNestedLoop {
    public static void main(String[] args) {
        String word = "java";
        for (int i = 0; i <= word.length() - 1; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(word.charAt(j));
            }
            System.out.println();
        }


        for (int i = 0; i < word.length(); i++) {
            for (int j = i; j < word.length(); j++){
                System.out.print(word.charAt(j));
            }
            System.out.println();
        }
    }
}
