package Day3programs;
//multilevel inheritance

class c1
{
	int a = 20;
}

class c2 extends c1
{
	int b= 10;
}

class c3 extends c2
{
	int c = a+b;
	void display()
	{
		System.out.println(c);
	}
}
public class p2_inherit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		c3 obj = new c3();
		obj.display();
	}

}
