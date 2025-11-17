import java.util.Scanner;

public class e8_larsmall {

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		int a=50,n;
		int lar = 0,small=0;
		System.out.println("Enter 5 numbers: ");
		n = sc.nextInt();
		lar = n;
		small = n;
		for(int i=1;i<5;i++) {
			n = sc.nextInt();
			if(n > lar)
			{
				lar = n;
			}
			if(n < small)
			{
				small = n;
			}
		}
		System.out.println("Largest is :" + lar);
		System.out.println("Smallest is:" + small);
	}

}
