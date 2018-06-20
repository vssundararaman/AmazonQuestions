package amazon;

public class DetectLoopInALinkedListFloydCycleFindingAlgorithm {

    static Node head;

    public static void main(String[] args) {
        push(5);
        push(12);
        push(45);
        push(65);
        head.next.next.next.next = head;

        System.out.println("Loop Found : " + detectLoop(head));

    }

    static boolean detectLoop(Node head){

        Node slow = head, fast = head;
        while (slow !=null && fast!=null && fast.next !=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
        }

        return false;
    }

    public static void push(int data){

        Node newNode = new Node(data);

        newNode.next = head;

        head = newNode;
    }

    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            next = null;
        }
    }
}
