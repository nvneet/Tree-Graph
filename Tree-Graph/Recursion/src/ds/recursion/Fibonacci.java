package ds.recursion;

public class Fibonacci {

	public static void main(String[] args) {

		int num = getFibonacciNum(4);
		System.out.println("result: " + num);
	}

	private static int getFibonacciNum(int n) {
		if(n < 0) {
			return -1;
		}

		if (n <= 1) {
			return n;
		}

		return getFibonacciNum(n - 1) + getFibonacciNum(n - 2);
	}

}
