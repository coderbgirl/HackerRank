package Interview_Practice;

import java.util.HashMap;
import java.util.Scanner;

public class RandsomNote {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int m = scan.nextInt();
		int n = scan.nextInt();
		String[] magazine = new String[m];
		String[] note = new String[n];

		for (int i = 0; i < m; i++) {
			magazine[i] = scan.next();
		}
		for (int i = 0; i < n; i++) {
			note[i] = scan.next();
		}
		String result = checkMagazine(magazine, note);
		System.out.println(result);
	}

	static String checkMagazine(String[] magazine, String[] note) {
		HashMap<String, Integer> m = new HashMap<>();
		HashMap<String, Integer> n = new HashMap<>();

		for (int i = 0; i < magazine.length; i++) {
			if (m.get(magazine[i]) == null)
				m.put(magazine[i], 1);
			else
				m.put(magazine[i], m.get(magazine[i]) + 1);
		}
		for (int i = 0; i < note.length; i++) {
			if (n.get(note[i]) == null)
				n.put(note[i], 1);
			else
				n.put(note[i], n.get(note[i]) + 1);
		}

		for (String key : n.keySet()) {
			if (m.get(key) != null) {
				if (m.get(key) >= n.get(key))
					continue;
				else
					return "No";
			} else
				return "No";
		}

		return "Yes";
	}

}
