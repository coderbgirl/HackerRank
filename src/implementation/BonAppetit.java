package implementation;

import java.util.Scanner;

public class BonAppetit {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k = scan.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}
		int b_charge = scan.nextInt();
		int sum = 0;
		for (int i = 0; i < n; i++) {
			if (i == k) {
				arr[i] = arr[i] - arr[i];
			}
			sum = sum + arr[i];
		}
		int b_actual = sum / 2;
		int charge = 0;

		if (b_charge == b_actual) {
			System.out.println("Bon Appetit");
		} else {
			charge = b_charge - b_actual;
			System.out.println(charge);
		}
	}

}
