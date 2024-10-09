package day12_conditional_statements;

public class ComparisonExamples {
    public static void main(String[] args) {
        int limit = 55;
        int current = 45;
        boolean speeding = current > limit;
        System.out.println("Are you speeding? - " + speeding);
        System.out.println("Current Speed = " + current +" mph");
        System.out.println("Speed limit = " + limit +" mph");
    }
}
