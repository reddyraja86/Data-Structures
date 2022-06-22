package ApnaCollege.Arrays;

import java.util.HashMap;
import java.util.Map;

/**
 * Longest subarray with sum divisible by
 * Input: arr[] = {2, 7, 6, 1, 4, 5}, k = 3
 * Output: 4
 * Explaination: The subarray is {7, 6, 1, 4} with sum 18, which is divisible by
 * 3.
 * 
 * Input: arr[] = {-2, 2, -5, 12, -11, -1, 7}, k = 3
 * Output: 5
 */

public class Problem24 {
    public static void main(String[] args) {
        int arr[] = { 2, 7, 6, 1, 4, 5 };
        int k = 3;
        Map<Integer, Integer> reminderMap = new HashMap<Integer, Integer>();
        int length = 0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            int reminder = sum % k;
            if (reminder < 0) {
                reminder = reminder + k;
            }
            if (reminderMap.containsKey(reminder)) {
                int ll = i - reminderMap.get(reminder);
                if (ll > length)
                    length = ll;
            } else {
                reminderMap.put(reminder, i);
            }
        }

        System.out.println(length);

    }
}
