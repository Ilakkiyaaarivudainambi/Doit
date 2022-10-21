package sep22;

public class sep22_a 
{
	public static void main(String[] args) 
	{
		int [][] arr = {{1,2,3},{5,6,7},{9,1,2}};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				for(int k=0;k<arr.length;k++)
				{
					for(int l=0;l<arr.length;l++)
					{
		                 int temp= 0;
				         if (arr[i][j] < arr[k][l])
				           {
				              temp=arr[i][j] ;
				              arr[i][j] =arr[k][l];
				              arr[k][l]=temp;
		                   }
		            }
				}
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				System.out.print(arr[i][j]);
	        }
			System.out.println();
			}
		System.out.println("max value is"+ arr[arr.length-1][arr.length-1]);
		System.out.println("min value is"+ arr[0][0]);
	}
}
