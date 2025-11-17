package Day2Programs;
//accept password from user and check atleast it has eight characters in length and one nmerals atleast

public class e21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String pass = "password123$";
		boolean result = false;
		int count = 0;
		int i;
		char c;
		if(pass.length() < 8)
		{
			System.out.println("Invalid Password");
		}
		else
		{
			count = pass.length();
			for( i=0;i<count;i++)
			{
				c = pass.charAt(i);
				if(Character.isDigit(c) == true)
				{
					result = true;
					break;
				}
				else
				{
					if(i == count - 1)
					{
						result = false;
						break;
					}
				}
			}
		}

	}

}
