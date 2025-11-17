
//define class student to store data such as roll no,student name,course enrolled.Assign 
//values to the class with following values using method assignValues
//rollno=101,student name="test",course enrolled="perl programming"
//print the above using printValues() method

package Day2Programs;

class student
{
	int rollno;
	String studentname, course;
	
	void assignValues(int r, String s, String c)
	{
		rollno = r;
		studentname = s;
		course = c;
	}
	void printValues()
	{
		System.out.println("Student Name:" +studentname);
		
	}
}

public class e1 {

	public static void main(String[] args) 
	{
		

	}

}
