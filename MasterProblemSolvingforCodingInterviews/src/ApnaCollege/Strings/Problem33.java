package ApnaCollege.Strings;

import java.util.HashMap;
import java.util.Map;

/**
 * Print all the duplicates in the input string
 * “geeksforgeeks”
 */
public class Problem33 {
    public static void main(String[] args) {
        String s = "geeksforgeeks";
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i = 0; i < s.length(); i++) {
            Character ch = s.charAt(i);
            if (map.containsKey(ch)) {
                int count = map.get(ch);
                count++;
                map.put(ch, count);
            } else {
                map.put(ch, 1);
            }
        }
    }
}
