package ds.recursion;

public class PowerOfNumber {

	public static void main(String[] args) {
		
		System.out.println("result: " + powerOf(2, -1));
	}
	
	private static int powerOf(int base, int exp) {
		if (exp < 0) {
			return -1;
		}
		if (exp == 1) {
			return base;
		}
		
		return base * powerOf(base, exp-1);
	}

}
