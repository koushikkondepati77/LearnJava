package day20;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo1 {
    public static void main(String[] args) {
        HashSet mySet = new HashSet();
        //Set mySet = new HashSet(); this is also correct

        //adding data to hashset
        mySet.add(100);
        mySet.add("koushik");
        mySet.add(null);
        mySet.add('K');
        mySet.add(100);
        mySet.add(null);

        //printing hashset
        System.out.println(mySet);

        //inserting element into a hashset is not possible, because it doesn't follow the order
        //accessing the specific element is also not possible because of no index
        // so inorder to access any specific elemnets in the hashset we have to convert it into arraylist

        ArrayList al = new ArrayList(mySet);
        System.out.println(al);
        System.out.println(al.get(2));

        //read all the elements
        for (Object x:mySet){
            System.out.println(x);
        }

        //reading data from hashset using iterator
        Iterator it = mySet.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        //size of the hashset
        mySet.size();

        //remove all the elements
        mySet.clear();




    }
}
