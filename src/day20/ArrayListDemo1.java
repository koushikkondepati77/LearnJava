package day20;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo1 {
    public static void main(String[] args) {

        //Declaration
        ArrayList mlist = new ArrayList();
        //List mlist = new ArrayList();
        //ArrayList <Integer>mlist = new ArrayList<Integer>();

        //adding data into arraylist
        mlist.add(100);
        mlist.add("koushik");
        mlist.add('K');
        mlist.add(null);
        mlist.add(100);
        mlist.add("kondepati");
        mlist.add(null);
        mlist.add(null);

        //size of arraylist
        System.out.println("size of arraylist :"+mlist.size());

        //printing the arraylist
        System.out.println("printing the arraylist :"+mlist);

        //reading the arraylist elements using iterator
        Iterator <Object>it = mlist.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }

        //checking arraylist is empty or not
        boolean check = mlist.isEmpty();
        System.out.println(check);



    }
}
