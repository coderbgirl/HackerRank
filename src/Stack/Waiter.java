package Stack;

import java.util.ArrayList;
import java.util.Scanner;

public class Waiter {
	static int[] waiter(int[] number, int q) {
		int[] prime = new int[q];
		int index = 0;
		for (int i = 2; i < 10000; i++) {
			int counter = 0;
			if (i > 9) {
				while (true) {
					String temp = Integer.toString(i);
					int a = Integer.parseInt(temp.substring(temp.length() - 1));
					if (a == 0 || a == 2 || a == 4 || a == 5 || a == 6 || a == 8) {
						i++;
					} else
						break;
				}
			}
			for (int j = i; j >= 1; j--) {
				if (i % j == 0) {
					counter++;
				}
			}
			if (counter == 2) {
				prime[index] = i;
				index++;
			}
			if (index == q) {
				break;
			}
		}
		ArrayList<Integer> Ao = new ArrayList<Integer>();
		ArrayList<Integer> A = new ArrayList<Integer>();
		ArrayList<Integer> B = new ArrayList<Integer>();

		int[] result = new int[number.length];
		int k = 0;

		for (int i = 0; i < number.length; i++) {
			Ao.add(number[i]);
		}
		for (int i = 0; i < q; i++) {
			for (int j = Ao.size() - 1; j >= 0; j--) {
				if (Ao.get(j) % prime[i] == 0)
					B.add(Ao.get(j));
				else
					A.add(Ao.get(j));
			}
			for (int l = B.size() - 1; l >= 0; l--) {
				result[k] = B.get(l);
				k++;
			}
			if (i == q - 1 && result[number.length-1]==0){
				for (int l = A.size() - 1; l >= 0; l--) {
					result[k] = A.get(l);
					k++;
				}
			}
			Ao.clear();
			Ao.addAll(A);
		

			B.clear();
			A.clear();
		}

		return result;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.next());
		int q = Integer.parseInt(scan.next());
		int[] number = new int[n];
		for (int i = 0; i < n; i++) {
			number[i] = scan.nextInt();
		}
		int[] result = waiter(number, q);

		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}

}
