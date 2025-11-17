import java.util.Scanner;

public class p12_while 
{
	public static void main(String[] args)
	{
		int i=1, n, sum=0, avg;
		System.out.println("Enter 5 numbers");
		Scanner scanner = new Scanner(System.in);
		while(i<=5)
		{
			n = scanner.nextInt();
			sum+=n;
			i++;
		}
		avg=sum/5;
		System.out.println("Sum is:" + sum);
		System.out.println("Average is:" + avg);
	}

}
