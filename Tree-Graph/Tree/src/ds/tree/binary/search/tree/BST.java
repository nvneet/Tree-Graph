package ds.tree.binary.search.tree;

public class BST {

	public BSTNode rootNode;
	
	public BST() {
		this.rootNode = null;
	}
	
	//Insert Method
	private BSTNode insert(BSTNode currentNode, int value) {
		if (currentNode == null) {
			BSTNode newNode = new BSTNode();
			newNode.value = value;
			System.out.println("The value has been successfully inserted.");
			return newNode;
		} else if (value <= currentNode.value) {
			currentNode.leftNode = insert(currentNode.leftNode, value);
			return currentNode;
		} else {
			currentNode.rightNode = insert(currentNode.rightNode, value);
			return currentNode;
		}
	}
//	Time Complexity = O(logN) ; Space Complexity = O(logN)
	void insert (int value) {
		insert(rootNode, value);
	}
}
