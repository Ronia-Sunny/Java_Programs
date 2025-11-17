import java.util.Scanner;

public class e3_sumAverage {

	public static void main(String[] args) 
	{
		int a , b, c ;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter first number: ");
		a = scanner.nextInt();
		
		System.out.println("Enter second number: ");
		b = scanner.nextInt();
		
		System.out.println("Enter third number: ");
		c = scanner.nextInt();
		
		System.out.println("Sum :" + (a + b + c));
		System.out.println("Average :" + ((a + b + c)/3));
	}

}