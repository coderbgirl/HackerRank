package General;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeMap;

public class goldman {

	public static ArrayList<String> function(String[] strings, Integer[] mapping) {

		ArrayList<String> result = new ArrayList<String>();

		HashMap<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();
		for (int i = 0; i < strings.length; i++) {
			String key = realNum(strings[i], mapping);

			ArrayList<String> temp = null;

			if (map.containsKey(key)) {
				temp = map.get(key);
				temp.add(strings[i]);
				map.put(key, temp);
			} else {
				temp = new ArrayList<String>();
				temp.add(strings[i]);
				map.put(key, temp);
			}
		}

		String[] sorted = map.keySet().toArray(new String[0]);
		sortList(sorted);

		for (String k : sorted) {

			result.addAll(map.get(k));
		}
		return result;

	}

	static void sortList(String[] sorted) {

		Arrays.sort(sorted, (l, r) -> {

			if (l.length() != r.length())
				return l.length() - r.length();
			return l.compareTo(r);
		});
	}

	public static String realNum(String s, Integer[] mapping) {
		String temp = "";
		for (char c : s.toCharArray()) {
			int num = Integer.parseInt(Character.toString(c));
			temp = temp + mapping[num].toString();
		}

		int i = 0;
		while (i < temp.length() && temp.charAt(i) == '0')
			i++;

		return temp.substring(i);
	}

	public static void main(String[] args) {

		String[] strings = { "004", "992", "2", "92", "4213", "678" };
		Integer[] mapping = { 1, 3, 7, 4, 2, 9, 5, 6, 8, 0 };

		System.out.println(function(strings, mapping));

	}

}
