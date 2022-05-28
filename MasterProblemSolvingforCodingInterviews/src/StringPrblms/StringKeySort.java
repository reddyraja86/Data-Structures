package StringPrblms;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class StringKeySort {
    public static void main(String[] args) {
        String s = "hello world  How are you";
        String s1 = s.split(" ", 3)[1];
        System.out.println(s1);

        List<String> list = new ArrayList<String>();
        list.add("92 22");
        list.add("82 12");
        list.add("77 13");
        list.add("99 2");
        list.add("5 18");

        int col = 2;
        approachOne(list, col);

    }

    static void approachOne(List<String> l, int col) {
        Map<Integer, Integer> m = new TreeMap<Integer, Integer>();
        for (int i = 0; i < l.size(); i++) {
            m.put(Integer.parseInt(l.get(i).split(" ", 2)[col - 1]), i);
        }
        Iterator<Integer> it = m.keySet().iterator();
        while (it.hasNext()) {
            System.out.println(l.get(m.get(it.next())));
        }

    }

}
