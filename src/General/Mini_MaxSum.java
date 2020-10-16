package General;

import java.util.Arrays;
import java.util.Scanner;

public class Mini_MaxSum {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		long[] array = new long[5];
		System.out.println("Enter 5 no.:");

		for (int i = 0; i < 5; i++) {
			array[i] = scan.nextLong();
		}
		Arrays.sort(array);
		for (int i = 0; i < 5; i++) {
			System.out.println(array[i]);
		}
		long min=0;
		for(int i=0; i<4; i++){
			min= (min+ array[i]);
		}
		System.out.println(min);
		
		long max=0;
		for(int i=1; i<5; i++){
			max = (max+ array[i]);
		}
		System.out.println(max);
	}
}
