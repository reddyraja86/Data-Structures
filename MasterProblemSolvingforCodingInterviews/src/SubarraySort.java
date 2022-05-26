class SubarraySort {
    public static void main(String[] args) {
        int a[] = { 0, 1, 15, 25, 6, 7, 30, 40, 50 };
        approachOne(a);
    }

    public static void approachOne(int a[]) {

        int i = 0;
        int j = a.length - 1;

        while (i < j) {
            if (a[i + 1] > a[i]) {
                i++;
            } else if (a[j - 1] < a[j]) {
                j--;
            } else {
                break;
            }
        }
        System.out.println(i + "====" + j);

    }
}