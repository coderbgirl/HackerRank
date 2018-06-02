package LinkedList;

import java.util.Scanner;

class Node7 {
	int data;
	Node7 next;
}

class Linkedlist7 {
	Node7 head;
	Node7 tail;

	public void insert(int data) {
		Node7 node = new Node7();
		node.data = data;
		node.next = null;

		if (head == null) {
			head = node;
			tail = node;
		} else {
			tail.next = node;
		}
		tail = node;
	}

	public int getNode(Node7 head, int position) {
		Node7 n = head;
		int count = 0;
		while (n != null) {
			count++;
			n = n.next;
		}
		int m = 1;
		Node7 node = head;
		while (m < count - position) {
			m++;
			node = node.next;
		}

		return node.data;
	}

}

public class GetNode {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int tests = scan.nextInt();
		for (int i = 0; i < tests; i++) {
			Linkedlist7 list1 = new Linkedlist7();
			int NoOfElements1 = scan.nextInt();

			for (int j = 0; j < NoOfElements1; j++) {
				int element1 = scan.nextInt();
				list1.insert(element1);
			}
			int position = scan.nextInt();

			int result = list1.getNode(list1.head, position);
			System.out.println(result);
		}
	}

}
