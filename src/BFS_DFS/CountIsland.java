package BFS_DFS;

import java.util.LinkedList;
import java.util.Queue;

public class CountIsland {

	public static void main(String[] args) {

		int[][] matrix = { { 1, 0, 0, 1 }, { 1, 0, 1, 1 }, { 1, 1, 1, 0 }, { 1, 0, 1, 0 } };

		int out = getShortestDistance(matrix);
		System.out.println("fgarg");
		System.out.println(out);
	}

	public static int getShortestDistance(int[][] matrix) {
		boolean[][] visited = new boolean[matrix.length][matrix[0].length];
		Queue<Node> q = new LinkedList<>();

		int[] row = { 0, 1, 1, 1, 0, -1, -1, -1 };
		int[] col = { -1, -1, 0, 1, 1, 1, 0, -1 };
		int count = 0;
		int max = 0;

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {

				if (matrix[i][j] == 1) {
					Node src = new Node();
					src.x = i;
					src.y = j;
					q.add(src);
					count = 0;
				} else {
					continue;
				}

				while (!q.isEmpty()) {
					Node curr = q.remove();

					for (int k = 0; k < 8; k++) {

						int x = curr.x + row[k];
						int y = curr.y + col[k];
						if (isValid(x, y, matrix.length, matrix[0].length) && matrix[x][y] == 1) {
							Node node = new Node();
							node.x = x;
							node.y = y;
							q.add(node);
							count++;
						}
					}
				}
				if (count > max) {
					max = count;
				}

			}
		}
		return max;
	}

	public static boolean isValid(int x, int y, int row, int col) {

		if ((x > -1 && x < row) && (y > -1 && y < col)) {
			return true;
		}
		return false;
	}

}

class Node {
	int x;
	int y;
}
