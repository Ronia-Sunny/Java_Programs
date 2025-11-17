package UserInterface;

import Bank.customer;
import Bank.transaction;
import Utility.validate;

import java.util.Scanner;

public class MainMenu {
    private customer customer;
    private transaction transaction;

    
    public MainMenu(customer customer) {
        this.customer = customer;
        transaction = new transaction(customer);
    }

    
    public void displayMenu() {
        
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. View Customer Details");
        System.out.println("4. Exit");
        System.out.print("Enter option: ");
    }

    
    public void executeOption(int option) 
    {
        Scanner sc = new Scanner(System.in);
        switch (option) 
        {
            case 1:
                System.out.print("Enter amount to deposit: ");
                double depositAmount = sc.nextDouble();
                transaction.deposit(depositAmount);
                break;
            case 2:
                System.out.print("Enter amount to withdraw: ");
                double withdrawAmount = sc.nextDouble();
                transaction.withdraw(withdrawAmount);
                break;
            case 3:
                System.out.println("Customer Details ");
                System.out.println("Name: " + customer.getCustomerName());
                System.out.println("ID: " + customer.getCustomerId());
                System.out.println("Balance: " + customer.getBalance());
                break;
            case 4:
                System.out.println("Exiting...");
                break;
            default:
                System.out.println("Invalid option.");
                break;
        }
        sc.close();
    }

    
    public boolean authenticatePin(String enteredPin) {
        validate validator = new validate();
        return validator.validatePin(customer, enteredPin);
    }
}


