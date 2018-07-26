package implementation;

import java.util.Scanner;

public class SockMerchant {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}
		int pair=0;
		int[] a = new int[100];
		for (int i = 0; i < n; i++) {
			a[arr[i]]++;
		}
		for(int j=0; j<100; j++){
			int s=a[j]/2;
			pair= pair+s;
		}
		System.out.println(pair);
	}
}
