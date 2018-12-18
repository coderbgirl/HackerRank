import java.util.Scanner;

public class TimeConversion {
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String y = scan.nextLine();
		String[] s = y.split(":");
		String hour = s[0];
		String minute = s[1];
		String second = s[2].substring(0, 2);
		String day_night = s[2].substring(s[2].length() - 2, s[2].length());
		int h = Integer.parseInt(hour);
		int m = Integer.parseInt(minute);
		int se = Integer.parseInt(second);
		if (h < 0 || h > 12 || m < 0 || m > 59 || se < 0 || se > 59) {
			System.out.println("Enter valid input.");
		}
		day_night = day_night.toUpperCase();
		if (day_night.equals("AM")) {
			if (h== 12) {
				System.out.println("00" + ":" + minute + ":" + second);
			} else if (0 <= h && 11 >= h) {

				System.out.println(hour + ":" + minute + ":" + second);
			}
		}

		else {
			if (h == 12) {
				System.out.println(hour + ":" + minute + ":" + second);
			} else {
				h = h + 12;
				System.out.println(h + ":" + minute + ":" + second);
			}
		}
	}
}


	/*public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter time:");
		int hh = scan.nextInt();
		int mm = scan.nextInt();
		int ss = scan.nextInt();
		Scanner scan1= new Scanner(System.in);
		//String AM="AM";
		//String PM="PM";
	
		String AP= scan1.nextLine();
		if(AP.equals("AM")){
			if(hh==12){
				System.out.println("00:"+mm+":"+ss);
			}
			else if(1<=hh && 11>=hh){
				System.out.println(hh+":"+mm+":"+ss);
			}
			}
		
		else if (AP.equals("PM")){
			 if(hh==12){
				 System.out.println(hh+":"+mm+":"+ss);
			 }
			 else if (1<=hh && 11>=hh){
				 hh=hh+12;
				 System.out.println(hh+":"+mm+":"+ss);
			 }
		}
		
		//System.out.println(":"+mm+":"+ss);}
	

	}
}*/
