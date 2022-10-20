package teleapps;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrrayList {

	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList<>();
		l.add(10);
		l.add(1);
		l.add(2);
		l.add(11);
		l.add(9);
		l.add(1);
		l.add(11);
		l.add(5);
		System.out.println("list with duplicate");
		System.out.println(l);
		ArrayList<Integer> l1 = new ArrayList<>();
		for (int integer : l) {
			if (!l1.contains(integer)) {
				System.out.println(l1.contains(l));
				l1.add(integer);
			}

			System.out.println("list without duplicate");
			System.out.println(l1);
			l1.remove(5);
			System.out.println("list after remove element ");
			System.out.println(l1);
			System.out.println("sorted list");
			Collections.sort(l1);
			System.out.println(l1);
			Collections.reverse(l1);
			System.out.println("list after reverse");
			System.out.println(l1);

		}

	}
}
