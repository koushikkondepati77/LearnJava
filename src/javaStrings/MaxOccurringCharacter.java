package javaStrings;

import java.util.HashMap;

public class MaxOccurringCharacter {
    public static void main(String[] args) {
        String str = "koushikkondepati";

        HashMap <Character,Integer>charCout = new HashMap<>();

        for(char c: str.toCharArray()){
            charCout.put(c,charCout.getOrDefault(c,0)+1);
        }

        char maxChar = str.charAt(0);

        int maxCount = 0;
        System.out.println(charCout.keySet());
        for(char c : charCout.keySet()){
            if(charCout.get(c) > maxCount){
                maxCount = charCout.get(c);
                maxChar = c;
            }
        }
        System.out.println(maxChar);
    }
}
