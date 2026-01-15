package LeetCodeSolPack;

class MissingNumber268 {
    public int[] sortArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int current = arr[i];
            int j = i - 1;

            while (j >= 0 && current < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = current;
        }
        return arr;
    }
    public int missingNumber(int[] nums) {

        int[] sorted = sortArray(nums);
        int n = nums.length;

        // If 0 is missing (edge case)
        if (sorted[0] != 0) {
            return 0;
        }

        // Find the missing number by detecting the gap
        for (int i = 1; i < sorted.length; i++) {
            if (sorted[i] != sorted[i - 1] + 1) {
                return sorted[i - 1] + 1;
            }
        }

        // If no gap found, missing number is n
        return n;

    }
    public static void main(String[] args) {
        int[]arr = {3,1,4,5,0};
        MissingNumber268 miss = new MissingNumber268() ;
        System.out.println(miss.missingNumber(arr));
     }
}
       
                                               