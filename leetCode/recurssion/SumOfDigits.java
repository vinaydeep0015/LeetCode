package recurssion;

/*
 * write a recursive function that, given a number  n, returns the sum of the digits of the number n.
 */
public class SumOfDigits {
	public static void main(String[] args) {
		System.out.println(digitalSum(1231));
	}

	private static int digitalSum(int n) {
		if(n==0) {
			return 0;
		}
		return n%10 + (digitalSum(n/10));
	}
}
