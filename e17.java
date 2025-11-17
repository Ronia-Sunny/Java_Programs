//declare the class with the following 3 methods m1,m2,m3;
class testing
{
	void m1()
	{
		System.out.println("M1 is running");
		m2();
	}
	void m2()
	{
		System.out.println("M2 is running");
		m3();
	}
	void m3()
	{
		System.out.println("M3 is running");
	}
}
// call the method m2 from m1 and m3 from m2	


public class e17 {

	public static void main(String[] args) 
	{
		testing obj = new testing();
		obj.m1();
		//obj.m2();

	}

}
