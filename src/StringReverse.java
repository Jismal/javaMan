import java.io.StringBufferInputStream;

public class StringReverse {
    //I want to reverse the strings
    public static void main(String[] args) {
        String actual = "this is a test string";
        String rev = "";
        int len = actual.length();
        System.out.println(len);
        for (int i = len - 1; i >= 0; i--) {
            rev = rev + actual.charAt(i);

        }
        System.out.println(rev);
    }

}
