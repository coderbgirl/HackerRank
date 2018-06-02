package LinkedList;

import java.util.Scanner;

class Node4 {
	int data;
	Node4 next;
}

class Linkedlist4 {
	Node4 head;
	Node4 tail;

	public void insert(int data) {
		Node4 node = new Node4();
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
		Node4 n = head;
		while (n != null) {
			System.out.println(n.data);
			n = n.next;
		}
	}

	public Node4 delete(Node4 head, int position) {
		if(position==0){
			head= head.next;
		}
		else{
			Node4 n = head;
			for(int i=0; i<position-1; i++){
				n=n.next;
			}
			Node4 temp=n.next;
			n.next= temp.next;
 
		}
		return head;
	}
	public Node4 Reverse(Node4 head){
		Node4 pre= null;
		Node4 current = head;
		Node4 next = null;
		while(current!=null){
			next=current.next;
			current.next= pre;
			pre=current;
			current=next;
		}
		head= pre;	
		return head;
	}
}

public class ReversePrint {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int NoOfElements = scan.nextInt();
		Linkedlist4 list = new Linkedlist4();

		for (int i = 0; i < NoOfElements; i++) {
			int element = scan.nextInt();
			list.insert(element);
		}

		
		list.head=list.Reverse(list.head);
		list.show();
	}


}
