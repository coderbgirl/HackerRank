package implementation;

import java.util.Scanner;

public class BreakingTheRecords {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		long[] S = new long[n];
		for (int i = 0; i < n; i++) {
			S[i] = scan.nextLong();
		}
		int most = 0;
		long m = S[0];
		for (int i = 1; i < n; i++) {
			if (m < S[i]) {
				m = S[i];
				most++;
			}
		}
		int least = 0;
		long l = S[0];
		for (int i = 1; i < n; i++) {
			if (l < S[i]) {
				l = S[i];
				least++;
			}
		}
		System.out.println(most + " " + least);
	}

}
