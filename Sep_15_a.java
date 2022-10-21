package Sep_15;

public class Sep_15_a {

	public static void main(String[] args) 
	  {
     
		int[]array=new int[] {5,7,1,3,98};
	
	  {
		int i,temp=0;
		for(i=0;i<array.length;i++)
		{
			for(int j=i+1;j<array.length;j++)
			{
				if(array[i]>array[j])
				{
				temp=array[i];
				array[i]=array[j];
				array[j]=temp;
			    }
		    }	
		
	System.out.println(array[i]+"");
		
	    }
	}
     }
}
