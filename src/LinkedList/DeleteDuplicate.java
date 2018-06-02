package LinkedList;

import java.util.Scanner;

class Node8 {
	int data;
	Node8 next;
}

class Linkedlist8 {
	Node8 head;
	Node8 tail;

	public void insert(int data) {
		Node8 node = new Node8();
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

	public void show(Node8 result) {
		Node8 n = result;
		while (n != null) {
			System.out.println(n.data);
			n = n.next;
		}
	}
	public Node8 removeNode(Node8 head){
		Node8 n= head;
		while(n.next!= null){
			
			if(n.data==n.next.data){
				Node8 temp =n.next;
				n.next= temp.next;
			}
			else{
				n=n.next;
			}
		}
		return head;
	}
}

public class DeleteDuplicate {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int tests = scan.nextInt();
		for (int i = 0; i < tests; i++) {
			Linkedlist8 list = new Linkedlist8();
			int NoOfElements1 = scan.nextInt();

			for (int j = 0; j < NoOfElements1; j++) {
				int element1 = scan.nextInt();
				list.insert(element1);
			}

			Node8 result = list.removeNode(list.head);
			list.show(result);
		}
	}

}
