package algo.ds.sorting;

import java.util.Arrays;

public class Four_Bucket_Sort {

	public static void main(String[] args) {

		int[] nums = {10, 5, 30, 15, 50, 6, 13, 11, 25, 39, 7, 18};
		
		System.out.println("Un-sorted: " + Arrays.toString(nums));
		bucketSortNumbers(nums);
		System.out.println("   *** Sorted by BUCKET-SORT ***");
		System.out.println("   Sorted: " + Arrays.toString(nums));
	}
	
	public static void bucketSortNumbers(int[] nums) {
		
		//TODO
	}
}
