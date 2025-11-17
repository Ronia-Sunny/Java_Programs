package Day5Programs;

class testinggeneric <T>
{
	T value;
	void setValue(T value)
	{
		this.value = value;
	}
	
	T getValue()
	{
		return value;
	}
}

public class genericclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testinggeneric obj = new testinggeneric();
		obj.setValue("Ronia");
		System.out.println("Name: " + obj.getValue() );
		obj.setValue(22);
		System.out.println("Age: " + obj.getValue());
	}

}
