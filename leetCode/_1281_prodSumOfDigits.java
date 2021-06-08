
public class _1281_prodSumOfDigits {

	public static int subtractProductAndSum(int n) {
		int prod = 1;
		int sum = 0;

		while (n != 0) {
			int d = n % 10;
			prod *= d;
			sum += d;

			n /= 10;
		}

		return prod - sum;
	}
	
	public static void main(String[] args) {
		subtractProductAndSum(224);
	}
}