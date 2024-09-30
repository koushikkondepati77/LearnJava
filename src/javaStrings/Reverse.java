package javaStrings;

import org.junit.Test;

public class Reverse {
    public static void main(String[] args) {
        String input = "bob";
        String s = null;
        System.out.println(s);
        System.out.println("string input :" + input);
        String reverseInput = reversed(input);
        System.out.println("reversed string :" + reverseInput);

        //checking the string is palindrome or not

        if(input.equals(reverseInput)){
            System.out.println("given string is palindrome");
        } else{
            System.out.println("given string is not a palindrome");
        }


    }



    public static String reversed(String str){
        System.out.println();
        char[] c = str.toCharArray();
        int left = 0;
        int right = c.length-1;

        while(left<right){
            char temp = c[left];
            c[left] = c[right];
            c[right] = temp;

            left++;
            right--;
        }



        return new String(c);
    }
}
