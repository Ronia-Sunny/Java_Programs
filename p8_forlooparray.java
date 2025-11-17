package Day2Programs;

public class p8_forlooparray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no[] = new int[5];
		no[0] = 10;
		no[1] = 100;
		no[2] = 400;
		no[3] = 450;
		no[4] = 500;
		for(int n :no)
		{
			System.out.println("Value of no " +n);
		}
	}

}
