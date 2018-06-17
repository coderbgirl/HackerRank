package implementation;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class BetweenTwoSets {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int[] A = new int[n];
		int[] B = new int[m];
		int output = 0;

		for (int i = 0; i < n; i++) {
			A[i] = scan.nextInt();
		}
		Arrays.sort(A);
		for (int i = 0; i < m; i++) {
			B[i] = scan.nextInt();
		}
		Arrays.sort(B);
		int[] c = new int[100];
		int p = 0;
		for (int i = A[n - 1]; i <= B[0]; i++) {
			int a = 0;
			for (int k = 0; k < n; k++) {
				if (i % A[k] == 0) {
					a++;
				}
			}
			if (a == n) {
				c[p] = i;
				p++;
			}
		}
		int[] d = new int[100];
		int q = 0;
		for (int j = A[n - 1]; j <= B[0]; j++) {
			int b = 0;
			for (int l = 0; l < m; l++) {
				if (B[l] % j == 0) {
					b++;
				}
			}
			if (b == m) {
				d[q] = j;
				q++;
			}
		}
		for (int i = 0; i < p; i++) {
			for (int j = 0; j < q; j++) {
				if (c[i] == d[j]) {
					output++;
				}
			}
		}
		System.out.println(output);
	}

}
