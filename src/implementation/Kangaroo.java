package implementation;

import java.util.Scanner;

public class Kangaroo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x1 = scan.nextInt();
		int v1 = scan.nextInt();
		int x2 = scan.nextInt();
		int v2 = scan.nextInt();
		//int j=0;
		int j= Math.abs((x2-x1)/(v1-v2));
		int k1 =(x1+(j*v1));
		int k2 =(x2+(j*v2));
		if(k1== k2){
			System.out.println("YES");
		}
		else{
			System.out.println("NO");
		}
		

	}

}
