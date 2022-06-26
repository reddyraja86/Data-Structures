package Sorting;

public class MeegeSort {
    public static void main(String[] args) {
        int a[] = { 6, 3, 9, 5, 2, 8, 1 };
        int[] result = sort(a, 0, a.length - 1);
        System.out.println(result);
        printArray(result);

    }

    static void printArray(int a[]) {
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + "  ");
    }

    static int[] sort(int a[], int start, int end) {
        // base codition
        if (end - start == 0) {
            int[] r = { a[end] };
            return r;
        }

        int pivot = start + (end - start) / 2;

        int[] f = sort(a, start, pivot);
        int[] s = sort(a, pivot + 1, end);

        return merge(f, s);

    }

    private static int[] merge(int[] f, int[] s) {
        int[] test = new int[f.length + s.length];
        int i = 0, j = 0, k = 0;
        while (i < f.length || j < s.length) {
            Integer val1 = null, val2 = null;
            if (i < f.length) {
                val1 = f[i];
            }
            if (j < s.length) {
                val2 = s[j];
            }
            if (val1 != null && val2 != null) {
                if (f[i] < s[j]) {
                    test[k] = f[i];
                    i++;
                } else {
                    test[k] = s[j];
                    j++;
                }
                k++;
            } else {
                if (val1 == null) {
                    while (j < s.length) {
                        test[k] = s[j];
                        j++;
                        k++;
                    }
                }
                if (val2 == null) {
                    while (i < f.length) {
                        test[k] = f[i];
                        i++;
                        k++;
                    }
                }
                break;
            }

        }

        return test;
    }
}
