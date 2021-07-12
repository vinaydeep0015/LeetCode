package recurssion;
/*
 * Write a recursive implementation of the factorial function. 
 * Recall that n! = 1 × 2 × ... ×n,with the special case that 0! = 1
 */


public class Factorial {
	public static void main(String[] args) {
		System.out.println(fact(5));
	}

	private static int fact(int n) {
		if(n==0) {
			return 1;
		}
		return n*fact(n-1);
	}
}
