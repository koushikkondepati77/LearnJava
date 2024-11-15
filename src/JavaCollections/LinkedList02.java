package JavaCollections;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedList02 {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();

        l.add("X");
        l.add("Y");
        l.add("Z");
        l.add("A");
        l.add("B");
        l.add("C");

        LinkedList l_dup = new LinkedList();

        l_dup.addAll(l);
        //sort
        //sorting can be done in linkedlist only when we have homogenous data
        Collections.sort(l_dup);
        System.out.println("After Sorting " + l_dup);
        //shuffle
        Collections.shuffle(l_dup);
        System.out.println("After shuffling " + l_dup);
        //reverse order
        Collections.sort(l_dup,Collections.reverseOrder());
        System.out.println("reverse order sorting " + l_dup);
        l_dup.removeAll(l);
        System.out.println("After removing all the elements " + l_dup);


    }
}
