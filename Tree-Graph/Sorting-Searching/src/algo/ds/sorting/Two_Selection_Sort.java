package algo.ds.sorting;

import java.util.Arrays;

public class Two_Selection_Sort {

	public static void main(String[] args) {

		int[] nums = {10, 5, 30, 15, 50, 6, 13, 11, 25, 39, 7, 18};
		
		System.out.println("Un-sorted: " + Arrays.toString(nums));
		selectionSortNumbers(nums);
		System.out.println("   *** Sorted by SELECTION-SORT ***");
		System.out.println("   Sorted: " + Arrays.toString(nums));

	}

	private static void selectionSortNumbers(int[] nums) {
		
		for (int i =0; i<nums.length; i++) {
			
			int minimumIndex = i;
			for (int j=i+1; j<nums.length; j++) {
				
				if (nums[j] < nums[minimumIndex]) {
					minimumIndex = j;
				}
			}			
			if (minimumIndex != i) {
				int temp = nums[i];
				nums[i] = nums[minimumIndex];
				nums[minimumIndex] = temp;
			}
		}
	}

}
