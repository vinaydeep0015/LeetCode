
public class _53_maxSubarray {
    public static int maxSubArray(int[] nums) {
        int max = nums[0];
        int s =0;
        for(int i =0;i<nums.length;i++){
           s+=nums[i];
            if(max<s){
                max =s;
            }
            if(s<0){
                s=0;
            }
        }
        return max;
    }
    
    public static void main(String[] args) {
		int arr[] = {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(maxSubArray(arr));
	}
}