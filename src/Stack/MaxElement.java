package Stack;

import java.util.ArrayList;
import java.util.Scanner;

class stack {
	ArrayList<Long> arraylist = new ArrayList<Long>();
	int top = 0;
	long max = 0;

	public void push(long data) {
		if (data > max) {
			max = data;
		}
		arraylist.add(data);
		top++;

	}

	public long delete() {
		if (top == 0) {
			return 0;
		}
		long data;
		if (arraylist.get(top - 1).equals(max)) {
			max = 0;
			for (int i = top - 2; i >= 0; i--) {
				if (max < arraylist.get(i)) {
					max = arraylist.get(i);
				}
			}
		}
		data = arraylist.get(top - 1);
		arraylist.remove(top - 1);
		top--;
		return data;
	}

	public void show() {
		for (int i = 0; i < top; i++) {
			System.out.println(arraylist.get(i));
		}
	}

	public long maxElement() {
		if (top == 0) {
			return 0;
		}
		/*
		 * long max = arraylist.get(0); 
		 * for (int i = 0; i < top; i++) { 
		 * if (max< arraylist.get(i)) { 
		 * max = arraylist.get(i); 
		 * } 
		 * }
		 */
		return max;
	}

}

public class MaxElement {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		stack num = new stack();
		int q = Integer.parseInt(scan.nextLine());

		String[] array = new String[q];
		for (int i = 0; i < q; i++) {
			array[i] = scan.nextLine();
		}
		for (int j = 0; j < array.length; j++) {
			String s = array[j];

			String[] split = s.split(" ");
			if (split[0].equals("1")) {
				num.push(Long.parseLong((split[1])));
			} else if (split[0].equals("2")) {
				num.delete();
			} else {
				System.out.println(num.maxElement());
			}
		}

	}

}
