
public class LinkedHashMap {
    public static void main(String[] args) {
      System.out.println("Hello, World!");  
    }
}
/*
 * LinkedHashMap:
 * 1. HashMap ki tarah hi hota hai, lekin ye insertion order
 *   maintain karta hai.
 * ------------------------------------------------------------
 * 2. Jab hum elements ko iterate karte hain, to ye unhe
 *   usi order me dikhata hai jisme wo add kiye gaye the.
 * ------------------------------------------------------------
 * 3. Ye doubly linked list ka use karta hai elements ko order
 *   me rakhne ke liye.
 * ------------------------------------------------------------
 * 4. Performance thoda slow hota hai HashMap ke comparison me,
 *   kyunki isme extra memory use hoti hai order maintain karne ke liye.
 * ------------------------------------------------------------
 * 5. Null keys aur null values dono allow karta hai.
 * ------------------------------------------------------------
 * 6. Common methods: put(), get(), remove(), containsKey(),
 *    containsValue(), size(), isEmpty(), keySet(), values(),
 *    entrySet().
 * ------------------------------------------------------------
 * 7. Use case: Jab hume insertion order me data chahiye hota
 *    hai, jaise caching, maintaining order of elements, etc.
 */
