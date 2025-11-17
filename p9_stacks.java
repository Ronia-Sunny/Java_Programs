package Day4Programs;

import java.util.Stack;

public class p9_stacks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> l = new Stack<>();
		System.out.println("Initial value : ");
		System.out.println(l);
		System.out.println("Size: " + l.size());
		
		System.out.println("Adding item1");
		l.push("apple");
		System.out.println(l);
		System.out.println("Size: " + l.size());
		
		System.out.println("Adding item2");
		l.push("orange");
		System.out.println(l);
		System.out.println("Size: " + l.size());
		
		System.out.println("Adding item3");
		l.push("mango");
		System.out.println(l);
		System.out.println("Size: " + l.size());
		
		System.out.println("Adding item4");
		l.push("banana");
		System.out.println(l);
		System.out.println("Size: " + l.size());
		
		System.out.println("Removing item");
		l.pop();
		System.out.println(l);
		System.out.println("Size: " + l.size());
		
		System.out.println("Adding item");
		l.push("cat");
		System.out.println(l);
		
		System.out.println("Removing item");
		l.pop();
		System.out.println(l);
		System.out.println("Size: " + l.size());
		
		System.out.println("Removing item");
		l.pop();
		System.out.println(l);
		System.out.println("Size: " + l.size());
		
	}

}
