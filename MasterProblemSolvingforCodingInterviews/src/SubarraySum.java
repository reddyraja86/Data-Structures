/**
 * Given:
 * 
 * arr = { 10 , 12 , 2 , 4 , 13 , 19 , 5 }
 * 
 * sum = 18
 * 
 * Output :
 * 
 * The given sum is found from indexes 1 to 3
 * 
 * And the subarray is: { 12 , 2 , 4 }
 * 
 * Required sum between indexes of corresponding elements are : 12 + 2 + 4 = 18
 * 
 * Example 2 :
 * Given:
 * 
 * arr = { 1 , 12 , 2 , 14 , 3 , 16 , 4 }
 * 
 * sum = 19
 * 
 * Output :
 * 
 * The given sum is found from indexes 4 to 5
 * 
 * And the Subarray is: { 3, 16 }
 * 
 * Required sum between indexes of corresponding elements are : 3 + 16 = 19
 */

public class SubarraySum {

    public static void main(String[] args) {
        int arr[] = { 12, 2, 4 };// { 1, 12, 2, 14, 3, 16, 4 };// { 10, 12, 2, 4, 13, 19, 5 };
        int sum = 18;
        approachOne(arr, sum);

    }

    static void approachOne(int a[], int k) {

        int i = 0, j = 0;
        int total = 0;

        while (j < a.length) {

            total = total + a[j];
            j++;

            while (total > k && i < a.length) {
                total = total - a[i];
                i++;
            }
            if (total == k) {
                System.out.println("(" + i + "," + (j - 1) + ")");

            }
        }
    }
}
