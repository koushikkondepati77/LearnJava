package JavaCollections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMap01 {
    public static void main(String[] args) {

        //default declaration
        //HashMap hmap = new HashMap();
        HashMap <Integer,String> hmap = new HashMap<Integer,String>();

        hmap.put(1,"koushik");
        hmap.put(2,"chinni");
        hmap.put(3,"chotu");
        hmap.put(4,"jayanth");
        hmap.put(5,"koushik");
        hmap.put(6,"chinni");
        hmap.put(7,"chotu");
        hmap.put(8,"jayanth");

        System.out.println(hmap); //{1=koushik, 2=chinni, 3=chotu, 4=jayanth}

        System.out.println(hmap.get(1)); //koushik

        hmap.remove(7);

        System.out.println(hmap);

        System.out.println(hmap.containsKey(7)); //false
        System.out.println(hmap.containsValue("koushik")); //true

        System.out.println(hmap.keySet()); // prints all the keys and the returntype Set [1, 2, 3, 4, 5, 6, 8]
        System.out.println(hmap.values()); // return type is Collection [koushik, chinni, chotu, jayanth, koushik, chinni, jayanth]
        System.out.println(hmap.entrySet()); // all entries as a Set [1=koushik, 2=chinni, 3=chotu, 4=jayanth, 5=koushik, 6=chinni, 8=jayanth]

        for(Object i:hmap.keySet()){
            System.out.println(i);
        }

        for(Object i:hmap.values()){
            System.out.println(i);
        }

        for(Object i:hmap.keySet()){
            System.out.println(i + " " + hmap.get(i));
        }

        for(Map.Entry entry:hmap.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        Set s = hmap.entrySet();
        Iterator it = s.iterator();
        while(it.hasNext()){
            Map.Entry entry = (Map.Entry)it.next();
            System.out.println(entry.getKey() + " " + entry.getValue());

        }

    }
}
