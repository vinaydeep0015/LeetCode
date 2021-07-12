package recurssion;
/*
 * Write a recursive function that, 
 * given a pointer to the root of a binary search tree, 
 * printsout the elements in that tree in sorted order.
 */
public class PrintTreeNodeInSortedOrder {

	public class Node{
		int item;
		Node left;
		Node right;
	}
	public void inOrderTraversal(Node root) {
		inOrderTraversal(root.left);
		System.out.println(root.item);
		inOrderTraversal(root.right);
	}
}
