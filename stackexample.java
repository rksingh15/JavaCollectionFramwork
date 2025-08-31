
/*
 * Stack Methods:
 * push(E e)          // add element to top
 * pop()              // remove and return top element
 * peek()             // return top element without removing
 * isEmpty()         // check if stack is empty
 * size()            // current size of stack
 * search(Object o)  // return 1-based position from top, -1 if not
 * empty()            // check if stack is empty
 * // clear()            // remove all elements
 * 
 */

import java.util.Stack;
class stack{
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // Pushing elements onto the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Stack after pushes: " + stack);

        // Popping the top element
        int poppedElement = stack.pop();
        System.out.println("Popped element: " + poppedElement);
        System.out.println("Stack after pop: " + stack);

        // Peeking at the top element
        int topElement = stack.peek();
        System.out.println("Top element: " + topElement);
        System.out.println("Stack after peek: " + stack);

        // Checking if the stack is empty
        boolean isEmpty = stack.isEmpty();
        System.out.println("Is the stack empty? " + isEmpty);

        // Getting the size of the stack
        int size = stack.size();
        System.out.println("Current size of the stack: " + size);

        // Searching for an element
        int position = stack.search(20);
        System.out.println("Position of 20 from top: " + position);

        position = stack.search(40);
        System.out.println("Position of 40 from top: " + position); // Not found, should return -1
    }
}