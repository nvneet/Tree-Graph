package algo.ds.sorting;

import java.util.Arrays;

import algo.ds.BinaryHeap;

public class Seven_Heap_Sort {

	public static void main(String[] args) {

		int[] nums = {10, 5, 30, 15, 50, 6, 13, 11, 25, 39, 7, 18};
		
		System.out.println("Un-sorted: " + Arrays.toString(nums));
		HeapSort hs = new HeapSort(nums);

		hs.sort(nums);

		System.out.println("   *** Sorted by HEAP-SORT ***");
		System.out.println("   Sorted: " + Arrays.toString(nums));
	}

}

class HeapSort{
	
	int[] numArray;
	
	public HeapSort(int[] numArray) {
		this.numArray = numArray;
	}

	public void sort(int[] arr) {
		BinaryHeap bh = new BinaryHeap(numArray.length);
		for (int i=0; i < numArray.length; i++) {
			bh.insert(numArray[i], "Min");
		}
		
		for (int i=0; i < numArray.length; i++) {
			numArray[i] = bh.extractRootOfHeap("Min");
		}
	}
}
