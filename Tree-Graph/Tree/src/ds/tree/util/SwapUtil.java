package ds.tree.util;

public class SwapUtil {

	public static void swap(int[] arr, int index, int parent) {
		int temp = arr[index];
		arr[index] = arr[parent];
		arr[parent] = temp;
	}
}
