package day20;

//HashMap is a class implemented Map Interface
//data can be stored in the form of key value pairs.
//key is unique, but we can have duplicate values.
//insertion order is not preserved(index not allowed).

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap <Integer,String>map = new HashMap<Integer,String>();
        //Map <Integer,String>map = new Map<Integer,String>();

        map.put(101,"koushik");
        map.put(102,"kondepati");
        map.put(103,"jayanth");
        map.put(104,"satineni");
        map.put(102,"jishitha");
        map.put(104,"pusuluri");

        //printing the data
        System.out.println("printing my hashmap: " +map);

        //access value of the key
        System.out.println("accessing specific value through the key "+map.get(102));

        //get all the keys from hashmap
        System.out.println(map.keySet()); //[101,102,....]
        System.out.println(map.values()); //[koushik, ......]
        System.out.println(map.entrySet());

        //remove
        map.remove(104);

        //readinig the data in hashmap
        for(int x:map.keySet()){
            System.out.println(x+" : "+ map.get(x));
        }

        //using iterator

        System.out.println("reading hashmap using iterator");
         Iterator<Map.Entry<Integer,String>>it = map.entrySet().iterator();

        while(it.hasNext()){
            Map.Entry<Integer,String> entry = it.next();
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        map.clear();

        map.isEmpty();



    }

}
