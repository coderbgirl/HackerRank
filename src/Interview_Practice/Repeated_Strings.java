package Interview_Practice;

import java.util.Scanner;

public class Repeated_Strings {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		long n = scan.nextLong();
		long result = repeatedStrings(s, n);
		System.out.println(result);
	}


	static long repeatedStrings(String s, long n) {
		long count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'a') {
				count++;
			}
		}
		count = count * (n / s.length());
		long remainder = n % s.length();

		for (int i = 0; i < remainder; i++) {
			if (s.charAt(i) == 'a') {
				count++;
			}
		}

		return count;
	}

}
