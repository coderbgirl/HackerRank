package implementation;

import java.util.Scanner;

public class DivisiableSumPair {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k = scan.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}
		int total = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (i < j && (arr[i] + arr[j]) % k == 0) {
					total++;
				}
			}
		}
		System.out.println(total);
	}
}
