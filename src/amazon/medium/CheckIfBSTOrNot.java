package amazon.medium;

public class CheckIfBSTOrNot {

    Node root;

    boolean isBST(){

        return false;
    }

    boolean isBSTUtil(Node node, int min, int max){

        //an empty tree is BST
        if(node == null){
            return true;
        }

        // false if this node violates the min/max constraints
        if(node.data <min || node.data > max){
            return false;
        }

        return (isBSTUtil(node.left,min,node.data-1) &&
                isBSTUtil(node.right, node.data+1,max));
    }

    public static void main(String[] args) {
        CheckIfBSTOrNot tree = new CheckIfBSTOrNot();

    }
}

class Node {
    int data;
    Node right, left;

    public Node(int item){
        data = item;
        left = right = null;
    }
}
