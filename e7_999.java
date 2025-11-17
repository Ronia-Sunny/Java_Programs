import java.util.Scanner;

public class e7_999 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n;
		int avg = 0;
		int sum = 0;
		int i =1;
			System.out.println("Enter numbers :");
			n = sc.nextInt();
			while(n!=-999)
			{
			sum += n;
			i++;
			n = sc.nextInt();
			}
			avg = sum/i;
			System.out.println("Sum is " + sum);
			System.out.println("Average is " + avg);
			
		}
		
				
	}
		

	
