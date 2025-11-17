package Day4Programs;

public class p2_arithmeticexception {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int a = 10, b = 5, c = 5;
		try
		{
		int d = (a/b-c);
		}
		catch (ArithmeticException e)
		{
		System.out.println("Division by zero error");
		}
		System.out.println("Rest of the code");
	}

}
