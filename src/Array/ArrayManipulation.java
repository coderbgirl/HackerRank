package Array;

import java.util.Scanner;

public class ArrayManipulation {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] nm = scan.nextLine().split(" ");
		int n = Integer.parseInt(nm[0]);
		int m = Integer.parseInt(nm[1]);
		long[] array = new long[n];
		long temp = 0;
		for (int i = 0; i < m; i++) {
			String[] abk = scan.nextLine().split(" ");
			int a = Integer.parseInt(abk[0]);
			int b = Integer.parseInt(abk[1]);
			long k = Long.parseLong(abk[2]);
			for (int j = a - 1; j < b; j++) {
				array[j] = array[j] + k;
			}
		}
		for (int k = 0; k < n; k++) {
			if (array[k] > temp) {
				temp = array[k];
			}
		}
		System.out.println(temp);
	}
}





/*import java.util.Scanner;

public class ArrayManipulation {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] nm = scan.nextLine().split(" ");
		int n = Integer.parseInt(nm[0]);
		int m= Integer.parseInt(nm[1]);
		long[] array = new long[n+1];
		long sum=0;
        long max=0;
		for(int i= 0; i<m; i++){
			String[] abk = scan.nextLine().split(" ");
			int a=Integer.parseInt(abk[0]);
			int b=Integer.parseInt(abk[1]);
			long k= Long.parseLong(abk[2]);
			array[a-1]=array[a-1]+k;
            array[b]=array[b]-k;
		}
        for (int k = 0; k < n; k++) {
			sum=array[k]+sum;
            max= Math.max(max,sum);
			}
		
		System.out.println(max);
	}

}*/
