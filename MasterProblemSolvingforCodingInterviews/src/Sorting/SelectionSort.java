package Sorting;

/*

In selection sort we will 
    -- GO through the array and  find smallest element
    -- Swap that element wiht the first element
    -- DO the avobe two steps till end of all elements

*/
public class SelectionSort {
    static void valuesInArray(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "  ");
        }
    }

    public static void main(String[] args) {
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

        }

        valuesInArray(a);
    }
}
