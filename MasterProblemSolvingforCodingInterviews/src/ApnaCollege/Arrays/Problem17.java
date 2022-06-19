package ApnaCollege.Arrays;

public class Problem17 {
    public static void main(String[] args) {
        int[] height = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        int sum = maxArea(height);
        System.out.println(sum);
    }

    static int maxArea(int[] height) {

        int i = 0, j = height.length - 1;
        int sum = 0;

        while (i < j) {
            sum = Math.max(sum, (Math.min(height[i], height[j]) * (j - i)));
            if (height[i] < height[j]) {
                i++;
            } else {
                j--;
            }

        }

        return sum;
    }
}
