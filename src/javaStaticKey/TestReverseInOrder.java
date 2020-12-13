package javaStaticKey;

import org.junit.Test;

import java.util.Arrays;

public class TestReverseInOrder {
    @Test
    public static void main(String[] args) {
        String str3 = "This is a new way of reversing";
        String rev1 = "";
        String[] a = str3.split(" ");
        System.out.println(a[2]);
        int num=a.length;
        for (int i=num-1;i>=0;i--) {
            rev1 =rev1+" "+a[i];

        }
        System.out.println(rev1.trim());
    }
}
