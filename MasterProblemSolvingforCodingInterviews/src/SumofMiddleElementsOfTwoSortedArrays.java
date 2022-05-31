/*
Given 2 sorted arrays Ar1 and Ar2 of size N each. Merge the given arrays and find the sum
 of the two middle elements of the merged array.

Example 1:

Input:
N = 5
Ar1[] = {1, 2, 4, 6, 10}
Ar2[] = {4, 5, 6, 9, 12}
Output: 11
Explanation: The merged array looks like
{1,2,4,4,5,6,6,9,10,12}. Sum of middle
elements is 11 (5 + 6).
*/

//TO DO :Neeed to solve this problem

public class SumofMiddleElementsOfTwoSortedArrays {
    public static void main(String[] args) {
        int Ar1[] = { 1 };// { 1, 2, 4, 6, 10 };
        int Ar2[] = { 4 };// { 4, 5, 6, 9, 12 };

        // find the middle element
        int middle = (Ar1.length + Ar2.length) / 2;
        int index = 0;
        int index1 = -1;
        // even we have two elements
        if ((Ar1.length + Ar2.length) % 2 == 0) {
            index = middle - 1;
            index1 = middle;
        } else {
            index = middle;
        }

        int i = 0;
        int j = 0;
        int cunter = 0;
        int val = 0;
        int total = 0;

        while (i < Ar1.length || j < Ar2.length) {
            if (cunter == index && index1 == -1) {
                total = total + val;
                break;
            } else if (cunter == index) {
                total = total + val;
            } else if (cunter == index1) {
                total = total + val;
            }
            if (Ar1[i] <= Ar2[j]) {
                val = Ar1[i];
                i++;
                cunter++;
            } else {
                val = Ar2[j];
                j++;
                cunter++;
            }
        }

        System.out.println(total);
    }
}
