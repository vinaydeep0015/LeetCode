package SampleProgs;

public class DecimalToBinary {
	public static void main(String[] args) {
		System.out.println(deciToBi(10));
	}

	private static String deciToBi(int n) {
		if (n == 1) {
			return " " + 1;
		}

		String res = " " + (n % 2);
		return deciToBi(n / 2) + res;
	}
}
