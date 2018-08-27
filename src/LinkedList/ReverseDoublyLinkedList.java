package LinkedList;

import java.util.Scanner;

class Node12 {
	int data;
	Node12 next;
	Node12 previous;
}

class Linkedlist12 {
	Node12 head;
	Node12 tail;

	public void insert(int data) {
		Node12 node = new Node12();
		node.data = data;
		node.next = null;
		node.previous = null;

		if (head == null) {
			head = node;
			tail = node;
		} else {
			tail.next = node;
			node.previous = tail;
		}
		tail = node;

	}

	public void show(Node12 head) {
		Node12 n = head;
		while (n != null) {
			System.out.println(n.data);
			n = n.next;
		}
	}

	public Node12 Reverse(Node12 head){
		Node12 pre= null;
		Node12 current = head;
		Node12 next = null;
		while(current!=null){
			next=current.next;
			current.next= pre;
			current.previous= next;
			pre=current;
			current=next;
		}
		head= pre;	
		return head;
		
	}
}

public class ReverseDoublyLinkedList {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int tests = scan.nextInt();
		for (int i = 0; i < tests; i++) {

			Linkedlist12 list1 = new Linkedlist12();
			int NoOfElements1 = scan.nextInt();

			for (int j = 0; j < NoOfElements1; j++) {
				int element1 = scan.nextInt();
				list1.insert(element1);
			}

			Node12 result = list1.Reverse(list1.head);
			list1.show(result);
		}
	}

}
