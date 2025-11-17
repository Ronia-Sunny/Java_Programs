package Day4Programs;

import java.util.HashSet;
import java.util.Set;

public class p11_sets {

	public static void main(String[] args) 
	{
		Set<String> l = new HashSet<String>();
		l.add("item1");
		l.add("item2");
		l.add("item3");
		l.add("item4");
		l.add("item1");
		
		System.out.println(l);
		System.out.println("Size " +l.size());
	}

}
