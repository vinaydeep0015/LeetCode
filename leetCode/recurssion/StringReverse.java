package recurssion;

/*
 * Write a recursive function that, given a string s, prints the characters of s in reverse order.
 */

public class StringReverse {
	public static void main(String[] args) {
		System.out.println(rev("abcdefgh"));
	}

	private static String rev(String str) {
		if(str.length()==0) {
			return "";
		}
		return str.charAt(str.length()-1) + rev(str.substring(0,str.length()-1));
	}
}
