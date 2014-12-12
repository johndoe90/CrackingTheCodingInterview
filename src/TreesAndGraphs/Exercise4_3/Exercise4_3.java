package TreesAndGraphs.Exercise4_3;

import java.util.Stack;

public class Exercise4_3 {
	
	public static TreeNode buildBSTree(int[] arr, int left, int right) {
		if ( left > right ) {
			return null;
		} 
		
		int middle = (left + right) / 2;
		TreeNode node = new TreeNode(arr[middle]);
		node.left = buildBSTree(arr, left, middle - 1);
		node.right = buildBSTree(arr, middle + 1, right);
			
		return node;
	}
	
	public static void traverse(TreeNode node) {
		if ( node == null )
			return;
		
		traverse(node.left);
		System.out.println(node.data);
		traverse(node.right);
	}
	
	public static void main(String[] args) {
		int[] arr = new int[] {0,1,2,3,4,5,6,7,8,9};
		
		TreeNode root = buildBSTree(arr, 0, arr.length - 1);
		
		traverse(root);
	}
}
