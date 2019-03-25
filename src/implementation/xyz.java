package implementation;

import java.util.Scanner;

public class xyz {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[][] s = new int[3][3];
		for (int s_i = 0; s_i < 3; s_i++) {
			for (int s_j = 0; s_j < 3; s_j++) {
				s[s_i][s_j] = in.nextInt();
			}
		}
		int RD = s[0][0] + s[1][1] + s[2][2];
		int LD = s[0][2] + s[1][1] + s[2][0];
		int row ;
		int col ;
		int cost=0;
		for (int i = 0; i < 3; i++) {
			row=0;
			for (int j = 0; j < 3; j++) {
				row = row + s[i][j];
			}
			if (RD==15 && row != RD) {			
				for (int c = 0; c < 3; c++) {
					if (i != c) {
						col=0;
						for (int r = 0; r < 3; r++) {
							col = col + s[r][c];
						}
						if (col != RD) {
							if (row < RD) {
								s[i][c] = s[i][c] + (RD - row);
								cost = cost + (RD - row);
							} else if (RD < row) {
								s[i][c] = s[i][c] - (row - RD);
								cost = cost + (row - RD);

							}

						}
					}
				}

			}
			else if(LD==15 && row!= LD){
				for (int c = 0; c <3; c++) {
					if (c!= 3-i-1) {
						col=0;
						for (int r = 0; r < 3; r++) {
							col = col + s[r][c];
						}
						if (col != LD) {
							if (row < LD) {
								s[i][c] = s[i][c] + (LD - row);
								cost = cost + (LD - row);
							} else if (LD < row) {
								s[i][c] = s[i][c] - (row - LD);
								cost = cost + (row - LD);

							}

						}
					}
				}

			}
			
		}
		System.out.println(cost);
	}

}
