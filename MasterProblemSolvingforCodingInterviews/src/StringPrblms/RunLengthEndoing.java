package StringPrblms;

public class RunLengthEndoing {
    public static void main(String[] args) {

        String a = "aaaaabcccccaaa";

        int count = 1;
        String result = "";
        char prev = a.charAt(0);
        for (int i = 1; i < a.length(); i++) {
            if (a.charAt(i) == prev) {
                count++;
            } else {
                result = result + prev + count;
                count = 1;
                prev = a.charAt(i);
            }
        }
        result = result + prev + count;

        System.out.println(result);
    }
}
