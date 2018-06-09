package Array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SparseArrays {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = Integer.parseInt(scan.nextLine());
		ArrayList<String> strings = new ArrayList<String>();
		for (int i = 0; i < n; i++) {
			strings.add(scan.nextLine());
		}
		int q = Integer.parseInt(scan.nextLine());

		ArrayList<String> query = new ArrayList<String>();
		for (int i = 0; i < q; i++) {
			query.add(scan.nextLine());
		}

		for (int i = 0; i < q; i++) {
			System.out.println(Collections.frequency(strings, query.get(i)));
		}
	}
}




/*import java.util.Arrays;
import java.util.Scanner;

public class Arr {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.nextLine());
		String[] strings = new String[n];
		for (int i = 0; i < n; i++) {
			strings[i] = scan.nextLine();
		}
		int q = Integer.parseInt(scan.nextLine());
		String[] query = new String[q];
		for (int i = 0; i < q; i++) {
			query[i] = scan.nextLine();
		}
		for (int i = 0; i < q; i++) {
			int count = 0;
			for (int j = 0; j < n; j++) {
				if (Arrays.asList(query[i]).contains(strings[j])) {
					count++;
				}
			}
			System.out.println(count);
		}
	}
}*/



/*
import java.util.HashMap;
import java.util.Scanner;

public class xyz {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.nextLine());
		HashMap<String, Integer> strings = new HashMap<String, Integer>();
		for (int i = 0; i < n; i++) {
			String s = scan.nextLine();
			if (strings.get(s) == null) {
				strings.put(s, 1);
			} else {
				int count = strings.get(s);
				count++;
				strings.put(s, count);
			}
		}
		int q = Integer.parseInt(scan.nextLine());
		String[] query= new String[q];
		for (int j = 0; j < q; j++) {
			String Q = scan.nextLine();
			if(strings.get(Q)== null){
				System.out.println(0);
			}
			else
			System.out.println(strings.get(Q));
		}
	}

}*/
