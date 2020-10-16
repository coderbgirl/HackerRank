package General;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class BNY {

	public static int minMoves(int[] arr) {

		HashMap<Integer, Integer> map = new HashMap<>();

		ArrayList<Integer> sortedList = new ArrayList<>();

		int count = 1;
		for (int i = 0; i < arr.length; i++) {
			map.put(arr[i], i);
			sortedList.add(arr[i]);
		}
		
		Collections.sort(sortedList);

		for (int j = 0; j < sortedList.size() - 1; j++) {
			int curr = sortedList.get(j);
			int next = sortedList.get(j + 1);
			if (map.get(curr) < map.get(next)) {
				count++;
			} else {
				break;
			}

		}
		return arr.length - count;
	}

	public static void main(String[] args) {

		int[] arr = { 5, 1, 3, 2, 7 };
		System.out.println(minMoves(arr));

	}

}
