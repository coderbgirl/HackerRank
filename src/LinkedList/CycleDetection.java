package LinkedList;

import java.util.Scanner;

class Node9 {
	int data;
	Node9 next;
}

class Linkedlist9 {
	Node9 head;
	Node9 tail;

	public void insert(int data) {
		Node9 node = new Node9();
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
	public boolean Cycle(Node9 head){
		Node9 n= head;
		while(n!=null){
			n=n.next;
			if(n.next==null){
				return false;
			}
		}
		return true;
	}
}

public class CycleDetection {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int tests = scan.nextInt();
		for (int i = 0; i < tests; i++) {
			Linkedlist9 list1 = new Linkedlist9();
			int NoOfElements1 = scan.nextInt();

			for (int j = 0; j < NoOfElements1; j++) {
				int element1 = scan.nextInt();
				list1.insert(element1);
			}

			
			boolean result = list1.Cycle(list1.head);
		}

	}

}
