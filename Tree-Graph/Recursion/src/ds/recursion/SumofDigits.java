package ds.recursion;

// Problem: Sum of all the digits in a number
public class SumofDigits {

	public static void main(String[] args) {
		
		System.out.println("result: " + getSum(1999999123));
		System.out.println("Max: " + Integer.MAX_VALUE);
		System.out.println("Min: " + Integer.MIN_VALUE);

	}
	
	private static int getSum(int n) {

		if (n <= 0) {
			return 0;
		}
		
		return n%10 + getSum(n/10);
	}

}
