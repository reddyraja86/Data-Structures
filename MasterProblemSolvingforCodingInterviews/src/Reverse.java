import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Reverse {

    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            arr.add(i);
        }

        int k = 3;
        int n = arr.size();

        int i = 0;
        int j = k - 1;
        while (i <= j) {
            int temp = arr.get(j);
            arr.set(j, arr.get(i));
            arr.set(i, temp);
            i++;
            j--;
        }

        System.out.println(arr);

        i = k;
        j = n - 1;

        while (i <= j) {
            int temp = arr.get(j);
            arr.set(j, arr.get(i));
            arr.set(i, temp);
            i++;
            j--;

        }

        System.out.println(arr);

        /*
         * 
         * int a[] = { 0, 1, 2, 3, 4, 5 };
         * int k = 3;
         * int n = a.length;
         * 
         * int i = 0;
         * int j = k - 1;
         * while (i <= j) {
         * int temp = a[j];
         * a[j] = a[i];
         * a[i] = temp;
         * i++;
         * j--;
         * }
         * 
         * System.out.println(a);
         * 
         * i = k;
         * j = n - 1;
         * 
         * while (i <= j) {
         * int temp = a[j];
         * a[j] = a[i];
         * a[i] = temp;
         * i++;
         * j--;
         * 
         * }
         */
    }

}
