package JavaCollections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet01 {
    public static void main(String[] args) {
        //duplicates not allowed
        //insertion order is not preserved
        //will insert the elements by using hashcode concept thats why searching elemnts in hashset is faster
        //heterogenous data is supported
        //nulls also allowed

        //when ur program has more number of searching then we can go for hashset

        //default declaration
        HashSet hs = new HashSet();
        // initial size of hashset is 16, //it will by-default let u store 16 elements.
        //apart from default initial size it also has loadFactor or fillratio default value is 0.75
        //HashSet hs = new HashSet(100, (float)0.95); //we can always configure the locations and loadfactor
        //HashSet <Integer> hs = new HashSet<Integer>(); //we can always restrict to our desired datatype

        hs.add(100);
        hs.add("koushik");
        hs.add(5.56);
        hs.add('K');
        hs.add(true);
        hs.add(null);

        System.out.println(hs); //will not maintain any order - example - [null, koushik, 100, K, 5.56, true]

        //remove()
        hs.remove(5.56);
        System.out.println("after removing the element " + hs);

        //contains()
        System.out.println( hs.contains("welcome")); //false
        System.out.println( hs.contains('K')); //true
        System.out.println(hs.isEmpty()); //false

        //we can read the elements from hashset only by using for each loop and Iterator method

        //reading elements by for each loop

        for(Object i:hs){
            System.out.println(i);
        }

        //using Iterator class

        Iterator it = hs.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }
}
