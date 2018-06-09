package Stack;

import java.util.Scanner;

public class EqualStack {

	static int equalStacks(int[] h1, int[] h2, int[] h3) {
		int sum1 = 0, sum2 = 0, sum3 = 0;
		int n1 = h1.length, n2 = h2.length, n3 = h3.length;
		int top1 = 0, top2 = 0, top3 = 0;

		for (int i = 0; i < n1; i++) {
			sum1 = sum1 + h1[i];
		}
		for (int i = 0; i < n2; i++) {
			sum2 = sum2 + h2[i];
		}
		for (int i = 0; i < n3; i++) {
			sum3 = sum3 + h3[i];
		}
		while (true) {
			if (n1 == 0 || n2 == 0 || n3 == 0)
				return 0;

			if (sum1 == sum2 && sum2 == sum3)
				return sum1;

			if (sum1 >= sum2 && sum1 >= sum3) {
				sum1 = sum1 - h1[top1];
				top1++;
			}
			if (sum2 >= sum1 && sum2 >= sum3) {
				sum2 = sum2 - h2[top2];
				top2++;
			}
			if (sum3 >= sum2 && sum3 >= sum1) {
				sum3 = sum3 - h3[top3];
				top3++;
			}
		}

	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n1 = Integer.parseInt(scan.next());
		int n2 = Integer.parseInt(scan.next());
		int n3 = Integer.parseInt(scan.next());

		int[] h1 = new int[n1];
		for (int i = 0; i < n1; i++) {
			h1[i] = scan.nextInt();
		}
		int[] h2 = new int[n2];
		for (int i = 0; i < n2; i++) {
			h2[i] = scan.nextInt();
		}
		int[] h3 = new int[n3];
		for (int i = 0; i < n3; i++) {
			h3[i] = scan.nextInt();
		}

		int result = equalStacks(h1, h2, h3);
		System.out.println(result);
	}

}
