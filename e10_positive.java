import java.util.Scanner;

public class e10_positive {

	public static void main(String[] args) 
	{
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");
		n = sc.nextInt();
		posNeg(n);

	}

	private static void posNeg(int n) 
	{
		if(n > 0)
		{
			System.out.println("N is Positive");
		}
		else if(n < 0)
		{
			System.out.println("N is Negative");
		}
		else
		{
			System.out.println("N is not a digit");
		}
		
	}

}
