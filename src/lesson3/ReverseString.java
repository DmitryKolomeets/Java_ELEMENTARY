package lesson3;

public class ReverseString {

    public static String phrase = "ZюукяДZіботZ,ежобZощZяZенZ!ьлаксом";

    static public String reverseWords(String s) {
        StringBuffer sb = new StringBuffer(s);
        StringBuffer newSb = new StringBuffer();
        String[] strs = sb.reverse().toString().split("Z");

        for (int i = strs.length - 1; i >= 0; i--) {
            newSb.append(strs[i] + " ");
        }
        return newSb.toString().trim();

    }

    public static void main(String[] args) {
        System.out.println(reverseWords(phrase));
    }
}
