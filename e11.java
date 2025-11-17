package Day2Programs;

import java.util.Arrays;

public class e11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no[] = new int[10];
		no[0] = 23;no[1] = 5;no[2] = 67;
		no[3] = 20;no[4] = 3;no[5] = 30 ;
		no[6] = 79;no[7] = 3;no[8] = 70;
		no[9] = 2;
		
		System.out.println("Before sorting ");
		int i = 0;
		for(i=0;i<no.length;i++)
		{
			System.out.println(no[i]);
		}
		Arrays.sort(no);
		System.out.println("Array in Descending Order: ");
		for(i=no.length-1;i<no.length;i--)
		{
			System.out.println(no[i]);
		}
	}

}
