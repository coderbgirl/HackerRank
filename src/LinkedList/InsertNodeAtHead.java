package LinkedList;

import java.util.Scanner;

class Node1 {
	int data;
	Node1 next;
}

class Linkedlist1 {
	Node1 head;

	public Node1 insert(Node1 head, int data) {
		Node1 node = new Node1();
		node.data = data;
		node.next = head;
		return node;
	}

	public void show() {
		Node1 n = head;
		while (n.next != null) {
			System.out.println(n.data);
			n = n.next;
		}
		System.out.println(n.data);
	}
}

public class InsertNodeAtHead {

	public static void main(String[] args) {

		Linkedlist1 list = new Linkedlist1();
		Node1 head = list.insert(null, 5);
		head = list.insert(head, 6);

	}

}
