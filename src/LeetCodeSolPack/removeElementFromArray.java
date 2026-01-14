package LeetCodeSolPack;

public class removeElementFromArray {
	public int removeElement(int[] nums, int val) {
		int noOcc = 0;
		if(nums.length==1&&nums[0]!=val)
		{
			nums[noOcc] = nums[0];
			return val;
			}
		for(int i=0;i<nums.length;i++)
		{
			if (nums[i] != val&& nums.length!=1)
			{
				nums[noOcc] = nums[i];
				noOcc += 1;
				}
			}
		return noOcc;
		}
	 public static void main(String[] args)
	 {
		 int[] nums = {3,2,2,3}; // Input array
		 int val = 3; // Value to remove
		 int[] expectedNums = {2,2}; // The expected answer with correct length.
		                             // It is sorted with no values equaling val.
         removeElementFromArray rE = new removeElementFromArray();
		 int k =rE.removeElement(nums, val); // Calls your implementation

		 assert k == expectedNums.length;
		 
		 for (int i = 0; i < nums.length; i++) {
		     assert nums[i] == expectedNums[i];
		     
		 }
		 
		 
	 }
	}
