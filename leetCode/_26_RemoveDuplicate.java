
public class _26_RemoveDuplicate {
	public int removeDuplicates(int[] nums) {
		int i = 1, j = i;
		for (;j < nums.length;) {
			if (nums[j] > nums[i - 1]) {
				nums[i++] = nums[j++];

			} else {
				j++;
			}
		}
		return i;
	}
}
