import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
 Find all pairs with a given sum 
Easy Accuracy: 49.98% Submissions: 13662 Points: 2
Given two unsorted arrays A of size N and B of size M of distinct elements, the task is to find all pairs from both arrays whose sum is equal to X.
Example 1:

Input:
A[] = {1, 2, 4, 5, 7}
B[] = {5, 6, 3, 4, 8} 
X = 9 
Output: 
1 8
4 5 
5 4
Explanation:
(1, 8), (4, 5), (5, 4) are the
pairs which sum to 9.
 */
public class FindAllPairsWithaGivenSum {
    public static void main(String[] args) {

        long A[] = { 1, 2, 4, 5, 7 };
        long B[] = { 5, 6, 3, 4, 8 };
        allPairs(A, B, A.length, B.length, 9);

    }

    static pair[] allPairs(long A[], long B[], long N, long M, long X) {
        // Your code goes here
        List<pair> l = new ArrayList<pair>();
        Set<Integer> s = new HashSet<Integer>();
        Arrays.sort(A);
        Arrays.sort(B);
        if (N <= M) {
            for (int i = 0; i < A.length; i++) {
                s.add(A[i]);
            }
            for (int i = 0; i < B.length; i++) {
                int val = Math.abs(x - B[i]);
                if (s.contains(val)) {
                    if (val < B[i]) {
                        pair p = new pair(val, B[i]);
                        l.add(p);
                    } else {
                        pair p = new pair(B[i], val);
                        l.add(p);
                    }

                }
            }
        } else {
            for (int i = 0; i < B.length; i++) {
                s.add(B[i]);
            }
            for (int i = 0; i < A.length; i++) {
                int val = Math.abs(x - A[i]);
                if (s.contains(val)) {
                    if (val < A[i]) {
                        pair p = new pair(val, A[i]);
                        l.add(p);
                    } else {
                        pair p = new pair(A[i], val);
                        l.add(p);
                    }

                }
            }
        }

        return (pair[]) l.toArray();

    }

}

class pair {
    long first, second;

    public pair(long first, long second) {
        this.first = first;
        this.second = second;
    }
}