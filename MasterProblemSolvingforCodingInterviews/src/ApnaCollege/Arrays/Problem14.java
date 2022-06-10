package ApnaCollege.Arrays;

/**
 * Find Minimum in Rotated Sorted Array
 * Input: nums = [3,4,5,1,2]
 * Output: 1
 * Explanation: The original array was [1,2,3,4,5] rotated 3 times.
 * 
 * Input: nums = [4,5,6,7,0,1,2]
 * Output: 0
 * Explanation: The original array was [0,1,2,4,5,6,7] and it was rotated 4
 * times.
 */
public class Problem14 {
    public static void main(String[] args) {
        int[] nums = { 11, 13, 15, 17 };// { 4, 5, 6, 7, 0, 1, 2 };// { 3, 4, 5, 6, 2 };
        minInRotatedArray(nums, 0, nums.length - 1);
    }

    static void minInRotatedArray(int a[], int l, int h) {

        if (h - l == 1) {
            int result = a[l] > a[h] ? a[h] : a[l];
            System.out.println("=====" + result);
            return;
        }

        int pivot = l + (h - l) / 2;

        if (a[pivot] > a[l]) {
            // search right
            minInRotatedArray(a, pivot, h);
        } else {
            // search left
            minInRotatedArray(a, l, pivot);
        }

    }
}
