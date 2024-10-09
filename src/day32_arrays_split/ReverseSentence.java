package day32_arrays_split;

public class ReverseSentence {
    public static void main(String[] args) {
        String sentence = "java is fun";
        String[] wordsInSentence = sentence.split(" ");
        String reversed = "";
        for (int i = wordsInSentence.length - 1; i >= 0; i--) {
            reversed += wordsInSentence[i] + " ";
        }
        System.out.println("sentence = " + sentence);
        System.out.println("reversed = " + reversed);
    }
}
