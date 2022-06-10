package ApnaCollege.Arrays;

public class Problem13 {
    public static void main(String[] args) {
        int[] nums = { -2, 0, -1 };// { 2, 3, -2, 4 };
        maxProduct(nums);
    }

    static int maxProduct(int[] nums) {
        int i = 0, j = 0, l = nums.length;
        int multiple = 1;
        int total = Integer.MIN_VALUE;
        while (j < l) {
            while (j < nums.length && (multiple * nums[j]) > multiple) {
                multiple = multiple * nums[j];
                j++;
            }

            if (multiple > total) {
                total = multiple;
            }
            if (i < j) {
                if (nums[i] == 0)
                    multiple = 0;
                else {
                    multiple = multiple / nums[i];
                    i++;
                }
            }
            if (i == j) {
                j++;
            }

        }
        System.out.println(total);
        return total;
    }
}
