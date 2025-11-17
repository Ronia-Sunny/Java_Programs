package Day2Programs;

class utility
{
	void add(String a, String b)
	{
		System.out.println(a+b);
	}
	void add(int a, int b)
	{
		System.out.println(a+b);
	}
}

public class p1_methodoverloading {

	public static void main(String[] args) 
	{
		utility obj = new utility();
		obj.add(5, 5);
		obj.add("a","b");

	}

}
