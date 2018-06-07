package Array;

import java.util.Scanner;

public class DynamicArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int Q = scan.nextInt();
		int[][] query = new int[Q][];
		for (int i = 0; i < Q; i++) {
			query[i] = new int[3];
			for (int j = 0; j < 3; j++) {
				int q = scan.nextInt();
				query[i][j] = q;
			}
		}
		Integer[][] sequence = new Integer[N][100];
		int lastAnswer = 0;
		for (int i = 0; i < Q; i++) {
			if (query[i][0] == 1) {
				for (int j = 0; j < 100; j++) {
					if (sequence[((query[i][1]) ^ lastAnswer) % N][j] == null) {
						sequence[((query[i][1]) ^ lastAnswer) % N][j] = query[i][2];
						break;

					}
				}
			}
			if (query[i][0] == 2) {
				int index = (query[i][1] ^ lastAnswer) % N;
				int len = 0;
				for (int k = 0; k < sequence[index].length; k++)
					if (sequence[index][k] != null)
						len++;
					else
						break;
				int a = query[i][2] % len;
				lastAnswer = sequence[index][a];
				System.out.println(lastAnswer);
			}
		}
	}

}




/*

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int Q = scan.nextInt();
        
        Integer[][] sequence = new Integer[N][1000];
        int[] sizes = new int[N];
		int lastAnswer = 0;
        
        
		for (int i = 0; i < Q; i++) {
			int[] query = new int[3];
			for (int j = 0; j < 3; j++) {
				query[j] = scan.nextInt();
			}
		
            int index = ((query[1])^lastAnswer)% N;
			if (query[0] == 1) {
				sequence[index][sizes[index]]= query[2];
                sizes[index]++;
			} else if(query[0]==2){
				int len = sizes[index];
				int a = query[2] % len;
				lastAnswer = sequence[index][a];
				System.out.println(lastAnswer);
			}
		}
	}

}*/

