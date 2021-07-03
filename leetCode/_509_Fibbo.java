
public class _509_Fibbo {
	public static int fib(int n) {

		return fibbo(-1, 1, 0, n);
	}

	public static int fibbo(int a, int b, int c, int n) {
		if (n == -1) {
			return c;
		}
		c = a + b;
		a = b;
		b = c;

		return fibbo(a, b, c, n - 1);
	}
	
	public static void main(String[] args) {
		System.out.println(fib(4));
	}
}