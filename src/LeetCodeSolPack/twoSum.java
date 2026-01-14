package LeetCodeSolPack;

class twoSum {
   
    public int[] twoSumN(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
     return new int[] {};
    }
    public static void main(String[] args) {
         int val[] = new int[]{11,15,2,7,};
         twoSum s= new twoSum();
         int res[]=new int[2];
         res = s.twoSumN(val, 9);
         for(int i=0;i<res.length;i++)
         {
          System.out.println(res[i]);
         }
     }
}
       
                                               