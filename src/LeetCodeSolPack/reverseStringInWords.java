package LeetCodeSolPack;

public class reverseStringInWords {
    public String reverseWords(String s) {
        if (s == null) return null;
        // Split on one or more spaces; trim to remove leading/trailing spaces
        String[] words = s.trim().split(" +");
        StringBuilder out = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            out.append(reverseString(words[i]));
            if (i < words.length - 1) {
                out.append(' ');
            }
        }
        return out.toString();
    }
    private String reverseString(String str) {
        char[] arr = str.toCharArray();
        int i = 0, j = arr.length - 1;
        while (i < j) {
            char tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
            i++; j--;
        }
        return new String(arr);
    }
    public static void main(String[] args) {
        reverseStringInWords rev = new reverseStringInWords();
        System.out.println(rev.reverseString("Let's take LeetCode contest"));
    }
}

