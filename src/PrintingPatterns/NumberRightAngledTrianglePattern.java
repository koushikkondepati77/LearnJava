package PrintingPatterns;
//        1
//        1 2
//        1 2 3
//        1 2 3 4
//        1 2 3 4 5


public class NumberRightAngledTrianglePattern {
    public static void main(String[] args) {

        int[] arr = new int[5];

        for(int i = 0; i<5;i++){
            arr[i] = i+1;
        }

        for (int i = 0; i<5; i++){
            for(int j=0;j<=i;j++){
                System.out.print(arr[j] + " ");
            }
            System.out.println();
        }
    }
}
