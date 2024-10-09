package day31_arrays;

import java.util.*;

public class ArraysUtil {
    public static void main(String[] args) {
        int[] nums = {5, 52334647, -3, 4, 2, 9, 10, 6412, 154, 1,};
        System.out.println(Arrays.toString(nums));

        Arrays.sort(nums);

        System.out.println(Arrays.toString(nums));
        System.out.println("min value: " + nums[0]);
        System.out.println("max value: " + nums[nums.length-1]);


        //Arrays.sort(nums, Collections.reverseOrder());  sort in reverse (Biggest to smallest)
        // but it doesn't work with primitive type arrays

        String[] words = {"java", "python", "c++", "sql", "ruby", "javascript"};
        System.out.println(Arrays.toString(words));
        System.out.println(String.join(", ", words));

        Arrays.sort(words);
        System.out.println(Arrays.toString(words));

        Arrays.sort(words, Collections.reverseOrder());
        System.out.println(Arrays.toString(words));

    }
}
