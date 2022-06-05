package ApnaCollege.Arrays;

/**
 * Search an element in a sorted and rotated array
 * 
 * 
 */
public class Problem6 {
    public static void main(String[] args) {
        int arr[] = { 5, 6, 7, 8, 9, 10, 1, 2, 3 };
        search(arr, 0, arr.length, 9);
    }

    static void search(int[] a, int start, int end, int k) {
        int pivot = start + (end - start) / 2;
        if (a[pivot] == k) {
            System.out.println(k + "---- Found at index :" + pivot);
            return;
        }

        if (k > a[start]) {
            // search inside that is left
            search(a, start, pivot, k);
        } else {
            search(a, pivot, end, k);
        }

    }

}
