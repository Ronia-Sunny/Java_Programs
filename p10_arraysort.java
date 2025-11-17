package Day2Programs;

import java.util.Arrays;

public class p10_arraysort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no[] = new int[5];
		no[0] = 10;
		no[1] = 2;
		no[2] = 4;
		no[3] = 22;
		no[4] = 100;
		
		System.out.println("Before sorting ");
		int i = 0;
		for(i=0;i<no.length;i++)
		{
			System.out.println(no[i]);
		}
		Arrays.sort(no);
		System.out.println("After sorting");
		for(i=0;i<no.length;i++)
		{
			System.out.println(no[i]);
		}

	}

}
