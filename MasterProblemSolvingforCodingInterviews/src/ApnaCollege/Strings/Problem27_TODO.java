package ApnaCollege.Strings;

/**
 * Valid Palindrome
 * Input: s = "A man, a plan, a canal: Panama"
 * Output: true
 * Explanation: "amanaplanacanalpanama" is a palindrome.
 */
public class Problem27_TODO {
    public static void main(String[] args) {
        String s = "a.";// "A maan, a plan, a canal: Panama";
        System.out.println(approachOne(s));
    }

    static boolean approachOne(String s) {
        s = s.toLowerCase();
        if (s.length() == 2) {
            int x = (int) s.charAt(0);
            int y = (int) s.charAt(1);
            if ((x >= 97 && x <= 122) && (y >= 97 && y <= 122) && (x != y)) {
                return false;
            } else if (((x >= 48 && x <= 57) || (y >= 48 && y <= 57)) && (x != y)) {
                return false;
            }
        }
        int i = 0, j = s.length() - 1;

        while (i < j) {
            int x = (int) s.charAt(i);
            int y = (int) s.charAt(j);
            if (x < 97 || x > 122) {
                i++;
                continue;
            } else if (y < 97 || y > 122) {
                j--;
                continue;
            } else {
                if (x != y) {
                    return false;
                }
                i++;
                j--;
            }

        }

        return true;
    }
}
