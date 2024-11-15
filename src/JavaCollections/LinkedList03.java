package JavaCollections;

import java.util.LinkedList;

public class LinkedList03 {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();

        l.add("dog");
        l.add("dog");
        l.add("cat");
        l.add("horse");

        System.out.println(l); //[dog, dog, cat, horse]
        l.addFirst("tiger");
        l.addLast("elephant");
        System.out.println(l); //[tiger, dog, dog, cat, horse, elephant]
        l.getFirst(); //tiger
        l.getLast(); //elephant
        l.removeFirst();
        l.removeLast();
        System.out.println(l); //[dog, dog, cat, elephant]

    }
}
