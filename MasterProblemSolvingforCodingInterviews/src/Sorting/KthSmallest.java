package Sorting;

public class KthSmallest {
    static void valuesInArray(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "  ");
        }
    }

    public static void main(String[] args) {

        int k = 2;
        int KthSmallest = 0;

        int a[] = { 4, 19, 8, 5, 7, 3, 1, 2 };

        for (int i = 0; i < a.length; i++) {
            int smallestIndex = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[smallestIndex]) {
                    smallestIndex = j;
                }
            }
            // swap smallest
            int temp = a[i];
            a[i] = a[smallestIndex];
            a[smallestIndex] = temp;
            if (i == k - 1) {
                KthSmallest = a[i];
                break;
            }

        }

        valuesInArray(a);
        System.out.println("===K th Smallest ====");
        System.out.println(KthSmallest);
    }
}
