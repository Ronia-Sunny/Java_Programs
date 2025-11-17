package Day4Programs;

import java.io.File;

public class p17_filedeletion {

	public static void main(String[] args) 
	{
		File file = new File("c:\\test.txt");
		if(file.delete())
		{
			System.out.println("File deleted successfully");
		}
	}

}
