package Day4Programs;

import java.util.Scanner;

//read a list of numbers from a user and throws an exception if any numbers are negative
public class e1 {

	public static void main(String[] args) throws myexception
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] n = new int[5];
		System.out.println("Enter numbers: ");
		int n1 = sc.nextInt();
		if(n1 < 0 )
		{
			throw new myexception("Number cannot be negative");
		}
		else
		{
			System.out.println("Numbers are valid");
		}
		System.out.println("Rest of the code");
	}

	//static Exception newexception(String string) {
		// TODO Auto-generated method stub
		//return null;
	//}

}
