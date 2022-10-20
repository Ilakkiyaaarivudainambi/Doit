import java.util.Arrays;

public class exam {
	public static void main(String[] args) {
		String s="key=1,count=10&key=2,count=18&key=3,count=100&key=4,count=8&key=7,count=10";
		String delimiter ="[&=,]";
		String s1[]=s.split(delimiter);
		int count=0;
		String s2=" ";
		int n=0;
	   // System.out.println(Arrays.toString(s1));
		for (int i = 0; i < s1.length; i++) {
//			String string = s1[i];
			//System.out.println(s1[i]);
			
			if("count".equals(s1[i])){
			    s2=s1[i+1];
			    count++;
			    n=Integer.parseInt(s2)+count;
			    //s1[i+1]=String.valueOf(n);
			    System.out.println(n);
			    }
			   
			}
		}
	}

