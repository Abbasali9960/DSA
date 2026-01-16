package LeetCodeSolPack;

public class reverseWordsInString557 {
    public String reverseString(String str) {
        char[] arr = str.toCharArray();
        int left = 0, right = arr.length - 1;

        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        return new String(arr);
    }

    public static void main(String[] args) {
        reverseWordsInString557 reverse = new reverseWordsInString557();
        String s = "Let's take LeetCode contest";
        String[] words = s.split(" +");
        StringBuilder rev = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            rev.append(reverse.reverseString(words[i]));
            System.out.println(rev);
            rev.append(' ');
        }
        System.out.println(rev.toString().trim());
    }

}
