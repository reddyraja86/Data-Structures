import java.util.Arrays;

public class MinimumDifference {
    public static void main(String[] args) {

        int a[] = { 10, 5, 40 };
        int b[] = { 50, 90, 80 };
        approachOne(a, b);
        approachTwo(a, b);
    }

    /**
     * Find all pair differances
     * 
     * @param a
     */
    static void approachOne(int a[], int b[]) {
        int result = Integer.MAX_VALUE;
        Arrays.sort(a);
        Arrays.sort(b);

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                int val = Math.abs(a[i] - b[j]);
                if (val < result) {
                    result = val;
                    System.out.println(i + "-- " + j);
                }
            }
        }
        System.out.println(result);
    }

    /**
     * Sort the arrays
     * iterate A and B arrays
     * find the difference between a[i] & b[j]
     * update total if this is less
     * move i pointer to left in a[i] < b[j]
     * move i pointer to left in b[j] < a[i]
     * 
     * @param a
     * @param b
     */
    static void approachTwo(int a[], int b[]) {

        int total = Integer.MAX_VALUE;
        int i = 0;
        int j = 0;

        while (i < a.length && j < b.length) {

            int val = Math.abs(a[i] - b[j]);
            if (val < total) {
                total = val;
                System.out.println(i + " ** " + j);
            }
            if (i < a.length && a[i] < b[j]) {
                i++;
            } else if (j < b.length && a[i] > b[j]) {
                j++;
            }

        }
        System.out.println(total);

    }

}
