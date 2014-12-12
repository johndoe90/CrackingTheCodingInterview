package TreesAndGraphs.Exercise4_1;

import java.util.Stack;

public class Exercise4_1 {

	private static class TreeData {
		int depth;
		TreeNode node;
	}
	
	public static boolean isBalanced(TreeNode node) {
		int depth = 0;
		int minDepth = Integer.MAX_VALUE;
		int maxDepth = 0;
		TreeNode current = node;
		Stack<TreeData> stack2 = new Stack<>();
		
		while ( current != null ) {
			current.visited = true;
			if ( current.left != null && !current.left.visited ) {
				if ( current.right == null && depth < minDepth ) {
					minDepth = depth;
				}
				
				TreeData data = new TreeData();
				data.depth = depth;
				data.node = current;
				stack2.push(data);
				
				current = current.left;
				depth++;
			} else {
				if ( current.left == null && depth < minDepth ) {
					minDepth = depth;
				}
				
				if ( current.right != null ) {
					current = current.right;
					depth++;
				} else {
					//Leaf node
					maxDepth = depth > maxDepth ? depth : maxDepth;
					
					if ( !stack2.isEmpty() ) {
						TreeData data = stack2.pop();
						depth = data.depth;
						current = data.node;
					} else {
						break;
					}
				}
			}
		}
		
		System.out.println("Mindepth: " + minDepth);
		System.out.println("MaxDepth: " + maxDepth);
		
		return (maxDepth - minDepth) <= 1;
	}
	
	public static void main(String[] args) {
		TreeNode a = new TreeNode('a');
		TreeNode b = new TreeNode('b');
		TreeNode c = new TreeNode('c');
		TreeNode d = new TreeNode('d');
		TreeNode e = new TreeNode('e');
		TreeNode f = new TreeNode('f');
		TreeNode g = new TreeNode('g');

		a.left = b;
		a.right = c;
		
		b.left = d;
		b.right = e;
		
		c.left = f;
		c.right = g;

		
		System.out.println("Tree is balanced: " + isBalanced(a));
	}

}
