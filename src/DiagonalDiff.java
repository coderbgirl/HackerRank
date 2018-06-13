import java.util.Scanner;

public class DiagonalDiff {



		public static int rightDia(int arr[][], int a) {
			int r = 0;
			int c = 0;
			int sum = 0;
			while (r < a && c < a) {
				sum = sum + arr[r][c];
				r++;
				c++;
			}
			return sum;

		}
		public static int leftDia(int arr[][], int a) {
			int r = 0;
			int c = a-1;
			int sum = 0;
			while (r < a && c >= 0) {
				sum = sum + arr[r][c];
				r++;
				c--;
			}
			return sum;

		}

		public static void main(String[] args) {
			@SuppressWarnings("resource")

			Scanner scan = new Scanner(System.in);
			int n = scan.nextInt();
			int row = 0;
			int col = 0;
			int[][] grid = new int[n][n];
			for (row = 0; row < n; row++) {
				for (col = 0; col < n; col++) {
					grid[row][col] = scan.nextInt();
				}
			}
			for (row = 0; row < n; row++) {
				for (col = 0; col < n; col++) {
					System.out.print(grid[row][col] + "\t");
				}
				System.out.println();
			}
			int r = rightDia(grid, n);
			System.out.println(r);
			int r1= leftDia(grid,n);
			System.out.println(r1);

			System.out.println(Math.abs(r-r1));
		}


}

/*static int diagonalDifference(int[][] a) {
	int sum = 0;
	int sum1 = 0;
	for (int r = 0; r < a.length; r++) {
		for (int c = 0; c < a.length; c++) {
			if (r == c ) {
				sum = sum + a[r][c];
			}
			if (r == a.length - c - 1) {
				sum1 = sum1 + a[r][c];
			}
		}
	}
	return Math.abs(sum - sum1);
}

public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int n = in.nextInt();
	int[][] a = new int[n][n];
	for (int a_i = 0; a_i < n; a_i++) {
		for (int a_j = 0; a_j < n; a_j++) {
			a[a_i][a_j] = in.nextInt();
		}
	}
	int result = diagonalDifference(a);
	System.out.println(result);
	in.close();
}*/
