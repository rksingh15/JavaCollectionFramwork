# 📌 Java Collections Framework (Interview Notes)

---

## 🔹 1. ArrayList
- Resizable **array implementation** (dynamic size).  
- Allows **duplicate elements**.  
- Maintains **insertion order**.  
- ❌ Not thread-safe.  
- Access elements in **O(1)** (random access supported).  

**Common methods:**  
- `add(E e)`, `add(int index, E e)`  
- `set(int index, E e)`  
- `remove(int index)`, `remove(Object o)`  
- `get(int index)`  
- `size()`, `contains(Object o)`, `isEmpty()`  
- `toArray()`, `toArray(T[] a)`  

✅ **Best use-case → search-heavy operations.**

---

## 🔹 2. LinkedList
- **Doubly Linked List implementation**.  
- Can be used as **List, Queue, or Deque**.  
- Allows **duplicate elements**.  
- Maintains **insertion order**.  
- Each element has **previous + next pointer**.  

**Extra methods (apart from List ones):**  
- `addFirst(E e)`, `addLast(E e)`  
- `getFirst()`, `getLast()`  
- `removeFirst()`, `removeLast()`  
- `removeFirstOccurrence(Object o)`  
- `removeLastOccurrence(Object o)`  
- `retainAll(Collection<?> c)`  

✅ **Best use-case → insertion/deletion-heavy operations.**

---

## 🔹 3. Stack
- **LIFO (Last-In-First-Out)** data structure.  
- Internally extends **Vector**.  

**Core 5 methods:**  
- `push(E e)` → add element at top.  
- `pop()` → remove + return top element.  
- `peek()` → return top element without removing.  
- `empty()` → check if stack is empty.  
- `search(Object o)` → 1-based position from top.  

✅ **Best use-case → Undo, recursion, expression evaluation.**

---

## 🔹 4. CopyOnWriteArrayList
- Part of **java.util.concurrent**.  
- ✅ **Thread-safe version of ArrayList**.  
- On modification → creates a **new copy** of the array.  
- **Fail-safe iterator** (no `ConcurrentModificationException`).  
- Slower for **writes**, faster for **reads**.  

✅ **Best use-case → multithreading (read-heavy environments).**

---

## ⚡ Quick Comparison

| Feature              | ArrayList | LinkedList | Stack            | CopyOnWriteArrayList |
|-----------------------|-----------|------------|------------------|-----------------------|
| Order Maintained      | ✅ Yes    | ✅ Yes     | ✅ Yes (LIFO)    | ✅ Yes                |
| Duplicates Allowed    | ✅ Yes    | ✅ Yes     | ✅ Yes           | ✅ Yes                |
| Thread-Safe           | ❌ No     | ❌ No      | ❌ No (Vector is sync) | ✅ Yes           |
| Access Time           | O(1)      | O(n)       | O(1) (top)       | O(1)                 |
| Insertion/Deletion    | O(n)      | O(1) (ends)| O(1) (top)       | O(n) (copy on write) |

---
