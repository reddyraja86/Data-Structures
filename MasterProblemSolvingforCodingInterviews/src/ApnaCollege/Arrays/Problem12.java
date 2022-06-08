package ApnaCollege.Arrays;

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
