package ds.tree.binarytree.linkedlist;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeLL {
	
	public BinaryNode root;
	
	public BinaryTreeLL() {
		this.root = null;
	}
	
//	Pre-Order Traversal: Root -> Left -> Right
	void preOrderTranversal(BinaryNode node) {
		if (node == null) {
			return;
		}
		System.out.print(node.data + " ");
		preOrderTranversal(node.left);
		preOrderTranversal(node.right);
	}
	
//	In-Order Traversal: Left -> Root -> Right
	void inOrderTranversal(BinaryNode node ) {
		if (node == null) {
			return;
		}		
		inOrderTranversal (node.left);
		System.out.print(node.data + " ");
		inOrderTranversal(node.right);
	}
	
//	Post-Order Traversal: Left -> Right -> Root 
	void postOrderTranversal(BinaryNode node ) {
		if (node == null) {
			return;
		}		
		postOrderTranversal (node.left);
		postOrderTranversal(node.right);
		System.out.print(node.data + " ");
	}

	
//	Level-Order Traversal: ( Breadth-First Search )
	void levelOrderTranversal() {
		Queue <BinaryNode> queue = new LinkedList<BinaryNode>();
		queue.add(root);
		
		while(!queue.isEmpty()) {
			BinaryNode presentNode = queue.remove(); // retrieves and remove the head
			System.out.print(presentNode.data + " ");
			if(presentNode.left != null) {
				queue.add(presentNode.left);
			}
			if(presentNode.right != null) {
				queue.add(presentNode.right);
			}
		}
	}
	
//	search a Node: ( Breadth-First )
	void SearchNode(String data) {
		Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
		queue.add(root);
		while(!queue.isEmpty()) {
			BinaryNode presentNode = queue.remove();
			if (presentNode.data == data) {
				System.out.println("The data - " + data + " is found in tree");
				return;
			} else {
				if (presentNode.left != null) {
					queue.add(presentNode.left);
				}
				if(presentNode.right != null) {
					queue.add(presentNode.right);
				}
			}
		}
		System.out.println("Node is not found in tree.");
	}
	
//	Insert a Node: ( level-order )
	void InsertNode(String data) {
		BinaryNode newNode = new BinaryNode(data);
		if(root == null) {
			root = newNode;
			System.out.println("Node has been inserted successfully.");
			return;
		}
		Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
		queue.add(root);
		while(!queue.isEmpty()) {
			BinaryNode presentNode = queue.remove();
			System.out.println("removed head node: " + presentNode.data);
			if (presentNode.left == null) {
				presentNode.left = newNode;
				System.out.println("Node has been inserted successfully.");
				return;
			} else if (presentNode.right == null) {
				presentNode.right = newNode;
				System.out.println("Node has been inserted successfully.");
				return;
			} else {
				queue.add(presentNode.left);
				queue.add(presentNode.right);
			}
		}
	}
	
//	Get deepest Node: ( level-order )
	public BinaryNode getDeepestNode() {
		Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
		queue.add(root);
		BinaryNode presentNode = null;
		
		while (!queue.isEmpty()) {
			presentNode = queue.remove();
			if (presentNode.left != null) {
				queue.add(presentNode.left);
			}
			if (presentNode.right != null) {
				queue.add(presentNode.right);
			}
		}
		
		return presentNode;
	}
	
//	Delete Deepest Node
	public void deleteDeepestNode() {
		Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
		queue.add(root);
		BinaryNode previousNode,  presentNode = null;
		
		while (!queue.isEmpty()) {
			previousNode = presentNode;
			presentNode = queue.remove();
			if (presentNode.left == null) {
				previousNode.right = null;
				return;
			}
			if (presentNode.right == null) {
				presentNode.left = null;
				return;
			}
			queue.add(presentNode.left);
			queue.add(presentNode.right);
		}
	}
	
//	Delete given Node
	void deleteNode(String data) {
		Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
		queue.add(root);
		while (!queue.isEmpty()) {
			BinaryNode presentNode = queue.remove();
			if (presentNode.data == data) {
				presentNode.data = getDeepestNode().data;
				deleteDeepestNode();
				System.out.println("The "+data+" node is deleted");
				return;
			} else {
				if (presentNode.left != null) 
					queue.add(presentNode.left);
				if (presentNode.right != null) 
					queue.add(presentNode.right);
			}
		}
		System.out.println("Node "+data+" does not exist in this binary tree.");
	}
	
//	Delete complete Tree
	void deleteBT() {
		root = null;
		System.out.println("Binary tree has been deleted.");
	}
}





















	
	
	
	
	
	
