package Bank;

public class transaction {
    private static customer customer;

    
    public transaction(customer customer) 
    {
        transaction.customer = customer;
    }

    
    public void deposit(double amount) 
    {
        if (amount > 0) 
        {
            double newBalance = customer.getBalance() + amount;
            customer.setBalance(newBalance);
            System.out.println("Deposit successful! New balance: " + newBalance);
        } 
        else 
        {
            System.out.println("Invalid deposit amount.");
        }
    }

    
    public void withdraw(double amount) 
    {
        if (amount > 0 && amount <= customer.getBalance()) 
        {
            double newBalance = customer.getBalance() - amount;
            customer.setBalance(newBalance);
            System.out.println("Withdrawal successful! New balance: " + newBalance);
        } 
        else 
        {
            System.out.println("Insufficient funds or invalid amount.");
        }
    }
}


