package LinkedList;

import java.util.Scanner;

class Node3 {
	int data;
	Node3 next;
}

class Linkedlist3 {
	Node3 head;
	Node3 tail;

	public void insert(int data) {
		Node3 node = new Node3();
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

	public void show() {
		Node3 n = head;
		while (n != null) {
			System.out.println(n.data);
			n = n.next;
		}
	}

	public Node3 delete(Node3 head, int position) {
		if (position == 0) {
			head = head.next;
		} else {
			Node3 n = head;
			for (int i = 0; i < position - 1; i++) {
				n = n.next;
			}
			Node3 temp = n.next;
			n.next = temp.next;

		}
		return head;
	}

	public Node3 insertAt(Node3 head, int data, int position) {
		Node3 node = new Node3();
		node.data = data;
		node.next = null;
		if (position == 0) {
			node.next = head;
			head = node;
		} else {
			Node3 n = head;

			for (int i = 0; i < position - 1; i++) {
				n = n.next;
			}
			node.next= n.next;
			n.next= node;
		}
		return head;
	}
}

public class InsertAtPosition {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int NoOfElements = scan.nextInt();
		Linkedlist3 list = new Linkedlist3();

		for (int i = 0; i < NoOfElements; i++) {
			int element = scan.nextInt();
			list.insert(element);
		}
		int data = scan.nextInt();
		int position = scan.nextInt();
		list.head = list.insertAt(list.head, data, position);
		list.show();
	}

}
