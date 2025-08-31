
import java.util.*;
import java.util.concurrent.*;
// ye agar iteration ke dauraan list ko modify karna ho to ye use karte hain
// ye thread safe bhi hai
class CopyAndWriteArrayList {
    // Implementation of CopyOnWriteArrayList

    public static void main(String[] args) {
   List<String> list=new CopyOnWriteArrayList<>();
    // yaha par humne list banayi hai jo ki CopyOnWriteArrayList ki hai
    // ab hum isme kuch elements add karte hain
    list.add("A");
    list.add("B");
    list.add("C");
    System.out.println("Initial List: " + list);
    // ab hum ek iterator banate hain
   for(String s:list){
    System.out.println(s);

    if(s.equals("B")){
        list.add("D");         // ye bhi add kar sakte hain
        //lekin me ye kaam arraylist me nahi kar sakta ye LinkedList me nahi kar sakta
        //kyuki ye concurrent modification exception dega
        list.remove("A");
    }
   }
    System.out.println("Modified List: " + list);
    }
}
/*
 * This is a placeholder for the CopyAndWriteArrayList class.
 * Actual implementation would go here.
 * This class is typically used in concurrent programming scenarios.
 * It allows safe iteration over a list while it is being modified.
 * Modifications (like add, set, remove) result in a new copy of the underlying array.
 * This is useful in scenarios where reads are more frequent than writes.
 * It is part of the java.util.concurrent package.
 * Common methods include add(E e), remove(Object o), get(int index), size(), etc.
 * It is thread-safe and can be used in multi-threaded environments.
 */