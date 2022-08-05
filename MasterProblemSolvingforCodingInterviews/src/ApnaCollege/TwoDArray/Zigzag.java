package ApnaCollege.TwoDArray;

public class Zigzag {
    public static void main(String[] args) {
        int M[][] = {
                { 1, 2, 3, 4 }, { 5, 6, 7, 8 },
                { 9, 10, 11, 12 }, { 13, 14, 15, 16 },
                { 17, 18, 19, 20 },
        };
        for (int i = 0; i <= M[0].length; i++) {
            int k = i;
            for (int j = 0; j <= i && j >= 0; j++) {

                if (isValidIndex(k, j, M)) {
                    System.out.print(M[k][j] + "   ");
                }

                // check the valid index
                k--;
            }
            System.out.println("");
        }
        for (int i = 1; i < M[0].length; i++) {
            int k = i;
            for (int j = M[0].length; j >= 0; j--) {
                if (isValidIndex(j, k, M)) {
                    System.out.print(M[j][k] + "   ");
                }
                k++;
            }
            System.out.println("");
        }

    }

    static boolean isValidIndex(int i, int j, int M[][]) {
        if (i < M.length && j < M[0].length) {
            // System.out.println(i + " -- " + j);
            return true;
        }
        return false;
    }
}
