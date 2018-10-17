package Interview_Practice;

import java.util.Scanner;

public class JumingOnClouds {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int c = scan.nextInt();
		int[] arr = new int[c];
		for (int i = 0; i < c; i++) {
			arr[i] = scan.nextInt();
		}
		int result = minJump(arr);
		System.out.println(result);
	}

	static int minJump(int[] arr) {
		int count = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i + 1] == 0) {
				if (i < arr.length - 2) {
					if (arr[i + 2] == 0)
						i = i + 1;
				}
				count++;
			} else if (arr[i + 1] == 1) {
				i++;
				count++;
			}
		}
		return count;
	}

}
