package Day2Programs;
//define string with value "Apple is good for health" and replace the same with 
//"Orange is good for health"
public class e22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Apple is good for health";
		String s2 = "Orange is good for health";
		String s3 = "Apple is good for health";
		int len = s.length();
		if(s.equals(s3))
			{
				s = s2;
			}
		System.out.println(s);

	}

}
