package PrintingPatterns;


public class DescNumberLeft {
    public static void main(String[] args) {
        int[] arr = new int[5];
        for(int i = 0;i<5;i++){
           arr[i] = i+1;
        }

        for(int i=0;i<5;i++){

            for(int j=4;j>=i;j--){
                System.out.print(arr[j]);
            }
            System.out.println();
        }
    }
}
