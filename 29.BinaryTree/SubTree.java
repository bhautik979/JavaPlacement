// Java program to check if binary tree is subtree of
// another binary tree

// A binary tree node
class Node {
	int data;
	Node left, right, nextRight;

	Node(int item)
	{
		data = item;
		left = right = nextRight = null;
	}
}

class SubTree {
	Node node, root2;
	boolean areIdentical(Node node, Node root2)   //Ye vo node hai jahapai data math karta hai
	{

		/* base cases */
		if (node == null && root2 == null)
			return true;

		if (node == null || root2 == null || node.data!=root2.data)
			return false;

		/* Check if the data of both roots is same and data
		of left and right subtrees are also same */
		return (areIdentical(node.left, root2.left) && areIdentical(node.right, root2.right));
	}

	/* This function returns true if S is a subtree of T,
	* otherwise false */
	boolean isSubtree(Node T, Node S)
	{
		if (T == null)
			return false;

		/* Check the tree with root as current node */
		if(T.data==S.data){

			if (areIdentical(T, S))
			 {return true;}
		}

		/* If the tree with root as current node doesn't
		match then
		try left and right subtrees one by one */
		return isSubtree(T.left, S)
			|| isSubtree(T.right, S);
	}

	public static void main(String args[])
	{
		SubTree tree = new SubTree();

		// TREE 1
		/* Construct the following tree
			1 2 3 4 5 6 7*/

		tree.node = new Node(1);
		tree.node.left = new Node(2);
		tree.node.right = new Node(3);
		tree.node.left.left = new Node(4);
		tree.node.left.right = new Node(5);
		tree.node.right.left = new Node(6);
		tree.node.right.right = new Node(7);

		// TREE 2
		/* Construct the following tree
		2 4 5 */

		tree.root2 = new Node(2);
		tree.root2.left = new Node(4);
		tree.root2.right = new Node(5);

		if (tree.isSubtree(tree.node, tree.root2))
			System.out.println(
				"Tree 2 is subtree of Tree 1 ");
		else
			System.out.println(
				"Tree 2 is not a subtree of Tree 1");
	}
}

// This code has been contributed by Mayank Jaiswal
