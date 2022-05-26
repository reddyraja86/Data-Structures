import java.util.Arrays;
import java.util.Map;
import java.util.Set;

import javafx.scene.SnapshotParameters;

public class ArrayProducts {
    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 5 };
        approachOne(a);

    }

    static void approachOne(int a[]) {
        int left[] = new int[a.length];
        int right[] = new int[a.length];
        int result[] = new int[a.length];
        int prevValue = 1;
        for (int i = 0; i < a.length; i++) {
            prevValue = prevValue * a[i];
            left[i] = prevValue;
        }
        prevValue = 1;
        for (int i = a.length - 1; i >= 0; i--) {
            prevValue = prevValue * a[i];
            right[i] = prevValue;
        }
        for (int i = 0; i < a.length; i++) {
            if (i == 0) {
                result[i] = right[i];
            } else if (i == a.length - 1) {
                result[i] = left[i - 1];
            } else {
                result[i] = left[i - 1] * right[i + 1];
            }
        }

        for (int i = 0; i < a.length; i++) {
            System.out.print(result[i] + "  ");
        }

    }

    static boolean check(long A[], long B[], int N) {
        Map<Integer, Integer> values = new HashMap<Integer, Integer>();
        // Your code here
        for (int i = 0; i < A.length; i++) {
            Set<Integer> keys = values.keySet();
            if (keys.contains(A[i])) {
                values.put(A[i], values.get(A[i] + 1));
            } else {
                values.put(A[i], 1);
            }
        }
        for (int i = 0; i < B.length; i++) {
            Integer key = values.get(B[i]);
            if (key == null || key == 0) {
                return false;
            } else {
                values.put(B[i], key - 1);
            }
        }

        return true;

    }

    void zigZag(int arr[], int n) {
        for (int i = 0; i <= arr.length - 3; i++) {
            int small, medium, large;
            if (arr[i] < arr[i + 1]) {
                small = arr[i];
                medium = arr[i + 1];
            } else {
                small = arr[i];
                medium = arr[i + 1];
            }
            if (small < arr[i + 2]) {
                small = arr[i + 2];
            }
            if (medium < arr[i + 2]) {
                medium = arr[i + 2];
            } else {
                large = arr[i + 2];
            }
            arr[i] = small;
            arr[i + 1] = large;
            arr[i + 2] = medium;
            i = i + 3;
        }
    }

}
