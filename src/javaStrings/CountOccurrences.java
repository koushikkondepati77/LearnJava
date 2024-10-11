package javaStrings;

import java.util.HashMap;

public class CountOccurrences {
    public static void main(String[] args) {
        String str = "koushikkondepati";
        char[] arr = str.toCharArray();

        HashMap <Character,Integer>coutChar = new HashMap<>();
        for(char c : arr){
            coutChar.put(c,coutChar.getOrDefault(c,0)+1);
        }

        System.out.println("character and their occurrences " + coutChar.entrySet());
        int maxCount = 0;
        char maxOccurChar = str.charAt(0);
        System.out.println("character and their occurrences " + coutChar.keySet());
        for(char d : coutChar.keySet()){
            if(coutChar.get(d) > maxCount){
                maxCount = coutChar.get(d);
                maxOccurChar = d;
            }
        }

        System.out.println("max Occurred char :" + maxOccurChar);


    }
}
