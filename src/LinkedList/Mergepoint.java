package LinkedList;

import java.util.Scanner;

class Node10 {
	int data;
	Node10 next;
}

class LinkedList10 {
	Node10 head;
	Node10 tail;

	public void insert(int data) {
		Node10 node = new Node10();
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

	public int MPoint(Node10 head1, Node10 head2) {
		Node10 n = head1;
		Node10 m = head2;
		int count1 = 0;
		int count2 = 0;
		while (n != null) {
			n = n.next;
			count1++;
		}
		while (m != null) {
			m = m.next;
			count2++;
		}
		 n = head1;
		 m = head2;
		int d = 0;
		if (count2 > count1) {
			d = count2 - count1;
			for (int i = 0; i < d; i++) {
				m = m.next;
			}
		} else {
			d = count1 - count2;
			for (int i = 0; i < d; i++) {
				n = n.next;
			}
		}
		while (n != null && m != null) {
			if (n == m) {
				return n.data;
			}
			n = n.next;
			m = m.next;
		}
		return 0;
	}
}

public class Mergepoint {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int tests = scan.nextInt();
		for (int i = 0; i < tests; i++) {
			int index1 = scan.nextInt();

			LinkedList10 list1 = new LinkedList10();
			int NoOfElements1 = scan.nextInt();

			for (int j = 0; j < NoOfElements1; j++) {
				int element1 = scan.nextInt();
				list1.insert(element1);
			}

			int index2 = scan.nextInt();
			LinkedList10 list2 = new LinkedList10();
			int NoOfElements2 = scan.nextInt();

			for (int j = 0; j < NoOfElements2; j++) {
				int element2 = scan.nextInt();
				list2.insert(element2);
			}
			Node10 n = list1.head;
			Node10 temp = null;
			for (int k = 0; k < NoOfElements1; k++) {
				if (index1 == k) {
					temp = n;
					break;
				}
				n = n.next;
			}
			Node10 m = list2.head;
			for (int l = 0; l < NoOfElements2; l++) {
				if (index2 - 1 == l) {
					m.next = temp;
					break;
				}
				m = m.next;
			}

			int result = list1.MPoint(list1.head, list2.head);
			System.out.println(result);
		}

	}

}
