package sep_28;

import java.util.Scanner;

public abstract class sep_28a implements in1,in2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("choose your area \n1.rural \n2.urban \n3.punchayat \n4.metro");
		int area =sc.nextInt();
		System.out.println("choose your tariff 1.comm 2.resi");
		int tariff =sc.nextInt();
		
		switch(area)
		{
		case 1:
			if(tariff==1)
			in2.rural();
			else
			in1.rural();
			break;
		case 2:
			if(tariff==1)
			in2.urban();
			else
			in1.urban();
			break;
	    case 3:
			if(tariff==1)
			in2.punchayat();
			else
			in1.punchayat();
			break;
		case 4:
			if(tariff==1)
			in2.metro();
			else
			in1.metro();
			break;	
		default:
			System.out.println("choose correct number");
		}
		
		

	
		
	}

}
