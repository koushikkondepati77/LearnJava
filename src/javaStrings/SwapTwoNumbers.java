package javaStrings;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        int a = 5, b = 10;
        System.out.println(a + " " + b);
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println(a + " " + b);
    }
}
