package Map;

import java.util.HashMap;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
       
        HashMap <Integer, String> m = new HashMap<Integer, String>();
        //  HashMap m = new HashMap();

         m.put(101, "john");
         m.put(102, "David");
         m.put(103, "scott");
         m.put(104, "mary");
         m.put(105, "tye");
         m.put(103, "X");
         m.put(106, "david");
         System.out.println(m);
         System.out.println(m.get(105));
        m.remove(106);  //remove pair
        System.out.println(m);

        System.out.println(m.containsKey(106));
        System.out.println(m.containsValue("mary"));
        System.out.println(m.isEmpty());

        System.out.println(m.keySet());
        for(Object i : m.keySet()){
            System.out.println(i);
        }


        System.out.println(m.values());
        for(Object i : m.values()){
            System.out.println(i);
        }


        for(Object i : m.keySet()){
            System.out.println(i+"......"+m.get(i));
        }

        // entry methods
        System.out.println(m.entrySet());

        for(Map.Entry entry : m.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }

        // iterator method
        Set s = m.entrySet();

        Iterator itr = s.iterator();
        while(itr.hasNext()){
            Map.Entry entry = (Entry) itr.next();
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}
/*
 * Map is not the chained interface of collectioin interface
 * Map(I) is implemented by two main classes HashMap(C) and HashTable(C)
 * 
 * whwn we have to deal with the objects where key value pair are there so here we use Map
 * 
 * combination of a key and a value is called as data set or pair
 * each key is also an object
 * each value is also an object
 * 
 * duplicate keys are not allowed
 * duplicate values are allowed
 * whwn you trry to add the existing key , then value will be overriden
 * map is the collection of entries
 * one entry is equal to one key and its value
 * 
 * 
 * 
 *              HashMap(C)
 * 
 * underlaying data structure is hashtable
 * insertion order is not preserved
 * duplicate keys arenot allowed
 * duplicate values are allowed
 * null key is allowed only once
 * null values can be multiple
 * when you have more number ofd searching, go for hashMap
 * 
 * HashMap m = new HashMap()
 * 
 * m.put(key,value)
 * m.putAll(map collection)
 * m.get(key)       returns value
 * m.remove(key)    removes the entry(both key and value removes)
 * m.containsKey(key)          return true/false
 * m.containsvalue(Value)       returns true/false
 * m.isEmpty()                  returns true/false
 * m.size()
 * m.clear()                 clears all enteries from map
 * m.keySet()       returns set Object of all keys
 * m.values()       returns Collection of all the values
 * m.entrySet()     returns set of all entrySet
 * 
 * internally there is entry interface for enteries
 * it is inside the hashmap interface
 * 
 * Entry e = new Entry()
 * 
 * e.getKey()  return value
 * e.getValue()
 * e.setValue(Object o)     updates existing values
 */
