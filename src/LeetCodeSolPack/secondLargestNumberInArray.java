package LeetCodeSolPack;

public class secondLargestNumberInArray {
    public int getSecondLargestNumber(int[]arr)
    {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for(int i : arr)
        {
            if(i>largest)
            {
                largest = i;
                secondLargest = largest;
            }
            else if (i>secondLargest&&i!=largest)
            {
                secondLargest = arr[i];
            }
        }
        return secondLargest ;
    }
    public static void main(String[] args) {
        int [] arr = {4,8,6,9,7};
        secondLargestNumberInArray sl = new secondLargestNumberInArray();
        System.out.println(sl.getSecondLargestNumber(arr));
    }
}
