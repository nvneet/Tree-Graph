package ds.tree.binaryheap;

import ds.tree.util.SwapUtil;

public class BinaryHeap {

	int[] arr;
	int sizeOfTree;

	public BinaryHeap(int size) {
		arr = new int[size + 1];
		this.sizeOfTree = 0;
	}

	public boolean isEmpty() {
		if (sizeOfTree == 0) {
			return true;
		} else
			return false;
	}

	public int peek() {
		if (isEmpty()) {
			System.out.println("Binary heap is empty.");
			return (Integer) null;
		}
		return arr[1];
	}

	public int size() {
		return sizeOfTree;
	}

	public void levelOrder() {
		for (int i = 1; i <= sizeOfTree; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("\n");
	}

	// Heapify for insert
	private void heapifyBottomToTop(int index, String heapType) {

		int parent = index / 2;

		if (index <= 1) {
			return;
		}

		if (heapType == "Min") {
			if (arr[index] < arr[parent]) {
				SwapUtil.swap(arr, index, parent);
			}
		} else if (heapType == "Max") {
			if (arr[index] > arr[parent]) {
				SwapUtil.swap(arr, index, parent);
			}
		}
		heapifyBottomToTop(parent, heapType);
	}

	public void insert(int value, String heapType) {
		arr[sizeOfTree + 1] = value;
		sizeOfTree++;
		heapifyBottomToTop(sizeOfTree, heapType);
	}

	// Heapify Top to Bottom for extracting node
	private void heapifyTopToBottom(int index, String heapType) {

		int leftNodeIndex = index * 2;
		int rightNodeIndex = index * 2 + 1;
		int swapChild = 0;

		if (sizeOfTree < leftNodeIndex) {
			return;
		}

		if (heapType == "Max") {
			if (sizeOfTree == leftNodeIndex) {
				if (arr[index] < arr[leftNodeIndex]) {
					SwapUtil.swap(arr, index, leftNodeIndex);
				}
				return;
			} else {
				if (arr[leftNodeIndex] > arr[rightNodeIndex]) {
					swapChild = leftNodeIndex;
				} else {
					swapChild = rightNodeIndex;
				}
				if (arr[index] < arr[swapChild]) {
					SwapUtil.swap(arr, index, swapChild);
				}
			}
		} else if (heapType == "Min") {
			if (sizeOfTree == leftNodeIndex) {
				if (arr[index] > arr[leftNodeIndex]) {
					SwapUtil.swap(arr, index, leftNodeIndex);
				}
				return;
			} else {
				if (arr[leftNodeIndex] < arr[rightNodeIndex]) {
					swapChild = leftNodeIndex;
				} else {
					swapChild = rightNodeIndex;
				}
				if (arr[index] > arr[swapChild]) {
					SwapUtil.swap(arr, index, swapChild);
				}
			}
		}
		heapifyTopToBottom(swapChild, heapType);
	}
	
	public int extractRootOfHeap(String heapType) {
		if(isEmpty()) {
			return -1;
		} else {
			int extraxtedValue = arr[1];
			arr[1] = arr[sizeOfTree];
			sizeOfTree--;
			heapifyTopToBottom(1, heapType);
			return extraxtedValue; 
		}
		
	}
	
	public void deleteBinaryHeap(String heapType) {
		arr = null;		
	}
}
