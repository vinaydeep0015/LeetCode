package SampleProgs;

import java.util.Stack;

/**
 * 
 * Question statement: Write a function that takes as input a string and returns
 * whether the parenthesis are "balanced".
 * 
 * If the candidate solves this question quickly, add the following difficulty:
 * the string may also contain "[]" or "{}". Return whether all three types of
 * brackets are balanced. Example “(())”, “(()())”, or “()(()())” should return
 * true “(()" or “))” should return false Tips for interviewer (Only share this
 * with the candidate as needed) Candidate may be tempted to just count open and
 * closed parenthesis but that doesn't work: ")(" is not balanced.
 * 
 * If the candidate tries to use multiple loops, advise against that. One
 * for-loop is all that's needed.
 * 
 * Make sure their code handles non-paren characters in the input like "(abc)"
 * (that should return true).
 * 
 * If the candidate still struggles, guide them towards the idea counting the
 * number of open parens that have been seen and subtract one for each closed
 * paren. If the number of open parens ever gets negative or isn't 0 at the end,
 * then it's not balanced.
 * 
 * If they get to the "[]" and "{}" version of the problem, counting is no
 * longer enough. They will need to use a stack to keep track of the open
 * characters that have been seen.
 *
 * 
 * 
 */
public class BalancedParanthese {
	public static void main(String[] args) {
		String str = "))";

		boolean flag = true;
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < str.length(); i++) {
			switch (str.charAt(i)) {
			case '(':
				stack.push('(');
				break;
			case '[':
				stack.push('[');
				break;
			case '{':
				stack.push('{');
				break;
			case ')':
				if (!stack.isEmpty()&& stack.peek() == '(') {
					stack.pop();
				} else {
					flag = false;
				}
				break;
			case ']':
				if (!stack.isEmpty()&& stack.peek() == '[') {
					stack.pop();
				} else {
					flag = false;
				}
				break;
			case '}':
				if (!stack.isEmpty()&& stack.peek() == '{') {
					stack.pop();
				} else {
					flag = false;
				}
				break;
			}
		}
		
		if(!stack.isEmpty()) {
			flag = false;
		}
		System.out.println("balanced : " + flag);
	}
}
