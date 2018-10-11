package Stack;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class Smallest {
	private int small;
	private int small1;
	public Smallest(int small, int small1) {
		this.small = small;
		this.small1 = small1;
	}
	public int getSmall() {
		return small;
	}
	public void setSmall(int small) {
		this.small = small;
	}
	public int getSmall1() {
		return small1;
	}
	public void setSmall1(int small1) {
		this.small1 = small1;
	}
	
	

}

public class ANDxorOR {
	static int maxValue(int[] arr) {
		int max = 0;
		Set<Smallest> smallestOfInterval = new HashSet<>();

		for (int i = 0; i < arr.length - 1; i++) {
			int min = 0;
			int min1 = 0;
			min = Math.min(arr[i], arr[i + 1]);
			if (min == arr[i])
				min1 = arr[i + 1];
			else
				min1 = arr[i];

			Smallest s = new Smallest(min,min1);
			smallestOfInterval.add(s);
			if (i == arr.length - 2) {
				break;
			}
			for (int j = i + 2; j < arr.length; j++) {
				if (arr[j] <= min) {
					min1 = min;
					min = arr[j];
				} else if (arr[j] <= min1 || arr[j] > min)
					min1 = arr[j];
				else
					continue;

				Smallest s1 = new Smallest(min,min1);
				smallestOfInterval.add(s1);
			}
		}
		for (Smallest elements : smallestOfInterval) {
			Smallest temp = elements;
			int m1 = temp.getSmall();
			int m2 = temp.getSmall1();
			int result = (((m1 & m2) ^ (m1 | m2)) & (m1 ^ m2));
			if (result > max) {
				max = result;
			}

		}
		return max;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}
		int result = maxValue(arr);
		System.out.println(result);
	}

}
