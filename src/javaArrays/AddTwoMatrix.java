package javaArrays;

import java.util.Scanner;

public class AddTwoMatrix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the rows :");
        System.out.println();

        int rows = input.nextInt();
        System.out.print("Enter the columns :");
        System.out.println();
        int cols = input.nextInt();

        int[][] matrix1 = new int[rows][cols]; //matrix1
        int[][] matrix2 = new int[rows][cols]; //matrix2
        int[][] sum = new int[rows][cols];

        System.out.println("Enter the elements into matrix1 :");
        for(int i=0; i<rows;i++){
            for(int j=0; j<cols;j++){
                matrix1[i][j] = input.nextInt();
            }
            System.out.println();
        }
        System.out.println("matrix1");
        for(int i=0; i<rows;i++){
            for(int j=0; j<cols;j++){
                System.out.print(matrix1[i][j]);;
            }
            System.out.println();
        }




        System.out.println("Enter the elements into matrix2");
        for(int i=0; i<rows;i++){
            for(int j=0; j<cols;j++){
                matrix2[i][j] = input.nextInt();
            }
            System.out.println();
        }
        System.out.println("matrix2");
        for(int i=0; i<rows;i++){
            for(int j=0; j<cols;j++){
                System.out.print(matrix2[i][j]);;
            }
            System.out.println();
        }

        System.out.println("matrix1 + matrix2");
        for(int i=0; i<rows;i++){
            for(int j=0; j<cols;j++){
                sum[i][j] = matrix1[i][j] + matrix2[i][j];
                System.out.print(sum[i][j]);
            }
            System.out.println();
        }


    }





}
