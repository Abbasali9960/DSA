package LeetCodeSolPack;

import java.util.Stack;

public class isValidParenthesis {
    public boolean isValid(String s) {
        
        if(s.length() % 2!=0) return false;
        
        Stack<Character> stack = new Stack();
        
      	for (char c : s.toCharArray()) 
        {
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
		 String S ="{}()[]";
		 isValidParenthesis vp = new isValidParenthesis();
		 boolean flag =vp.isValid(S);
		 System.out.println(flag);
		 
		 
	 }
}
