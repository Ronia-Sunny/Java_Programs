import java.util.Scanner;

public class e2_sevenDivisible {

	public static void main(String[] args) 
	{
		int num;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println(" Enter a number : ");
		num = scanner.nextInt();
		
		System.out.println("Divisibility by 7 :" + (num % 7 == 0 ));
	}

}
