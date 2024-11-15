package JavaCollections;

//LinkedList is preffered if we have more number of insertion or deletion operations
//we shouldnot prefer linkedlist if we have more number of retrievals
//most of the times linkedlist is preffered to develop stacks and queues
//linkedlist is implemented from List(I) and also Deque(I)
//stack[LIFO or FILO] QUEUE[FIFO]

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList01 {
    public static void main(String[] args) {
        //declare linkedlets
        LinkedList l = new LinkedList(); // this linkedlist stores heterogenous data
        //LinkedList <Integer> l = new LinkedList<Integer>();

        //add elements into linkedlist

        l.add(100);
        l.add("koushik");
        l.add(15.5);
        l.add(true);
        l.add(null);
        l.add('K');

        System.out.println(l);
        System.out.println(l.size());
        l.remove(2);
        System.out.println("after removing the latest list is " + l);
        l.remove(null);
        System.out.println("after removing by passing the value " + l);
        l.add(2,"kondepati");
        System.out.println("adding in the middle of list by index " + l);
        l.set(0,1002069104);
        System.out.println("updating the exixting value " + l);
        System.out.println("retireving the value by passing index " + l.get(0));

        //contains
        System.out.println(l.contains("koushik")); //true
        System.out.println(l.contains("java")); //false
        System.out.println(l.isEmpty()); //false

        System.out.println("read the data using for loop");
        for(int i = 0; i<l.size();i++){
            System.out.println(l.get(i));
        }

        System.out.println("read the data using for each loop");
        for(Object i:l){
            System.out.println(i);
        }

        System.out.println("read the data using Iterator");
        Iterator it = l.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }



    }
}
