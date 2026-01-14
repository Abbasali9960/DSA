package LeetCodeSolPack;

public class removeDuplicatedFromArray {
	
	public int removeDuplicates(int []nums)
	{   
		if(nums.length==1) return 1;
		
		int j = 0;
		int i =0;
				
		for(j=0;j<nums.length;j++)
		{
			if(nums[i]!=nums[j]&& j+1<nums.length)
			{
				nums[i] = nums[j+1];
				i++;
				j++;
				
			}
			if(nums[i]==nums[j])
			{
				j=j+1;
						
			}
			
			
		}
			
		return i = i+1;			
		
	}
	 public static void main(String[] args)
	 {
		 int[] nums = {1,2,3,3,4,4,5}; // Input array
		 int[] expectedNums = {1,2,3,4,5};
		 removeDuplicatedFromArray rd = new removeDuplicatedFromArray(); 
		 int k = rd.removeDuplicates(nums); // Calls your implementation
     
		 assert k == expectedNums.length;
		 for (int i = 0; i < k; i++) {
		     assert nums[i] == expectedNums[i];
		 }
		
	 }
	
}
