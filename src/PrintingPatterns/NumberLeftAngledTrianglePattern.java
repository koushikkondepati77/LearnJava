package PrintingPatterns;

public class NumberLeftAngledTrianglePattern {
    public static void main(String[] args) {
        int[] arr = new int[5];

        for(int i = 0; i < 5; i++){
            arr[i] = i+1;
        }
        int rows = 5;
        for(int i = 0; i<rows; i++){
            for (int j = rows-i;j>0;j--){
                System.out.print(" ");
            }

            for(int k = 0;k<=i;k++){
                System.out.print(arr[k]);
            }

            System.out.println();
        }


    }
}
