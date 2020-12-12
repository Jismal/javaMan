package javaStaticKey;

public class StaticPractice {

    public static int number1=100;

    public static void main(String[] args) {
       int outPut= sum(10);
        System.out.println(outPut);
    }
    public static int sum(int num) {
        return num + number1;
    }
}
