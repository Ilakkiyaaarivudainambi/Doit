package teleapps;

import java.util.Scanner;
import java.util.Vector;

public class Vec {
	static int[] a = new int[5];
	static Scanner s = new Scanner(System.in);
	static String n;
	static int k;
	static Vector<String> ve = new Vector<>();
	static Vector<Integer> ve1 = new Vector<>();

	public static void main(String[] args) {
		ve.add("apple");
		ve.add("orange");
		ve.add("mango");
		ve.add("pomagranate");
		ve.add("pinapple");
		ve.add("papaya");
		ve.add("butter fruit");
		ve.add("kiwi");
		ve.add("fig");
		ve.add("jack fruit");
		for (String str : ve) {
			System.out.println(str);
		}

		ve1.add(10);
		ve1.add(25);
		ve1.add(15);
		ve1.add(20);
		ve1.add(12);
		ve1.add(18);
		ve1.add(19);
		ve1.add(12);
		ve1.add(8);
		ve1.add(28);

		System.out.println("1.PARCHASE     ");
		System.out.println("2.SALE         ");
		System.out.println("3.Available Products");
		int d = s.nextInt();
		if (d == 1) {
			parchase();

		} else if (d == 2) {
			sale();
		} else if (d == 3) {
			System.out.println("my stock is \n " + ve);
			System.out.println(ve1);
		} else {
			System.out.println("Enter valid number");
		}

	}

	public static void sale() {
		System.out.println("enter the fruit to sales");
		n = s.next();
		int d1 = ve.indexOf(n);

		System.out.println("Enter how many fruit to want parchase");
		k = s.nextInt();
		if (k < ve1.get(d1)) {

			int d2 = ve1.get(d1);
			d2 = d2 - k;
			ve1.set(d1, d2);

		} else {
			System.out.println("My availability is low :" + ve1.get(d1));
			sale();
		}
	}

	public static void parchase() {
		System.out.println("enter the fruit to parchase");
		n = s.next();
		int d1 = ve.indexOf(n);

		System.out.println("Enter how many fruit to want parchase");
		k = s.nextInt();
		int d2 = ve1.get(d1);
		d2 = d2 + k;
		ve1.set(d1, d2);
		System.out.println("my stock is \n " + ve);
		System.out.println(ve1);

	}
}
