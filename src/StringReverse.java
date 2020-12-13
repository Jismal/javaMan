import java.io.StringBufferInputStream;

public class StringReverse {
    static String rev = "";

    //I want to reverse the strings
    public static void main(String[] args) {
        StringReverse.reverseChar();
        StringReverse.reverseStr();
        String actual = "this is a test string";

        int len = actual.length();
        System.out.println(len);

        for (int i = len - 1; i >= 0; i--) {
            rev = rev + actual.charAt(i);
        }
        System.out.println(rev);
    }
    // reverse using arrays
    public static void reverseChar() {
        String str = "I am going to reverse this string";
        char[] charArr = str.toCharArray();
        int lenA = charArr.length;
        for (int i = lenA - 1; i >= 0; i--) {
            rev = rev + charArr[i];
        }
        System.out.println(rev);
    }
    //using String buffer class
    public static void reverseStr(){
        String str2 = "I am going to reverse this string using Buffer";
         StringBuffer sb= new StringBuffer(str2);
         rev=sb.reverse().toString();
        System.out.println(rev);
    }
}
