package ApnaCollege.Arrays;

import java.util.Arrays;

public class Problem4 {
    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 1 };
        System.out.println(containsDuplicate(nums));
    }

    static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        boolean flag = false;
        int prev = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (prev == nums[i]) {
                return true;
            } else {
                prev = nums[i];
            }
        }
        return flag;
    }
}
