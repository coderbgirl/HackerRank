package LinkedList;

import java.util.Scanner;

class Node5 {
	int data;
	Node5 next;
}

class Linkedlist5 {
	Node5 head;
	Node5 tail;

	public void insert(int data) {
		Node5 node = new Node5();
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

	 static boolean compareLists(Node5 head1, Node5 head2) {
		Node5 n1 = head1;
		Node5 n2 = head2;

		while (n1 != null || n2 != null) {
			if (n1.next == null && n2.next != null || n1.next != null && n2.next == null) {
				return false;
			} else {
				if (n1.data == n2.data) {
					n1 = n1.next;
					n2 = n2.next;
					continue;
				} else {
					return false;
				}
			}
		}
		return true;

	}
}

public class CompareLinkedLists {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int tests = scan.nextInt();
		for (int i = 0; i < tests; i++) {
			Linkedlist5 list1 = new Linkedlist5();
			int NoOfElements1 = scan.nextInt();

			for (int j = 0; j < NoOfElements1; j++) {
				int element1 = scan.nextInt();
				list1.insert(element1);
			}

			Linkedlist5 list2 = new Linkedlist5();
			int NoOfElements2 = scan.nextInt();

			for (int j = 0; j < NoOfElements2; j++) {
				int element2 = scan.nextInt();
				list2.insert(element2);
			}
			boolean result = list1.compareLists(list1.head, list2.head);
			System.out.println(result);
		}
	}
}
