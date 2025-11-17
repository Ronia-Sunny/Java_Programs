package Day3programs;
//abstract class employee with abstract methods calculateSalary() and displayInfo().

abstract class Employee
{
	int empid = 1;
	int empsalary = 35000;
	
	abstract void calculateSalary();
	abstract void displayInfo();
}

class newEmployee extends Employee
{
	
	@Override
	void calculateSalary() {
		// TODO Auto-generated method stub
		System.out.println("Salary");
	}
	@Override
	void displayInfo() {
		// TODO Auto-generated method stub
		System.out.println("Emp id : " +empid);
		System.out.println("Emp salary:" +empsalary);
	}
}
public class e5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		newEmployee obj = new newEmployee();
		obj.calculateSalary();
		obj.displayInfo();
	}

}
