package General;

import java.util.Scanner;

public class Staircase {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the no:");
		int n= scan.nextInt();
		for(int i=0; i<n; i++){
			for(int j=0; j<n-i-1; j++){
				System.out.print(" ");
			}
			for(int k=0; k<i+1; k++){
				System.out.print("#");
			}
			System.out.println();
		}

	}

}
