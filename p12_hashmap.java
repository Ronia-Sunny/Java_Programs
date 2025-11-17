package Day4Programs;

import java.util.HashMap;

public class p12_hashmap {

	public static void main(String[] args) 
	{
		HashMap<Integer,String> employee = new HashMap<Integer,String> ();
		employee.put(1, "user1");
		employee.put(2, "user2");
		employee.put(3, "user3");
		employee.put(4, "user4");
		employee.put(5, "user5");
		
		System.out.println("List of employees " + employee);
		
		System.out.println("Remove users");
		
		employee.remove(3);
		
		System.out.println("List of employees " + employee);
		
	}

}
