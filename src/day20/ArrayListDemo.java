package day20;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
    public static void main(String[] args) {
        //declaration
        ArrayList mylist = new ArrayList();

        //adding data into arraylist
        mylist.add(100);
        mylist.add(null);
        mylist.add("koushik");
        mylist.add(100);
        mylist.add('A');
        mylist.add(true);

        //size of arraylist
        System.out.println("size of arraylist :" + mylist.size());

        //print the arraylist
        System.out.println("mylist :" + mylist);

        //remove the index 3 data from the arraylist
        mylist.remove(3);

        //remove data from array list printing
        System.out.println("after removing 3rd index from the array list :"+ mylist);

        //modifying the existing data in the arraylist
        mylist.set(2,"kondepati");

        //printing the arraylist after modification
        System.out.println("printing the arraylist after modification :" + mylist);

        //inserting the element inside arraylist
        mylist.add(3,"koushik");

        //arraylist after insertion
        System.out.println("arraylist after insertion :" + mylist);

        //size of updated arraylist
        System.out.println("size of updated arraylist :" + mylist.size());

        //read the elements inside arraylist
        System.out.println("using for loop");
        for(int i = 0; i < mylist.size(); i++){
            System.out.println("position " + i + " : " +mylist.get(i));
        }

        //using iterator
        //by using iterator also we can read the data in collection
        System.out.println("using iterator");
        Iterator it = mylist.iterator();

        while (it.hasNext()){
            System.out.println(it.next());
        }

        //using the enhanced for loop
        System.out.println("using enhanced for loop");
        for(Object x : mylist){
            System.out.println(x);
        }



        //remove all the elements at a time
        mylist.clear();
        System.out.println("after removing all the elements " + mylist.isEmpty());

    }
}
