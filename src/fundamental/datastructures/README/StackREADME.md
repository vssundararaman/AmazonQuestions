**Stack Class in Java**

Java provides an inbuilt object type called Stack. 
It is a collection that is based on the last in first out (LIFO) principle. On Creation, a stack is empty.

It extends Vector class with five methods that allow a vector to be treated as a stack. 

1. **Object push(Object element) :** Pushes an element on the top of the stack.

2. **Object pop() :** Removes and returns the top element of the stack. 
An ‘EmptyStackException’ exception is thrown if we call pop() when the invoking stack is empty.

 3. **Object peek( ) :** Returns the element on the top of the stack, but does not remove it. 
 
 4. **boolean empty() :** It returns true if nothing is on the top of the stack. Else, returns false.

5. **int search(Object element) :** It determines whether an object exists in the stack. If the element is found, it returns the position of the element from the top of the stack. 
Else, it returns -1.