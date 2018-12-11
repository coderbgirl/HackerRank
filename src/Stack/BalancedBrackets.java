package Stack;

import java.util.Scanner;
import java.util.Stack;

public class BalancedBrackets {

	static String isBalanced(String s) {
		Stack<Character> stack = new Stack<Character>();
		for (char c : s.toCharArray()) {
			if (c == '(' || c == '{' || c == '[') {
				stack.push(c);
			} else {
				if (!stack.isEmpty()) {
					if (c == ')' && stack.peek()=='(')
						stack.pop();

					else if (c == '}' && stack.peek()=='{')
						stack.pop();

					else if (c == ']' && stack.peek()=='[')
						stack.pop();
				} else
					return "NO";
			}
		}
		if (stack.isEmpty())
			return "YES";
		else
			return "NO";

	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int strings = Integer.parseInt(scan.nextLine());
		for (int i = 0; i < strings; i++) {
			String s = scan.nextLine();

			String result = isBalanced(s);

			System.out.println(result);

		}

	}

}
