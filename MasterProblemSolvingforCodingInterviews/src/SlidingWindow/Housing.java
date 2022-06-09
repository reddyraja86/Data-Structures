package SlidingWindow;

/**
 * Find subarray with given sum
 * Given an unsorted array arr of nonnegative integers and an integer sum, find
 * a continuous subarray which adds to a given sum. There may be more than one
 * subarrays with sum as the given sum, print first such subarray.
 * Examples :
 * 
 * Input: arr[] = {1, 4, 20, 3, 10, 5}, sum = 33
 * Output: Sum found between indexes 2 and 4
 * Sum of elements between indices 2 and 4 is 20 + 3 + 10 = 33
 * 
 * Input: arr[] = {1, 4, 0, 0, 3, 10, 5}, sum = 7
 * Output: Sum found between indexes 1 and 4
 * Sum of elements between indices 1 and 4 is 4 + 0 + 0 + 3 = 7
 * 
 * Input: arr[] = {1, 4}, sum = 0
 * Output: No subarray found
 * There is no subarray with 0 sum
 * 
 * 
 */
public class Housing {
    public static void main(String[] args) {
        int arr[] = { 1, 4, 20, 3, 10, 5 };
        int k = 33;
        subArrayWithKSum(arr, k);
    }

    static void subArrayWithKSum(int[] a, int k) {
        int sum = a[0];
        int i = 0, j = 0;
        while (i < a.length && j < a.length) {
            if (sum == k) {
                System.out.println("(" + i + "," + j + ")");
                j++;
                if (j < a.length) {
                    sum = sum + a[j];
                }

            } else if (sum <= k && j < a.length) {
                j++;
                sum = sum + a[j];
            } else if (sum > k && i < a.length) {
                sum = sum - a[i];
                i++;
            }
        }

    }

    public static void housing(int[] arr, int n, int k) {

        int i = 0;
        int j = 0;
        int cs = 0;

        while (j < n) {

            // expand to right
            cs += arr[j];
            j++;

            // remove elements from the left till cs > sum and i<j
            while (cs > k && i < j) {
                cs = cs - arr[i];
                i++;
            }

            // check if any given point
            if (cs == k) {
                // print that window
                System.out.println(i + " - " + (j - 1));
                ;
            }

        }
    }
}
