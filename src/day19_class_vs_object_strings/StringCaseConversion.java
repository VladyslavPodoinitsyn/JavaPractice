package day19_class_vs_object_strings;

public class StringCaseConversion {
    public static void main(String[] args) {
        String word = "CyberTek";
        String sentence = "Java is Fun!";

        System.out.println(word.toLowerCase());
        System.out.println(word.toUpperCase());
        System.out.println("Java".toUpperCase());
        System.out.println(sentence.toLowerCase());
        System.out.println(sentence.toUpperCase());

        word.toLowerCase();
        System.out.println(word);

        String wordInLCase =  word.toLowerCase();
        System.out.println("wordInLCase = " + wordInLCase);

        String company = "Amazon";
        System.out.println("company in uppercase - " + company.toUpperCase());

        System.out.println("company = " + company);
        company = company.toUpperCase();
        System.out.println("company = " + company);
    }
}
