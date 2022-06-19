package ApnaCollege.Arrays;

import java.util.Arrays;

/**
 * Arrange given numbers to form the biggest number
 */
public class Problem22 {
    public static void main(String[] args) {

    }

    static void approachOne(int a[]) {
        Arrays.sort(a);
        String number = "";
        for (int i = a.length - 1; i >= 0; i--) {
            String c1 = number + "" + a[i];
            String c2 = a[i] + "" + number;
            if (c1.compareTo(c2) > 0) {
                number = c1;
            } else {
                number = c2;
            }
        }
        System.out.println(number);

    }
}
