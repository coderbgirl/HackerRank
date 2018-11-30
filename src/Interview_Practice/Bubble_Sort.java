package Interview_Practice;

import java.util.Scanner;

public class Bubble_Sort {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}
		countSwaps(arr);

	}

	static void countSwaps(int[] a) {
		int count = 0;
		int temp = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length - 1; j++) {
				if (a[j] > a[j + 1]) {
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
					count++;
				}
			}
		}
		System.out.println("Array is sorted in "+ count+" swaps.");
		System.out.println("First Element: "+ a[0]);
		System.out.println("Last Element: "+ a[a.length-1]);
	}

}
