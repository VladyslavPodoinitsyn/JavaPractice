package day19_class_vs_object_strings;

public class StringStartsEndsWith {
    public static void main(String[] args) {
        String word = "intellij idea";
        System.out.println(word.startsWith("in")); //can use any amount of characters to display true if they are in the right place
        System.out.println(word.startsWith("Int")); //False. it's case sensitive

        System.out.println(word.endsWith("idea"));
        System.out.println(word.endsWith("a"));

        String name = "Irina";
        if (name.endsWith("a")) {
            System.out.println("Maybe it is a female name");
        }

        String firstName = "Dr. Vladyslav";

        if (firstName.startsWith("Dr.")) {
            System.out.println("They are a Doctor");
        } else if (firstName.startsWith("Mr.")) {
            System.out.println("They are a Man");
        } else if (firstName.startsWith("Mrs.")) {
            System.out.println("They are a Married Woman");
        } else if (firstName.startsWith("Ms.")) {
            System.out.println("They are a Single Woman");
        } else if (firstName.startsWith("Sr.")) {
            System.out.println("They are a Senior");
        } else {
            System.out.println("Normal Name");
        }

        String url = "https://www.wisc.edu";
        if(url.endsWith(".com")) {
            System.out.println("Commercial website");
        } else if (url.endsWith(".ru")) {
            System.out.println("Russian website");
        } else if (url.endsWith(".gov")) {
            System.out.println("Government website");
        } else if (url.endsWith(".edu")) {
            System.out.println("Education website");
        } else if (url.endsWith(".org")) {
            System.out.println("Organization website");
        }
    }
}
