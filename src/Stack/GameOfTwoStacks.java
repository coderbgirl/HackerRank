package Stack;

import java.util.Scanner;

public class GameOfTwoStacks {

	static int maxValue(long x, int[] a, int[] b) {
		 int ai = 0;
		    int bi = 0;
		    int count = 0;
		    int sum = 0;
		    // move bi to the position where if only take elements from B, last element it can take
		    while (bi < b.length && sum + b[bi] <= x) {
		        sum += b[bi]; 
		        bi++;
		    }
		    bi--; // loop exits only when bi reaches end or sum > x; in both case bi should decrease
		    count = bi + 1;
		    while (ai < a.length && bi < b.length) {
		        sum += a[ai];
		        if (sum > x) {
		            while (bi >= 0) {
		                sum -= b[bi];
		                bi--;
		                if (sum <= x) break;
		            }
		            // if even no elements taken from B, but still sum greater than x, then a[ai] should not be chosen
		            // and loop terminates
		            if (sum > x && bi < 0) {
		                ai--;
		                break;
		            }
		        }
		        count = Math.max(ai + bi + 2, count);
		        ai++;
		    }

		    return count;
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
