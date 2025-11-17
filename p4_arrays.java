package Day2Programs;

public class p4_arrays {

	public static void main(String[] args) 
	{
		int nos[] = new int[5];
		nos[0] = 0;
		nos[1] = 10;
		nos[2] = 100;
		nos[3] = 1000;
		nos[4] = 10000;
		
		System.out.println("0th element " + nos[0]);
		System.out.println("Total values" + nos.length);
		int i;
		for(i=0;i<nos.length;i++)
		{
			System.out.println("Value of " + i + " position is " + nos[i]);
		}

	}

}
