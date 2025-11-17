import java.util.Scanner;

public class e13 {

	public static void main(String[] args) 
	{
		int n =0;
		
		int even = 0;
		int odd = 0;
		Scanner sc = new Scanner(System.in);
	while(n!=-999) {
		

			System.out.println("Enter number:");
			n = sc.nextInt();
		
			if(n % 2 == 0)
			{
				even ++;
			}
			else
			{
				odd ++;
			}
		}
		
	
		System.out.println("No of even nos:" + even);
		System.out.println("No of odd nos:" + odd);
}
	}



