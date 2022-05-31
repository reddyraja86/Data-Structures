public class KadanesAlgorithm {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, -2, 5 };
        maxSubarraySum(arr, arr.length);
    }

    static long maxSubarraySum(int arr[], int n) {

        long max = Integer.MIN_VALUE;
        long local = 0;

        for (int i = 0; i < arr.length; i++) {
            local = local + arr[i];
            if (local > max) {
                max = local;
            }
            if (local < 0)
                local = 0;
        }
        return max;
    }
}
