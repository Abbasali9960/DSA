package LeetCodeSolPack;

public class lengthOfLastWord {
    public int lenghtOfLastWord(String s)
    {
        String[] words = s.trim().split(" ");
        return words[words.length-1].length();

    }
    public static void main(String[] args)
    {
        lengthOfLastWord lw = new lengthOfLastWord();
      System.out.println(lw.lenghtOfLastWord("   Hello World Abb "));
    }
}
