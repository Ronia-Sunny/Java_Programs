package Day2Programs;

class disp
{
	void display()
	{
		//System.out.println("Nothing to display");
	}
	void display(int a)
	{
		System.out.println(a);
	}
	void display(String a)
	{
		System.out.println(a);
	}
	void display(int a, String b)
	{
		System.out.println(a+ " "+b);
	}
}

public class e4 {

	public static void main(String[] args) 
	{
		disp obj = new disp();
		obj.display();
		obj.display(5);
		obj.display("a");
		obj.display(5,"ab");
		

	}

}
