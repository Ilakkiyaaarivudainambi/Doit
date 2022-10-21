package sep22;

public class sep22_d {

	public static void main(String[] args) {
  
		String[] s= {"hdh","tdxyfyh","aaag"};
	   for (int i = 0; i < s.length; i++) {
		   for (int j= i+1; j < s.length; j++) {
			   String temp=" ";
			   if(s[i].compareTo(s[j])>0)
			   {
				   temp=s[i];
				   s[i]=s[j];
				   s[j]=temp;
				   
			   }
		   }
		   System.out.println(s[i]);

	
	}	
	}

}
