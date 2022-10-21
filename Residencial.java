package sep_28;

import java.util.Scanner;

public interface Residencial {
	public static void Panchayat()
	{
		    int unit;
	    	double bill = 0;
	    	Scanner sc=new Scanner(System.in);
	    	System.out.println("Enter the units consumed in Resi_Panchayat: ");
	    	unit=sc.nextInt();

		   if(unit<=100)
		   {
			 bill=100*0;  
		   }else if(unit<=300)
		   {
			 bill=(unit-100)*2;    
		   }else if(unit<=400)
		   {
		     bill=(unit-100)*3;  
		   }else if(unit>400)
		   {
		     bill=(unit-100)*4;    
		   }
		   
		   System.out.println(bill);
	      
	}
	public static void rural()
	{
		 int unit;
	    	double bill = 0;
	    	Scanner sc=new Scanner(System.in);
	    	System.out.println("Enter the units consumed in Resi_Rural: ");
	    	unit=sc.nextInt();

		   if(unit<=100)
		   {
			 bill=100*0;  
		   }else if(unit<=300)
		   {
			 bill=(unit-100)*2;    
		   }else if(unit<=400)
		   {
		     bill=(unit-100)*3;  
		   }else if(unit>400)
		   {
		     bill=(unit-100)*4;    
		   }
		   
		   System.out.println(bill);

}
	public static void Metro()
	{
		 int unit;
	    	double bill = 0;
	    	Scanner sc=new Scanner(System.in);
	    	System.out.println("Enter the units consumed in Resi_Metro: ");
	    	unit=sc.nextInt();

		   if(unit<=100)
		   {
			 bill=100*0;  
		   }else if(unit<=300)
		   {
			 bill=(unit-100)*3.5;    
		   }else if(unit<=400)
		   {
		     bill=(unit-100)*4.5;  
		   }else if(unit>400)
		   {
		     bill=(unit-100)*5.5;    
		   }
		   
		   System.out.println(bill);

}
	public static void Urban()
	{
		 int unit;
	    	double bill = 0;
	    	Scanner sc=new Scanner(System.in);
	    	System.out.println("Enter the units consumed in Resi_Urban: ");
	    	unit=sc.nextInt();

		   if(unit<=100)
		   {
			 bill=100*0;  
		   }else if(unit<=300)
		   {
			 bill=(unit-100)*5.5;    
		   }else if(unit<=400)
		   {
		     bill=(unit-100)*6.5;  
		   }else if(unit>400)
		   {
		     bill=(unit-100)*7.5;    
		   }
		   
		   System.out.println(bill);

}
	
}
