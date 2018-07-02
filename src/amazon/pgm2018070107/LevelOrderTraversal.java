package amazon.pgm2018070107;

public class LevelOrderTraversal {

    Node root;

    public static void main(String[] args) {
        LevelOrderTraversal tree = new LevelOrderTraversal();
        tree.root= new Node(1);
        tree.root.left= new Node(2);
        tree.root.right= new Node(3);
        tree.root.left.left= new Node(4);
        tree.root.left.right= new Node(5);

        System.out.println("Level order traversal of binary tree is ");
        tree.printLevelOrder();
    }

    void printLevelOrder(){

        int h = height(root);

        for(int i=1;i<=h;i++){
            printGivenLevel(root, i);
        }

    }

    int height(Node node){
        if(node == null){
            return 0;
        }
        else{
            int leftHeight = height(node.left);
            int rightHeight = height(node.right);

            if(leftHeight > rightHeight){
                return (leftHeight+1);
            }else{
                return rightHeight +1;
            }
        }
    }

    void printGivenLevel(Node root, int level){
        if(root == null){
            return;
        }

        if(level ==1){
            System.out.print( root.data + " ");
        }else if(level > 1){
            printGivenLevel(root.left, level -1);
            printGivenLevel(root.right, level-1);
        }
   }
}
