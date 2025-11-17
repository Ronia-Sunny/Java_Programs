package Day4Programs;

public class p4_mutipleexception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n[] = new int[4];
		int a = 5, b = 5, c = 5;
		try
		{
			//n[10] = 100;
			int d = (a / (b - c));
			n[10] = 100;
		}
		catch(ArithmeticException e)
		{
			System.out.println("Division by zero error");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array index is not correct");
		}
		finally
		{
			System.out.println("Always executed");
		}
		System.out.println("Rest of the code");
	}

}
