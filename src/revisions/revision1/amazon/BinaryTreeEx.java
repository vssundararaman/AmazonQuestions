/**
 * @author Selva
 * @version Revision 1.0
 * 
 * 
 */

package revisions.revision1.amazon;

public class BinaryTreeEx {

	Node root1;
	Node root2;
	public static void main(String[] args) {

		BinaryTreeEx binTree1 = new BinaryTreeEx();
		
		binTree1.root1 = new Node(5);
		binTree1.root1.left = new Node(6);
		binTree1.root1.right = new Node(7);
		binTree1.root1.left.left = new Node(8);
		binTree1.root1.left.right = new Node(9);
		
		binTree1.root2 = new Node(5);
		binTree1.root2.left = new Node(6);
		binTree1.root2.right = new Node(7);
		binTree1.root2.left.left = new Node(8);
		binTree1.root2.left.right = new Node(9);
		
		if(isEqualBinTrees(binTree1.root1, binTree1.root2)) {
			System.out.println("Binary Trees are equal");
		}
		else {
			System.out.println("Binary Trees are not equal");
		}
	}
	private static boolean isEqualBinTrees(Node root1, Node root2) {

		if(root1 == null && root2 == null) {
			return true;
		}
		else if (root1 != null && root2 != null) {
			if (root1.data == root2.data && isEqualBinTrees(root1.left, root2.left) && isEqualBinTrees(root1.right, root2.right)) {
				return true;
			}
		}
		return false;
	}


}
