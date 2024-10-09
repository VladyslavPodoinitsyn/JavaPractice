package day31_arrays;

import java.util.*;

public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = {23, 45, 75, 190, 843};
        System.out.println(Arrays.binarySearch(nums, 23));//0
        System.out.println(Arrays.binarySearch(nums, 75));//3
        System.out.println(Arrays.binarySearch(nums, 46));//-3
        System.out.println(Arrays.binarySearch(nums, 45));//1
        System.out.println(Arrays.binarySearch(nums, 200));//-5

        if (Arrays.binarySearch(nums, 843) >= 0) {
            System.out.println("843 is present in array");
        } else {
            System.out.println("843 is not present");
        }
    }
}
