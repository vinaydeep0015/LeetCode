package SampleProgs;

import java.util.Stack;

/**
 * Question statement: Write a function that takes a multi-word string as input
 * and reverses the order of the letters in each word while preserving the word
 * order and spacing. Example “moo cow bark dog” -> “oom woc krab god” Tips for
 * interviewer (Only share this with the candidate as needed) Several potential
 * ways to do this:
 * 
 * Start with a naive implementation that uses a split function to naively split
 * the string into words. Brute force by finding and keeping track of the start
 * of a word and the end of the word, reverse the word, and keep going.
 * (Advanced) Improve this by using a data structure, such as a stack, to add
 * the letters in the word to the stack until you encounter a space, then add
 * the letters from the stack (in reversed order) back together and add them to
 * the string. Others!
 * 
 * Potential pitfalls: Don’t reverse the entire string -- preserve the word
 * ordering and the spaces. We make no guarantee about how many spaces / tabs
 * there are between words, so you can’t split (using the .split() method) and
 * then reverse the words individually.
 * 
 * Potential hints: “Well how do we know when we want to start or finish
 * reversing a word?” IE - using a method like isLetter() to determine if the
 * current character is or is not part of a word. “Would it help to break the
 * reversing a word part into its own method?” “Are there any data structures
 * that are useful for reversing the order of elements you put in?” Suggest that
 * they implement a function that uses a for-loop to filter out all the
 * non-letter words from a string. That gives the right code structure and
 * functionality to solve the given problem can be added to that.
 * 
 */

public class ReverseWordsInString {
	public static void main(String[] args) {
		String str = "moo cow bark dog";

		naiveApproach(str);
		advancedApproachUsingStack(str);
	}

	private static void advancedApproachUsingStack(String str) {

		StringBuffer sb = new StringBuffer();
		Stack<Character> stack = new Stack<Character>();

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ' ') {
				stack.add(str.charAt(i));
			} else {
				while (!stack.empty()) {
					sb.append(stack.peek());
					stack.pop();
				}
				sb.append(' ');
			}
		}

		while (!stack.empty()) {
			sb.append(stack.peek());
			stack.pop();
		}

		System.out.println(sb);
	}

	private static void naiveApproach(String str) {

		StringBuffer res = new StringBuffer();
		String[] arr = str.split(" ");
		for (int i = 0; i < arr.length; i++) {
			res.append(new StringBuffer(arr[i]).reverse());
			res.append(" ");
		}

		System.out.println(res);
	}
}
