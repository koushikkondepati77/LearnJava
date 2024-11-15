package JavaCollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayList03 {
    public static void main(String[] args) {
        String arr[] = {"Dog", "Cat", "Element"};

        for(String value:arr){
            System.out.println(value);
        }

        //converting array into arraylist object
        ArrayList al = new ArrayList(Arrays.asList(arr));
        System.out.println(al);

        System.out.println("reading individual elements using Iterator");

        Iterator it = al.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }
}
