package Interview_Practice;

import java.io.InputStream;
import java.util.Scanner;

public class AlternatingStrings {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int q = scan.nextInt();
		for (int i = 0; i < q; i++) {
			String s = scan.next();

			int result = alternatingCharacters(s);
			System.out.println(result);
		}
	}

	static int alternatingCharacters(String s) {
		int count = 0;

		for (int i = 0; i < s.length() - 1; i++) {

			if (s.charAt(i + 1) == s.charAt(i)) {
				count++;
			}
		}

		return count;
	}

}
