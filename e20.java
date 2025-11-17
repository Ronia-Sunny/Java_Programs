package Day2Programs;
//accept string from user and display the no of words in it

public class e20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "apple banan cat dog";
		int total = s.length();
		int i=0;
		char c;
		int count=1;
		for(i=0;i<total;i++)
		{
			c = s.charAt(i);
			if(c == ' ')
			{
				count++;
			}
		}
		System.out.println("No of words in string :" +count);
	}

}
