package implementation;

import java.util.Scanner;

public class ElectronicsShop {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int s = in.nextInt();
		int n = in.nextInt();
		int m = in.nextInt();
		int[] keyboards = new int[n];
		for (int keyboards_i = 0; keyboards_i < n; keyboards_i++) {
			keyboards[keyboards_i] = in.nextInt();
		}
		int[] drives = new int[m];
		for (int drives_i = 0; drives_i < m; drives_i++) {
			drives[drives_i] = in.nextInt();
		}
		// int nm= n*m;
		int[] pay = new int[n * m];
		int k = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				int sum = keyboards[i] + drives[j];
				if (sum <= s) {
					pay[k] = sum;
					k++;
				}
			}
		}
		if (pay[0]==0){
			System.out.println("-1");
			}
		else{
		int max = pay[0];
		for (int i = 1; i < pay.length; i++) {
			if (max < pay[i]) {
				max = pay[i];
			}
		}
			System.out.println(max);
		}
	}

}
