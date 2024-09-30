package javaArrays;

public class searchElementArray {
    public static void main(String[] args) {
        int[] a = {100,200,300,400,500};
        int sElement = 400;
        int count = 0;
        for(int x : a){

            if(x == sElement){
                System.out.println("element foiund at " + count + " index");
                break;
            }
            count++;
        }
    }
}
