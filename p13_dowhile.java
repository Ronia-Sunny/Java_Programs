import java.util.Scanner;

public class p13_dowhile {

	public static void main(String[] args) 
	{
		int choice = 1;
		Scanner scanner = new Scanner(System.in);
		do
		{
			System.out.println("1. Print your name");
			System.out.println("2. Print your age");
			System.out.println("3. Exit");
			System.out.println("4. Enter your choice");
			choice = scanner.nextInt();
		}while(choice != 3);
	}

}
