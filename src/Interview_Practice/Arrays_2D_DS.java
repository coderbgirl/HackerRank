package Interview_Practice;

import java.util.Scanner;

public class Arrays_2D_DS {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[][] arr = new int[6][6];
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				arr[i][j] = scan.nextInt();
			}
		}
		int result = hourGlassMax(arr);
		System.out.println(result);
	}

	static int hourGlassMax(int[][] arr) {
		int sum = 0;
		int max=-56;
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				sum = arr[i][j] + arr[i][j + 1] + arr[i][j + 2] + arr[i + 1][j + 1] + arr[i + 2][j] + arr[i + 2][j + 1]
						+ arr[i + 2][j + 2];
				max=Math.max(max, sum);
			}
		}
		return max;
	}

}
