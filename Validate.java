

import Bank.Customer;

public class Validate {

    // Method to validate the entered pin
    public boolean validatePin(Customer customer, String enteredPin) {
        return customer.getPin().equals(enteredPin);  // Directly using 'customer' object
    }

    // Method to validate withdrawal amount
    public boolean validateWithdrawal(Customer customer, double amount) {
        return amount > 0 && amount <= customer.getBalance();  // Directly using 'customer' object
    }
}
