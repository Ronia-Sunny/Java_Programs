package Day2Programs;

class simple
{
	int a;
	simple()
	{
		a = 10;
	}
	simple(simple s)
	{
		a = s.a;
	}
	void print()
	{
		System.out.println("Value of A is " +a);
	}
}

public class p3_copyconstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		simple obj1 = new simple();
		obj1.print();
		simple obj2 = new simple(obj1);
		obj2.print();

	}

}
