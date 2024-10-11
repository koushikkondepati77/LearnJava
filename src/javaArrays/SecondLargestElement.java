package javaArrays;

import java.util.Scanner;

public class SecondLargestElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of an array :");
        int size = input.nextInt();
        int[] arr = new int[size];
        System.out.println("enter the elements into an array");
        for(int i: arr){
            arr[i] = input.nextInt();
        }

        System.out.println("display array :" + arr);

        int firstHighest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;


        for(int i: arr){
            if(i > firstHighest){
                secondHighest = firstHighest;
                firstHighest = i;
            }
//            else if (i>secondHighest && i!=firstHighest) {
//                secondHighest = i;
//            }
        }

        System.out.println("firstHighest :" + firstHighest);
        System.out.println("secondHighest :" + secondHighest);
    }
}
