package LeetCodeSolPack;

public class ImplementStrStr {
	
    public int strStr(String haystack, String needle) {
        if(needle.isEmpty()) return 0;
       
          for (int i = 0; i < haystack.length(); i++) 
          {     
              if (haystack.startsWith(needle, i))
                  return i;
              
          }
    return -1;
}
	    
	 public static void main(String[] args)
	 {
		int val = 2; 
		String s1 = "hello";
		String s2 = "ll";
		ImplementStrStr str = new ImplementStrStr();
		if( val == str.strStr(s1, s2))
			System.out.println("Success");
				
	 }
}
