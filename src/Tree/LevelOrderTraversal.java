package Tree;

import java.util.Scanner;

class Node5 {
	int data;
	Node5 left;
	Node5 right;

	Node5(int data) {
		this.data = data;
	}
}

class tree5 {

	public Node5 insert(Node5 root, int data) {
		if (root == null) {
			Node5 Node5 = new Node5(data);
			return Node5;
		}
		if (root.data >= data) {
			root.left = insert(root.left, data);
		} else {
			root.right = insert(root.right, data);
		}
		return root;
	}

	public int height(Node5 root) {
		if (root == null) {
			return 0;
		}
		return Math.max(height(root.left), height(root.right)) + 1;
	}

	public void printLevelOrder(Node5 root) {
		int h = height(root);
		for (int i = 1; i <= h; i++) {
			levelOrder(root, i);
		}
	}

	public void levelOrder(Node5 root, int level) {
		if (root == null) {
			return;
		}
		if (level == 1) {
			System.out.println(root.data);
		} else if (level > 1) {
			levelOrder(root.left, level - 1);
			levelOrder(root.right, level - 1);

		}
	}
}

public class LevelOrderTraversal {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		Node5 root = null;
		tree5 t = new tree5();
		for (int i = 0; i < n; i++) {
			int data = scan.nextInt();
			root = t.insert(root, data);
		}

		t.printLevelOrder(root);
	}

}
