package sep_28;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class mini1 {
	static TreeMap<String, Integer> m = new TreeMap<>();
	static Scanner sc = new Scanner(System.in);
	static LocalDate startday = LocalDate.parse("2022-10-01");
	static LocalDate currentday = LocalDate.now();

	public static void main(String[] args) {
		m.put("amit", 14);
		m.put("suba", 11);
		m.put("keerthana", 10);
		m.put("banu", 13);
		m.put("janu", 14);
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
		System.out.println("enter student name");
		int daysDiff = (int) startday.until(currentday, ChronoUnit.DAYS);
		// System.out.println(daysDiff);
		while (true) {
			String name = sc.next();
			Set<String> keySet = m.keySet();
			if (keySet.contains(name)) {
				int val = m.get(name);
				int val1 = (val * 100) / daysDiff;
				System.out.println(name + " " + "attendance percentage:" + val1 + "%");
				break;
			} else {
				System.out.println("Enter Valid Name");
			}
		}
	}

	private static void attendance() {
		System.out.println("P FOR PRESENT A FOR ANBSENT");
		Set<Entry<String, Integer>> set = m.entrySet();
		for (Entry<String, Integer> e : set) {
			System.out.println("student name:" + " " + e.getKey());

			while (true) {
				String c = sc.next();
				if (c.equalsIgnoreCase("p")) {
					m.put(e.getKey(), e.getValue() + 1);
					break;
				} else if (c.equalsIgnoreCase("a")) {
					break;
				} else {
					System.out.println("enter correct character");

				}

			}

		}
		// for (Entry<String, Integer> e1 : set) {
		// System.out.println(e1.getKey()+" "+e1.getValue());
		// }
	}
}
