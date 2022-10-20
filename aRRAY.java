package teleapps;
import java.util.*;
//import java.util.ArrayList;
//import java.util.HashSet;
//import java.util.List;
//import java.util.Set;

public class aRRAY {
public static void main(String[] args) {
	List<String> l=new ArrayList<>();
	l.add("sajee");
	l.add("tele");
    l.add("rajaram");
    l.add("sajee");
    l.add("tele");
    l.add("apps");
	System.out.println(l);
	System.out.println();
	Set<String> s1=new HashSet<>(l);
	System.out.println(s1);
//	for (int i = 0; i < l.length; i++) {
//		
//	}
//	
//	
//	System.out.println();
//	for(Object e:l) {
//		System.out.println(e);
//	}
}
}
