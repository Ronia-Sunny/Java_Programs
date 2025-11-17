package Day3programs;
//class counter with a static variable count.

class counter
{
	static int count = 0;
	counter()
	{
		count ++;
		//System.out.println("Count: " + count);
	}
	System.out.println("Count: " + count);
}
public class e3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new counter();
		new counter();
		new counter();
	}

}
