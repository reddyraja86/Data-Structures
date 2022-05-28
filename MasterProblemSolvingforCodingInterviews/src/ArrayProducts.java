
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

    void zigZag(int arr[], int n) {
        for (int i = 0; i <= arr.length - 3; i++) {
            int small = 0, medium = 0, large = 0;
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
