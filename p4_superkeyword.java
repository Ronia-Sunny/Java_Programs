package Day3programs;
//single inheritance using super keyword
class baseclass
{
	int x = 10;
}

class subclass extends baseclass
{
	int x = 100;
	void display()
	{
		System.out.println("Base class " + super.x);
		System.out.println("Sub class " + x);
	}
}

public class p4_superkeyword {

	public static void main(String[] args) 
	{
		subclass obj = new subclass();
		obj.display();

	}

}
