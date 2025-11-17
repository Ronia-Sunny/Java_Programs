package Day3programs;
//hierarchical inheritance
class a
{
	int x = 10;
}

class b extends a
{
	int y = 10;
	void display()
	{
		System.out.println(x+y);
	}
}

class c extends a
{
	int z = 10;
	void display()
	{
		System.out.println(x+z);
	}
}

public class p3_inherit {

	public static void main(String[] args) 
	{
		b obj = new b();
		obj.display();
		c obj2 = new c();
		obj2.display();
	}
}
