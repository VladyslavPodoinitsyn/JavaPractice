package day26_loops;

public class CountMatches {
    public static void main(String[] args) {
        String word = "java";
        char letter = 'a';
        int count = 0;

        for (int i = 0; i <= word.length() - 1; i++){
            if (word.charAt(i) == letter){
                count++;
            }
        }
        System.out.println("There are " + count + " " + letter + "'s in " + word);
    }
}
