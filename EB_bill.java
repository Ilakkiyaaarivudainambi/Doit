package sep_28;

import java.util.Scanner;

public abstract class EB_bill {
	public static void main(String[] args) {
		System.out.println("Enter your category: ");

		Scanner sc = new Scanner(System.in);
		int Option = sc.nextInt();

		switch (Option) {
		case 1:
			Residencial.Panchayat();
			break;
		case 2:
			Residencial.rural();
			break;
		case 3:
			Residencial.Metro();
			break;
		case 4:
			Residencial.Urban();
			break;
		case 5:
			Commercial.Panchayat();
			break;
		case 6:
			Commercial.Rural();
			break;
		case 7:
			Commercial.Metro();
			break;
		case 8:
			Commercial.Urban();
			break;
		default:
			System.out.println("Please enter a valid category");
			break;
		}
	}
}
