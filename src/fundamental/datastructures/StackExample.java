package fundamental.datastructures;

import java.util.Stack;

public class StackExample {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<Integer>();

        stack_push(stack);
        stack_pop(stack);
        stack_push(stack);
        stack_peek(stack);
        search_stack(stack,5);
        search_stack(stack, 12);

    }

    // Pushing element on the top of the stack
    static void stack_push(Stack<Integer> stack){

        System.out.print("Stack push");

        for(int i=0;i<10;i++){
                stack.push(i);
        }

        System.out.println(stack.toString());
    }

    // Popping element from the top of the stack
    static void stack_pop(Stack<Integer> stack){

        System.out.print(" Stack Pop ");

        for(int i=0;i<10;i++){
            System.out.print(stack.pop() + " ");
        }

        System.out.println();
    }


    // Displaying element on the top of the stack
    static void stack_peek(Stack<Integer> stack){

        System.out.println("Peek Element of the stack ");

        System.out.print("Peek/Top element of the stack " + stack.peek());

    }

    static void search_stack(Stack<Integer> stack, int searchElement){

        Integer index =  stack.search(searchElement);

        if(index ==-1){
            System.out.println("Element is not found ");
        }else{
            System.out.println("Element found at index " + index);
        }
    }


}
