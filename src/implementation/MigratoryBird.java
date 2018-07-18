package implementation;

import java.util.Scanner;

public class MigratoryBird {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}
		int[] t = new int[n];

		for (int i = 0; i < n; i++) {
			if (arr[i] == 1)
				t[0]++;
			if (arr[i] == 2)
				t[1]++;
			if (arr[i] == 3)
				t[2]++;
			if (arr[i] == 4)
				t[3]++;
			if (arr[i] == 5)
				t[4]++;
		}

		int max = t[0];
		for (int i = 1; i < 5; i++) {
			if (max < t[i]) {
				max = t[i];
			}
		}
		int j = 5;
		for (int i = 4; i >= 0; i--) {
			if (max == t[i]) {
				if (j > i) {
					j = i;
				}
			}
		}
		System.out.println(j + 1);
	}

}
