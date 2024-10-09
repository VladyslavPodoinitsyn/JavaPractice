package day29_nested_loop_arrays;

public class ArraysIntro {
    public static void main(String[] args) {
        int[] nums = new int[3];
        nums[0] = 5;
        nums[1] = 7;
        nums[2] = 10;

        System.out.println("number of elements = " + nums.length);
        
        int len = nums.length;
        System.out.println("len = " + len);

        nums[0] = 100;
        nums[1] = 300;
        nums[2] = 200;

        nums[2] = nums[1];
        System.out.println(nums[0] + "\n" + nums[1] + "\n"+ nums[2]);
    }
}
