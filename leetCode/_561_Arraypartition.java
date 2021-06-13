import java.util.Arrays;

public class _561_Arraypartition {
    public static int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum=0;
        for(int i=0;i<nums.length;i=i+2){
            sum+=nums[i];
        }
        return sum;
    }
    
    public static void main(String[] args) {
    	
    	int arr[] = {2,4,3,1};
    	System.out.println(arrayPairSum(arr));
	}
}
