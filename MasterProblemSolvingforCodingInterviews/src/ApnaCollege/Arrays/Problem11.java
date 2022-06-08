package ApnaCollege.Arrays;

public class Problem11 {
    public static void main(String[] args) {
        int[] height = { 4, 2, 0, 3, 2, 5 };
        System.out.println(trap(height));
    }

    static int trap(int[] height) {
        int left[] = new int[height.length];
        int rigtht[] = new int[height.length];

        int maxHeightSofar = 0;
        for (int i = 0; i < height.length; i++) {
            left[i] = maxHeightSofar;
            if (height[i] > maxHeightSofar) {
                maxHeightSofar = height[i];
            }
        }

        maxHeightSofar = 0;
        for (int i = height.length - 1; i >= 0; i--) {
            rigtht[i] = maxHeightSofar;
            if (height[i] > maxHeightSofar) {
                maxHeightSofar = height[i];
            }
        }
        int rainTrap = 0;
        for (int i = 0; i < height.length; i++) {
            int temp = Integer.min(left[i], rigtht[i]) - height[i];
            if (temp > 0) {
                rainTrap = rainTrap + temp;
            }
        }

        return rainTrap;
    }
}
