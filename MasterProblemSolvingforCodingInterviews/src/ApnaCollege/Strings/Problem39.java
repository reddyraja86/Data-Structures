package ApnaCollege.Strings;

import java.util.Collections;
import java.util.List;

public class Problem39 {
    public static void main(String[] args) {

    }

    static void nextPermutation(int a[]) {

        int tempIndex = 0;
        // find first element where a[i]<a[i+1] temp =a[i]
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] < a[i + 1]) {
                tempIndex = i;
            } else {
                break;
            }
        }
        int rightIndex = 0;
        // From right get the first element which is less than temp
        for (int i = a.length - 1; i > 0; i--) {
            if (a[i] > a[tempIndex]) {
                rightIndex = i;
                break;
            }
        }

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }
        System.out.println();

        // swap the elements
        int temp = a[tempIndex];
        a[tempIndex] = a[rightIndex];
        a[rightIndex] = temp;

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }
        System.out.println();

        // reverse the tempIndex+1 to length
        tempIndex = tempIndex + 1;
        int l = a.length - 1;
        while (tempIndex <= l) {
            int t = a[l];
            a[l] = a[tempIndex];
            a[tempIndex] = t;
            tempIndex++;
            l--;
        }

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }
    }
}
