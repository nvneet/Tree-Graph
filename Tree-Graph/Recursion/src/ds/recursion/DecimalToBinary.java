package ds.recursion;

public class DecimalToBinary {

	public static void main(String[] args) {
		
		System.out.println("result: " + getDecimalToBinary(-13));
	}
	
	private static int getDecimalToBinary(int num) {
		
//		if (num < 0) {
//			return -1;
//		}
		if (num == 0) {
			return 0;
		}
		
		return num%2 + 10 * getDecimalToBinary(num / 2);
		
	}
	
	/*
	 * step 1: Divide the number by 2
	 * step 1: Get the integer quotient for the next iteration
	 * step 3: Get the remainder for the binary digit
	 * step 4: Repeat the steps until the quotient is equal to 0
	 * 
	 * 
	 * eg. Division by 2         Quotient        Remainder        f(n) = n%2 + 10*f(n/2)
	 *        13/2                   6               1            110*10 + 1 = 1101
	 *         6/2                   3               0             11*10 + 0 = 110
	 *         3/2                   1               1              1*10 + 1 = 11
	 *         1/2                   0               1            
	 *         
	 *         binary for 13: 1101
	 *         
	 */
}
