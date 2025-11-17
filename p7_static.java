package Day3programs;
//static variable also called class variable
//it takes the previous value hence here x=10 then incremented then 11 
//and throughout 11 since it is static
//sv is sharing same variable throughout all objects
class staticdemo
{
	int x = 10;
	static int y = 10;
	staticdemo()
	{
		x++;
		y++;
		System.out.println("x = " + x);
		System.out.println("y = " + y);
	}
}

public class p7_static {

	public static void main(String[] args) 
	{
		new staticdemo();
		new staticdemo();
		new staticdemo();
		new staticdemo();

	}

}
