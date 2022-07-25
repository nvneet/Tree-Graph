package algo.ds.util;

public class SwapUtil {

	public static void swapValuesAtIndex(int[] arr, int indexCurrent, int indexParent) {
		int temp = arr[indexCurrent];
		arr[indexCurrent] = arr[indexParent];
		arr[indexParent] = temp;
	}
}
