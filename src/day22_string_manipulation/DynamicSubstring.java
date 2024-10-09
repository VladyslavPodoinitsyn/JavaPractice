package day22_string_manipulation;

public class DynamicSubstring {
    public static void main(String[] args) {
        String result = "result count:12345";
        System.out.println(result.substring(13, 18));
        //or
        System.out.println(result.substring(13));
        System.out.println(result.indexOf(":"));
        int colonIndex = result.indexOf(":");
        System.out.println(result.substring(colonIndex + 1));

        String today = "i leaned [java] today";

        int index1 = today.indexOf("[");
        int index2 = today.indexOf("]");

        System.out.println(today.substring(index1 + 1, index2));
        //or
        System.out.println(today.substring(today.indexOf("[") + 1, today.indexOf("]")));
    }
}
