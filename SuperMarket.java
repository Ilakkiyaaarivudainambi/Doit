package teleapps;
import java.util.Scanner;
public class SuperMarket  {
	static int count;
	static String name, name1, name2;
	static Scanner s = new Scanner(System.in);
	static String[] stringArray = new String[5];

	static String Sauce[] = { "chilly", "tomoto", "soya" };
	static String beverges[] = { "tea", "coffee", "boost", "horlics" };
	static String diary[] = { "milk", "curd", "butter" };

	public static void main(String[] args) {

		System.out.println("enter your product");
		for (int i = 0; i < stringArray.length; i++) {
			stringArray[i] = s.nextLine();
		}
		SuperMarket sm = new SuperMarket();
		SuperMarket1 v = new SuperMarket1();
		v.start();
		v.setName("BEVERGES");
		name = v.getName();
		SuperMarket2 v1 = new SuperMarket2();
		v1.start();
		v1.setName("Sauce");
		name1 = v1.getName();
		SuperMarket3 v2 = new SuperMarket3();
		v2.start();
		v2.setName("diary");
		name2 = v2.getName();
	}

	static synchronized public void beverges() {
		System.out.println("-----" + name + "-------");
		for (int i = 0; i < stringArray.length; i++) {
			for (int j = 0; j < beverges.length; j++) {

				if (stringArray[i].equals(beverges[j])) {

					System.out.println(beverges[j]);
				}
			}
		}
	}

	static synchronized public void diary() {
		System.out.println("-----" + name2 + "-------");
		for (int i = 0; i < stringArray.length; i++) {
			for (int j = 0; j < diary.length; j++) {

				if (stringArray[i].equals(diary[j])) {

					System.out.println(diary[j]);
				}
			}
		}
	}

	static synchronized public void Sauce() {
		System.out.println("-----" + name1 + "-------");
		for (int i = 0; i < stringArray.length; i++) {
			for (int j = 0; j < Sauce.length; j++) {

				if (stringArray[i].equals(Sauce[j])) {

					System.out.println(Sauce[j]);
				}
			}
		}
	}

}
