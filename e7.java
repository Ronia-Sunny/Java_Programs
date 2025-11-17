package Day2Programs;
//extend the person class further by adding another parametrized constructor that 
//only takes name as an argument and initializes name to the given value,while 
//setting age to a default value(eg -1). Demonstrate constructor overloading by creating 
//objects using all three constructors default,name and age, name only) and 
//print their values

class person2{
	String name;
	int age;
	
	person2()
	{
		name = "unknown";
		age = 0;
	}
	person2(String s)
	{
		name = s;
		age =-1;
	}
	person2(String s, int a)
	{
		name = s;
		age = a;
	}
}

public class e7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
person2 obj = new person2();
System.out.println("Name:" +obj.name);
System.out.println("Age:" +obj.age);

	}

}
