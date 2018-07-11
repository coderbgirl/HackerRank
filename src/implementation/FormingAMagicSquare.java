package implementation;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class FormingAMagicSquare {

	static int formingMagicSquare(int[][] s) {
		int row;
		int cost = 0;
		if (s[1][1] != 5) {
			cost = cost + Math.abs(5 - s[1][1]);
			s[1][1] = 5;
		}
		HashSet<Integer> corners= new HashSet<>();
		corners.add(2);
		corners.add(4);
		corners.add(6);
		corners.add(8);
		corners.remove(s[0][0]);
		corners.remove(s[2][2]);
		corners.remove(s[0][2]);
		corners.remove(s[2][0]);
		
		

		
		int RD = s[0][0] + s[2][2];
		if (RD != 10) {
			if (s[0][0] == 2 || s[0][0] == 4 || s[0][0] == 6 || s[0][0] == 8) {
				cost = cost + Math.abs((s[2][2] - (10 - s[0][0])));
				s[2][2] = 10 - s[0][0];
			} else {
				cost = cost + Math.abs((s[0][0] - (10 - s[2][2])));
				s[0][0] = 10 - s[2][2];

			}
		}
		int LD = s[0][2] + s[2][0];
		if (LD != 10) {
			if (s[0][2] == 2 || s[0][2] == 4 || s[0][2] == 6
					|| s[0][2] == 8 && s[0][2] != s[0][0] && s[0][2] != s[2][2]) {
				cost = cost + Math.abs((s[2][0] - (10 - s[0][2])));
				s[2][0] = 10 - s[0][2];
			} else {
				cost = cost + Math.abs((s[0][2] - (10 - s[2][0])));
				s[0][2] = 10 - s[2][0];

			}
		}

		for (int i = 0; i < 3; i++) {
			row = 0;
			for (int j = 0; j < 3; j++) {
				row = row + s[i][j];
			}
			if (row != 15) {
				for (int j = 0; j < 3; j++) {
					if ((i % 2 == 0 && j % 2 != 0) || (i % 2 != 0 && j % 2 == 0)) {
						if (s[i][j] != 1 && s[i][j] != 3 && s[i][j] != 7 && s[i][j] != 9) {
							if (row < 15) {
								s[i][j] = s[i][j] + (15 - row);
								cost = cost + (15 - row);
							} else {
								s[i][j] = s[i][j] - (row - 15);
								cost = cost + (row - 15);
							}
						}
					}
				}
			}
		}

		return cost;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[][] s = new int[3][3];
		for (int s_i = 0; s_i < 3; s_i++) {
			for (int s_j = 0; s_j < 3; s_j++) {
				s[s_i][s_j] = in.nextInt();
			}
		}
		int result = formingMagicSquare(s);
		System.out.println(result);
		in.close();
	}
}
