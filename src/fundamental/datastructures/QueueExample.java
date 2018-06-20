package fundamental.datastructures;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<Integer>();

        //Add elements in Queue
        for(int i=0;i<5;i++){
            queue.add(i);
        }

        System.out.println("Elements in Queue " + queue);

        // To remove the head of queue.
        int removedele = queue.remove();
        System.out.println("removed element-" + removedele);

        System.out.println(queue);

        // To view the head of queue
        int head = queue.peek();
        System.out.println("head of queue-" + head);

        // Rest all methods of collection interface,
        // Like size and contains can be used with this
        // implementation.
        int size = queue.size();
        System.out.println("Size of queue-" + size);

    }

}
