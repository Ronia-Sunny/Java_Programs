import java.util.Scanner;

public class e4_netSalaryCalculate {

	public static void main(String[] args) 
	{
		int basicSalary;
		System.out.println("Enter basic salary : ");
		Scanner scanner = new Scanner(System.in);
		basicSalary = scanner.nextInt();
		
		double dallowance = 0.3 * basicSalary;
		double houserent = 0.18 * basicSalary ;
		double city = 0.2 * basicSalary;
		double pf = 0.08 * basicSalary;
		double grosspay = basicSalary + dallowance + houserent + 
				city + pf;
		double netpay = grosspay - pf;
		
		
		
		
		System.out.println("Netpay : " + netpay);
		
	}

}
