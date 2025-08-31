import java.util.*;

class ArrayListExample {

    void display(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(10);
        list.add(10);
        list.add(10);
        list.add(10);
        list.add(20); // adding elements to the list

        list.add(1, 15); // adding an element at index 1

        list.set(1, 17); // replace the element at index 1 to 17

        list.remove(0); // removing the element at index 0
        list.remove(Integer.valueOf(20)); // ✅ removing the element with value 20
        // list.remove(20); // ❌ this will throw IndexOutOfBoundsException
        // object pass karna padtha hai value remove karne ke liye

        System.out.println(list.get(0));
        System.out.println(list.get(1));

        // Iterator Example
        System.out.println("Using Iterator");
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            System.out.printf(it.next() + " ");
        }
// -------------------------------------------------------------------------------------------------------
        // Integer[] arr = { 1, 2, 3 };
        // ArrayList<Integer> list = new ArrayList<>(Arrays.asList(arr));

        // Integer[] arr2 = list.toArray(new Integer[0]);

// --------------------------------------------------------------------------------------------------------
        /*
         * 📘 ArrayList Methods Cheat Sheet
         * 🔹 Basic Methods (CRUD operations)
         * 
         * add(E e) → element add karta hai end me.
         * 
         * add(int index, E element) → specific index pe element insert karta hai.
         * 
         * get(int index) → element fetch karta hai given index pe.
         * 
         * set(int index, E element) → replace karta hai element ko given index pe.
         * 
         * remove(int index) → element remove karta hai given index se.
         * 
         * remove(Object o) → first occurrence of element remove karta hai.
         * 
         * 🔹 Search & Info
         * 
         * contains(Object o) → true/false return karta hai agar element present hai.
         * 
         * indexOf(Object o) → first index of element return karega (ya -1 agar nahi
         * mila).
         * -----------------------------------------------
         * import java.util.*;

public class IndexExample {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 30, 20, 40, 20));

        System.out.println("List: " + list);

        // First occurrence of 20
        System.out.println("indexOf(20): " + list.indexOf(20));  

        // Last occurrence of 20
        System.out.println("lastIndexOf(20): " + list.lastIndexOf(20));

        // If element not found
        System.out.println("indexOf(99): " + list.indexOf(99));  
        System.out.println("lastIndexOf(99): " + list.lastIndexOf(99));
    }
}
-----------------------------------------------------------------------------
         * lastIndexOf(Object o) → last index of element return karega.
         * 
         * size() → kitne elements hain.
         * 
         * isEmpty() → check karta hai empty hai ya nahi.
         * 
         * 🔹 Iteration
         * 
         * iterator() → simple forward-only iterator return karta hai.
         * 
         * listIterator() → bidirectional iterator (forward + backward).
         * 
         * forEach(Consumer<? super E> action) → Java 8 se element traversal using
         * lambda.
         * 
         * 🔹 Bulk Operations
         * 
         * addAll(Collection<? extends E> c) → doosri collection ke saare elements add
         * karega.
         * 
         * addAll(int index, Collection<? extends E> c) → index pe collection insert
         * karega.
         * 
         * removeAll(Collection<?> c) → jo elements dusri collection me hain unko remove
         * karega.
         * 
         * retainAll(Collection<?> c) → sirf common elements rakhega, baaki remove.
         * 
         * clear() → saare elements delete.
         * 
         * 🔹 Conversion
         * 
         * toArray() → Object[] return karega.
         * 
         * toArray(T[] a) → given type ka array return karega.
         */


   /*       import java.util.*;

public class ToArrayExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        // Conversion: ArrayList -> Object[]
        Object[] arr = list.toArray();

        // Printing
        for (Object o : arr) {
            System.out.println(o);
        }
    }
}
----------------------------------------------------------------
import java.util.*;

public class ToArrayExample2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("X");
        list.add("Y");
        list.add("Z");

        // Conversion: ArrayList -> String[]
        String[] arr = list.toArray(new String[0]);

        // Printing
        for (String s : arr) {
            System.out.println(s);
        }
    }
}
---------------------------------------------------------------------
*/

    }
}
