package ds.tree.binarytree.array;

public class Test {

	public static void main(String[] args) {
		BinaryTree arrayBT = new BinaryTree(9);
		arrayBT.insert("N1");
		arrayBT.insert("N2");
		arrayBT.insert("N3");
		arrayBT.insert("N4");
		arrayBT.insert("N5");
		arrayBT.insert("N6");
		arrayBT.insert("N7");
		arrayBT.insert("N8");
		arrayBT.insert("N9");
		
		System.out.println("\n\n***** Pre-Order Traversal *****");
		arrayBT.preOrder(1);
		
		System.out.println("\n\n***** In-Order Traversal *****");
		arrayBT.inOrder(1);
		
		System.out.println("\n\n***** Post-Order Traversal *****");
		arrayBT.postOrder(1);
		
		System.out.println("\n\n***** Level-Order Traversal *****");
		arrayBT.levelOrder(1);

	}

}
