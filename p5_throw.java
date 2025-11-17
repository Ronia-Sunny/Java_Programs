package Day4Programs;

import java.util.Scanner;

public class p5_throw 
{
	static void Validate(int a) 
	{
		if (a < 18)
		{
			throw new ArithmeticException("Age is invalid");
		}
	}

	public static void main(String[] args) 
	{
		int age;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the age of participant: ");
		age = scanner.nextInt();
		try
		{
		Validate(age);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		System.out.println("Rest of the code");
	}	
}
