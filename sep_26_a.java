package sep_26;
public class sep_26_a {
	public static void main(String[] args)
	{
		int n =6;
	     for(int i =0;i<n;i++)
	     {
	for (int j = 0; j <n; j++)
	{
		if(i+j>=n-1)
	{
	System.out.print("* ");
	}
	else
	{
	System.out.print("  ");
	}
	}
	for (int j = 0; j<n; j++)
	{
	          if(i>j)
	          {
	          System.out.print("* ");
	          }
	          else
	{
	System.out.print("  ");
	}
	}
	System.out.println();
	}          
	for(int i =0;i<n;i++)
	{
	for (int j =0; j<n; j++)
	{
	if(i<=j-1)
	{
	System.out.print("* ");
	}
	else
	{
	System.out.print("  ");
	}
	}
	for (int j = 0; j<n; j++)
	{
	          if(i+j<n-2)
	          {
	          System.out.print("* ");
	          }
	          else
	{
	System.out.print("  ");
	}
	}
	System.out.println();
	}
	}
	}


