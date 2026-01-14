package LeetCodeSolPack;

public class lastWordLength {
	  public int lengthOfLastWord(String s) {
	        if(s==null||s.equals(""))
	            return 0;
	        	       	       
	       String allWord[] = s.split(" ");
	       
	        return allWord[allWord.length-1].length();
	  }
	  public static void main(String[] args)
		 {
		  String s = "   fly me   to   the moon  ";
		  lastWordLength wL = new lastWordLength();
		  System.out.println(wL.lengthOfLastWord(s));
	    							
		 }
}
