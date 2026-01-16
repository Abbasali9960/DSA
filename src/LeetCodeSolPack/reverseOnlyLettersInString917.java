package LeetCodeSolPack;

public class reverseOnlyLettersInString917 {
    public String reverseString(String str) {
        char[] arr = str.toCharArray();
        int left = 0, right = arr.length - 1;

        while (left < right) {
            if (!Character.isLetter(arr[left])) {
                left++;
            } else if (!Character.isLetter(arr[right])) {
                right--;
            } else {
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
        return new String(arr);
    }

    public static void main(String[] args) {
        reverseOnlyLettersInString917 reverse = new reverseOnlyLettersInString917();
        String s = "a-bC-dEf-ghIj";
        System.out.println(reverse.reverseString(s));
    }

}
