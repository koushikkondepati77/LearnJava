package day20;

import java.util.HashMap;

public class HashMapDemo2 {
    public static void main(String[] args) {
        HashMap <Integer,String>myMap = new HashMap<Integer,String>();

        myMap.put(1,"koushik");
        myMap.put(2,"jayanth");
        myMap.put(1,"chinni");
        myMap.put(2,"ramesh");
        myMap.put(3,"karthik");
        myMap.put(4,"kalyani");

        System.out.println(myMap.keySet());
        System.out.println(myMap.entrySet());
        System.out.println(myMap.values());

        //String[] strArray =

    }
}
