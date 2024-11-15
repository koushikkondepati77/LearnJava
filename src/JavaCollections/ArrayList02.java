package JavaCollections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList02 {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();

        al.add("X");
        al.add("Y");
        al.add("Z");
        al.add("A");
        al.add("B");
        al.add("C");

        ArrayList al_dup = new ArrayList();

        al_dup.addAll(al); // adding all the elements of al(ArrayList) into al_dup(ArrayList)

        System.out.println(al_dup);

        al_dup.removeAll(al); //removes all the group of objects or elements from the al_dup(arrayList)

        System.out.println("After Removing " + al_dup);

        System.out.println("Before sorting " + al);

        Collections.sort(al);

        System.out.println("After sorting " + al);

        Collections.sort(al,Collections.reverseOrder());

        System.out.println("After sorting in reverse order" + al);

        //shuffing order

        Collections.shuffle(al);

        System.out.println("After shuffling " + al);
    }
}
