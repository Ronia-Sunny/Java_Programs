package Day4Programs;
import java.util.Scanner;
//compile time error
//runtime error
//checked exception
//unchecked exception
public class p1_exceptionhandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, c;
		Scanner scanner = new Scanner(System.in);
		try
		{
		System.out.println("Enter first number:");
		a = scanner.nextInt();
		System.out.println("Enter second number:");
		b = scanner.nextInt();
		c = a + b;
		System.out.println("The result is: " + c);
		}
		catch(Exception e)
		{
			System.out.println("Error in the input");
		}
		System.out.println("Rest of the code");
	}
}