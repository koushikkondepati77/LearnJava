package javaStrings;

public class RemoveAllWhiteSpaces {
    public static void main(String[] args) {
        String str = "k o u s h i k k    o n   de pa ti";
        System.out.println(str);
        String result = str.replaceAll(" ", "");
        System.out.println(result);
    }
}
