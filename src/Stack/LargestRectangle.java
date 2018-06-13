package Stack;

import java.util.Arrays;
import java.util.Scanner;

public class LargestRectangle {
	static long largestRectangle(int[] h) {
		int noOfElements = 1;
		long max = 0;
		long areaRight = 0;
		long areaLeft = 0;
		long area = 0;
		for (int i = 0; i < h.length; i++) {
			noOfElements = 1;
			for (int j = i + 1; j < h.length; j++) {
				if (h[i] <= h[j])
					noOfElements++;
				else
					break;
			}
			areaRight = h[i] * noOfElements;
			noOfElements = 0;
			for (int k = i - 1; k >= 0; k--) {
				if (h[i] <= h[k])
					noOfElements++;
				else
					break;
			}
			areaLeft = h[i] * noOfElements;
			area = areaLeft + areaRight;

			if (area > max) {
				max = area;
			}
		}
		return max;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] h = new int[n];
		for (int i = 0; i < n; i++) {
			h[i] = scan.nextInt();
		}
		long result = largestRectangle(h);

		System.out.println(result);
	}

}
