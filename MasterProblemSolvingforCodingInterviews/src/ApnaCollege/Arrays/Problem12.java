package ApnaCollege.Arrays;

/**
 * 238. Product of Array Except Self
 * Given an integer array nums, return an array answer such that answer[i] is
 * equal to the product of all the elements of nums except nums[i].
 * 
 * The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit
 * integer.
 * 
 * You must write an algorithm that runs in O(n) time and without using the
 * division operation.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: nums = [1,2,3,4]
 * Output: [24,12,8,6]
 * Example 2:
 * 
 * Input: nums = [-1,1,0,-3,3]
 * Output: [0,0,9,0,0]
 * 
 * 
 */
public class Problem12 {
    public static void main(String[] args) {
        int[] numss = { -1, 1, 0, -3, 3 };
        int[] nums = productExceptSelf(numss);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + "  ");
        }
    }

    static int[] productExceptSelf(int[] nums) {
        int forward[] = new int[nums.length];
        int backward[] = new int[nums.length];
        int prev = 1;
        for (int i = 0; i < nums.length; i++) {
            forward[i] = prev * nums[i];
            prev = forward[i];
        }
        prev = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            backward[i] = prev * nums[i];
            prev = backward[i];
        }
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                nums[i] = backward[i + 1];
            } else if (i == (nums.length - 1)) {
                nums[i] = forward[i - 1];
            } else {
                nums[i] = forward[i - 1] * backward[i + 1];
            }

        }
        return nums;
    }
}
