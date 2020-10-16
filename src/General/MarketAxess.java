package General;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.TreeMap;

public class MarketAxess {

	public static int uniqueId(int[] array, int m) {

		HashMap<Integer, Integer> map = new HashMap<>();
		TreeMap<Integer, Queue<Integer>> treemap = new TreeMap<>();
		int result = 0;

		for (int i = 0; i < array.length; i++) {
			if (map.containsKey(array[i])) {
				map.put(array[i], map.get(array[i]) + 1);
			} else {
				map.put(array[i], 1);
			}
		}

		for (Integer key : map.keySet()) {
			Queue<Integer> temp = null;

			if (!treemap.containsKey(map.get(key))) {
				Queue<Integer> q = new LinkedList<Integer>();
				q.add(key);
				treemap.put(map.get(key), q);

			} else {
				temp = treemap.get(map.get(key));
				temp.add(key);
				treemap.put(map.get(key), temp);
			}
		}

//		for (Integer count : treemap.keySet()) {
//			//int counter = treemap.get(count).size() * count;
//			while (m > 0 && !treemap.get(count).isEmpty()) {
//				m--;
//				treemap.get(count).remove();
//				
//			}
//			if (m == 0) {
//				result = result + treemap.get(count).size();
//			}
//		}

		for (Integer count : treemap.keySet()) {
			while (m > 0 && !treemap.get(count).isEmpty()) {
				m -= count;
				if (m >= 0)
					treemap.get(count).remove();
			}
			if (m <= 0) {
				result = result + treemap.get(count).size();
			}
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = scan.nextInt();
		}
		int m = scan.nextInt();

		int result = uniqueId(array, m);
		System.out.println(result);

	}

}
