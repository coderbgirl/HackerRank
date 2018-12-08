package Interview_Practice;

import java.util.HashMap;
import java.util.Scanner;

public class TwoStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int p = scan.nextInt();

		for (int i = 0; i < p; i++) {
			String str1 = scan.next();
			String str2 = scan.next();

			String result = twoStrings(str1, str2);
			System.out.println(result);
		}

	}

	static String twoStrings(String str1, String str2) {
		HashMap<Character, Integer> string = new HashMap<>();

		for (int i = 0; i < str1.length(); i++) {
			if (string.get(str1.charAt(i)) == null)
				string.put(str1.charAt(i), 1);
			else
				string.put(str1.charAt(i), string.get(str1.charAt(i)) + 1);
		}
		for (int i = 0; i < str2.length(); i++) {
			if (string.containsKey(str2.charAt(i)))
				return "YES";
		}
		return "NO";
	}

}
