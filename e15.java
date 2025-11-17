package Day2Programs;
//sum of elemts of array
//10,20,30,40,50,60
//sum 210
public class e15 {

	public static void main(String[] args) 
	{
		int no[] = new int[6];
		int sum = 0;
		no[0] = 10;no[1] = 20;
		no[2] = 30;no[3] = 40;
		no[4] = 50;no[5] = 60;
		System.out.println("Array: ");
		for(int i=0;i<no.length;i++)
		{
			System.out.println(no[i]);
		}
		for(int i=0;i<no.length;i++)
		{
			sum += no[i];
		}
		System.out.println("Sum of array:" +sum);
	}

}
