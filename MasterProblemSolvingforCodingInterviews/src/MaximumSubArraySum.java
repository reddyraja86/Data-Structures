public class MaximumSubArraySum {

    public static void main(String[] args) {

        int a[] = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        approachOne(a);
        approachTwo(a);

    }

    public static void approachOne(int a[]) {

        int total = Integer.MIN_VALUE;
        int local = 0;
        for (int i = 0; i < a.length; i++) {
            local = a[i];
            for (int j = i + 1; j < a.length; j++) {
                local = local + a[j];
                if (local > total) {
                    total = local;
                    System.out.println(i + "---" + j);
                }
            }
        }
        System.out.println(total);
    }

  static  void approachTwo(int a[]) {
        int total = Integer.MIN_VALUE;
        int local = 0;

        for (int i = 0; i < a.length; i++) {
            local = local + a[i];
            if (total < local) {
                total = local;
            }
            if(local<0){
                local =0;
            }
        }

        System.out.println(total);
    }

}
