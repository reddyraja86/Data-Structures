package ApnaCollege.Arrays;

/**
 * Print all possible combinations of r elements in a given array of size n
 * 
 * Given an array of size n, generate and print all possible combinations of r
 * elements in array. For example, if input array is {1, 2, 3, 4} and r is 2,
 * then output should be {1, 2}, {1, 3}, {1, 4}, {2, 3}, {2, 4} and {3, 4}.
 */

public class Problem25 {
    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 5 };
        int r = 4;
        allCombos(a, r, 0, "");

    }

    static String allCombos(int[] a, int r, int start, String result) {
        if (result.length() == r) {
            System.out.println(result);
            result = result.substring(0, result.length() - 1);
            return result;
        }

        for (int i = start; i < a.length; i++) {
            result = result + a[i];
            start = start + 1;
            result = allCombos(a, r, start, result);
        }
        if (result.length() > 0)
            result = result.substring(0, result.length() - 1);
        return result;
    }
}
