import java.util.Arrays;

public class _27_RemoveElements {
	public static void main(String[] args) {
		int arr[] = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4, 4, 5 };
		System.out.println(removeElement(arr, 2));
	}

    public static int removeElement(int[] nums, int val) {
        int j=0;
        int i=0;
        for(;i<nums.length;i++){
            if(nums[i]!=val){
                nums[j]=nums[i];
                j++;
            }
        }
        
        return j;
    }
}
