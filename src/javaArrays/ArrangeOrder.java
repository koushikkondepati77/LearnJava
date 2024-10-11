package javaArrays;

public class ArrangeOrder {
    public static void main(String[] args) {
        int[] arr = {23,12,42,21,35};
        int temp;

        for(int i = 0; i<5;i++){
            for(int j=0;j<5-i-2;j++){
                if(arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        for(int i: arr){
            System.out.println(i);
        }
    }
}
