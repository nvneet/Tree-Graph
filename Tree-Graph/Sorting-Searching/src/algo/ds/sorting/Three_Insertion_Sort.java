package algo.ds.sorting;

import java.util.Arrays;

public class Three_Insertion_Sort {

	public static void main(String[] args) {
		int[] nums = {10, 5, 30, 15, 50, 6, 13, 11, 25, 39, 7, 18};
		
		System.out.println("Un-sorted: " + Arrays.toString(nums));
		insertionSortNumbers(nums);
		System.out.println("   *** Sorted by INSERTION-SORT ***");
		System.out.println("   Sorted: " + Arrays.toString(nums));
	}

	private static void insertionSortNumbers(int[] nums) {

		for (int i=0; i<nums.length; i++) {
			
			int temp = nums[i], j=i;
			while (j > 0 && nums[j-1] > temp) {
				nums[j] = nums [j-1];
				j--;
			}
			nums[j]=temp;
		}
	}

}
