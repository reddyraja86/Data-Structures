package ApnaCollege.Arrays;

import java.util.Arrays;

/**
 * Maximum and minimum of an array using minimum number of comparisons
 */
public class Problem1 {

    public static void main(String[] args) {
        int a[] = { 10, 3, 4, 2, 16, 8, 5 };
        approachOne(a);
    }

    static void printArray(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "  ");
        }

        System.out.println(" ");
    }

    /**
     * Sort and return first and last
     * 
     * @param a
     */
    static void approachOne(int a[]) {
        Arrays.sort(a);
        printArray(a);
        System.out.println(a[0] + "---" + a[a.length - 1]);
    }
}
