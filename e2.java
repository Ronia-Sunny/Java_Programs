package Day4Programs;

import java.io.File;

//create a method that reads a file and throws an exception if the file is not found.
public class e2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filepath = " file1.txt";
		try
		{
			File file= new (file);
		}

	}

}
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class e2 {
    public static void main(String[] args) 
    {
        String filePath = "file1.txt";

        try 
        {
            File file = new File(filePath);
            FileInputStream fis = new FileInputStream(file);
            
            System.out.println("File found and opened successfully.");
            fis.close(); 
        } 
        catch (FileNotFoundException e) 
        {
            System.err.println("File not found ");
            System.err.println(e.getMessage());
        } 
        catch (IOException e) 
        {
            System.err.println("Error closing the file stream: " + e.getMessage());
        }
    }
}