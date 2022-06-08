package ApnaCollege.Arrays;

/**
 * 
 * Return A and B.

        Note: Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
        Note that in your output A should precede B.
        Example:
        Input:[3 1 2 5 3] 
        Output:[3, 4] 
        A = 3, B = 4
 * 
 */
import java.util.HashSet;
import java.util.Set;

public class Problem9 {
    public static void main(String[] args) {
        int a[] = { 3, 1, 2, 5, 3 };
        Integer[] result = repeatedNumber(a);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }

    static Integer[] repeatedNumber(final int[] A) {

        Integer[] result = new Integer[2];
        int total = 0;
        for (int i = 0; i < A.length; i++) {
            total = total + A[i];
        }

        int idealTotal = A.length * (A.length + 1) / 2;

        Set<Integer> s = new HashSet<Integer>();
        for (int i = 0; i < A.length; i++) {
            if (s.contains(A[i])) {
                result[0] = A[i];
                result[1] = (idealTotal - total) + A[i];
                return result;
            } else {
                s.add(A[i]);
            }

        }
        return result;
    }
}
