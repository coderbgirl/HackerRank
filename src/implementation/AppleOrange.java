package implementation;
import java.util.Scanner;

public class AppleOrange {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int s = scan.nextInt();
		int t = scan.nextInt();
		int a = scan.nextInt();
		int b = scan.nextInt();
		int m = scan.nextInt();
		int n = scan.nextInt();
		int larry = 0;
		int rob = 0;
		int[] apple = new int[m];
		for (int a_i = 0; a_i < m; a_i++) {
			apple[a_i] = scan.nextInt();
		}
		int[] orange = new int[n];
		for (int o_i = 0; o_i < n; o_i++) {
			orange[o_i] = scan.nextInt();
		}
		for (int i = 0; i < m; i++) {
			apple[i] = apple[i] + a;

			if (apple[i] >= s && apple[i] <= t) {
				larry++;
			}
		}
		for (int i = 0; i < n; i++) {
			orange[i] = orange[i] + b;
			if (orange[i] >= s && orange[i] <= t) {
				rob++;
			}
		}

		System.out.println(larry + " " + rob);
	}

}

