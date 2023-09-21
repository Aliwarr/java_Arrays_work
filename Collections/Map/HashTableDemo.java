package Map;

import java.util.Hashtable;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

public class HashTableDemo {
    public static void main(String[] args) {
        // Hashtable t = new Hashtable(); //default capacity 11, loadfactor 0.75
        // Hashtable t = new Hashtable(initial capacity);  loadfactor 0.75
        // Hashtable t = new Hashtable(initial capacity, (float) loadfactor);
        Hashtable <Integer, String> t = new Hashtable<>();

        t.put(101, "john");
        t.put(102, "david");
        t.put(103, "smith");
        t.put(104, "mary");
        t.put(105, "tye");
        // t.put(null, "X");
        // t.put(105, null);

        System.out.println(t);

        System.out.println(t.get(103));

        t.remove(103);
        System.out.println(t);

        System.out.println(t.containsKey(102));
        System.out.println(t.containsValue("david"));
        System.out.println(t.isEmpty());

        System.out.println(t.keySet());
        System.out.println(t.values());

        for(int k :t.keySet()){
            System.out.println(k+" "+t.get(k));
        }
         
        // enteries

        for(Map.Entry entry:t.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getvalue());
        }
        //iterator

        Set s = t.entrySet();

        Iterator itr = s.iterator();
        while(itr.hasNext()){
           Map.Entry entry =(Entry) itr.next();
           System.out.println(entry.getKey()+" "+entry.getValue());
        }

    }
}
/*
 * key should be associated with the value
 * whatever the method avialble in map is avialaible in both hash map and hashtable
 * similarity
 *  both have key value pair
 *  underlaying data structure is hashtable(hashcode)
 * 
 * difference
 *  hashtable is synchronized
 *  at a time only one thread aceess is allowed
 *  threadsafe
 *  performance is low
 *  nulls can not be accepted either as a key or value
 *  hashtable is related to some old technology
 *  legacy class of java
 * 
 *  hashmap is non synchronized
 *  multiple threads can b allowed at a time
 *  not threadsafe
 *  performance is faster
 *  single null is allowed in key and multiple in values
 *  
 * 
 */
