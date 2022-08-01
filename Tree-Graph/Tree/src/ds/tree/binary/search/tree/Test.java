package ds.tree.binary.search.tree;

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
		bst.insert(10);
		bst.insert(40);
		bst.insert(120);
		bst.insert(110);
		
		System.out.println(bst.rootNode);
		bst.preOrder(bst.rootNode);

	}

}
