package General;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeMap;

public class goldman_1 {

	public static ArrayList<String> function(String[] nums, Integer[] mapping) {

		ArrayList<String> result = new ArrayList<String>();

		HashMap<String, String> map = new HashMap<String, String>();
		for (int i = 0; i < nums.length; i++) {
			String key = realNum(nums[i], mapping);

			map.put(key, nums[i]);
		}

		String[] sorted = map.keySet().toArray(new String[0]);
		sortList(sorted);

		for (String k : sorted) {
			result.add(map.get(k));

		}
		return result;

	}

	static void sortList(String sorted[]) {

		Arrays.sort(sorted, (left, right) -> {

			int i = 0;
			while (i < left.length() && left.charAt(i) == '0')
				i++;
			String l = left.substring(i);

			i = 0;
			while (i < right.length() && right.charAt(i) == '0')
				i++;

			String r = right.substring(i);

			if (l.equals(r)) {
				return right.compareTo(left);
			}

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

		return temp;
	}

	public static void main(String[] args) {

		String[] strings = { "004", "92", "2", "99999999999999992", "4213", "678" };
		Integer[] mapping = { 1, 3, 7, 4, 2, 9, 5, 6, 8, 0 };

		System.out.println(function(strings, mapping));

	}

}
