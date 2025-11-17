package Day3programs;
//abstract can be extended while final cannot .
abstract class employee
{
	int empid;
	String empname;
	int age;
	
	abstract void getPassportNumber();	
}

class newemployee extends employee
{

	@Override
	void getPassportNumber() 
	{
		// TODO Auto-generated method stub
		
	}
	
}
public class p10_abstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		newemployee obj = new newemployee();

	}

}

