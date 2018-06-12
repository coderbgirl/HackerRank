package Stack;

import java.util.Scanner;

public class Waiter {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.next());
		int q = Integer.parseInt(scan.next());
		int[] number= new int[n];
		for(int i=0; i<n; i++){
			number[i]= scan.nextInt();	
		}
		
		for(int i=0; i<n; i++){
			System.out.println(number[i]);
		}
	}

}
