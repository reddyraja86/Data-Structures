package ApnaCollege.Strings;

public class Problem37 {
    public static void main(String[] args) {
        String s = "babad";
    }

    static String findAllcombs(String s, String result, int length, int i) {
        if (isPalindrom(result)) {
            if (result.length() > length) {
                length = result.length();
                System.out.println(length);
            }
            return s;
        }

        findAllcombs(s, result + s.charAt(i) + "", length, i + 1);
        return findAllcombs(s, result, length, i + 1);
    }

    private static boolean isPalindrom(String s) {
        return false;
    }
}
