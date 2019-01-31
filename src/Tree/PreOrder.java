package Tree;

import java.util.Scanner;

class Node {
	int data;
	Node left;
	Node right;

	Node(int data) {
		this.data = data;
	}
}
class tree{

	public Node insert(Node root, int data) {
		if (root == null) {
			Node node = new Node(data);
			return node;
		}
		if (root.data >= data) {
			root.left = insert(root.left, data);
		} else {
			root.right = insert(root.right, data);
		}
		return root;

	}

	public void print(Node root) {
		if (root != null) {
			System.out.print(root.data+" ");
			print(root.left);
			print(root.right);

		}
	}
}


public class PreOrder {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		tree t= new tree();
		Node root = null;
		for (int i = 0; i < n; i++) {
			int data = scan.nextInt();
			root = t.insert(root, data);
		}
		t.print(root);
	}

}

