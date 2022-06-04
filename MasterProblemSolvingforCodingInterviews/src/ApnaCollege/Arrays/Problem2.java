package ApnaCollege.Arrays;

import java.util.Arrays;

/**
 * Write a program to reverse an array or string
 * 
 * Given an array (or string), the task is to reverse the array/string.
 * Examples :
 * 
 * Input : arr[] = {1, 2, 3}
 * Output : arr[] = {3, 2, 1}
 */
public class Problem2 {

    public static void main(String[] args) {
        int a[] = { 2, 3, 4, 5, 8, 10, 16 };
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

        int i = 0;
        int j = a.length - 1;
        while (i <= j) {
            // swap
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++;
            j--;
        }
        printArray(a);
    }
}
