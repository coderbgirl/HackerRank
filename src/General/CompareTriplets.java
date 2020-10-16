package General;

import java.util.Scanner;

public class CompareTriplets {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int A[] = new int[3];
		int i = 0;
		System.out.println("Enter 3 elements of array A:");
		for (i = 0; i < A.length; i++) {
			A[i] = scan.nextInt();
		}
		int[] B = new int[3];
		
		System.out.println("Enter 3 elements of array B:");
		for (i = 0; i < B.length; i++) {
			B[i] = scan.nextInt();
		}
		int A_points = 0;
		int B_points = 0;
		for (i = 0; i < 3; i++) {

			if (A[i] > B[i]) {
				A_points++;
			} else if (B[i] > A[i]) {
				B_points++;
			}
		}

		System.out.println("A_Points=" + A_points + ", B_points=" + B_points);
	}
}