package implementation;

import java.util.Scanner;

public class BirthdayChocolate {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}
		int d = scan.nextInt();
		int m = scan.nextInt();
		int total=0;
		for(int i=0; i<n; i++){
			int sum=0;
			if(m+i>n){
				break;
			}

			for(int j=i; j<m+i; j++){
				sum=sum+arr[j];
			}
			int s=sum;
			if(d==s){
				total++;
			}
		}
		System.out.println(total);
	}

}
