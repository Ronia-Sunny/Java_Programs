// class stringUtility and check the following outputs
// int stringLength(s)
//int countVowel(s)
// pass the following inputs to the program and check the output
// stringLength("Java")  (expected output 4)
// countVowel("apple")  (expected output 2)
class stringUtility
{
	int stringLength(String s)
	{
		return s.length();
	}
	int countVowels(String s)
	{
		int count = 0;
		for(int i=0;i<s.length();i++)
		{
			 if (s.charAt(i) == 'a' || s.charAt(i) == 'e'|| s.charAt(i) == 'i'
		  || s.charAt(i) == 'o' || s.charAt(i) == 'u') 
			 {
				 count ++;
			 }
		}
		return count;
	}
}


public class e16 {

	public static void main(String[] args) 
	{
		stringUtility obj = new stringUtility();
		System.out.println(obj.stringLength("java"));
		System.out.println(obj.countVowels("apple"));

	}

}
