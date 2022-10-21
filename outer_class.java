package sep_27;
import java.util.Scanner;
public class outer_class
{
  class inner_class_demo
  {
    	 public void selection1()
    	   {
    		    int unit;
    	    	double bill = 0;
    	    	Scanner sc=new Scanner(System.in);
    	    	System.out.println("Enter the units here: ");
    	    	unit=sc.nextInt();

    		   if(unit<100)
    		   {
    			 bill=100*1.20;  
    		   }else if(unit<300)
    		   {
    			 bill=100*1.20+(unit-100)*2;    
    		   }else if(unit<400)
    		   {
    		     bill=100*1.20+200*2+(unit-100)*3;  
    		   }else if(unit>400)
    		   {
    		     bill=100*1.20+200*2+300*3+(unit-100)*4;    
    		   }
    		   
    		   System.out.println(bill);
    	   }
	}
  public static void main(String[] args) {
  	outer_class in=new outer_class();
  	outer_class.inner_class_demo inp=in.new inner_class_demo();
  	inp.selection1();
  }
}
