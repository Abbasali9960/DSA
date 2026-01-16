package LeetCodeSolPack;

import java.util.Stack;

public class isValidParenthesis20 {
    public boolean isValid(String s) {
        
        if(s.length() % 2!=0) return false;
        
        Stack<Character> stack = new Stack();
        
      	for (char c : s.toCharArray()) 
        {   System.out.println(c);
            if (c == '(')
                stack.push(')');
            else if (c == '{')
                stack.push('}');
            else if (c == '[')
                stack.push(']');
            else if (stack.isEmpty() || stack.pop() != c)
                return false;
        }
        return stack.isEmpty();
    }
    public static void main(String[] args)
	 {
		 String S ="[{()}]";
		 isValidParenthesis20 vp = new isValidParenthesis20();
		 boolean flag =vp.isValid(S);
		 System.out.println(flag);
		 
		 
	 }
}
