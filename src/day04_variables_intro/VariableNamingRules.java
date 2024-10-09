package day04_variables_intro;

public class VariableNamingRules {
    public static void main(String[] args){
        //System.out.println("BREAK TILL 4:10 PM EST");
        //int static = 22; -> error, static is reserved by java
        int _static = 22;
        int static2 = 22;
        int $static = 44;
        int staticVar = 234;

        int salary$ = 55;
//        int 1stMonthSalary = 3000; -> ERROR, cannot start with the number
        int $ =10;
//        int _ = 3;
        System.out.println($);
//        System.out.println(_); -> error, cannot print "_"
        // int number-of-friends -> error
        int numberOfFriends = 401;
        int number_of_friends = 401; //not convention
    }
}
