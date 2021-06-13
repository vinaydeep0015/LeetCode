import java.util.Arrays;

public class _1051_HeightChecker {
    public static int heightChecker(int[] heights) {
        int orig[] = new int[heights.length];
        
        for(int i=0;i<heights.length;i++){
            orig[i] = heights[i];
        }
        
        Arrays.sort(heights);
        
        int res = 0;
        for(int i=0;i<heights.length;i++){
            if(orig[i]!=heights[i]){
                res++;
            }
        }
        
        return res;
    }
    
    public static void main(String[] args) {
		int arr[]= {1,1,4,2,1,3};
		System.out.println(heightChecker(arr));

	}
}
