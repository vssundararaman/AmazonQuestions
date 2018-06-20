package amazon;

import java.util.HashSet;

public class DetectLoopInALinkedList{

    static Node head;

    public static void main(String[] args) {

       push(20);
       push(5);
       push(12);
       push(10);

        head.next.next.next.next = head;

        if (detectLoop(head)){
            System.out.println("Loop found");
        }
        else {
            System.out.println("No Loop");
        }


    }
    /* Inserts a new Node at front of the list. */
    static void push(int data){

        /* 1 & 2: Allocate the Node &
                  Put in the data*/
        Node newNode = new Node(data);

        /* 3. Make next of new Node as head */
        newNode.next = head;

        /* 4. Move the head to point to new Node */
        head = newNode;
    }

    // Returns true if there is a loop in linked
    // list else returns false.
    static boolean detectLoop(Node head){

        HashSet<Node> hashSet = new HashSet<Node>();

        while (head !=null){

            // If we have already has this node
            // in hashmap it means their is a cycle
            // (Because you we encountering the
            // node second time).
            if(hashSet.contains(head)){
                return true;
            }

            // If we are seeing the node for
            // the first time, insert it in hash
            hashSet.add(head);

            head = head.next;
        }

        return false;
    }


    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next = null;
        }
    }
}
