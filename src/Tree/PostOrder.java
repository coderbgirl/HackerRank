package Tree;

import java.util.Scanner;

class Node1 {
	int data;
	Node1 left;
	Node1 right;

	Node1(int data) {
		this.data = data;
	}
}

class tree1 {
	public Node1 insert(Node1 root, int data) {
		if (root == null) {
			Node1 node = new Node1(data);
			return node;
		}
		if (root.data >= data) {
			root.left = insert(root.left, data);
		} else {
			root.right = insert(root.right, data);
		}
		return root;
	}

	public void print(Node1 root) {
		if (root != null) {
			print(root.left);
			print(root.right);
			System.out.println(root.data + " ");
		}
	}

}

public class PostOrder {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		Node1 root = null;
		tree1 t = new tree1();
		for (int i = 0; i < n; i++) {
			int data = scan.nextInt();
			root = t.insert(root, data);
		}
		t.print(root);
	}

}
