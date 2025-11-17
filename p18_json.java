package Day4Programs;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class p18_json {

	public static void main(String[] args) throws IOException, ParseException {
		JSONParser parser = new JSONParser();
		try (FileReader reader = new FileReader("c:\\testdata.json"))
		{
			Object obj = parser.parse(reader);
			
			JSONObject jsonObject = (JSONObject) obj;
			
			String name = (String) jsonObject.get("name");
			Long age = (Long) jsonObject.get("age");
			Boolean isStudent = (Boolean) jsonObject.get("isStudent");
			JSONArray courses = (JSONArray) jsonObject.get("courses");
			
			System.out.println("Name: " + name);
			System.out.println("Age: " + age);
			System.out.println("Is Student: " + isStudent);
			System.out.println("courses");
			for(Object course : courses)
			{
				System.out.println("Age: " + age);
			}
		}
	}

}
