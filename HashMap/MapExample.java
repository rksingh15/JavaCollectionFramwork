/*1. Definition

HashMap Java Collections Framework ka ek class hai.

Ye Map interface implement karta hai.

Data ko key–value pair ke form me store karta hai.

-----------------------------------------------------------------

2. Properties of HashMap

Keys unique hoti hain → duplicate key allow nahi karta (overwrite ho jaati hai).

Values duplicate ho sakti hain → ek hi value multiple keys me ho sakti hai.

Null key allowed hoti hai (sirf 1), aur multiple null values allowed hoti hain.

Order maintain nahi karta → elements random order me dikhte hain.

Fast performance → put/get ka average time complexity O(1) hota hai.
*/
// --------------------------------------------------------------
/* . Important Methods

put(key, value) → ek entry add/update karta hai.

get(key) → value return karta hai key ke basis pe.

remove(key) → key-value pair delete karta hai.

containsKey(key) → check karta hai key present hai ya nahi.

containsValue(value) → check karta hai value present hai ya nahi.

size() → total entries batata hai.

isEmpty() → empty hone ka check karta hai.

keySet() → saare keys return karta hai.

values() → saari values return karta hai.

entrySet() → key-value pairs return karta hai.  */

import java.util.HashMap;
import java.util.Map;
class MapExample {
    public static void main(String[] args) {
        // HashMap banate hain
        Map<Integer, String> map = new HashMap<>();

        // Entries add karte hain
        map.put(1, "Apple");
        map.put(2, "Banana");

        map.put(3, "Orange");
        map.put(4, "Grapes");
        map.put(5, "Pineapple"); // Null key allowed
        map.put(6, null); // Null value allowed
        map.put(7, null); // Multiple null values allowed
        map.put(8, "Apple"); // Duplicate values allowed
        // map.put(1, "Mango"); // Duplicate key not allowed, will overwrite
        // map.put(null, "Papaya"); // Null key allowed, only one null key
        // map.put(null, "Kiwi"); //

    

        // Ek entry update karte hain (key 2 ke liye)
        map.put(2, "Mango"); // Banana overwrite ho jaayega

        // Ek entry remove karte hain (key 3 ke liye)
        map.remove(3);

        // Check karte hain agar key 1 present hai
        if (map.containsKey(1)) {
            System.out.println("Key 1 is present with value: " + map.get(1));
        }

        // Check karte hain agar value "Grapes" present hai
        if (map.containsValue("Grapes")) {
            System.out.println("Value 'Grapes' is present in the map.");
        }

        // Saare keys print karte hain
        System.out.println("Keys: " + map.keySet());

        // Saari values print karte hain
        System.out.println("Values: " + map.values());

        // Saare key-value pairs print karte hain
        System.out.println("Entries:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
        System.out.println("-------------------Method 2-------------------------------");
        //method 2 print
        for(Integer key:map.keySet())
        {
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        }
        System.out.println("-------------------Method 3-------------------------------");
        // ---------------------------------------------
        // Method 3 print
        map.forEach((key, value) -> System.out.println("Key: " + key + ", Value: " + value));
        // ---------------------------------------------
        // ---------------------------------------------
        


        // Size of the map
        System.out.println("Size of the map: " + map.size());

        // Check if the map is empty
        System.out.println("Is the map empty? " + map.isEmpty());
    }
}
