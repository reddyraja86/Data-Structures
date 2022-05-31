import java.util.Arrays;

/*
Input:
K = 2, N = 4
Arr[] = {1, 5, 8, 10}
Output:
5
Explanation:
The array can be modified as 
{3, 3, 6, 8}. The difference between 
the largest and the smallest is 8-3 = 5.
*/

public class MinimizeTheHeightsII {
    public static void main(String[] args) {
        int K = 5;// 2;
        int N = 10;// 4;
        int Arr[] = { 2, 6, 3, 4, 7, 2, 10, 3, 2, 1 };// { 3, 9, 12, 16, 20 };// { 1, 5, 8, 10 };
        approachOne(Arr, K, N);
    }

    static void approachOne(int Arr[], int K, int N) {
        for (int i = 0; i < Arr.length; i++) {
            System.out.print(Arr[i] + " ");
        }
        System.out.println("====");
        for (int i = 0; i < Arr.length; i++) {
            if (Arr[i] - K <= 0) {
                Arr[i] = Arr[i] + K;
            } else {
                Arr[i] = Arr[i] - K;
            }
        }
        for (int i = 0; i < Arr.length; i++) {
            System.out.print(Arr[i] + " ");
        }
        Arrays.sort(Arr);
        System.out.println("--After Sort ==");
        for (int i = 0; i < Arr.length; i++) {
            System.out.print(Arr[i] + " ");
        }
        System.out.println("*******");
        int i = 0;
        int j = Arr.length - 1;
        while (i < j) {
            int val = Arr[j] - Arr[i];
            if (val < 0) {
                i++;
            } else {
                System.out.println(val);
                break;
            }

        }

    }
}
