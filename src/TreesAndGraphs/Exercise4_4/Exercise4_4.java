package TreesAndGraphs.Exercise4_4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Exercise4_4 {
	
	public static List<LinkedList<TreeNode>> getLists21(TreeNode node) {
		List<LinkedList<TreeNode>> lists = new ArrayList<>();
		getLists(node, lists, 0);
		
		return lists;
	}
	
	public static void getLists(TreeNode node, List<LinkedList<TreeNode>> lists, int level) {
		if ( node == null )
			return;
		
		if ( lists.size() == level ) {
			lists.add(new LinkedList<TreeNode>());
		}
		
		lists.get(level).add(node);
		getLists(node.left, lists, level + 1);
		getLists(node.right, lists, level + 1);
	}

	public static List<LinkedList<TreeNode>> getLists(TreeNode node) {
		int level = 0;
		int nodesThisLevel = 1;
		int nodesNextLevel = 0;
		TreeNode current = node;
		LinkedList<TreeNode> queue = new LinkedList<>();
		LinkedList<LinkedList<TreeNode>> nodes = new LinkedList<>();
		
		while ( current != null ) {
			//System.out.println(current.id);
			
			if ( nodes.size() <= level ) {
				nodes.add(new LinkedList<TreeNode>());
			}
			
			nodes.getLast().add(current);
			
			if ( current.left != null ) {
				nodesNextLevel++;
				queue.add(current.left);
			}
				
			if ( current.right != null ) {
				nodesNextLevel++;
				queue.add(current.right);
			}
			
			
			if ( --nodesThisLevel == 0 ) {
				level++;
				nodesThisLevel = nodesNextLevel;
				nodesNextLevel = 0;
			}
			
			current = queue.pollFirst();
		}		
		
		return nodes;
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
		
		//List<LinkedList<TreeNode>> lists = getLists(a);
		List<LinkedList<TreeNode>> lists = getLists21(a);
		
		for ( LinkedList<TreeNode> list : lists) {
			for ( TreeNode node : list ) {
				System.out.print(node.id + " ");
			}
			
			System.out.println("");
		}
	}
}
