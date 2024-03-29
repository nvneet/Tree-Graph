package ds.tree.bst;

public class Test {

	public static void main(String[] args) {
		
		BST bst = new BST();
		bst.insert(70);
		bst.insert(50);
		bst.insert(90);
		bst.insert(30);
		bst.insert(60);
		bst.insert(80);
		bst.insert(100);
		bst.insert(20);
		bst.insert(40);
		
		System.out.println("\nPre-Order Traversal:");
		bst.traversal_PreOrder(bst.rootNode);
		
		System.out.println("\nIn-Order Traversal:");
		bst.traversal_InOrder(bst.rootNode);
		
		System.out.println("\nPost-Order Traversal:");
		bst.traversal_PostOrder(bst.rootNode);
		
		System.out.println("\nLevel-Order Traversal:");
		bst.traversal_LevelOrder(bst.rootNode);
		
		System.out.println("\nSearching in Binary Tree:");
		BSTNode node = bst.search(bst.rootNode, 100);
		System.out.println("found Node: " + node.toString() + " :  " +node.value);
	}

}
