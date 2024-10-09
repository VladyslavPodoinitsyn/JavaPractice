package day18_conditions_practice_strings_intro;

public class IfWithoutCurlyBraces {
    public static void main(String[] args) {
        String todaysClass = "java";
        if (todaysClass.equals("java"))
            System.out.println("java is fun");
         else
            System.out.println("it is not java. it is " + todaysClass);

         int a = 10;
         if (a == 1)
             System.out.println("a is 1"); // belongs to if statement
             System.out.println("1 is a"); // does not belong to if statement
        //only 1 statement will work with the if statement without the "{}"
    }
}
