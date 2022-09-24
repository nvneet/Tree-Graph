package ds.recursion;

// Greatest Commob Divisor
// eg. gcd(8,12) = 4

public class GCD {

	public static void main(String[] args) {

		System.out.println("result: " + getGCD(48, 18));
	}

	private static int getGCD(int a, int b) {

		if (a < 0 || b < 0) {
			return -1;
		}

		if (b == 0) {
			return a;
		}

		return getGCD(b, a % b);
	}

	/*
	 * Euclidean algorithm
	 * 
	 * gcd (48, 18)
	 * 
	 * step 1: 48/18 = 2 remainder 12 
	 * step 2: 18/12 = 1 remainder 6 
	 * step 3: 12/6  = 2 remainder 0
	 * 
	 */

}
