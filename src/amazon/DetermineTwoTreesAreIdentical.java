package amazon;

public class DetermineTwoTreesAreIdentical {

    public static void main(String[] args) {

        BinaryTree binaryTree = new BinaryTree();

        binaryTree.root1 = new Node(1);
        binaryTree.root1.left = new Node(2);
        binaryTree.root1.right = new Node(3);
        binaryTree.root1.left.left = new Node(4);
        binaryTree.root1.left.right = new Node(5);

        binaryTree.root2 = new Node(1);
        binaryTree.root2.left = new Node(2);
        binaryTree.root2.right = new Node(3);
        binaryTree.root2.left.left = new Node(4);
        binaryTree.root2.left.right = new Node(5);

        if (binaryTree.identicalTrees(binaryTree.root1, binaryTree.root2))
            System.out.println("Both trees are identical");
        else
            System.out.println("Trees are not identical");

    }
}

class BinaryTree {
    Node root1, root2;

    /**
     * Given Two trees, return true if both are structurally identical.
     * @param a
     * @param b
     * @return true or false
     */
    boolean identicalTrees(Node a, Node b){

        /*1. both empty */
        if( a ==null && b==null){
            return true;
        }

        /* 2. both non-empty -> compare them */
        if((a!= null && b!= null) && (a.data == b.data) &&
                (identicalTrees(a.left,b.left) &&
                        identicalTrees(a.right,b.right))){
            return true;
        }

        return false;
    }
}

class Node{

    int data;
    Node left, right;

    public Node(int data){
        this.data = data;
        left = right = null;
    }
}

