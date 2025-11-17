package Day2Programs;

class values
{
	void compare(int a,int b)
	{
		if(a==b)
		{
			System.out.println("Same");
		}
		else
		{
			System.out.println("Not Same");
		}
	}
	
	void compare(String a,String b)
	{
		if(a==b)
		{
			System.out.println("Same");
		}
		else
		{
			System.out.println("Not Same");
		}
	}
}

public class e3 {

	public static void main(String[] args) 
	{
		values obj = new values();
		obj.compare(5, 5);
		obj.compare("6", "6");
	}
		
}


