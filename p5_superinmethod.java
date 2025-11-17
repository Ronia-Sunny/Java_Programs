package Day3programs;
//super keyword in a method
class testing
{
	void display()
	{
		System.out.println("Base class method");
	}
}

class sampletesting extends testing
{
	void display()
	{
		super.display();
		System.out.println("Extended class method");
	}
}

public class p5_superinmethod {

	public static void main(String[] args) {
		sampletesting obj = new sampletesting();
		obj.display();

	}

}
