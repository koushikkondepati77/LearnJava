package javaArrays;

//two dimensional array arr[][]

public class twoDimensionalArray {
    public static void main(String[] args) {
        //approach 1
        int[][] arr = new int[2][2]; //array of 2 rows and 2 columns

        //approach 2
        int a[][] = {
                {100,200},
                {300,400},
                {500,600}
        };

        for(int i = 0; i <a.length;i++) {
            //System.out.println(i+ " ");
            for(int j =0 ; j<a[i].length; j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        //enchanced for loop
        for(int b[]:a){
            for(int c : b){
                System.out.println(c);
            }
        }



    }

}
