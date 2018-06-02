package LinkedList;

import java.util.Scanner;

class Node2 {
	int data;
	Node2 next;
}

class Linkedlist2 {
	Node2 head;
	Node2 tail;

	public void insert(int data) {
		Node2 node = new Node2();
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
		Node2 n = head;
		while (n != null) {
			System.out.println(n.data);
			n = n.next;
		}
	}

	public Node2 delete(Node2 head, int position) {
		if(position==0){
			head= head.next;
		}
		else{
			Node2 n = head;
			for(int i=0; i<position-1; i++){
				n=n.next;
			}
			Node2 temp=n.next;
			n.next= temp.next;
 
		}
		return head;
	}
}

public class DeleteNode {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int NoOfElements = scan.nextInt();
		Linkedlist2 list = new Linkedlist2();

		for (int i = 0; i < NoOfElements; i++) {
			int element = scan.nextInt();
			list.insert(element);
		}

		int position = scan.nextInt();
		list.head =list.delete(list.head,position);
		list.show();
	}

}
