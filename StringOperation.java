import java.util.Arrays;
import java.util.Scanner;

public class StringOperation {
	public static void main(String args[])

	{
		Scanner scan = new Scanner(System.in);

		String str = "key=13,count=14|key=12,count=8|key=4,count=7";

		System.out.println("Enter the key value:" + str);
		String key = scan.next();
		String s[] = str.split("[=,\\|]");

		int count = 0;
		int g = 0;
		String r = " ";
		String s3 = "";
		int c = 0;
		String s4 = "";
		String s5 = "";

		for (int i = 0; i < s.length; i++) {
			//System.out.println(s[i]);
			//System.out.println(s.length);

			if (key.equals(s[i])&& i<s.length-1) {
				if ("count".equals(s[i + 1]) ){

					r = s[i + 2];
					g = Integer.parseInt(r);

					g = g + 1;
					s5 = String.valueOf(g);

				}

			}

		}

		System.out.println(str.replace(r, s5));
	}
}
