package javaArrays;

//single dimensional array
//stores the homegenous data, same datatype


public class oneDimensionalarray {
    public static void main(String[] args) {

        //declaration
        //approach 1
        int[] arr = new int[5]; //array of size 5 integer array
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;

        //String[] arr = new String[5]; //String array
        //char[] arr = new char[5]; //char array

        //approach 2
        int a[] = {1,2,3,4,5};
        //reading the data from an array using normal for loop
        for(int i = 0; i<a.length;i++){
            System.out.println(a[i]);
        }


    }
}
