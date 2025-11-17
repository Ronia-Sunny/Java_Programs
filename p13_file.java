package Day4Programs;

import java.io.File;
import java.io.IOException;

public class p13_file {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File myfile = new File("c:\\test.txt");
		boolean res = myfile.createNewFile();
		if(res == true)
		{
			System.out.println("File does not exists...New file got created");
			
		}
		else
		{
			System.out.println("File already exists...New file not created");
		}

	}

}
