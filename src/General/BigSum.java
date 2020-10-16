package General;

import java.util.Scanner;

public class BigSum {
	public static long arraySum(int a, long arr[]) {
		long sum = 0;
		for (int i = 0; i < a; i++) {
			sum = sum + arr[i];
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter no.:");
		int n = scan.nextInt();
		long[] array = new long[n];
		System.out.println("Enter " + n + " elements:");
		for (int i = 0; i < n; i++) {
			array[i] = scan.nextInt();
		}

		long result = arraySum(n, array);
		System.out.println("Answer is:" + result);

	}

}
