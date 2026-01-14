package LeetCodeSolPack;

public class MaximumSubarray {
	 public static void main(String[] args)
	 {
		 int[] nums = {-2,1,-3,4,-1,2,1,-5,4};

		
	            int maxSum=Integer.MIN_VALUE;
		        int total = 0;
		        if(nums.length==0)
		        	maxSum =0;
	        
	            if(nums.length==1)
	            	maxSum= nums[0];
	        
		        for( int i=0;i<nums.length;i++)
		        {                               
			           total = Math.max(nums[i],total + nums[i]);
	                   maxSum = Math.max(maxSum,total);             
	         
		        }
		        
		        
	        
	          System.out.print(maxSum); 
			
	 }

}
