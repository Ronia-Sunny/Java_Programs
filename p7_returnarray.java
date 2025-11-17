package Day2Programs;

public class p7_returnarray 
{

	public static void main(String[] args) 
	{
		int[] no = new int[5];
		int i;
		no[0] = 10;
		no[1] = 100;
		no[2] = 400;
		no[3] = 450;
		no[4] = 500;
		//System.out.println("Initial values are");
		//for(i=0;i<no.length;i++)
		//{
		//	System.out.println(no[i]);
		//}
		no = incrementtoHundred( no);
		System.out.println("After incrementing to 100 ");
		for(i=0;i<no.length;i++)
		{
			System.out.println("Value of" +i+ " position is " + no[i]);
		}
	}
		static int[] incrementtoHundred(int no[])
		{
			int total = no.length;
			int i;
			for(i=0;i<no.length;i++)
			{
				no[i] += no[i]+100;
			}
			return no;
		}
		

}


