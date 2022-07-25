package algo.ds.sorting;

import java.util.Arrays;

public class One_Bubble_Sort {

	public static void main(String[] args) {

		int[] nums = {10, 5, 30, 15, 50, 6, 13, 11, 25, 39, 7, 18};
		
		System.out.println("Un-sorted: " + Arrays.toString(nums));
		bubbleSortNumbers(nums);
		System.out.println("   *** Sorted by BUBBLE-SORT ***");
		System.out.println("   Sorted: " + Arrays.toString(nums));
	}
	
	public static void bubbleSortNumbers(int[] nums) {
		
		for (int i =0; i<nums.length; i++) {			
			for (int j=i+1; j<nums.length; j++) {
				
				if (nums[i] > nums[j]) {
					int temp = nums[i];
					nums[i] = nums[j];
					nums[j] = temp;
				}
			}
		}
	}
}
