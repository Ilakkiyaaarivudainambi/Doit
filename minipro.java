package teleapps;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Date;
import java.util.Properties;
import java.util.Scanner;
import java.util.Vector;

public class minipro {
	static ArrayList<String> s = new ArrayList<>();
	static Vector<Integer> v = new Vector<>();
	static Scanner sc = new Scanner(System.in);
	static LocalDate startday = LocalDate.parse("2022-10-01");
	static LocalDate currentday = LocalDate.now();

	public static void main(String[] args) throws FileNotFoundException {
		s.add("abi");
		s.add("banu");
		s.add("deebika");
		s.add("karthika");
		s.add("suba");
		s.add("suganya");
		v.add(12);
		v.add(10);
		v.add(11);
		v.add(13);
		v.add(12);
		v.add(9);
//		for (String a : s) {
//			Properties p = new Properties();
//			FileOutputStream f = new FileOutputStream("C:\\Users\\User\\Documents\\New folder\\pro.properties");
//			p.setProperty(a, a);
//		}
		
		System.out.println("WELCOME");
		System.out.println(java.time.LocalDate.now());
		System.out.println("MONTHLY ATTENDANCE");
		while (true) {
			System.out.println("1 IS FOR PUT ATTENDANCE 2 IS FOR CHECK ATTENDANCE PERCENTAGE");
			while (true) {
				int at = sc.nextInt();

				if (at == 1) {
					attendance();
					break;
				} else if (at == 2) {
					percentage();
					break;
				} else {
					System.out.println("enter correct choice");
				}
			}
			System.out.println("do you want to continue: 1.yes 2.no");
			int fi = sc.nextInt();
			if (fi == 2) {
				System.out.println("thank you");
				break;
			}
		}
	}

	private static void percentage() {
		int daysDiff = (int) startday.until(currentday, ChronoUnit.DAYS);
		System.out.println("enter student name:");
		String get1=sc.next();
		
//		for (int i : v) {
//// System.out.println(daysDiff);
//			int f = (i * 100) / daysDiff;
//// System.out.println(f);
//			int vindex = v.indexOf(i);
//			String names = s.get(vindex);
//			//System.out.println(names );
//			
//			if(get1.equals(names)) {
//				System.out.println(get1 + " " + "percentage is:" + " " + f + "%");
//			}
//			
			//System.out.println(names + " " + "percentage is:" + " " + f + "%");
	//	}
	}

	public static void attendance() {
		int indexval = 0;
		int attval = 0;
		System.out.println("P FOR PRESENT A FOR ANBSENT");
		for (String element : s) {
			System.out.println("student name: " + element);
			indexval = s.indexOf(element);
			attval = v.get(indexval);

			while (true) {
				String c = sc.next();
				if (c.equalsIgnoreCase("p")) {
					v.set(indexval, attval + 1);
					break;
				} else if (c.equalsIgnoreCase("a")) {
					break;
				} else {
					System.out.println("enter correct character");

				}
			}

		}

	}

}
