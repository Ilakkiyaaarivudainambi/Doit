import java.util.Arrays;

public class StringOccurence {
	public static void main(String[] args) {
		String s="key = 1 , count = 10 || key = 2 , count = 18 || key = 3 , count = 100 || key = 4 , count = 8 || key = 7 , count = 10";
		String s1[]=s.split(" ");
		int count=0;
		int count1=0;
		int num=0;
		String s2="";
		//System.out.println(Arrays.toString(s.split(" ")));
		for (int i = 0; i < s1.length; i++) {
			if("=".equals(s1[i])) {
				count++;
				if(count%2==0) {
					count1++;
					s2=s1[i+1];
					int n=Integer.parseInt(s2);
					num=n+count1;
					//System.out.println(n+count1);
					s1[i+1]=String.valueOf(num);
					
				}
			}System.out.print(s1[i]);
		}
		
	}
    
}