package ApnaCollege.Arrays;

public class Problem15 {
    public static void main(String[] args) {
        int[] nums = { 1 };
        int k = 1;
        int result = -1;
        if (nums.length == 1) {
            result = nums[0] == k ? 0 : -1;
        } else {
            result = search(nums, 0, nums.length - 1, k);
        }

        System.out.println(result);
    }

    static int search(int[] A, int l, int h, int k) {

        int pivot = l + (h - l) / 2;
        if (A[pivot] == k) {
            return pivot;
        }
        if (h - l == 1) {
            int val1 = A[l];
            int val2 = A[h];
            if (val1 == k)
                return l;
            else if (val2 == k)
                return h;
            else
                return -1;
        }

        if (k > A[l] && k < A[pivot]) {
            // search left
            return search(A, l, pivot, k);
        } else {
            // search right
            return search(A, pivot, h, k);
        }

    }

}
