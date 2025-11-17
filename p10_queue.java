package Day4Programs;

import java.util.PriorityQueue;

public class p10_queue {

	public static void main(String[] args) 
	{
		PriorityQueue<String> q = new PriorityQueue<>();
		System.out.println("Initial List");
		System.out.println(q);
		
		System.out.println("Adding new item");
		q.add("apple");
		System.out.println("Size: " + q.size());
		System.out.println(q);
		
		System.out.println("Adding new item");
		q.add("java");
		System.out.println("Size: " + q.size());
		System.out.println(q);
		
		System.out.println("Adding new item");
		q.add("python");
		System.out.println("Size: " + q.size());
		System.out.println(q);
		
		System.out.println("Adding new item");
		q.add("cat");
		System.out.println("Size: " + q.size());
		System.out.println(q);
		
		System.out.println("Removing item");
		q.remove();//after removal queue is displayed sorted ascending 
		System.out.println("Size: " + q.size());
		System.out.println(q);
		
		System.out.println("First element " + q.peek());
		
		q.clear();
		
		System.out.println("After removing all items, First element " + q.peek());
	}
}
