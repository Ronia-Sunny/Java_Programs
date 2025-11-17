package Day4Programs;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class p16_filereader {

	public static void main(String[] args) throws FileNotFoundException 
	{
		FileReader file = new FileReader("c:\\test.txt");
		Scanner sc = new Scanner(file);
		while(sc.hasNext())
		{
			String content = sc.nextLine();
			System.out.println(content);
		}
	}

}
