package LinkedList;

import java.util.Scanner;

class Node {
	int data;
	Node next;
}

class Linkedlist {
	Node head;

	public void insert(int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;

		if (head == null) {
			head = node;
		} else {
			Node n = head;
			while (n.next != null) {
				n = n.next;
			}
			n.next = node;

		}
	}

	public void show() {
		Node n = head;
		while (n != null) {
			System.out.println(n.data);
			n = n.next;
		}
	}
}

public class PrintElements {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		int NoOfElements= scan.nextInt();
		Linkedlist list = new Linkedlist();

		for(int i=0; i<NoOfElements; i++){
			int element= scan.nextInt();
			list.insert(element);	
		}
		list.show();

	}

}
