package General;

import java.util.Scanner;

public class ArraySum {

	public static int arraySum(int arr[]) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {

			sum = sum + arr[i];
		}
		arr[0]=5;
		return sum;

	}
	
	/*public static int arraySum4(int arr) {    //delete
		arr = 66;
		return 44;

	}*/
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number:");
		int b = scan.nextInt();
		int[] array = new int[b];

		System.out.println("Enter " + b + " array elements:");
		for (int i = 0; i < array.length; i++) {

			array[i] = scan.nextInt();
		}

		int result = arraySum(array);
		System.out.println(array[0]);
	//	int result2 = arraySum4(array[0]); //delete
		//int result3 = array[0];

		System.out.println("Answer is:" + result);

	}

}

/*import java.util.Scanner;

public class ArraySum {

	
	public static void main(String[] args) {
	
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the number:");
		int b= scan.nextInt();
		int[] array= new int[b];
		int sum = 0;
		for(int i=0;i<array.length;i++){
			System.out.println("Enter the array element:");
			int a= scan.nextInt();
			array[i]=a;
			sum=sum+array[i];
		}
		System.out.println(sum);

	}

}*/

