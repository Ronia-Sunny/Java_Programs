package Day2Programs;
//class person with instance variables name(String) and age(int).
//default constructor that initializes name to "unknown" and age to 0. create object
//of person and print its name and age.

class Person
{
	String name;
	int age;
	
	Person()
	{
		name = "unknown";
		age = 0;
	}
	
	void print()
	{
		System.out.println("Name:" +name);
		System.out.println("Age:" +age);
	}
}
public class e5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person obj = new Person();
		obj.print();
	}

}
