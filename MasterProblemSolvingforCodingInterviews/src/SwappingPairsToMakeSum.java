import java.util.Arrays;

/*
Find a pair of elements swapping which makes sum of two arrays same

Difficulty Level : Medium
Given two arrays of integers, find a pair of values (one value from each array) that you can swap to give the two arrays the same sum.
Examples: 
 

Input: A[] = {4, 1, 2, 1, 1, 2}, B[] = (3, 6, 3, 3) 
Output: {1, 3} 
Sum of elements in A[] = 11 
Sum of elements in B[] = 15 
To get same sum from both arrays, we 
can swap following values: 
1 from A[] and 3 from B[]
Input: A[] = {5, 7, 4, 6}, B[] = {1, 2, 3, 8} 
Output: 6 2
**/

public class SwappingPairsToMakeSum {
    public static void main(String[] args) {
        long A[] = { 10, 10, 10, 10 };// { 5, 7, 4, 6 };// { 4, 1, 2, 1, 1, 2 };
        long B[] = { 5, 5, 5, 10 };// { 1, 2, 3, 8 };// { 3, 6, 3, 3 };
        approachOne(A, B);
    }

    static long approachOne(long A[], long B[]) {
        long sumOfA = 0;
        long sumOfB = 0;
        for (int i = 0; i < A.length; i++) {
            sumOfA = sumOfA + A[i];
        }
        for (int i = 0; i < B.length; i++) {
            sumOfB = sumOfB + B[i];
        }

        long diffrence = Math.abs(sumOfA - sumOfB);

        Arrays.sort(A);
        Arrays.sort(B);

        int i = 0;
        int j = 0;

        long sum = A[i] + B[j];

        while (i < A.length && j < B.length) {
            if (sum == diffrence) {
                System.out.println(A[i] + "----" + B[j]);
                return 1;

            } else if (sum < diffrence) {
                sum = sum - A[i];
                i++;
                if (i < A.length)
                    sum = sum + A[i];

            } else if (sum > diffrence) {
                sum = sum - B[j];
                j++;
                if (j < B.length)
                    sum = sum + B[j];
            } else {
                return -1;
            }
        }
        return -1;
    }
}
