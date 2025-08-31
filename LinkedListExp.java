public class LinkedListExp {
    
}
/*🔹 Important Methods
add(E e)                 // add at end
add(int index, E e)      // insert at specific index
addAll(Collection c)     // add all elements
addAll(int index, c)     // insert collection at index

remove()                 // remove first element
remove(int index)        // remove element at index
remove(Object o)         // remove first occurrence
removeAll(Collection c)  // remove all matching elements
LinkedList<String> animals = new LinkedList<>(Arrays.asList("Dog", "Elephant", "Cat", "Lion", "Tiger"));
LinkedList<String> animalsToRemove = new LinkedList<>(Arrays.asList("Dog", "Lion"));
animals.removeAll(animalsToRemove);
System.out.println(animals); // Output: [Elephant, Cat, Tiger]


clear()                  // remove everything

get(int index)           // get element by index
set(int index, E e)      // replace element at index
size()                   // current size
isEmpty()                // true if empty
contains(Object o)       // check if element present
indexOf(Object o)        // first index of element
lastIndexOf(Object o)    // last index of element
removeFirst()       // remove first element
removeLast()        // remove last element
removeFirstOccurrence(Object o) // remove first occurrence
removeLastOccurrence(Object o)  // remove last occurrence  

removeIf(Predicate filter) // remove if condition matches
removeIf(x -> x%2==0) // remove even numbers


retainAll(Collection c)    // retain only matching elements  ye common elements ko rakhta hai

-------------------------------------------------------------------------
addFirst(E e)        // insert at head
addLast(E e)         // insert at tail
offer(E e)           // add at end (returns true/false)
offerFirst(E e)      // add at head
offerLast(E e)       // add at tail

getFirst()           // returns first element
getLast()            // returns last element
peek()               // first element (null if empty)
peekFirst()          // same as peek()
peekLast()           // last element

poll()               // remove and return first element
pollFirst()          // remove and return first element
pollLast()           // remove and return last element
pop()                // stack style removeFirst()
push(E e)            // stack style addFirst()


 
--------------------------------------------------------------------------*/