package BFS_DFS;


import java.util.LinkedList;
import java.util.Queue;

public class ShortestPath {

	public static void main(String[] args) {

		int[][] matrix = { { 1, 0, 0, 1 }, { 1, 0, 1, 1 }, { 1, 1, 1, 0 }, { 1, 0, 1, 0 } };

		int out = getShortestDistance(matrix, 0, 0, 0, 3);
		System.out.println(out);
	}

	public static int getShortestDistance(int[][] matrix, int srcX, int srcY, int desX, int desY) {
		boolean[][] visited = new boolean[matrix.length][matrix[0].length];
		Queue<Cell> q = new LinkedList<>();

		int[] row = { 0, 0, -1, 1 };
		int[] col = { -1, 1, 0, 0 };

		Cell src = new Cell();
		src.x = srcX;
		src.y = srcY;
		src.dist = 0;
		visited[srcX][srcY] = true;

		q.add(src);

		while (!q.isEmpty()) {
			Cell curr = q.remove();
			if (curr.x == desX && curr.y == desY) {
				return curr.dist;
			}

			for (int k = 0; k < 4; k++) {

				int x = curr.x + row[k];
				int y = curr.y + col[k];
				if (isValid(x, y, matrix.length, matrix[0].length)) {
					if (matrix[x][y] == 1 && visited[x][y] == false) {
						Cell node = new Cell();
						node.x = x;
						node.y = y;
						node.dist = curr.dist + 1;
						q.add(node);
					}
					visited[x][y] = true;

				}
			}
		}

		return 0;
	}

	public static boolean isValid(int x, int y, int row, int col) {

		if ((x > -1 && x < row) && (y > -1 && y < col)) {
			return true;
		}
		return false;
	}

}

class Cell {
	int x;
	int y;
	int dist;
}
