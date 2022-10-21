package sep_28;

import java.util.Scanner;

public interface Commercial {
	public static void Panchayat()
	{
		    int unit;
	    	double bill = 0;
	    	Scanner sc=new Scanner(System.in);
	    	System.out.println("Enter the units consumed in Comm_Panchayat: ");
	    	unit=sc.nextInt();

		   if(unit<=100)
		   {
			 bill=100*0;  
		   }else if(unit<=300)
		   {
			 bill=(unit-100)*4;    
		   }else if(unit<=400)
		   {
		     bill=(unit-100)*6;  
		   }else if(unit>400)
		   {
		     bill=(unit-100)*8;    
		   }
		   
		   System.out.println(bill);
	      
	}
	public static void Rural()
	{
		 int unit;
	    	double bill = 0;
	    	Scanner sc=new Scanner(System.in);
	    	System.out.println("Enter the units consumed in Comm_Rural: ");
	    	unit=sc.nextInt();

		   if(unit<=100)
		   {
			 bill=100*0;  
		   }else if(unit<=300)
		   {
			 bill=(unit-100)*4.5;    
		   }else if(unit<=400)
		   {
		     bill=(unit-100)*6.5;  
		   }else if(unit>400)
		   {
		     bill=(unit-100)*8.5;    
		   }
		   
		   System.out.println(bill);

}
	public static void Metro()
	{
		 int unit;
	    	double bill = 0;
	    	Scanner sc=new Scanner(System.in);
	    	System.out.println("Enter the units consumed in Comm_Metro: ");
	    	unit=sc.nextInt();

		   if(unit<=100)
		   {
			 bill=100*0;  
		   }else if(unit<=300)
		   {
			 bill=(unit-100)*6.5;    
		   }else if(unit<=400)
		   {
		     bill=(unit-100)*8.5;  
		   }else if(unit>400)
		   {
		     bill=(unit-100)*10.5;    
		   }		   
		   System.out.println(bill);
}
	public static void Urban()
	{
		 int unit;
	    	double bill = 0;
	    	Scanner sc=new Scanner(System.in);
	    	System.out.println("Enter the units consumed in Comm_Urban: ");
	    	unit=sc.nextInt();

		   if(unit<=100)
		   {
			 bill=100*0;  
		   }else if(unit<=300)
		   {
			 bill=(unit-100)*10;    
		   }else if(unit<=400)
		   {
		     bill=(unit-100)*12;  
		   }else if(unit>400)
		   {
		     bill=(unit-100)*14;    
		   }		   
		   System.out.println(bill);
}
}
