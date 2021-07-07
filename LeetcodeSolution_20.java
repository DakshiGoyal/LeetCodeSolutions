/*Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.

Time Complexity: O(n)
Space Complexity: O(n)*/


import java.util.Scanner;
import java.util.Stack;

public class LeetcodeSolution_20 {
	public static boolean isValid(String s) {

		Stack<Character> st = new Stack<>();
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch == '(' || ch == '{' || ch == '[') {
				st.push(ch);
			} else if (st.size() != 0) {
				if (ch == ')' && st.peek() != '(') {
					return false;
				} else if (ch == ']' && st.peek() != '[') {
					return false;
				} else if (ch == '}' && st.peek() != '{') {
					return false;
				} else {
					st.pop();
				}
			} else {
				return false;
			}
		}
		return(st.isEmpty());
	}

	public static void main(String[] args) {

		System.out.print(isValid("()[]{}"));

	}
}
