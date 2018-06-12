package Stack;

import java.util.Scanner;
import java.util.Stack;

class Editor {
	Stack<String> stack = new Stack<String>();
	int top = 0;

	public void append(String s) {
		if (stack.isEmpty() == true) {
			stack.push(s);
			top++;
		} else {
			String newString = stack.peek() + s;
			stack.push(newString);
			top++;
		}
	}

	public void delete(int k) {

		String s = stack.peek();

		s = s.substring(0, s.length() - k);
		if (s == null) {
			stack.push("");
			top++;
		} else {
			stack.push(s);
			top++;
		}
	}

	public char print(int k) {
		String s = stack.peek();
		char result = '0';
		for (int i = 0; i < s.length(); i++) {
			if (i == (k - 1)) {
				result = s.charAt(i);
			}
		}
		return result;
	}

	public void undo() {
		stack.pop();
		top--;
	}

}

public class SimpleTextEditor {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Editor text = new Editor();
		int q = Integer.parseInt(scan.nextLine());
		for (int i = 0; i < q; i++) {

			String s = scan.nextLine();
			String[] split = s.split(" ");

			if (split[0].equals("1")) {
				text.append(split[1]);
			} else if (split[0].equals("2")) {
				text.delete(Integer.parseInt(split[1]));
			} else if (split[0].equals("3")) {
				char c = text.print(Integer.parseInt(split[1]));
				System.out.println(c);
			} else if (split[0].equals("4")){
				text.undo();
			}
		}

	}

}
