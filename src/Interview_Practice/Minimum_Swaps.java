package Interview_Practice;

import java.util.Scanner;

public class Minimum_Swaps {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}
		int result = minSwaps(arr);
		System.out.println(result);

	}

	static int minSwaps(int[] arr) {
		int count=0;
		for (int i = 0; i < arr.length; ) {
		  if (arr[i] == (i + 1) || arr[i] >= arr.length) {
		      i++;
		        continue;
		    }
		            
		    int tmp = arr[i];
		    arr[i] = arr[tmp - 1];
		    arr[tmp - 1] = tmp; 
		            
		    count++;
		}
		        
		return count;
	}

}

/*
 * int temp = 0; int swap = 0; int j = 0; for (int i = 0; i <arr.length; i++) {
 * if (i+1 != arr[i]) { for (j = i + 1; j < arr.length; j++) { if (arr[j] ==i+1)
 * { break; } } temp = arr[i]; arr[i] = arr[j]; arr[j] = temp; swap++; } }
 * return swap;
 */
