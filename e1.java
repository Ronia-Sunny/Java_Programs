package Day3programs;
//create class BankAccount with methods deposit() withdraw().
//subclass SavingsAccount that overrides the withdraw() method to prevent withdrawals
//if the account balance falls below one hundred

class  BankAccount
{
	void deposit()
	{
		int amount = 10000;
		System.out.println("Deposit Amount " + amount);
	}
	
	void withdraw()
	{
		int wamount = 5000;
		System.out.println("Withdrawal amount " + wamount);
	}
}

class SavingsAccount extends BankAccount
{
	void withdraw()
	{
		
		System.out.println("Account balance below hundred");
	}
}

public class e1 {

	public static void main(String[] args) {
		BankAccount obj = new BankAccount();
		obj.deposit();
		obj.withdraw();

	}

}
