package javaArrays;

public class fibonocci {
    public static void main(String[] args) {
        int n = 10;
        int num1 = 0;
        int num2 = 1;
        int num3;
        System.out.print("Fibbonocai series : " + num1 + ", " + num2);
        for(int i = 2; i < n; i++)
        {
            num3 = num2 + num1;
            num2 = num3;
            num1 = num2;
            System.out.print(", " + num3);
        }
    }
}
