package day15_logicalops_switch_ternary;

public class GradeEvaluator {
    public static void main(String[] args) {
        char grade = 'A';

        if ((grade == 'A' || grade == 'a') || (grade == 'B' || grade == 'b') || (grade == 'C' || grade == 'c')) {
            System.out.println("Passed with grade - " + grade);
        } else if (grade == 'D' || grade == 'd'){
            System.out.println("Qualify for retake. Grade - " + grade);
        }  else if (grade == 'E' || grade == 'e') {
            System.out.println("Fail. Grade - " + grade);
        } else {
            System.out.println("Invalid Grade - " + grade);
        }
    }
}
