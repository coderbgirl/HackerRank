package Array;

import java.util.Scanner;

public class ArraysDS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
	    int n = scan.nextInt();
		int [] A= new int[n];

		for (int i = 0; i < A.length; i++) {

			A[i] = scan.nextInt();
		}
		for(int i=A.length -1; i>=0; i--){
			System.out.print(A[i]+" ");
		}
	}

}
