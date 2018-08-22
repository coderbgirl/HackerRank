package LinkedList;

import java.util.Scanner;
class Node11 {
	int data;
	Node11 next;
	Node11 previous;
}

class LinkedList11 {
	Node11 head;
	Node11 tail;

	public void insert(int data) {
		Node11 node = new Node11();
		node.data = data;
		node.next = null;
		node.previous = null;


		if (head == null) {
			head = node;
			tail = node;
		} else {
			tail.next = node;
			node.previous= tail;
		}
		tail = node;

	}

	public void show(Node11 head) {
		Node11 n = head;
		while (n != null) {
			System.out.println(n.data);
			n = n.next;
		}
	}
	public Node11 SortedInsert(Node11 head, int data){
		Node11 node = new Node11();
		node.data=data;
		node.next=null;
		node.previous=null;
		Node11 n= head;
		if(n==null){
            return node;
        }
		while(n!=null){
			if(head.data>= data){
					node.next=n;
					n.previous=node;
					head=node;
					break;
			}
			if(n.data<= data && n.next==null){
				node.previous= n;
				n.next= node;
				break;
			}
            if(n.data<=data && n.next.data>= data){
                node.next=n.next;
				node.previous= n;
				n.next= node;
				node.next.previous=node;
				break;
            }
			
			n=n.next;
		}
		return head;
	}
}

public class InsertInDoublyLinkedList {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int tests = scan.nextInt();
		for (int i = 0; i < tests; i++) {

			LinkedList11 list1 = new LinkedList11();
			int NoOfElements1 = scan.nextInt();

			for (int j = 0; j < NoOfElements1; j++) {
				int element1 = scan.nextInt();
				list1.insert(element1);
			}
			int data= scan.nextInt();
			

			Node11 result = list1.SortedInsert(list1.head, data);
			list1.show(result);
		}
	}

}
