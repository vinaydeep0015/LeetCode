package recurssion;

/*
 * Write a recursive function that checks whether a string is a palindrome 
 * (a palindrome isa string that's the same when reads forwards and backwards.)
 */
public class Palindrome {
	public static void main(String[] args) {
		String str = "abcba";
		System.out.println(str+ "Palindrome or not : "+palindrome(str,0,str.length()-1));
	}

	private static Boolean palindrome(String str, int i, int j) {
		if(i>=j) {
			return true;
		}
		if(str.charAt(i)==str.charAt(j)) {
			return palindrome(str, ++i, --j);
		}
		
		return false;
	}
}
