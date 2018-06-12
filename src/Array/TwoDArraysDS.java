package Array;

import java.util.Scanner;

public class TwoDArraysDS {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[][] arr = new int[6][6];
		for (int row = 0; row < 6; row++) {
			for (int col = 0; col < 6; col++) {
				arr[row][col] = scan.nextInt();
			}
		}
		int sum = 0;
		int tempsum =-64;
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if (arr[i][j] < 10 && arr[i][j] > -10) {
					sum = sum + (arr[i][j] + arr[i][j + 1] + arr[i][j + 2]);
					sum = sum + (arr[i + 1][j + 1]);
					sum = sum + (arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2]);
					if (sum > tempsum) {
						tempsum = sum;
					}
				}
				sum = 0;
			}
		}
		System.out.println(tempsum);
	}

}
