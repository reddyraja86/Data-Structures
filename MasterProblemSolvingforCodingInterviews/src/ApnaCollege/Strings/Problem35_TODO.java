package ApnaCollege.Strings;

/**
 * Longest Repeating Character Replacement
 * 
 */
public class Problem35_TODO {
    public static void main(String[] args) {
        String s = "ABAB";
        int k = 2;
        System.out.println(characterReplacement(s, k));
    }

    static int characterReplacement(String s, int k) {
        int i = 0, j = 1, c = 1, T = 1;
        int l = s.length();
        int backup = k;
        Character ch = s.charAt(0);
        while (j < l) {

            while (i < l && s.charAt(j) == ch) {
                ch = s.charAt(j);
                j++;
                c++;
            }
            if (c > T) {
                T = c;
            }
            if (k != 0) {
                // IDEALLY REAPLCED WITH prEV CHARACTER
                j++;
                k--;

            } else {
                i++;
                k = backup;
                c = 0;
            }

        }
        return T;
    }

}
