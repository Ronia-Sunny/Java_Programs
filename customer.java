package Bank;
//You are asked to develop the banking application with the following features.
//	a. enter pin
//	b. deposit amount
//	c. withdraw amount
//	d. check balance

//the folder structure:

//Package name : Bank
//classes 
//customer - to store customer details such as customer id, customer name, balance,pin
//transaction - to perform deposit and withdrawal

//Package name : User Interface
//classes
//Main menu - to display options such as 1.deposit 2.withdraw 3.view customer details 4.exit

//Package name : Utility
//classes
//validate - validatewithdrawal, validatepin

//identify the data type as per the business requirement and design the application





public class customer {
    private static String customerId;
    private static String customerName;
    private static double balance;
    private static String pin;

    public customer(String customerId, String customerName, double balance, String pin) {
        customer.customerId = customerId;
        customer.customerName = customerName;
        customer.balance = balance;
        customer.pin = pin;
    }

    public String getCustomerId() {
        return customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getBalance() {
        return balance;
    }

    public String getPin() {
        return pin;
    }

    public void setBalance(double balance) {
        customer.balance = balance;
    }
}


