package SlidingWindow;

public class SubArraySumWithKElements {
    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 2, 5, 1, 1, 4, 2 };
        SubArraySumWithKElementsSum(a, 3, 6);
    }

    static void SubArraySumWithKElementsSum(int a[], int k, int requiredSum) {
        int i = 0, j = 0, total = 0, l = a.length, count = 0;

        while (j < l) {
            while (count < 3) {
                total = total + a[j];
                j++;
                count++;
            }

            if (count == 3 && total == requiredSum) {
                System.out.println("(" + i + "," + (j - 1) + ")" + "--" + total);
            }

            if (i < j) {
                total = total - a[i];
                i++;
                count--;
            }

        }
    }
}
