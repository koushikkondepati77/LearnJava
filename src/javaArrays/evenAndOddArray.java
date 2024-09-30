package javaArrays;

public class evenAndOddArray {
    public static void main(String[] args) {
        int[] a = {11,21,31,44,50};
        for(int x: a){
            if(x%2==0){
                System.out.println(x + "is a even number");
            } else{
                System.out.println(x + "is a odd number");
            }
        }
    }
}
