package Variables_DataTypes.Strings;

public class Reverse {
    public static void main(String[] args) {
        String input = "madam";
        System.out.println("Original String: " + input);
        String reversed = reverseString(input);
        System.out.println("Reversed String: " + reversed);

        if(input.equals(reversed)){
            System.out.println("palindrome");
        } else{
            System.out.println("is not a palindrome");
        }
    }

    // Method to reverse a string without using built-in methods
    public static String reverseString(String str) {
        char[] charArray = str.toCharArray();
        int left = 0;
        int right = charArray.length - 1;

        // Swap characters from start and end until the middle
        while (left < right) {
            // Swap characters at left and right indices
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;

            left++;
            right--;
        }



        // Convert the character array back to a string
        return new String(charArray);
    }


}
