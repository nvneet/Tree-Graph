package ds.recursion;

public class Factorial {

	public static void main(String[] args) {

		Factorial fact = new Factorial();
		int num = fact.factorial(10);

		System.out.println("result: " + num);

	}

	public int factorial(int n) {
		if (n < 0) {
			return -1;
		}
		if (n <= 1) {
			return 1;
		}

		return n * factorial(n - 1);
	}

}
