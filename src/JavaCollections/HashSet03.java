package JavaCollections;

import java.util.HashSet;

public class HashSet03 {
    public static void main(String[] args) {
        //union , intersection, difference

        HashSet <Integer> set1 = new HashSet<Integer>();

        set1.add(1);
        set1.add(2);
        set1.add(3);

        System.out.println("set1 : " + set1);

        HashSet <Integer> set2 = new HashSet<Integer>();

        set2.add(3);
        set2.add(4);
        set2.add(5);

        System.out.println("set2 : " + set2);

        //union
        set2.addAll(set1);
        System.out.println("union of set2 and set1 " + set2);

    }
}
