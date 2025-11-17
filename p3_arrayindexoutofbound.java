package Day4Programs;

public class p3_arrayindexoutofbound {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no[] = new int[4];
		try
		{
		no[10] = 10;
		System.out.println("Value of no[10]" + no[10]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
		System.out.println("Wrong array index mentioned in the program");
		}
		System.out.println("Rest of the code");
	}

}
