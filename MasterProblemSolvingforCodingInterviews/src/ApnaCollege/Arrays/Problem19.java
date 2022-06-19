package ApnaCollege.Arrays;

import java.util.Arrays;

/**
 * Kth smallest element
 * Input:
 * N = 6
 * arr[] = 7 10 4 3 20 15
 * K = 3
 * Output : 7
 * Explanation :
 * 3rd smallest element in the given
 * array is 7.
 */
public class Problem19 {
    public static void main(String[] args) {

    }

    static int sortAndReturn(int[] a, int k) {
        Arrays.sort(a);
        return a[k - 1];
    }

}
