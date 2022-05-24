import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

/**
 * Longest band is nothing but the longest consecutive sequence of numbers that
 * are in ascending order.
 * 
 * Input: arr[] = {1, 56, 58, 57, 90, 92, 94, 93, 91, 45};
 * Output: Length of the longest contiguous subarray is 5
 * 
 * Solution one : Sort the Array and find the longest consecutive sequence
 * Time Complexity : O(nlogn) + O(n)
 * 
 * Solution Two :
 * 1.Insert all the elements in a Hashset
 * 2.Interate through the array and check whether it can start the longest band
 * ex : { 14, 12, 11, 20 }
 * 1. Add it hash set
 * 2. Iterate through array
 * 14 check it can be start a band by checking 13 avialble in hashset or not
 * If avialble ignore and move to next element
 * Else add 1 and check for the continuos elements and find the length of
 * continuous band
 * Check the above for all the elements in Array
 * 
 */

public class LongestBand {
    public static void main(String[] args) {
        int arr[] = { 10, 12, 11 };// { 14, 12, 11, 20 };// { 1, 56, 58, 57, 90, 92, 94, 93, 91, 45 };
        SolutionOne(arr);
        SolutionTwo(arr);
    }

    public static void SolutionTwo(int a[]) {
        HashSet<Integer> set = new HashSet<Integer>();

        for (int i = 0; i < a.length; i++) {
            set.add(a[i]);
        }

        int maxSubarray = 0;
        for (int i = 0; i < a.length; i++) {
            // get the first element and check whether it can for a subarray or not
            int val = a[i];
            if (set.contains(val - 1)) {
                continue;
            } else {
                // find the coninuos subarray when it can start a sub array
                int subSize = 0;
                while (set.contains(val)) {
                    val++;
                    subSize++;
                    if (maxSubarray < subSize) {
                        maxSubarray = subSize;
                    }
                }
            }
        }

        System.out.println("======max syb array size == " + maxSubarray);

    }

    public static void SolutionOne(int a[]) {
        Arrays.sort(a);
        int length = 1;
        int currentLength = 1;

        for (int i = 0; i < a.length - 1; i++) {
            if ((a[i] + 1) == a[i + 1]) {
                currentLength++;
                if (length < currentLength) {
                    length = currentLength;
                }
            } else {
                currentLength = 1;
            }
        }
        System.out.println("Longest Continuous subarray Length  :: " + length);
    }
}