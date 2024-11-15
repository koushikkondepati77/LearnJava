package JavaCollections;
//collection is a single entity that holds group of objects or which represents multiple objects
//collection framework defines the different classes and interfaces by which we can represent the group of objects

import java.util.Hashtable;

public class HashTable01 {
    public static void main(String[] args) {
        //Hashtable t = new Hashtable(); //this type hashtable object can be able to store any type of key and any type of value
        //the above statement is the empty Hashtable object creation // default capacity is 11, load factor is 0.75

        //Hashtable t = new(initial capacity); //create hashtable object with some capacity

        //Hashtable t = new Hashtable(initial capacity, fill ratio or load factor); // capacity - integer type, loadfactor - floattype

        Hashtable <Integer,String> t = new Hashtable<Integer,String>();

        //keys should be unique, values can be duplicated
        //nulls are not allowed as key or value in hashtable
        //insertion order is not preserved

        t.put(101,"chinni");
        t.put(102,"koushik");
        t.put(103,"chotu");
        t.put(104,"chinni");

        System.out.println(t);
        System.out.println(t.get(102));

        t.remove(104);
        System.out.println(t);

        System.out.println(t.isEmpty()); //returns false
        System.out.println(t.containsKey(101)); //true
        System.out.println(t.containsValue("chotu")); //true
        System.out.println(t.keySet()); //returns all the keys as set object
        System.out.println(t.values()); //returns all the values as a collection

        for(int k:t.keySet()){
            System.out.println(k+" "+t.get(k));
        }



    }
}
