import java.util.Arrays;

public class Triplets {

    public static void main(String ars[]) {
        int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 15 };
        triplets(a, 18);
    }

    /**
     * Sort the array
     * take first element of the array
     * find the remaining sum (ie twopaisum = Sum-arr[i] )
     * 
     * Time complexity
     * Sorting O(nlong) + pair sum for all the elements O(n^2)
     */

    private static void triplets(int arr[], int sumNeeded) {

        Arrays.sort(arr); // O(nlogn)

        for (int i = 0; i < arr.length; i++) {
            int twoPairSumNeed = sumNeeded - arr[i];

            findTwoPairsum(i + 1, arr.length-1, twoPairSumNeed, arr, arr[i]);
           

        }

    }

    static void findTwoPairsum(int start, int end, int twoPairSumNeed, int arr[], int firstVal) {
        while (start < end) {
            if (arr[start] + arr[end] == twoPairSumNeed) {
                System.out.println(firstVal + "====" + arr[start] + "====" + arr[end]);
                start++;
                end--;
              
            } else if (arr[start] + arr[end] > twoPairSumNeed) {
                end--;
            } else {
                start++;

            }
        }

    }

}
