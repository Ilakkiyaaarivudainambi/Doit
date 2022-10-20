package teleapps;

import java.util.Scanner;

public class Str {
	public static void main(String[] args) {
		Str tr = new Str();
		try {
			Scanner s1 = new Scanner(System.in);
			System.out.println("Enter the string");
			String s = s1.nextLine();

			tr.menu(s);
		} catch (Exception e) {
			System.err.println("Error");
		}

	}

	public void menu(String s) {
		String rev = " ";
		for (int i = s.length() - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);
		}
		// System.out.println(rev);
		String[] a = rev.split(" ");
		for (int i = a.length - 1; i >= 0; i--) {
			System.out.print(a[i] + " ");
		}
	}
}
