package javaArrays;

import java.util.HashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {1,1,1,1,2,3,4,5,6,5,5,5,5,2,2};
        HashSet <Integer>set = new HashSet<>();
        for(int i : arr){
            set.add(i);
        }

        System.out.println(set);
    }
}
