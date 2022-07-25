package ds.tree.binarytree.array;

public class BinaryTree {
	String[] arr;
	int lastUsedIndex;
	
	public BinaryTree(int size) {
		arr = new String[size+1];
		this.lastUsedIndex = 0;
		System.out.println("Blank Tree of size " +size+ " is created.");
	}
	
//	tree array is full
	private boolean isFull() {
		if (arr.length-1 == lastUsedIndex) {
			return true;
		} else return false;
	}
	
//	Insert new node in tree
	public void insert (String data) {
		if(!isFull()) {
			arr[lastUsedIndex+1] = data;
			lastUsedIndex++;
			System.out.println("New node " +data+ " has been inserted to tree.");
		} else System.out.println("Binary tree is full"); 
	}
	
//	Pre-Order traversal
	public void preOrder(int index) {
		if(index > lastUsedIndex) {
			return;
		}
		
		System.out.print(arr[index] + " ");
		preOrder(index * 2);
		preOrder(index * 2 + 1);
	}
	
//	In-Order traversal
	public void inOrder(int index) {
		if(index > lastUsedIndex) {
			return;
		}
		
		inOrder(index * 2);
		System.out.print(arr[index] + " ");
		inOrder(index * 2 + 1);
	}
	
//	Post-Order traversal
	public void postOrder(int index) {
		if(index > lastUsedIndex) {
			return;
		}
		
		postOrder(index * 2);
		postOrder(index * 2 + 1);
		System.out.print(arr[index] + " ");
	}
	
//	Level-Order traversal
	public void levelOrder(int index) {
		for(int i=1; i<=lastUsedIndex; i++) {
			System.out.print(" " + arr[i]);
		}
	}
}
