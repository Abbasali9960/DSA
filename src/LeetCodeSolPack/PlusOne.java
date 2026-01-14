package LeetCodeSolPack;

public class PlusOne {
	   public int[] plusOne(int[] digits) {
	        int n = digits.length;
	        int[] ans = new int[n+1]; 
	        
	        for (int i = n-1; i >= 0; i--)
	        {
	            if (digits[i] + 1 == 10)
	            {
	                digits[i] = 0; ans[0] = 1;
	                
	            }
	            else {
	                digits[i] += 1;
	                  return digits;
	            }
	        }
	        return ans;
	    }
	   public static void main(String[] args)
	   {
		   PlusOne pO = new PlusOne();
		   int [] digits = {1,2,3};
		   digits = pO.plusOne(digits);
		   for(int i=0;i<digits.length;i++)
		   {
		   System.out.println(digits[i]);
		   }
		   
	   }
}
