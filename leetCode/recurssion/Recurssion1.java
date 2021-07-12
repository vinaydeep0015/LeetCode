package recurssion;

public class Recurssion1 {
	public static void main(String[] args) {
		System.out.println(rec(3,5));
	}

	private static int rec(int x, int y) {
		if(x==0) {
			return y;
		}
		
		return rec(x-1,x+y);
	}
}
