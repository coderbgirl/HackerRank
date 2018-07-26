package implementation;

import java.util.Scanner;

public class ProgrammerOfTheDay {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int y = scan.nextInt();
		String s = null;
		if (y >= 1700 && y <= 2700) {
			if (y > 1918)
				if ((y % 4 == 0) && (y % 100 != 0) || (y % 400 == 0))
					s = "12.09." + y;
				else
					s = "13.09." + y;
			if (y == 1918)
				s = "26.09.1918";
			if (y < 1918)
				if (y % 4 == 0)
					s = "12.09." + y;
				else
					s = "13.09." + y;
		}

		System.out.println(s);
	}
}
