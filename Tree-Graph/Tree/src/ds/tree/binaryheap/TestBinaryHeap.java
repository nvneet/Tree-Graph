package ds.tree.binaryheap;

public class TestBinaryHeap {

	public static void main(String[] args) {
		
		BinaryHeap bh = new BinaryHeap(12);
		try {
			bh.insert(10, "Min");
			bh.insert(5, "Min");
			bh.insert(30, "Min");
			bh.insert(15, "Min");
			bh.insert(50, "Min");
			bh.insert(6, "Min");
			bh.insert(13, "Min");
			bh.insert(11, "Min");
			bh.insert(25, "Min");
			bh.insert(39, "Min");
			bh.insert(7, "Min");
			bh.insert(18, "Min");
		}catch (Exception ex) {
			System.out.println("Exception message: " + ex.getMessage());			
		} finally {
			System.out.println("Min Heap: ");
//			bh.levelOrder();
		}
		
//		int root = bh.extractRootOfHeap("Min");
//		System.out.println("root: " + root);
		bh.levelOrder();
		
//		int root1 = bh.extractRootOfHeap("Min");
//		System.out.println("root1: " + root1);
		bh.levelOrder();
		
//		int root2 = bh.extractRootOfHeap("Min");
//		System.out.println("root2: " + root2);
		bh.levelOrder();
		
//		BinaryHeap bmh = new BinaryHeap(12);
//		try {
//			bmh.insert(10, "Max");
//			bmh.insert(5, "Max");
//			bmh.insert(30, "Max");
//			bmh.insert(15, "Max");
//			bmh.insert(50, "Max");
//			bmh.insert(6, "Max");
//			bmh.insert(13, "Max");
//			bmh.insert(11, "Max");
//			bmh.insert(25, "Max");
//			bmh.insert(39, "Max");
//			bmh.insert(7, "Max");
//			bmh.insert(18, "Max");
//		}catch (Exception ex) {
//			System.out.println("Exception message: " + ex.getMessage());			
//		} finally {
//			System.out.print("\nMax Heap: ");
//			bmh.levelOrder();
//		}
		
		
	}
}
