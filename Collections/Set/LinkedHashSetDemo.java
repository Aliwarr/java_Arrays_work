package Set;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        // LinkedHashSet <Integer>lset = new LinkedHashSet<Integer>();
        LinkedHashSet lset = new LinkedHashSet();
        
        lset.add(100);
        lset.add(200);
        lset.add(300);
        lset.add(400);
        lset.add(500);

        System.out.println(lset);
        

        // rest allmethods of hashSet are valid here
        // practice with your own
    }
}
/*
 * duplicates not allowed
 * insertion order is preserved
 * underlaying data structure is hashtable+linkedlist
 * initial size 16
 * load factor 0.75
 */
