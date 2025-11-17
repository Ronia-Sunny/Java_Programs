package Day4Programs;
//develop an inventory management application for the user. the user can perform the following.
//add items to store
//view items in the store
//remove items in the store
//check the minimum and maximum quantity of each product (min quantity = 5 to max qty 100)
//display the following menu
//add item to store
//view items in the store
//issue the item
//remove item
//exit

import java.util.*;

class Item {
    String name;
    int quantity;

    Item(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }
}

public class e5 {
    private static final int MIN_QUANTITY = 5;
    private static final int MAX_QUANTITY = 100;
    private static final Scanner scanner = new Scanner(System.in);
    private static final Map<String, Item> inventory = new HashMap<>();

    public static void main(String[] args) {
        int choice;
        do {
            displayMenu();
            choice = getChoice();
            switch (choice) {
                case 1 -> addItem();
                case 2 -> viewItems();
                case 3 -> issueItem();
                case 4 -> removeItem();
                case 5 -> System.out.println("Exiting application. ");
                default -> System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);
    }

     static void displayMenu() {
        System.out.println("\n   Inventory Management Menu   ");
        System.out.println("1. Add item to store");
        System.out.println("2. View items in the store");
        System.out.println("3. Issue the item");
        System.out.println("4. Remove item");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");
    }

     static int getChoice() {
        try {
            return Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            return -1;
        }
    }

     static void addItem() {
        System.out.print("Enter item name: ");
        String name = scanner.nextLine().trim();
        System.out.print("Enter quantity (5 to 100): ");
        int qty = Integer.parseInt(scanner.nextLine());

        if (qty < MIN_QUANTITY || qty > MAX_QUANTITY) {
            System.out.println("Quantity must be between " + MIN_QUANTITY + " and " + MAX_QUANTITY + ".");
            return;
        }

        if (inventory.containsKey(name)) {
            inventory.get(name).quantity += qty;
            System.out.println("Updated quantity of " + name + " to " + inventory.get(name).quantity);
        } else {
            inventory.put(name, new Item(name, qty));
            System.out.println("Item added successfully.");
        }
    }

     static void viewItems() {
        if (inventory.isEmpty()) {
            System.out.println("Inventory is empty.");
            return;
        }

        System.out.println("\nCurrent Inventory:");
        System.out.printf("%-20s %-10s %-10s\n", "Item Name", "Quantity", "Status");
        for (Item item : inventory.values()) {
            String status = (item.quantity < MIN_QUANTITY) ? "Below Min" :
                            (item.quantity > MAX_QUANTITY) ? "Above Max" : "OK";
            System.out.printf("%-20s %-10d %-10s\n", item.name, item.quantity, status);
        }
    }

     static void issueItem() {
        System.out.print("Enter item name to issue: ");
        String name = scanner.nextLine().trim();

        if (!inventory.containsKey(name)) {
            System.out.println("Item not found.");
            return;
        }

        System.out.print("Enter quantity to issue: ");
        int qty = Integer.parseInt(scanner.nextLine());

        Item item = inventory.get(name);
        if (qty > item.quantity) {
            System.out.println("Not enough stock to issue.");
        } else {
            item.quantity -= qty;
            System.out.println("Issued " + qty + " of " + name + ". Remaining: " + item.quantity);
            if (item.quantity == 0) {
                inventory.remove(name);
                System.out.println("Item removed from inventory as quantity is zero.");
            }
        }
    }

     static void removeItem() {
        System.out.print("Enter item name to remove: ");
        String name = scanner.nextLine().trim();

        if (inventory.remove(name) != null) {
            System.out.println("Item removed successfully.");
        } else {
            System.out.println("Item not found.");
        }
    }
}


