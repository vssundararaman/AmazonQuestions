package revisions.revision1.amazon;

public class DetermineTwoTreeIdentical {

    public static void main(String[] args) {
        System.out.println("Executing...");
    }

}

class BinaryTree{
    Node root1, root2;

    boolean isTreeIdentifical(Node root1, Node root2){

        if(root1==null && root2==null){
            return true;
        }

        if((root1!=null && root2!=null) &&
                (root1.data==root2.data) &&
                (isTreeIdentifical(root1.right,root2.right)
                        && isTreeIdentifical(root1.left,root2.left))){
            return true;
        }

        return false;
    }

}

class Node{

    int data;
    Node left, right;

    Node(int data){
        this.data = data;
        left = right=null;
    }
}
