package Day4Programs;

import java.util.ArrayList;
import java.util.List;

public class p8_list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> mylist = new ArrayList<>();
		mylist.add("item1");
		mylist.add("item2");
	    mylist.add("item3");
	    mylist.add("item4");
	    
	    System.out.println(mylist);
	    System.out.println("Total items initial : " + mylist.size());
	    
	    boolean res = mylist.contains("item4");
	    System.out.println("Item 4 exists => " + res);
	    
	    res = mylist.contains("item10");
	    System.out.println("Item 10 exists => " + res);
	    
	    mylist.remove(3);
	    System.out.println("Removed 3rd item...updated list");
	    System.out.println(mylist);
	    
	    System.out.println("Total items after deletion : " + mylist.size());
	    
	}

}
