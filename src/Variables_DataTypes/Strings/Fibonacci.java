package Variables_DataTypes.Strings;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 10;
        int num1 = 0;
        int num2 = 1;
        System.out.print("Fibbonacci series : " + num1 + ", " + num2);
        for(int i = 2; i < n;i++){
            int num3 = num1 + num2;
            System.out.print(", " + num3);
            num1 = num2;
            num2 = num3;
        }
    }
}
