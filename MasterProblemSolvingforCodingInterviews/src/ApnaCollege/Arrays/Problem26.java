package ApnaCollege.Arrays;

/**
 * MO’s Algorithm
 * Let us consider the following problem to understand MO’s Algorithm.
 * We are given an array and a set of query ranges, we are required to find the
 * sum of every query range.
 * 
 * Example:
 * 
 * Input: arr[] = {1, 1, 2, 1, 3, 4, 5, 2, 8};
 * query[] = [0, 4], [1, 3] [2, 4]
 * Output: Sum of arr[] elements in range [0, 4] is 8
 * Sum of arr[] elements in range [1, 3] is 4
 * Sum of arr[] elements in range [2, 4] is 6
 */
public class Problem26 {
    public static void main(String[] args) {
        int arr[] = { 1, 1, 2, 1, 3, 4, 5, 2, 8 };
        approachOne(arr, 0, arr.length - 1);
    }

    static void approachOne(int[] arr, int left, int right) {
        int indeXTotal[] = new int[arr.length];
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total = total + arr[i];
            indeXTotal[i] = total;
        }
        if (left == 0) {
            System.out.println(indeXTotal[right]);
        } else {
            System.out.println(indeXTotal[right] - indeXTotal[left - 1]);
        }

    }
}
