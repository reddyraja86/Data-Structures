package ApnaCollege.Strings;

/**
 * Remove Consecutive Characters
 * S = aabb
 * Output: ab
 */
public class Problem30 {
    public static void main(String[] args) {
        String s = "aabaa";
        char prev = s.charAt(0);
        String result = prev + "";
        for (int i = 1; i < s.length(); i++) {
            if (prev != s.charAt(i)) {
                result = result + s.charAt(i);
                prev = s.charAt(i);
            }
        }
        System.out.println(result);
    }
}
