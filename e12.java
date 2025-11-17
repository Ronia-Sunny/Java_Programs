import java.util.Scanner;

public class e12 {

	public static void main(String[] args) 
	{
		int old;
		int newr;
		//Scanner sc = new Scanner(System.in);
		int units;
		double charge = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter old reading:");
		old = sc.nextInt();
		System.out.println("Enter new reading:");
		newr = sc.nextInt();
		units = newr - old;
		System.out.println("Units:" + units);
		if(units >= 1 && units <= 100)
		{
			System.out.println("No charges");
		}
		else if(units >= 101 && units <= 200)
		{
			charge = units * 1;
		}
		else if(units >= 201 && units <= 300) 
		{
			charge = units * 2;
		}
		else if(units >= 301 && units <= 400)
		{
			charge = units * 3;
		}
		else
		{
			charge = (units * 4) + (0.1 * (units * 4));
		}
		System.out.println("Electricity charge :" + charge);
	}

}
