package Sep_15;

public class Sep_15_d {

	public static void main(String[] args) {
	int n=4;
	    for(int i=0;i<n;i++)
	    { 
	     for(int j=0;j<n;j++)
	     {
	    	 if(i+j>n-1 ) {
	    	
	    	System.out.print("* ");
	    	}
	    	else
	    		{
	    		System.out.print(" ");
	    		}
	     }
	     System.out.println();
	    }
	    int m=8;
	    for(int i=0;i<n;i++)
	    { 
	     for(int j=0;j<m;j++)
	     {	
	    	 System.out.print("* ");
	    	}
	     System.out.println();
	    
	    }
	}
}

