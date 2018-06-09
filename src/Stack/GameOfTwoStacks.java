package Stack;

import java.util.Scanner;

public class GameOfTwoStacks {

	static int maxValue(long x, int[] a, int[] b) {
		int top1 = 0, top2 = 0;
		int result = 0;
		long sum = 0;
		int max = 0;

		while (true) {
			if (a[top1] <= b[top2]) {
				max = b[top2];
				top2++;
			} else if(a[top1]> b[top2]) {
				max = a[top1];
				top1++;
			}
			
			if ((sum + max) < x) {
				sum = sum + max;
				if (result < max)
					result = max;
			} else {
				break;
			}
		}
		return max;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int g = Integer.parseInt(scan.nextLine());
		for (int i = 0; i < g; i++) {
			int n = Integer.parseInt(scan.next());
			int m = Integer.parseInt(scan.next());
			long x = Integer.parseInt(scan.next());

			int[] a = new int[n];
			for (int j = 0; j < n; j++) {
				a[j] = scan.nextInt();
			}
			int[] b = new int[m];
			for (int j = 0; j < m; j++) {
				b[j] = scan.nextInt();
			}
			int result = maxValue(x, a, b);
			System.out.println(result);

		}

	}

}
