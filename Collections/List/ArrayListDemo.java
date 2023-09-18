
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
// import java.util.List;

public class ArrayListDemo {

    public static void main(String[] args) {
        // declaring arraylist
        // List al = new ArrayList();
        // ArrayList <Integer> al = new ArrayList<Integer>();
        // ArrayList <String> al = new ArrayList<String>();
        // ArrayList <Object> al = new ArrayList<Object>();

        

        ArrayList al = new ArrayList();

        // add new Element to the arraylist
        al.add(100);
        al.add("welcome");
        al.add(15.5);
        al.add('A');
        al.add(true);

        System.out.println(al);  //[100, welcome, 15.5, A, true]

        // size()
        System.out.println(al.size());  //5 

        System.out.println(al.remove(1));  //welcome
        // System.out.println(al.remove(15.5));  //true
        System.out.println(al);     // [100, 15.5, A, true]

        // inserting new element
        al.add(2, "python");
        System.out.println(al);     //[100, 15.5, python, A, true]

        // retrieve specific element
        System.out.println(al.get(2));      //python

        // repleacing element
        al.set(2, "C#");
        System.out.println(al);  //[100, 15.5, C#, A, true]

        // search 
        System.out.println(al.contains("C#")); //true

        // isEmpty()
        System.out.println(al.isEmpty()); // false

        System.out.println("Reading elements using loops");
        // for loop
/*       for(int i=0; i< al.size();i++){
            System.out.println(al.get(i));
        }
        // for..each loop
        for(Object e :al){
            System.out.print(e+" ");
        }
        // iterator
        Iterator it = al.iterator(); 
        while(it.hasNext()){
            System.out.print(it.next()+" ");
      }
*/ 
        // addAll()
        ArrayList al2 = new ArrayList();

        al2.add("A");
        al2.add("B");
        al2.add("C");
        al2.add("X");
        al2.add("Y");
        al2.add("Z");

        ArrayList al3 = new ArrayList();
        al3.addAll(al2);
        System.out.println(al3);
        al2.addAll(al);
        System.out.println(al2);


        // removeAll()
        al3.removeAll(al2);
        System.out.println(al3);

        // sort()
        Collections.sort(al2);
        System.out.println(al2);

        Collections.sort(al2, Collections.reverseOrder());
        System.out.println(al2);

        // shuffling 
        Collections.shuffle(al2);
        System.out.println(al2);

        // cvonvert array into arraylist

        String arr[] = {"dog", "cat", "elephant"};
        for(String value:arr){
            System.out.println(value);
        }


    ArrayList convArr = new ArrayList(Arrays.asList(arr)); 
    System.out.println(convArr);
    }
}



/*
 * default location allocated in ArrayList is 10
 * it is implemented from list interface, so index is important
 * duplicates are allowed 
 * insertion order is preserved
 * 
 * ArrayList al = new ArrayList();
 * ArrayList <String> al = new ArrayList <String>();
 * ArrayList <Object> al = new ArrayList <Object>();
 * 
 * 
 * add(object e);
 * add(index, object e);
 * remove(item);
 * size();
 * get(index);
 * set(index, object e);
 * contains(object e);
 * al.isEmpty();
 * al.addAll(Collection c);
 * al.removeAll(collection c);
 * Collections.sort(al)
 * Collections.shuffle(al);
 * ArrayList convArr = new ArrayList(Arrays.asList(arr));
 * Collections.sort(al, Collections.reverseOrder());
 * 
 * 
 */