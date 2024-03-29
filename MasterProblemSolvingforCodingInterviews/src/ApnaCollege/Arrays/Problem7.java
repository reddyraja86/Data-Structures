package ApnaCollege.Arrays;

/**
 * Next Permutation
 * Medium
 * 
 * 11017
 * 
 * 3482
 * 
 * Add to List
 * 
 * Share
 * A permutation of an array of integers is an arrangement of its members into a
 * sequence or linear order.
 * 
 * For example, for arr = [1,2,3], the following are considered permutations of
 * arr: [1,2,3], [1,3,2], [3,1,2], [2,3,1].
 * The next permutation of an array of integers is the next lexicographically
 * greater permutation of its integer. More formally, if all the permutations of
 * the array are sorted in one container according to their lexicographical
 * order, then the next permutation of that array is the permutation that
 * follows it in the sorted container. If such arrangement is not possible, the
 * array must be rearranged as the lowest possible order (i.e., sorted in
 * ascending order).
 * 
 * For example, the next permutation of arr = [1,2,3] is [1,3,2].
 * Similarly, the next permutation of arr = [2,3,1] is [3,1,2].
 * While the next permutation of arr = [3,2,1] is [1,2,3] because [3,2,1] does
 * not have a lexicographical larger rearrangement.
 */
public class Problem7 {
    public static void main(String[] args) {

        int a[] = { 1, 2, 4, 3 };

        // 1234 1243 1324 1342

        /**
         * 
         * 1) find the first element where a[i]<a[i+1] temp =a[i]
         * 2) From right get the first element which is less than temp
         * 3) swap element
         * 4) reverse a(i+1,last)
         */

        // char a[] = { '1', '2', '3', '4' };// { 'a', 'b', 'c', 'd' };
        // findAllcombsOfArrayength(a, "", 0);
        nextPermutation(a);
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

    static void findAllcombsOfArrayength(char a[], String s, int x) {
        if (s.length() == a.length) {
            System.out.println(s);
            return;
        }
        for (int i = 0; i < a.length; i++) {
            x = x + 1;
            if (!s.contains(a[i] + "")) {
                findAllcombsOfArrayength(a, s + a[i], x);
            }

        }

    }
}
