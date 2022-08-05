package ApnaCollege.Strings;

/**
 * Count Palindromic Subsequences
 * Input:
 * Str = "aab"
 * Output:
 * 4
 * Explanation:
 * palindromic subsequence are :"a", "a", "b", "aa"
 */
public class Problem40_TODO {
    public static void main(String[] args) {
        String str = "aaaaaaaaaaaaaaaaaaaaaaaaaaa";
        System.out.println(countPS(str));
    }

    static long countPS(String s) {
        Long c = 0L;
        String temp = "";
        for (int i = 0; i < s.length(); i++) {
            System.out.println("i --" + i);
            for (int j = i; j < s.length(); j++) {
                System.out.println(" -- j :" + j);
                temp = temp + s.charAt(j);
                if (isPalindrom(temp)) {
                    System.out.println(temp);
                    c++;
                }
            }
            temp = "";
        }
        return c;
    }

    static boolean isPalindrom(String s) {
        /*
         * if (s.length() == 1) {
         * return true;
         * } else {
         * int i = 0, j = s.length() - 1;
         * while (i < j && i != j) {
         * if (s.charAt(i) == s.charAt(j)) {
         * i++;
         * j--;
         * } else {
         * return false;
         * }
         * }
         * }
         */
        StringBuffer sb = new StringBuffer(s);
        return sb.equals(sb.reverse());

    }

}
