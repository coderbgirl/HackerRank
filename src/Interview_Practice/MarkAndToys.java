package Interview_Practice;

import java.util.Scanner;

public class MarkAndToys {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k = scan.nextInt();

		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}
		int result = maximumToys(arr, k);
		System.out.println(result);
	}

	static int maximumToys(int[] a, int k) {
		int count = 0;
		int sum = 0;
		int temp = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length - 1; j++) {
				if (a[j] > a[j + 1]) {
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
			for(int i=0; i<a.length;i++){
				sum = sum + a[i];
				if (sum <= k) {
					count++;
					continue;
				} else {
					break;
				}	
			}
			
		
		return count;
	}

}
