package amazon.hard.pgm2018070814;

public class RearrangeLinkedListInPlace {

    static Node head;

    public static void main(String[] args) {

        RearrangeLinkedListInPlace list = new RearrangeLinkedListInPlace();
        list.head = new Node(1);
        list.head.next = new Node (2);
        list.head.next.next = new Node(3);
        list.head.next.next.next = new Node(4);
        list.head.next.next.next.next = new Node(5);

        list.printList(head);
        list.rearrange(head);
        System.out.println(" ");
        list.printList(head);

    }

    /* Node Class */
    static class Node {
        int data;
        Node next;

        Node(int data){
            this.data = data;
            next = null;
        }
    }

    void printList(Node node){
        if(node ==null){
            return ;
        }
        while(node !=null){
            System.out.print(node.data + " -> ");
            node = node.next;
        }
    }

    Node reverselist (Node node){

        Node prev = null, curr = node, next;

        while(curr !=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        node = prev;

        return node;
    }

    void rearrange(Node node){

        // 1) Find the middle point using tortoise and hare method
        Node slow = node, fast = slow.next;

        while(fast != null && fast.next !=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        // 2) Split the linked list in two halves
        // node1, head of first half    1 -> 2 -> 3
        // node2, head of second half   4 -> 5

        Node node1 = node;
        Node node2 = slow.next;
        slow.next = null;

        // 3) Reverse the second half, i.e., 5 -> 4
        node2 = reverselist(node2);

        // 4) Merge alternate nodes
        node = new Node(0); // Assign dummy Node

        // curr is the pointer to this dummy Node, which will
        // be used to form the new list
        Node curr = node;

        while(node1 !=null || node2!=null){

            //First add the element from first List
            if(node1 !=null){
                curr.next = node1;
                curr = curr.next;
                node1 = node1.next;
            }

            if(node2 !=null){
                curr.next = node2;
                curr = curr.next;
                node2 = node2.next;
            }
        }

        // Assign the head of the new list to head pointer
        node = node.next;
    }
}