package teleapps;

import java.util.Scanner;

public class divi {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter number");
		int i =1;
			int n=s.nextInt();
			while(i<n){
				if(i%3==0 && i%5==0 && i%9==0) {
					
					System.out.println(i);	
				}
				i++;
			}
			
}
} 