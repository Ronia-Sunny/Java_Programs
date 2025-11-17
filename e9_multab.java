import java.util.Scanner;

public class e9_multab {

	public static void main(String[] args) 
	{
		int n;
		int i;
		int p;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		n = sc.nextInt();
		
		for(i=1;i<=10;i++)
		{
			p = n * i;
			System.out.println(p);
		}
	}

}
