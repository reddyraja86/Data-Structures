package ApnaCollege.TwoDArray;

import java.util.ArrayList;
import java.util.List;

public class SetMatrixZeroes {
    public static void main(String[] args) {

    }

    public void setZeroes(int[][] matrix) {
        List<String> list = new ArrayList<String>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "  ");
                if (matrix[i][j] == 0) {
                    list.add(i + "--" + j);
                }
            }
        }
        for (String s : list) {
            Integer i = Integer.parseInt(s.split("--")[0]);
            Integer j = Integer.parseInt(s.split("--")[1]);
            // set all row values to zero
            for (int k = 0; k < matrix[i].length; k++) {
                matrix[i][k] = 0;
            }
            // set all column values to zero
            for (int k = 0; k < matrix.length; k++) {
                matrix[k][j] = 0;
            }

        }
    }
}
