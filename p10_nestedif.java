
public class p10_nestedif {

	public static void main(String[] args) 
	{
		int mark=18;
		if(mark>75)
		{
			System.out.println("Distinction");
		}
		else if((mark >59) && (mark<75))
		{
			System.out.println("First Class");
		}
		else if((mark>49) && (mark<60))
		{
			System.out.println("Second Class");
		}
		else
		{
			System.out.println("Fail");
		}

	}

}
