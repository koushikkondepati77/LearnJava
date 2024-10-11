package javaStrings;

import java.util.Arrays;

public class AnagramCheck {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        boolean isAnagram = arr1.equals(arr2);
        if(isAnagram){
            System.out.println("is an anagram");
        } else {
            System.out.println("is not an anagram");
        }

    }
}
