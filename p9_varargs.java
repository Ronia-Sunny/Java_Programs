package Day2Programs;

public class p9_varargs {

	public static void main(String[] args) 
	{
		addNumbers(1,1);
		addNumbers(1,2,3);
		addNumbers(1,2,3,4);

	}
	
	static void addNumbers(int a, int ...b)
	{
		int total = b.length;
		int i=0;
		int sum=a;
		for(i=0;i<total;i++)
		{
			sum+=b[i];
		}
		System.out.println(sum);
	}

}
