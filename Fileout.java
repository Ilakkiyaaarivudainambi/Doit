package teleapps;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Fileout {
public static void main(String[] args) throws IOException{
	try {
		FileOutputStream flo=new FileOutputStream("D:\\File\\new.txt");
		DataOutputStream s=new DataOutputStream(flo);
		String f="hi bye";
		byte[] by=f.getBytes();
		s.write(by);
		flo.close();
	} catch (FileNotFoundException e) {
		
		System.out.println(e);
	}
	
}
}
