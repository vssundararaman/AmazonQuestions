package amazon.pgm2018070107;

public class RootToLeafPathSumBinaryTree {

    Node root;

    public static void main(String[] args) {

        int sum = 21;

        RootToLeafPathSumBinaryTree tree = new RootToLeafPathSumBinaryTree();
        tree.root = new Node(10);
        tree.root.left = new Node(8);
        tree.root.right = new Node(2);
        tree.root.left.left = new Node(3);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(2);

        if (tree.hasPathSum(tree.root, sum))
            System.out.println("There is a root to leaf path with sum " + sum);
        else
            System.out.println("There is no root to leaf path with sum " + sum);
    }

    boolean hasPathSum(Node node, int sum){

        if(node == null){
            return (sum == 0);
        }else{
            boolean answer = false;

            int subsum = sum - node.data;
            if(subsum ==0 && node.left == null & node.right == null){
                return true;
            }
            if(node.left !=null){
                answer = answer || hasPathSum(node.left,subsum);
            }

            if(node.right !=null){
                answer = answer || hasPathSum(node.right,subsum);
            }

            return answer;
        }
   }
}

