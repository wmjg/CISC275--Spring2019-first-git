import java.util.*;

public class C2 {
	public static void main(String[] args) {
		Set<String> s = new HashSet<String>();//no dupes
		for (String a : args){
			if (!s.add(a))
				System.out.println("a duplicate: " + a);
		}
		System.out.println(s.size() + " arguments " + s);
	} 
} // we did it