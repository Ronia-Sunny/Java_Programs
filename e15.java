// class calc with following methods
// add(int,int)
// multiply(int,int)
// pass the following inputs and check the output
// add(5,5)  (expected output 10)
// multiply(5,5) (expected output 25)
class calc
{
	void add(int a,int b)
	{
		System.out.println(a+b);
	}
	void multiply(int a,int b)
	{
		System.out.println(a*b);
	}
	
}
public class e15 {

	public static void main(String[] args) 
	{
		calc obj = new calc();
		obj.add(5, 5);
		obj.multiply(5,5);

	}

}
