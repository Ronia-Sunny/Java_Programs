package Day2Programs;

class students
{
	int rollno;
	String name;
	String course;
	
	students()
	{
		rollno = 1;
		name = "user";
		course = "bca";
		System.out.println("Constructor is working here");
	}
	
	void print()
	{
		System.out.println("Roll no:" +rollno);
		System.out.println("Name:" +name);
		System.out.println("Course:" +course);
	}
}

public class p2_constructor {

	public static void main(String[] args)
	{
		students obj = new students();
		obj.print();
	}

}
