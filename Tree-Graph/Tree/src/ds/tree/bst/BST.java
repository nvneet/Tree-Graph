package ds.tree.bst;

import java.util.LinkedList;
import java.util.Queue;

public class BST {

	public BSTNode rootNode;
	
	public BST() {
		rootNode = null;
	}
	
	//Insert Method
	private BSTNode insert(BSTNode currentRootNode, int value) {
		if (currentRootNode == null) {
			BSTNode newNode = new BSTNode();
			newNode.value = value;
			System.out.println("The value has been successfully inserted.");
			return newNode;
		} else if (value <= currentRootNode.value) {
			currentRootNode.leftNode = insert(currentRootNode.leftNode, value);
			return currentRootNode;
		} else {
			currentRootNode.rightNode = insert(currentRootNode.rightNode, value);
			return currentRootNode;
		}
	}
	
//	Time Complexity = O(logN) ; Space Complexity = O(logN)
	void insert (int value) {
		rootNode = insert(rootNode, value);
	}
	
	// Pre-order traversal
	public void traversal_PreOrder (BSTNode node) {
		if(node == null) return;
		
		System.out.print(node.value + " ");
		traversal_PreOrder(node.leftNode);
		traversal_PreOrder(node.rightNode);
	}
	
	// in-order traversal
	public void traversal_InOrder (BSTNode node) {
		if(node == null) return;		
		
		traversal_InOrder(node.leftNode);
		System.out.print(node.value + " ");
		traversal_InOrder(node.rightNode);
	}
	
	// Pre-order traversal
	public void traversal_PostOrder (BSTNode node) {
		if(node == null) return;
		
		traversal_PostOrder(node.leftNode);
		traversal_PostOrder(node.rightNode);
		System.out.print(node.value + " ");
	}
	
	// Level-order traversal
	public void traversal_LevelOrder (BSTNode node) {
		
		Queue<BSTNode> queue = new LinkedList<>();
		queue.add(rootNode);
		
		while(!queue.isEmpty()) {
			
			BSTNode presentNode = queue.remove();
			System.out.print(presentNode.value + " ");
			if(presentNode.leftNode != null) {
				queue.add(presentNode.leftNode);
			}
			if(presentNode.rightNode != null) {
				queue.add(presentNode.rightNode);
			}
		}
	}
	
	// Search in BST
	public BSTNode search (BSTNode node, int value) {
		if(node == null) {
			System.out.println("value " + value + " is not found in tree.");
			return null;
		} else if (node.value == value) {
			System.out.println("value " + value + " is found in tree.");
			return node;
		}
		
		if(value < node.value) {
			return search (node.leftNode, value);
		}
		else if (value > node.value) {
			return search (node.rightNode, value);
		}
		return null;
	}
}
