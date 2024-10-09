package day29_nested_loop_arrays;

public class NestedForLoop {
    public static void main(String[] args) {
        for (int minutes = 0; minutes <= 5; minutes++){
            for (int seconds = 0; seconds <= 59; seconds++){
                System.out.println(minutes + ":" + seconds);
            }
        }
    }
}
