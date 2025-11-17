
public class e11_vowel {

	public static void main(String[] args) 
	{
		String st = " WelcomeHome ";
		int count = 0;
		st = st.toLowerCase();
		
		for (int i = 0; i < st.length(); i++) 
		{
            
            if (st.charAt(i) == 'a' || st.charAt(i) == 'e'|| st.charAt(i) == 'i'
                || st.charAt(i) == 'o'
                || st.charAt(i) == 'u') 
            {
                count++;
		
            }
	}
            System.out.println("Total no: of vowels: " + count);
	}
}
