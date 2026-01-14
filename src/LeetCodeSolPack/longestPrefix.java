package LeetCodeSolPack;

public class longestPrefix {
	 public String longestCommonPrefix(String[] strs)
	 {
		 String prefix =strs[0] ;
		 if(strs.length==0) return "";	
		 for(int i=1;i<strs.length;i++)
		 {
			 while(strs[i].indexOf(prefix)!=0)
			 {
				 prefix = prefix.substring(0,prefix.length()-1);
				 System.out.println("*********");
				 System.out.println(prefix);
			 }
		 }
		 return prefix;
	 }
	 public static void main(String[] args)
	 {
		 longestPrefix lp = new longestPrefix();
		 String strs[] = {"Apple","Apps","Ape"};
		 String longPref =  lp.longestCommonPrefix(strs);
		 System.out.println("Output: "+longPref);
	 }

}


