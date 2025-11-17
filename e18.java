package Day2Programs;

import java.util.Scanner;

public class e18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s;
		System.out.println("Enter string:");
		Scanner sc = new Scanner(System.in);
		s = sc.toString();
		int len;
		len = s.length();
		for(int i=0;i<len;i++)
		{
			if(s.charAt(i) != 1 || s.charAt(i) != 2 || s.charAt(i) != 3 || s.charAt(i) != 4 ||
					s.charAt(i) != 5 || s.charAt(i) != 6 || s.charAt(i) != 7 || s.charAt(i) != 8
					|| s.charAt(i) != 9 || s.charAt(i) != 0)
			{
				System.out.println("String doesn't contain numbers");
			}
			else
			{
				System.out.println("Contain numbers");
			}
		}
		

	}

}
