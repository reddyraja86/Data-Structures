package StringPrblms;

class Space20 {
    public static void main(String[] args) {

        String a = "hello world  How are you";
        approachOne(a);
    }

    static void approachOne(String s) {
        s = s.replace(" ", "%20");
        System.out.println(s);
    }

}