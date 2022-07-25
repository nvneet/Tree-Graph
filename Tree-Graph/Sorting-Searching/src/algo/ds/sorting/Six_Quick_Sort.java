package algo.ds.sorting;

import java.util.Arrays;

import algo.ds.util.SwapUtil;

// O(NlogN)
// Not a stable Sort
public class Six_Quick_Sort {
	private static int count = 0;
	public static void main(String[] args) {

		int[] nums = {10, 5, 30, 15, 50, 6, 13, 11, 25, 39, 7, 18};
		System.out.println("Un-sorted: " + Arrays.toString(nums));
		QuickSortNumbers(nums, 0, nums.length-1);
		System.out.println("*** Sorted by QUICK-SORT ***");
		System.out.println("Sorted: " + Arrays.toString(nums));
	}
	
	public static void QuickSortNumbers(int[] nums, int start, int end) {
		if (start < end) {			
			int pivot = partition(nums, start, end);			
//			count++;			
//			System.out.print(count + ". : " + Arrays.toString(nums));
			QuickSortNumbers(nums, start, pivot-1);
			QuickSortNumbers(nums, pivot+1, end);
		}		
	}
	
	private static int partition (int[] nums, int start, int end) {
		int pivot = end;
		int i = start - 1;
		for(int j=start; j<=end; j++) {
			if (nums[j] <= nums[pivot]) {
				i++;
				SwapUtil.swapValuesAtIndex(nums, i, j);
			}
		}
		return i;
	}
}
//		pivot => index: 11 :  Value: 18
//		For less than Pivot => i = -1 ;  j = 0 =>  patition steps: [10, 5, 30, 15, 50, 6, 13, 11, 25, 39, 7, 18]   => i = 0 ;  j = 0
//		For less than Pivot => i = 0 ;   j = 1 =>  patition steps: [10, 5, 30, 15, 50, 6, 13, 11, 25, 39, 7, 18]   => i = 1 ;  j = 1
//		For more than Pivot => i = 1 ;   j = 2 =>  patition steps: [10, 5, 30, 15, 50, 6, 13, 11, 25, 39, 7, 18]   => i = 1 ;  j = 2
//		For less than Pivot => i = 1 ;   j = 3 =>  patition steps: [10, 5, 15, 30, 50, 6, 13, 11, 25, 39, 7, 18]   => i = 2 ;  j = 3
//		For more than Pivot => i = 2 ;   j = 4 =>  patition steps: [10, 5, 15, 30, 50, 6, 13, 11, 25, 39, 7, 18]   => i = 2 ;  j = 4
//		For less than Pivot => i = 2 ;   j = 5 =>  patition steps: [10, 5, 15, 6, 50, 30, 13, 11, 25, 39, 7, 18]   => i = 3 ;  j = 5
//		For less than Pivot => i = 3 ;   j = 6 =>  patition steps: [10, 5, 15, 6, 13, 30, 50, 11, 25, 39, 7, 18]   => i = 4 ;  j = 6
//		For less than Pivot => i = 4 ;   j = 7 =>  patition steps: [10, 5, 15, 6, 13, 11, 50, 30, 25, 39, 7, 18]   => i = 5 ;  j = 7
//		For more than Pivot => i = 5 ;   j = 8 =>  patition steps: [10, 5, 15, 6, 13, 11, 50, 30, 25, 39, 7, 18]   => i = 5 ;  j = 8
//		For more than Pivot => i = 5 ;   j = 9 =>  patition steps: [10, 5, 15, 6, 13, 11, 50, 30, 25, 39, 7, 18]   => i = 5 ;  j = 9
//		For less than Pivot => i = 5 ;  j = 10 =>  patition steps: [10, 5, 15, 6, 13, 11, 7, 30, 25, 39, 50, 18]   => i = 6 ;  j = 10
//		For less than Pivot => i = 6 ;  j = 11 =>  patition steps: [10, 5, 15, 6, 13, 11, 7, 18, 25, 39, 50, 30]   => i = 7 ;  j = 11
//		pivot => index: 6 :  Value: 7
//		For more than Pivot => i = -1 ;  j = 0 =>  patition steps: [10, 5, 15, 6, 13, 11, 7, 18, 25, 39, 50, 30]   => i = -1 ;  j = 0
//		For less than Pivot => i = -1 ;  j = 1 =>  patition steps: [5, 10, 15, 6, 13, 11, 7, 18, 25, 39, 50, 30]   => i = 0 ;  j = 1
//		For more than Pivot => i = 0 ;   j = 2 =>  patition steps: [5, 10, 15, 6, 13, 11, 7, 18, 25, 39, 50, 30]   => i = 0 ;  j = 2
//		For less than Pivot => i = 0 ;   j = 3 =>  patition steps: [5, 6, 15, 10, 13, 11, 7, 18, 25, 39, 50, 30]   => i = 1 ;  j = 3
//		For more than Pivot => i = 1 ;   j = 4 =>  patition steps: [5, 6, 15, 10, 13, 11, 7, 18, 25, 39, 50, 30]   => i = 1 ;  j = 4
//		For more than Pivot => i = 1 ;   j = 5 =>  patition steps: [5, 6, 15, 10, 13, 11, 7, 18, 25, 39, 50, 30]   => i = 1 ;  j = 5
//		For less than Pivot => i = 1 ;   j = 6 =>  patition steps: [5, 6, 7, 10, 13, 11, 15, 18, 25, 39, 50, 30]   => i = 2 ;  j = 6
//		pivot => index: 1 :  Value: 6
//		For less than Pivot => i = -1 ;  j = 0 =>  patition steps: [5, 6, 7, 10, 13, 11, 15, 18, 25, 39, 50, 30]   => i = 0 ;  j = 0
//		For less than Pivot => i = 0 ;   j = 1 =>  patition steps: [5, 6, 7, 10, 13, 11, 15, 18, 25, 39, 50, 30]   => i = 1 ;  j = 1
//		pivot => index: 6 :  Value: 15
//		For less than Pivot => i = 2 ;  j = 3 =>  patition steps: [5, 6, 7, 10, 13, 11, 15, 18, 25, 39, 50, 30]   => i = 3 ;  j = 3
//		For less than Pivot => i = 3 ;  j = 4 =>  patition steps: [5, 6, 7, 10, 13, 11, 15, 18, 25, 39, 50, 30]   => i = 4 ;  j = 4
//		For less than Pivot => i = 4 ;  j = 5 =>  patition steps: [5, 6, 7, 10, 13, 11, 15, 18, 25, 39, 50, 30]   => i = 5 ;  j = 5
//		For less than Pivot => i = 5 ;  j = 6 =>  patition steps: [5, 6, 7, 10, 13, 11, 15, 18, 25, 39, 50, 30]   => i = 6 ;  j = 6
//		pivot => index: 5 :  Value: 11
//		For less than Pivot => i = 2 ;  j = 3 =>  patition steps: [5, 6, 7, 10, 13, 11, 15, 18, 25, 39, 50, 30]   => i = 3 ;  j = 3
//		For more than Pivot => i = 3 ;  j = 4 =>  patition steps: [5, 6, 7, 10, 13, 11, 15, 18, 25, 39, 50, 30]   => i = 3 ;  j = 4
//		For less than Pivot => i = 3 ;  j = 5 =>  patition steps: [5, 6, 7, 10, 11, 13, 15, 18, 25, 39, 50, 30]   => i = 4 ;  j = 5
//		pivot => index: 11 :  Value: 30
//		For less than Pivot => i = 7 ;   j = 8 =>  patition steps: [5, 6, 7, 10, 11, 13, 15, 18, 25, 39, 50, 30]   => i = 8 ;  j = 8
//		For more than Pivot => i = 8 ;   j = 9 =>  patition steps: [5, 6, 7, 10, 11, 13, 15, 18, 25, 39, 50, 30]   => i = 8 ;  j = 9
//		For more than Pivot => i = 8 ;  j = 10 =>  patition steps: [5, 6, 7, 10, 11, 13, 15, 18, 25, 39, 50, 30]   => i = 8 ;  j = 10
//		For less than Pivot => i = 8 ;  j = 11 =>  patition steps: [5, 6, 7, 10, 11, 13, 15, 18, 25, 30, 50, 39]   => i = 9 ;  j = 11
//		pivot => index: 11 :  Value: 39
//		For more than Pivot => i = 9 ;  j = 10 =>  patition steps: [5, 6, 7, 10, 11, 13, 15, 18, 25, 30, 50, 39]   => i = 9 ;  j = 10
//		For less than Pivot => i = 9 ;  j = 11 =>  patition steps: [5, 6, 7, 10, 11, 13, 15, 18, 25, 30, 39, 50]   => i = 10 ;  j = 11

