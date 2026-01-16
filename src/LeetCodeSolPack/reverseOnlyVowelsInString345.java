package LeetCodeSolPack;

public class reverseOnlyVowelsInString345 {
    public String reversevowels(String str) {
        String vowels = "aeiouAEIOU";
        char[] arr = str.toCharArray();
        int left = 0, right = arr.length - 1;

        while (left < right) {
            if (vowels.indexOf(arr[left])==-1) {
                left++;
            } else if (vowels.indexOf(arr[right])==-1) {
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
        reverseOnlyVowelsInString345 reverse = new reverseOnlyVowelsInString345();
        String s = "Hello";
        System.out.println(reverse.reversevowels(s));
    }

}
