package Day3programs;
//2 classes , employee and salary. store employee details such as
//empid,empname,city in employee class.
//write method called display() to display employee details such as empid,empname,city.
//in salary class , add variable like basic,da,hra,pf,gross,netpay.
//calculate the salary using the method calculatesalary().(da - 30% of basic, hra - 20% of basic,
//pf - 8% of basic,gross - basic + da +hra +pf, netpay - grosspay - pf.
//write the method display() to display the salary details such as grosspay and netpay.
//display the empid,ity,grosspay,netpay(use super keyword if required)

class employee
{
	int empid = 1;
	String empname = "Ronia";
	String city = "Trivandrum";
	
	void display()
	{
		System.out.println("Employee id: " + empid);
		System.out.println("Employee name: " + empname);
		System.out.println("City: " + city);
	}
}

class salary extends employee
{
	double basic,da,hra,pf,gross,netpay;
	void calculatesalary()
	{
		
	}
}
public class e4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
