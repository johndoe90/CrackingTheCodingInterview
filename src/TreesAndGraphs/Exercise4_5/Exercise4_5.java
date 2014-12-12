package TreesAndGraphs.Exercise4_5;

public class Exercise4_5 {

	public static boolean isBinarySearchTree(TreeNode node, int min, int max) {
		if ( node == null )
			return true;

		if ( node.data >= max || node.data < min ) {
			return false;
		}
		
		return isBinarySearchTree(node.left, min, node.data) && isBinarySearchTree(node.right, node.data, max);
	}
	
	public static void main(String[] args) {
		TreeNode a = new TreeNode(100);
		TreeNode b = new TreeNode(50);
		TreeNode c = new TreeNode(150);
		TreeNode d = new TreeNode(25);
		TreeNode e = new TreeNode(50);
		TreeNode f = new TreeNode(100);
		TreeNode g = new TreeNode(175);

		a.left = b;
		a.right = c;
		
		b.left = d;
		b.right = e;
		
		c.left = f;
		c.right = g;
		
		System.out.println(isBinarySearchTree(a, Integer.MIN_VALUE, Integer.MAX_VALUE));
	}
}
