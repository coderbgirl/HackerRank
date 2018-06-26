package implementation;

import java.util.Scanner;

public class CountingValleys {

	private static final char U = 0;

	//@SuppressWarnings("unused")
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String s = scan.next();
		int Mount = 0;
		int Up=0 ;
		int Down = 0;
		int Valley = 0;
		for (int i = 0; i < n; i++) {
			if (s.charAt(i) == 'U') {
				Up++;
			} else if (s.charAt(i) == 'D') {
				Down++;
			}
			if (Up == Down) {
				Up=0;
				Down=0;
				
				if (s.charAt(i) == 'U') {
					Valley++;
				}
			}

		}
		System.out.println(Valley);

	}
}
