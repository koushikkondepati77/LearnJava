package javaStrings;

public class SumOfFirstNNaturalNumbers {
    public static void main(String[] args) {
        int N = 10;
        int sum = 0;

        for(int i=1;i<=N;i++){
            sum += i;
        }

        System.out.println(sum);
    }
}
