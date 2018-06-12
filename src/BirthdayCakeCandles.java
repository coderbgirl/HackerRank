import java.util.Scanner;

public class BirthdayCakeCandles {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter no. of candles:");
		int n= scan.nextInt();
		int[] array = new int[n];
		System.out.println("Enter "+n+ " no.:");

		for (int i = 0; i < n; i++) {
			array[i] = scan.nextInt();
		}
		int p=  array[0];
		for(int i=1; i<n; i++){
			if(p<array[i]){
				p=array[i];
			}
		}
		int Output=0;
		for(int i=0; i<n; i++){
			if(p==array[i]){
				Output++;
			}
		}
		System.out.println(Output);
		

	}

}
