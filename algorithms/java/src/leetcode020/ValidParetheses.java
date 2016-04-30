package leetcode020;

import java.util.Stack;

public class ValidParetheses {
	public boolean isValid(String s){
		Stack<Character> stack = new Stack<Character>();
		int i = 0;
		while( i < s.length()){
			if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{')
				stack.push(s.charAt(i));
			else if(s.charAt(i) == ')' && !stack.isEmpty() && stack.peek() == '(' 
					|| s.charAt(i) == ']' && !stack.isEmpty() && stack.peek() == '['
					|| s.charAt(i) == '}' && !stack.isEmpty() && stack.peek() == '{')
					stack.pop();
			else return false;
			i++;
		}
		
		return stack.isEmpty();
	}
}
