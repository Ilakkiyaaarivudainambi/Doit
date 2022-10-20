package teleapps;

import java.util.Scanner;

public class Primenumber10 {
static int count;
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("enter number");
	int a=s.nextInt();
	for (int i = 2; i < a; i++) {
		count=0;
		for (int j = 2; j < i; j++) {
			if (i%j==0) {
				count++;
				break;
			}
		}
		if (count==0) {
			System.out.println("prime number :"+i);
		}
	}
}
}
