package ApnaCollege.Arrays;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Overlapping Intervals
 * Input:
 * Intervals = {{1,3},{2,4},{6,8},{9,10}}
 * Output: {{1, 4}, {6, 8}, {9, 10}}
 * Explanation: Given intervals: [1,3],[2,4]
 * [6,8],[9,10], we have only two overlapping
 * intervals here,[1,3] and [2,4]. Therefore
 * we will merge these two and return [1,4],
 * [6,8], [9,10].
 */
public class Problem20 {
    public static void main(String[] args) {
        Integer[][] Intervals = { { 6, 8 }, { 1, 9 }, { 2, 4 }, { 4, 7 } };// { { 1, 3 }, { 2, 4 }, { 4, 5 }, { 6, 8 },
        // { 9, 10 } };

        Arrays.sort(Intervals, new Comparator<Integer[]>() {
            public int compare(Integer[] a, Integer[] b) {
                return Integer.compare(a[0], b[0]);
            };
        });

        int prev_One = Intervals[0][0];
        int prev_Two = Intervals[0][1];
        for (int i = 1; i < Intervals.length; i++) {
            int scnd_One = Intervals[i][0];
            int scnd_Two = Intervals[i][1];

            if ((prev_One < scnd_One && scnd_One < prev_Two) || (prev_Two == scnd_One)) {
                if (prev_Two <= scnd_Two) {
                    prev_Two = scnd_Two;
                }
            } else {
                System.out.println("[" + prev_One + "," + prev_Two + "]");
                prev_One = scnd_One;
                prev_Two = scnd_Two;
            }

        }

        System.out.println("[" + prev_One + "," + prev_Two + "]");

    }
}
