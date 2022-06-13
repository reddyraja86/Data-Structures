package ApnaCollege.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Problem16_TODO {
    public static void main(String[] args) {
        int[] nums = { -1, 0, 1, 2, -1, -4 };
        threeSum(nums);
    }

    static void printArray(int a[]) {
        System.out.print("[");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.print("]");
    }

    static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        int sum = 0;
        Arrays.sort(nums);
        printArray(nums);
        for (int i = 0; i < nums.length; i++) {
            sum = 0 - nums[i];
            twoPointerTwo(nums, sum, nums[i], i);
        }

        return result;
    }

    static void twoPointerTwo(int[] nums, int sum, int first, int skipIndex) {
        int i = 0, j = nums.length - 1;
        while (i <= j) {
            if (i == skipIndex) {
                i++;
                continue;
            }
            if (j == skipIndex) {
                j--;
                continue;
            }
            int k = nums[i] + nums[j];
            if (k == sum) {
                System.out.println("sum  " + sum + "first " + first + " Second " + nums[i] + "  Thrird " + nums[j]);
                i++;
                continue;
            }
            if (k < sum) {
                j--;
            }
            if (k > sum) {
                i++;
            }
        }
    }

    static void twoPointer(int[] nums, int i, int j, int sum, int first) {
        while (i <= j) {
            int k = nums[i] + nums[j];
            if (k == sum) {
                System.out.println("sum  " + sum + "first " + first + " Second " + nums[i] + "  Thrird " + nums[j]);
                i++;
                continue;
            }
            if (k < sum) {
                j--;
            }
            if (k > sum) {
                i++;
            }
        }
    }

    static List<List<Integer>> threeSumTwo(int[] nums) {

        int sum = 0;
        List<List<Integer>> result = new ArrayList<List<Integer>>();

        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++) {
            sum = 0;
            int val = nums[i];
            System.out.println(sum + "test" + val + "====" + (sum - val));
            sum = sum - val;
            System.out.println(sum);
            for (int j = i + 1; j < nums.length; j++) {
                int remaining = sum - nums[j];
                if (map.keySet().contains(remaining)) {
                    System.out.println(remaining + "== " + val + "====" + nums[j]);
                    int count = map.get(remaining);
                    count = count + 1;
                    map.put(remaining, count);
                    sum = sum - nums[j];
                } else {
                    map.put(nums[j], 1);
                    map.put(val, 1);
                }
            }
        }

        return result;

    }
}
