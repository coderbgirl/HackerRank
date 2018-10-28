package Strings;

import java.util.Scanner;

public class Pangram {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String:");
		String s = scan.nextLine();
		String p = s.toUpperCase();
		int AZ = 0;
		for (char c = 'A'; c <= 'Z'; c++) {
			int cnt = 0;
			for (int i = 0; i < p.length(); i++) {
				if (p.charAt(i) == c) {
					cnt++;
				}
			}
			if (cnt == 0) {
				System.out.println("Not Pangram");
				break;
			}
			AZ++;
		}
		if (AZ == 26) {
			System.out.println("Pangram");
		}

	}

}
