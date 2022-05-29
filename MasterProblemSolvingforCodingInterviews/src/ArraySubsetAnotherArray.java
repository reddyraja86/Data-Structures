import java.util.HashMap;
import java.util.Map;

/*
Given two arrays: a1[0..n-1] of size n and a2[0..m-1] of size m. Task is to check whether a2[] is a subset of a1[] or not. Both the arrays can be sorted or unsorted. 

Example 1:

Input:
a1[] = {11, 1, 13, 21, 3, 7}
a2[] = {11, 3, 7, 1}
Output:
Yes
Explanation:
a2[] is a subset of a1[]
**/

public class ArraySubsetAnotherArray {
    public static void main(String[] args) {
        long a1[] = { 11, 1, 13, 21, 3, 7 };
        long a2[] = { 11, 3, 7, 1 };
        approachOne(a1, a2, a1.length, a2.length);
    }

    static String approachOne(long[] a1, long[] a2, int n, int m) {
        String result = "Yes";
        Map<Long, Integer> map = new HashMap<Long, Integer>();
        for (int i = 0; i < a1.length; i++) {
            if (map.get(a1[i]) == null) {
                map.put(a1[i], 1);
            } else {
                int count = map.get(a1[i]);
                count++;
                map.put(a1[i], count);
            }
        }
        for (int i = 0; i < a2.length; i++) {
            if ((map.get(a2[i]) != null && !(map.get(a2[i]) <= 0))) {
                int count = map.get(a2[i]);
                count--;
                map.put(a2[i], count);
            } else {
                result = "No";
                break;
            }
        }

        return result;
    }
}
