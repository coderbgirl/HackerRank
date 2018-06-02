package LinkedList;

import java.util.Scanner;

class Node6 {
	int data;
	Node6 next;
}

class Linkedlist6 {
	Node6 head;
	Node6 tail;

	public void insert(int data) {
		Node6 node = new Node6();
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

	public Node6 MergeLists(Node6 head1, Node6 head2) {

		if (head1.data >= head2.data) {

			Node6 node = new Node6();
			node.data = head2.data;
			node.next = head1;
			head1 = node;
			head2 = head2.next;

		}
		Node6 n = head1;
		while (n != null) {

			if (head2 == null) {
				break;
			}
			if ((n.data<= head2.data && n.next==null) || (n.data <= head2.data && n.next.data >= head2.data)) {
				Node6 newHead = head2.next;
				head2.next = n.next;
				n.next = head2;
				head2 = newHead;
			}
			
			
			n = n.next;

		}
		return head1;

	}

	public void show(Node6 list) {
		Node6 n = list;
		while (n != null) {
			System.out.println(n.data);
			n = n.next;
		}
	}

}

public class MergeSortedLists {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int tests = scan.nextInt();
		for (int i = 0; i < tests; i++) {
			Linkedlist6 list1 = new Linkedlist6();
			int NoOfElements1 = scan.nextInt();

			for (int j = 0; j < NoOfElements1; j++) {
				int element1 = scan.nextInt();
				list1.insert(element1);
			}

			Linkedlist6 list2 = new Linkedlist6();
			int NoOfElements2 = scan.nextInt();

			for (int j = 0; j < NoOfElements2; j++) {
				int element2 = scan.nextInt();
				list2.insert(element2);
			}
			Node6 list = list1.MergeLists(list1.head, list2.head);
			list1.show(list);
		}

	}

}
