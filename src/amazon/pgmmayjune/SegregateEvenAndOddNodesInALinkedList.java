package amazon.pgmmayjune;

public class SegregateEvenAndOddNodesInALinkedList {

    Node head;

    public static void main(String[] args) {

        SegregateEvenAndOddNodesInALinkedList list = new SegregateEvenAndOddNodesInALinkedList();

        list.push(2);
        list.push(5);
        list.push(8);
        list.push(11);
        list.push(20);
        list.push(40);

        list.printList();

        list.segregateEvenOdd();

        list.printList();
    }

    void segregateEvenOdd(){


        Node end = head;
        Node prev = null;
        Node current = head;

        //Get Point to Last Node
        while(end.next!=null){
            end = end.next;
        }

        Node newEnd = end;

        while(current.data %2 !=0 && current !=end){
            newEnd.next = current;
            current = current.next;
            newEnd.next.next = null;
            newEnd = newEnd.next;
        }

        if(current.data % 2 ==0){

            head = current;

            while (current !=end){

                if(current.data %2==0){
                    prev = current;
                    current = current.next;
                }else{

                    //Break the link between prev and curr
                    prev.next = current.next;

                    current.next = null;

                    newEnd.next = current;

                    newEnd = current;

                    current = prev.next;
                }
            }
        }else{
            prev= current;
        }

        if(newEnd !=end && end.data %2 !=0){
            prev.next = end.next;
            end.next = null;
            newEnd.next = end;
        }


    }

    class Node {
        int data;
        Node next;

        Node(int data){
            this.data=data;
            next = null;
        }
    }

    void push(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    void printList(){
        Node temp = head;
        while (temp !=null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
