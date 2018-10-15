package Stack;

import java.util.ArrayList;
import java.util.Scanner;

public class Waiter {
	static int[] waiter(int[] number, int q) {
		int[] prime = new int[q + 3];
		prime[0] = 2;
		prime[1] = 3;
		prime[2] = 5;
		int index = 3;
		for (int i = 7; i < 10000; i++) {
			if (i % 2 == 0 || i % 5 == 0)
				continue;
			
			int isPrime = 1;
			int squareRoot= (int)Math.sqrt(i);
			
			for (int j = i - 1; j >squareRoot ; j--) {
				if (i % j == 0) {
					isPrime = 0;
					break;
				}
			}
			if (isPrime==1) {
				prime[index] = i;
				index++;
			}
			if (index >= q) {
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
			if (i == q - 1 && result[number.length - 1] == 0) {
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
