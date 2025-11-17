package Day3programs;

class program1
{
	void program1()
	{
		System.out.println("Program 1 ");
	}
}

class program2 extends program1
{
	program2()
	{
		System.out.println("Program 2 ");
	}
}

class program3 extends program2
{
	program3()
	{
		System.out.println("Program 3 ");
	}
}
public class p8_inherit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		program1 obj = new program1();
		obj.program1();
				
	}

}
