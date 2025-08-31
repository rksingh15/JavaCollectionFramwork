

import java.util.*;



class Check implements Comparator<Integer> {  // ye size ke hisab se sort karne ke liye hai
    @Override
    public int compare(Integer o1, Integer o2) {
        // return  o2-o1; // descending order
        return o1 - o2; // ascending order
    }
    
}
class StringCheck implements Comparator<String> {  // ye size ke hisab se sort karne ke liye hai
    @Override
    public int compare(String o1, String o2) {
        // return  o2.length()-o1.length(); // descending order
        return o1.length() - o2.length(); // ascending order
    }
    
}

public class Comparartorclalss
{
    public static void main(String[] args) {
        
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(1);
        list.add(3);
        list.add(2);
        list.add(4);

        System.out.println("Original List:");
        System.out.println(list);
        list.sort(new Check());

        System.out.println("Sorted List: with comparator");
        System.out.println(list);






        ArrayList<String> str = new ArrayList<>();
        str.add("apple");


        str.add("banana");
        str.add("kiwi");
        str.add("grape");
        str.add("mango");
        str.add("watermelon");
        System.out.println("Original List:");
        System.out.println(str);
        str.sort(new StringCheck());
        System.out.println("Sorted List: with comparator");
        System.out.println(str);
    }
}