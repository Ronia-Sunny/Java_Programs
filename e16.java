package Day2Programs;
//copy elements of an array to new array

public class e16 {

	public static void main(String[] args) 
	{
		int no[] = new int[5];
		int i = 0;int j = 0;
		int newarray[] = new int[5];
		no[0] = 10;no[1] = 20;
		no[2] = 30;no[3] = 40;
		no[4] = 50;
		System.out.println("Array: ");
		for(i=0;i<no.length;i++)
		{
			System.out.println(no[i]);
		}
		System.out.println("New Array: ");
		for(i=0;i<no.length;i++)
		{
				newarray[i] = no[i];
				System.out.println(newarray[i]);
		}
		
	}

}
