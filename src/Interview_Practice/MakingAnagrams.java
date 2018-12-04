package Interview_Practice;

import java.util.HashMap;
import java.util.Scanner;

public class MakingAnagrams {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String a = scan.nextLine();
		String b = scan.nextLine();
		int result = stringAnagrams(a, b);
		System.out.println(result);
	}

	static int stringAnagrams(String a, String b) {
		HashMap<Character, Integer> str1 = new HashMap<>();
		HashMap<Character, Integer> str2 = new HashMap<Character, Integer>();
		int count = 0;
		for (int i = 0; i < a.length(); i++) {
			if (str1.get(a.charAt(i)) == null) {
				str1.put(a.charAt(i), 1);
			} else {
				str1.put(a.charAt(i), str1.get(a.charAt(i)) + 1);
			}
		}
		for (int i = 0; i < b.length(); i++) {
			if (str2.get(b.charAt(i)) == null) {
				str2.put(b.charAt(i), 1);
			} else {
				str2.put(b.charAt(i), str2.get(b.charAt(i)) + 1);
			}
		}
		for (Character key : str1.keySet()) {
			if (str2.get(key) == null)
				count = count + str1.get(key) - 0;
			else
				count = count + Math.abs(str1.get(key) - str2.get(key));
		}
		for (Character key : str2.keySet()) {
			if (str1.get(key) == null)
				count = count + str2.get(key) - 0;
		}

		return count;
	}

}



/*static int stringAnagrams(String a, String b) {
	HashMap<Character, Integer> str = new HashMap<>();
	int count = 0;
	for (int i = 0; i < a.length(); i++) {
		if (str.get(a.charAt(i)) == null) {
			str.put(a.charAt(i), 1);
		} else {
			str.put(a.charAt(i), str.get(a.charAt(i)) + 1);
		}
	}
	for (int i = 0; i < b.length(); i++) {
		if (str.get(b.charAt(i)) == null) {
			str.put(b.charAt(i), -1);
		} else {
			str.put(b.charAt(i), str.get(b.charAt(i)) - 1);
		}
	}
	for (Character key : str.keySet()) {
		count = count + Math.abs(str.get(key));
	}

	return count;
}*/


