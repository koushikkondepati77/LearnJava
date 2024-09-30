package javaArrays;

public class sumOfArray {
    public static void main(String[] args) {
        int[] a = {100,200,300,400,500};
        int sum = 0;
        for(int x:a){
            sum+=x; // adding the elements one by one
        }
        System.out.println(sum); //printing the sum
    }
}
