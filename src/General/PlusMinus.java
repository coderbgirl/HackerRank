package General;

import java.util.Scanner;

public class PlusMinus {

	public static void main(String[] args ) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter no.:");
		int n = scan.nextInt();
		int[] array = new int[n];
		System.out.println("Enter " + n + " elements:");
		int Positive=0;
		int Negative=0;
		int Zero =0;
		for (int i = 0; i < n; i++) {
			array[i] = scan.nextInt();
			

			if(array[i]==0){
				Zero ++;
			}
			else if(array[i]!=Math.abs(array[i])){
				Negative ++;
			}
			else if(array[i]==Math.abs(array[i])){
				Positive ++;
			}
		}
	
		double po= (double)Positive / n;
		double ne=(double)Negative/n;
		double ze=(double)Zero/n;
		System.out.printf("%f \n", po);
		System.out.printf("%.8f \n",ne);
		System.out.printf("%.12f \n",ze);

	}

}
