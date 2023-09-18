package Set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
    public static void main(String[] args) {
        
        // HashSet hs = new HashSet(); default size 16, load factor 0.75
        // HashSet hs = new HashSet(100); initial size 100, load factor 0.75
        // HashSet hs = new HashSet(100,(float)0.90); initial size 100, load factor 0.90 
        // HashSet <Integer> hs = new HashSet<Integer>();
        HashSet hs = new HashSet();

        // add objects
        hs.add(100);
        hs.add("welcome");
        hs.add(16.5);
        hs.add(true);
        hs.add('A');
        hs.add(null);

        System.out.println(hs);

        // remove 
        hs.remove(16.5);
        System.out.println(hs);

        // contains()
        System.out.println(hs.contains("welcome"));
        System.out.println(hs.contains("xyz"));


        // isEmpty()
        System.out.println(hs.isEmpty());

        // reading elements
    /* 
        for(Object e : hs){
            System.out.println(e);
        }

        Iterator it = hs.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }
    */

        HashSet<Integer> evenNumber= new HashSet<Integer>();
        evenNumber.add(2);
        evenNumber.add(4);
        evenNumber.add(6);
        evenNumber.add(8);
        evenNumber.add(10);

        System.out.println(evenNumber);
        // addAll()

        HashSet<Integer> number= new HashSet<Integer>();
        number.addAll(evenNumber);
        number.add(3);
        System.out.println(number);

        // removeAll()

        number.removeAll(evenNumber);
        System.out.println(number);

        // UNION, INTERSECTION , DIFFERENCE

        HashSet<Integer> set1 = new HashSet<Integer>();
        HashSet<Integer> set2 = new HashSet<Integer>();
        HashSet<Integer> set3 = new HashSet<Integer>();

        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);
        System.out.println(set1);

        set2.add(2);
        set2.add(4);
        set2.add(5);
        System.out.println(set2);

        // UNION
        set1.addAll(set2);
        System.out.println(set1);

        // Intersection
        set1.retainAll(set2);
        System.out.println(set1);

        // difference
        set1.removeAll(set2);
        System.out.println(set1);
        
        // check subset
        System.out.println(set1.containsAll(set2));


    }
}
/*
 * duplicates not allowed 
 * insertion order is not preserved
 * elements will be inserted into the hashset by using hashcodes
 * no index concept here
 * hetrogenous data will be supported
 * null also allowed
 * more number of searching then go for hashset
 * underlaying data structure is hashtable
 * 
 * HashSet hs = new HashSet()
 * HashSet hs = new HashSet(100)
 * HashSet hs = new HashSet(100, 0.95)
 *  initial allocated location is :16 objects
 *  load factor/ fill ratio : 0.75
 * 
 * hashSet is derived form Set interface
 * 
 * 
 * add(object)
 * addAll(collection)
 * remove(object)
 * removeAll(collection)
 * contains(object)
 * containsAll(collection)
 * isEmpty()
 * retainAll(collection)
 */