package ds.tree.binarytree.linkedlist;

import java.io.InputStream;

public class Test {

	public static void main(String[] args) {
		
		InputStream inputStream = Test.class.getClassLoader().getResourceAsStream("Tree.jpg");
		InputStream imageStream = Test.class.getClassLoader().getResourceAsStream("treeimage.jpg");
		
		BinaryNode N1 = new BinaryNode("N1");
		BinaryNode N2 = new BinaryNode("N2");
		BinaryNode N3 = new BinaryNode("N3");
		BinaryNode N4 = new BinaryNode("N4");
		BinaryNode N5 = new BinaryNode("N5");
		BinaryNode N6 = new BinaryNode("N6");
		BinaryNode N7 = new BinaryNode("N7");
		BinaryNode N8 = new BinaryNode("N8");
		BinaryNode N9 = new BinaryNode("N9");

		N1.left = N2;
		N1.right = N3;
		
		N2.left = N4;
		N2.right = N5;
		
		N3.left = N6;
		N3.right = N7;
		
		N4.left = N8;
		N4.right = N9;
		
		BinaryTreeLL binaryTree = new BinaryTreeLL();
		binaryTree.root = N1;
		
//		Test Pre-Order Traversal => O(N) time complexity
		binaryTree.preOrderTranversal(binaryTree.root);
		
		System.out.println("\n");
//		Test In-Order Traversal => O(N) time complexity
		binaryTree.inOrderTranversal(binaryTree.root);
		
		System.out.println("\n");
//		Test Post-Order Traversal => O(N) time complexity
		binaryTree.postOrderTranversal(binaryTree.root);
		
		System.out.println("\n");
//		Test Level Order Traversal => O(N) time complexity
		binaryTree.levelOrderTranversal();
		
		System.out.println("\n");
//		Searching => Breadth First => O(N) time complexity, O(N) Space Complexity
		binaryTree.SearchNode("N8");
		
//		Inserting => level order => O(N) time complexity, O(N) Space Complexity
		binaryTree.InsertNode("N10");
		binaryTree.levelOrderTranversal();		
		
		System.out.println("\n");
		binaryTree.deleteDeepestNode();
		System.out.println("DELETED deepest node successfully");
		binaryTree.levelOrderTranversal();
		
		System.out.println("\n");
		binaryTree.deleteNode("N5");
		binaryTree.levelOrderTranversal();
		
		System.out.println("\n");
		binaryTree.deleteBT();
		binaryTree.levelOrderTranversal();
	}

}
