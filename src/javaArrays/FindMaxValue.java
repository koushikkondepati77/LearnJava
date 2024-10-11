package javaArrays;

public class FindMaxValue {
    public static void main(String[] args) {
        int[] arr = {12,3,60,32,98,33};

        int maxValue = arr[0];

        try{
            for(int i=1;i<arr.length;i++){
                if(arr[i]>maxValue){
                    maxValue = arr[i];
                }
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
        }


        System.out.println(maxValue);
    }
}
