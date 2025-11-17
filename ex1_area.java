import java.util.Scanner;

public class ex1_area {

	public static void main(String[] args) 
	{
		int radius;
		final double pi = 3.14;
		Scanner scanner = new Scanner(System.in);
				
		System.out.println(" Enter the radius : ");
		radius = scanner.nextInt();
		
		System.out.println(" Area of circle : " + pi * radius * radius);
		
		

	}

}
