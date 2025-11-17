import java.util.Scanner;

public class p7_scanner {

	public static void main(String[] args) 
	{
		String username;
		int age;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your name: ");
		username = scanner.next();
		
		System.out.println("Enter your age: ");
		age = scanner.nextInt();
		
		System.out.println("Your name is " + username);
		System.out.println("Your age is " + age);

	}

}
