package Interview_Practice;

import java.util.Scanner;

public class Left_Rotation {
	
	public static int[] left_Rotation(int[]arr, int d){
		int[] temp= new int[d];
		for(int i=0; i<d; i++){
			temp[i]= arr[i];
		}
		int j=0;
		for(int i=d; i<arr.length; i++){
			arr[j]=arr[i];
			j++;
		}
		for(int i=0;i<d;i++){
			arr[j]=temp[i];
			j++;
		}
		
		return arr;

	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int d = scan.nextInt();

		int[] arr = new int[a];
		for (int i = 0; i < a; i++) {
			arr[i] = scan.nextInt();
		}
		int[] result=left_Rotation(arr,d);
		
		for(int i=0; i<a; i++){
			System.out.print(result[i] +" ");
		}
		
			
		}
	}


