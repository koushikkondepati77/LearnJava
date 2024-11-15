package javaStrings;

public class JavaReverseString {
    public static void main(String[] args) {
        String str = "koushik";
        System.out.println(str);
        char[] c = str.toCharArray();
        for(int i = 0; i<c.length;i++){
            System.out.println(c[i]);
        }

        String reverseString = reversed(str); //kihsuok
        System.out.println(reverseString);

        if(str.equals(reverseString)){
            System.out.println("is palindrome");
        } else{
            System.out.println("is not a palindrome");
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
