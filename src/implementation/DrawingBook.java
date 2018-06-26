package implementation;

import java.util.Scanner;

public class DrawingBook {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int p = in.nextInt();
		int front;
			front = p / 2;
		

		int back;
		if (n % 2 == 0) {
			if (p%2 ==0) {
				back = (n-p)/2;
			} else {
				back = (n - p) / 2 + 1;
			}
		} 
		else  {
			back = (n - p) / 2;
		}
		
		System.out.println(Math.min(front, back));
		
	}

}
