package Queue;

import java.util.Scanner;
import java.util.Stack;

class queueImplement {
	Stack<Integer> stack1 = new Stack<Integer>();
	Stack<Integer> stack2 = new Stack<Integer>();

	public void Enqueue(int number) {
		stack1.push(number);
	}

	public void Dequeue() {
		while (!stack1.isEmpty()) {
			stack2.push(stack1.pop());
		}
		stack2.pop();
		while (!stack2.isEmpty()) {
			stack1.push(stack2.pop());
		}
	}

	public int Print() {
		while (!stack1.isEmpty()) {
			stack2.push(stack1.pop());
		}
		int result = stack2.peek();
		while (!stack2.isEmpty()) {
			stack1.push(stack2.pop());
		}
		return result;
	}
}

public class QueueUsingTwoStacks {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		queueImplement queue = new queueImplement();
		int q = Integer.parseInt(scan.nextLine());
		for (int i = 0; i < q; i++) {

			String s = scan.nextLine();
			String[] split = s.split(" ");

			if (split[0].equals("1")) {
				queue.Enqueue(Integer.parseInt(split[1]));
			} else if (split[0].equals("2")) {
				queue.Dequeue();
			} else if (split[0].equals("3")) {
				int result = queue.Print();
				System.out.println(result);
			}
		}

	}
}
