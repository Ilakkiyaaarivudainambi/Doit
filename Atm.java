package teleapps;

import java.util.Scanner;
public class Atm {
	static int pin = 1234;
	static int myAmount = 20000;
	static float bal = 0;

	public static void main(String[] args) {
		System.out.println("********Insert your Card********");
		System.out.println(" Select type of transaction you want");
		System.out.println("1.withdraw \n2.Fastcash");
		Scanner s = new Scanner(System.in);
		int option = s.nextInt();
		switch (option) {
		case 1: {
			withdraw();
			break;
		}
		case 2: {
			fastcash();
			break;
		}
		}
		System.out.println("THANK YOU");
	}

	public static void withdraw() {
		System.out.println("Enter your Pin : ");
		Scanner s1 = new Scanner(System.in);
		int p = s1.nextInt();
		if (p == pin) {
			System.out.println("Enter amount here: ");
			// Scanner s1 = new Scanner(System.in);
			float amount = s1.nextFloat();
			if (amount <= myAmount) {
				System.out.println("Collect your cash:" + amount);
				bal = myAmount - amount;
				System.out.println("Your account balance is:" + bal);
			} else {
				System.out.println("Insufficent Amount");
				System.out.println("Your account balance is:" + myAmount);
			}
		} else {
			System.out.println("Incorrect Pin");
		}
	}

	public static void fastcash() {
		System.out.println("Enter your Pin : ");
		Scanner s1 = new Scanner(System.in);
		int p = s1.nextInt();
		if (p == pin) {
			System.out.println("Choose your amount \n1.$2000 \n2.$5000 \n3.$10000");
			Scanner s = new Scanner(System.in);
			int option = s.nextInt();
			switch (option) {
			case 1: {
				System.out.println("Collect your amount : $2000");
				bal = myAmount - 2000;
				System.out.println("Your account balance is:" + bal);
				break;
			}
			case 2: {
				System.out.println("Collect your amount : $5000");
				bal = myAmount - 5000;
				System.out.println("Your account balance is:" + bal);
				break;

			}
			case 3: {
				System.out.println("Collect your amount : $10000");
				bal = myAmount - 10000;
				System.out.println("Your account balance is:" + bal);
				break;
			}
			default:
				System.out.println("Please Choose vaild amount");
			}
		} else {
			System.out.println("Incorrect Pin");
		}
	}
}
