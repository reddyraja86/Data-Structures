package StringPrblms;
/*
    find all comnination
    Strin s= "abc"
        ("")
        
     ("a")          ("")
      
("ab")   ("a")  ("b")      ("")

 */

public class SubSequnces {

    public static void main(String[] args) {
        String val = "abc";
        SubSequnces c = new SubSequnces();
        c.findAll("", 0, 3, val);

    }

    void findAll(String s, int index, int n, String val) {
        if (index == n) {
            System.out.print(s + "  ");
            return;
        }
        findAll(s + val.charAt(index), index + 1, n, val);
        findAll(s, index + 1, n, val);
    }

}
