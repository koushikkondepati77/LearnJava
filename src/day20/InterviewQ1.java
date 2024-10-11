package day20;
//write a code to print a pattern using java Iterator
//        1
//        1 2
//        1 2 3
//        1 2 3 4
//        1 2 3 4 5

import java.util.ArrayList;
import java.util.Iterator;

public class InterviewQ1 {

    public static void main(String[] args) {
        ArrayList <Integer>myList = new ArrayList<Integer>();

        int size = 5;
        for(int i=1;i<=size;i++){
            myList.add(i);
        }

        System.out.println(myList);



        for(int i = 1; i <= 5; i++){
            Iterator it = myList.iterator();

            int count = 0;

            while(it.hasNext() && count<i ){
                System.out.print(it.next() + " ");
                count++;
            }
            System.out.println();
        }





    }
}
