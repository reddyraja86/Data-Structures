package ApnaCollege.Arrays;

import java.util.Arrays;

/**
 * Given Sum Pair
 * 
 */
public class Problem18 {
    public static void main(String[] args) {

    }

    static void twoPointerApproach(int[] a, int K) {
        Arrays.sort(a);
        int start_pointer = 0, end_pointer = a.length - 1;
        while (start_pointer < end_pointer) {
            int sum = a[start_pointer] + a[end_pointer];
            if (sum == K) {
                System.out.println(a[start_pointer] + "+" + a[end_pointer]);
                break;
            } else if (sum < K) {
                start_pointer++;
            } else {
                end_pointer--;
            }
        }
    }

}
