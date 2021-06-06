import java.util.Arrays;

public class _338_CountingBits {
//	public static int[] countBits(int n) {
//		int res[] = new int[n + 1];
//		for (int i = 0; i <= n; i++) {
//			res[i] = countOf1(i);
//		}
//
//		return res;
//	}
//
//	public static int countOf1(int n) {
//		if (n == 0) {
//			return 0;
//		}
//		if (n == 1) {
//			return 1;
//		}
//
//		int count = 1;
//		while (n != 1) {
//
//			if (n % 2 == 1) {
//				count++;
//			}
//			n = n / 2;
//		}
//		return count;
//	}
	
	
	//Approach 2
    public static int[] countBits(int n) {
        int res[] = new int[n+1];
        for(int i=0;i<=n;i++){
            // note to divide by 2 -->i/2  or i>>1
         //   res[i] = res[i/2] + (i&1);
         //   res[i] = res[i>>1] + (i&1);
            //note to find odd or even --> (i&1) or ((i%2==0)?0:1)
            res[i] = res[i>>1] + ((i%2==0)?0:1);
        }
        
        return res;
    }
	
	
	public static void main(String[] args) {
		System.out.println(Arrays.toString(countBits(5)));
	}
}