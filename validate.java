package Utility;

import Bank.customer;

public class validate 
{
    public boolean validatePin(customer customer, String enteredPin) 
    {
        return customer.getPin().equals(enteredPin);
    }

   
    public boolean validateWithdrawal(customer customer, double amount) 
    {
        return amount > 0 && amount <= customer.getBalance();
    }
}


