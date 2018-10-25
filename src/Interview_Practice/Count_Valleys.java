package Interview_Practice;

import java.util.Scanner;

public class Count_Valleys {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String[] path = new String[n];
		for (int i = 0; i < n; i++) {
			path[i] = scan.next();
		}
		int result = countValleys(path);
		System.out.println(result);
	}

	static int countValleys(String[] path) {
		int SeaLevel = 0;
		int Mountain = 0;
		int Valley = 0;
		for (int i = 0; i < path.length; i++) {

			if (path[i].equals("U"))
				SeaLevel++;
			else if (path[i].equals("D"))
				SeaLevel--;

			if (SeaLevel == 0) {
				if (path[i].equals("U"))
					Valley++;
				else
					Mountain++;
			}
		}

		return Valley;
	}
}
