import java.util.HashMap;
import java.util.Map;

public class StringProgram {
    public static void main(String[] args) {

        String str = "koushikkondepati";
        //reverseString(str);
        isPalindrome(str);
        System.out.println(isPalindrome(str));

    }

    public static int[] findLargetAndSmallest(){
        int[] arr = {1,20,12,34,6};
        int highest = arr[0];
        int smallest = arr[arr.length-1];

        for(int num : arr){
            if(num>highest){
                highest = num;
            }

            if(num<smallest){
                smallest= num;
            }
        }
        return new int[]{smallest,highest};
    }

    public static boolean isPalindrome(String str){
        int i = 0;
        int j = str.length() - 1;
        while(i<j){
            if(str.charAt(i) != str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void reverseString(String str){

        StringBuilder reversed = new StringBuilder();
        char[] charArray = str.toCharArray();
        for( int i = charArray.length -1; i>=0; i--){
            reversed.append(charArray[i]);
        }



        System.out.println(reversed.toString());
    }

    private static void duplicateCharacters(String hello) {
        Map<Character, Integer> map = new HashMap<>();
        for (char ch : hello.toCharArray()) {
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }

        for (Map.Entry<Character, Integer> mapp : map.entrySet()) {
            if (mapp.getValue() > 1) {
                System.out.println(mapp.getKey());
                System.out.println(mapp.getValue());
            }
        }
    }
}


