package Array;

import java.util.Scanner;
public class LeftRotation {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int d = scan.nextInt();
		int[] A = new int[n];

		for (int i = 0; i < A.length; i++) {
			A[i] = scan.nextInt();
		}
		for (int i = d; i < n+d; i++) {
			    System.out.print(A[i%n]+" ");			   
		}
	}
}

/*import java.util.Scanner;

public class LeftRotation {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int d = scan.nextInt();

		int[] A = new int[n];

		for (int i = 0; i < A.length; i++) {

			A[i] = scan.nextInt();
		}
		for (int i = 0; i < n; i++) {
			if(d==n){
				d=0;
			    System.out.print(A[d]+" ");
			    d++;
			    }
			 else{
				 System.out.print(A[d]+" ");
			     d++;
			 }
		}
		
	}

}
*/









