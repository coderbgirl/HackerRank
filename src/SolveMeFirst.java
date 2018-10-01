import java.util.Scanner;

public class SolveMeFirst {
	public static int solveMeFirst(int a, int b) {
		a = 5;
		return a + b;
	}

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value of x:");
		int x = scan.nextInt();
		System.out.println("Enter the value of y:");
		int y = scan.nextInt();
		int sum = 0;

		sum = solveMeFirst(x, y);
		System.out.println(x);
		System.out.println("Answer is:" + sum);
	}

}
