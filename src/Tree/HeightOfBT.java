package Tree;

import java.util.Scanner;

class Node4 {
	int data;
	Node4 left;
	Node4 right;

	Node4(int data) {
		this.data = data;
	}
}

class tree4 {

	public Node4 insert(Node4 root, int data) {
		if (root == null) {
			Node4 Node4 = new Node4(data);
			return Node4;
		}
		if (root.data >= data) {
			root.left = insert(root.left, data);
		} else {
			root.right = insert(root.right, data);
		}
		return root;
	}
	
	public int heightmax(Node4 root, int h) {
		if (root == null)
			return 0;
		
		return Math.max(heightmax(root.left, h), heightmax(root.right,  h)) + 1;
	}
	
	public int hack (Node4 root) {
		return heightmax(root, 0);
	}
}

public class HeightOfBT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		Node4 root = null;
		tree4 t = new tree4();
		for (int i = 0; i < n; i++) {
			int data = scan.nextInt();
			root = t.insert(root, data);
		}
		
		int result= t.hack(root);
		System.out.println(result-1);
	}

}
