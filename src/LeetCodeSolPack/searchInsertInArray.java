package LeetCodeSolPack;

public class searchInsertInArray {

	 public int searchInsert(int[] nums, int target) {
	        int index=0;
	        for(int i =0 ;i<nums.length;i++)
	        {           
	            if(nums[i]==target )
	            {
	                
	                index=i;
	            }
	            else if(nums[i]<target)
	            {
	                index=index+1;
	            }
	         
	       }
	        return index;
	        }
	 public static void main(String[] args)
	 {
		int [] val = {1,2,3,4}; 
		int target = 3;
		searchInsertInArray sI = new searchInsertInArray();
	    System.out.print("Succes: Index is :"+sI.searchInsert(val, target));
					
	 }
	 }
