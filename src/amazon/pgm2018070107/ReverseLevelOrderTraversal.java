package amazon.pgm2018070107;

public class ReverseLevelOrderTraversal {

    Node root;

    public static void main(String[] args) {
        ReverseLevelOrderTraversal tree = new ReverseLevelOrderTraversal();

        // Let us create trees shown in above diagram
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("Level Order traversal of binary tree is : ");
        tree.reverseLevelOrder(tree.root);
    }

    void reverseLevelOrder(Node node){

        int h = height(node);
        for(int i = h; i >=1;i--){
            printNode(node, i);
        }
    }

    void printNode(Node node, int level){
        if(node == null) {
            return;
        }

        if(level == 1){
                System.out.print(node.data + " ");
        }else if(level > 1){
            printNode(node.right, level-1);
            printNode(node.left, level-1);
        }

    }

    int height(Node node){

        if(node ==null){
            return 0;
        }else{
            int leftHeight = height(node.left);
            int rightHeight = height(node.right);

            if(leftHeight > rightHeight){
                return (leftHeight +1);
            }else{
                return (rightHeight +1);
            }
        }
    }
}
