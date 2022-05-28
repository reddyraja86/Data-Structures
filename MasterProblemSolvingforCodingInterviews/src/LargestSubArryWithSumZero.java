import java.util.HashMap;

public class LargestSubArryWithSumZero {
    public static void main(String[] args) {
        int A[] = { 15, -2, 2, -8, 1, 7, 10, 23 };
        approachTwo(A, 0);
    }

    static void approachTwo(int a[], int k) {
        int i = 0;
        int j = 0;
        int sum = a[i];
        int finalLength = 0;

        while (i < a.length && j < a.length) {
            if (sum == k) {

                if (finalLength < ((j - i) + 1)) {
                    finalLength = ((j - i) + 1);
                }
                if (j < a.length) {
                    j++;
                    sum = sum + a[j];
                }
            } else if (sum < k) {
                j++;
                if (j < a.length) {
                    sum = sum + a[j];
                }

            } else {
                sum = sum - a[i];
                i++;
            }
        }
        System.out.println(finalLength);
    }

    static void approachOne(int[] a, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        hm.put(0, 0);
        int length = 0;
        int cumSum = 0;

        for (int i = 0; i < arr.length; i++) {
            cumSum = cumSum + arr[i];

            if (hm.containsKey(cumSum)) {
                length = Math.max(length,
                        i + 1 - hm.get(cumSum));
            } else {
                hm.put(cumSum, i + 1);
            }
        }
        System.out.println(length);

    }

}
