package algo.ds.sorting;

import java.util.Arrays;


public class Five_Merge_Sort {

	public static void main(String[] args) {

		int[] nums = {10, 5, 30, 15, 50, 6, 13, 11, 25, 39, 7, 18};
		
		System.out.println("Un-sorted: " + Arrays.toString(nums));
		int right = nums.length - 1;
		mergeSortNumbers(nums, 0, right);
		System.out.println("   *** Sorted by MERGE-SORT ***");
		System.out.println("   Sorted: " + Arrays.toString(nums));
	}
	
	// Divide and Conquer
	public static void mergeSortNumbers(int[] numsArray, int left, int right) {
		
		if(right > left) {
			int middle = (left+right)/2;
			mergeSortNumbers(numsArray, left, middle);
			mergeSortNumbers(numsArray, middle+1, right);
			System.out.println("Sorting.....: " + Arrays.toString(numsArray));
			merge(numsArray, left, middle, right);
		}
	}
	
	// Divide and Conquer
	public static void merge(int[] nums, int left, int middle, int right) {
		
		int[] leftTempArray = new int[middle-left+2];
		int[] rightTempArray = new int[right-middle+1];
		
		for (int i=0; i<=middle-left; i++) {
			leftTempArray[i] = nums[left+i];
		}
		
		for(int i=0; i<=right-middle-1; i++) {
			System.out.println("i : " + i);
			int p = middle+1+i;
			System.out.println("p : " + p);
			rightTempArray[i] = nums[middle+1+i];
		}
		
		leftTempArray[middle-left+1] = Integer.MAX_VALUE;
		rightTempArray[right-middle] = Integer.MAX_VALUE;
		
		int i=0, j=0;
		for (int k=left; k <= right; k++) {
			if (leftTempArray[i] < rightTempArray[j]) {
				nums[k] = leftTempArray[i];
				i++;
			} else {
				nums[k] = rightTempArray[j];
				j++;
			}
		}
	}
}

















