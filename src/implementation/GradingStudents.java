package implementation;
import java.util.Scanner;

public class GradingStudents {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] g = new int[n];
		int i = 0;
		for (i = 0; i < n; i++) {
			g[i] = scan.nextInt();
			if (g[i] >= 38) {
				if (g[i] % 5 == 3) {
					g[i] = g[i] + 2;

				} else if (g[i] % 5 == 4) {
					g[i] = g[i] + 1;
				} else if (g[i] % 5 == 0) {
					g[i] = g[i];
				} else {
					g[i] = g[i];
				}
			} else {
				g[i] = g[i];
			}
		}
		int index=0;
		while(index<n){
			System.out.println(g[index]);
			index++;
		}
		
	}

}

