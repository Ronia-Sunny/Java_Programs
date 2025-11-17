package Day3programs;
//final keyword
class base
{
	final void display()
	{
		System.out.println("Display method");
	}
}

class extended extends base
{
	//use below without final keyword above
	//void display()
	//{
		//System.out.println("Hi");
	//}
}

public class p6_finalkeyword {

	public static void main(String[] args) {
		extended obj = new extended();
		obj.display();
	}

}
