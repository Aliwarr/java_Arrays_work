## What is collections?
```
1: Group of Objects is called Collections
eg. Group of Students, Group of teachers etc is called as collection

2: Collection is a single entity which represent multiple objects

```
## What is collection Framework
```
In Java, to represent a group of Objects in a single entity we need Classes and Interfaces. So, Collection Framework provide us these classes and interfaces

```

## Why Collections framework comes into existance
```
There where Some problems in the primitive types of data type like, for array:
a: homogeneous data (same type of data)
b: fixed size (not growable in nature)
c: not implemented by Data Structure i.e. no ready made methods are available, we have to write logic for everything

Object a[] = new Object[5];

So, to deal with these issues we use Collections framework
Collections are used when you want your code to be more flexible and reusable.

```
## Classes and Interfaces available in Collections Framework

```
0: List
a: ArrayList
b: LinkedList
c: stack

1: Queue
c: LinkedList
d: priorityQueue
e: ArrayDeque

2: Set
f: HashSet
g: LinkedHashSet
h: TreeSet
i: EnumSet

3: Map
j: HashMap
k: LinkedHashMap
l: TreeMap
m: Hashtable

```

## What common operations we can do on collection framework
```
Collection(Interface)

    Collections(Class) : present in java.util package

        add(Object O)
        addAll(Collection C)
        remove(Object O)
        removeAll(Collection C)
        retainAll(Collection C)
        contains(Object O)
        containsAll(Collection C )
        clear()
        size()
        isEmpty()
        toArray()
        iterator()
        sort()



```

## Heirarchy of Collection Interface
```
                    Collection(I)

List(I)             Set(I)              Queue(I)

ArrayList(C)        HashSet(C)           PriorityQueue(C)

LinkedList(C)       LinkedHashSet(C)     ArrayDeque(C)

Vector(C)

Stack(I)      



Map(I)

HashMap(C)      
LinkedHashMap(C)

```


## List Interface
```
a: it is the child interface of collection interface
b: Insertion order will be preserved
c: duplicates are also allowed

```

## Set Interface
```
a: it is also the child interface of collections interface
b: insertion order not preserved 
c: duplicates are not allowed

```

## Queue Interface
```
a: it is also the child interface of collections interface
b: we require a queue, whenever we have a group of objects which are prior to processing

```

## Map Interface
```
a: it is not the child interface of collections Interface
b: it is preferred when object has to be store in the form of key-value pair
c: keys cant be duplicated
d: values can be duplicated

```