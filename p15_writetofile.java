package Day4Programs;

import java.io.FileWriter;
import java.io.IOException;

public class p15_writetofile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileWriter file = new FileWriter("c:\\test.txt");
		file.write("First line\n");
		file.write("second line\n");
		file.write("third line");
		file.close();
	}

}
