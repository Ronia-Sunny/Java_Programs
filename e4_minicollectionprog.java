package Day4Programs;

import java.util.*;

class Book 
{
     String bookId;
     String bookName;
     String author;
     double price;

    public Book(String id, String name, String writer, double cost) 
    {
        if (id.isEmpty() || name.isEmpty() || writer.isEmpty() || cost <= 0) 
        {
            throw new IllegalArgumentException("Book details cannot be empty");
        }
            bookId = id;
            bookName = name;
            author = writer;
            price = cost;
    }

    public String getBookId() 
    {
        return bookId;
    }

    public String toString() 
    {
        return "BookID: " + bookId + ", Name: " + bookName + ", Author: " + author + ", Price: ₹" + price;
    }
}

public class e4_minicollectionprog {
    static Map<String, Book> library = new HashMap<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) 
    {
        while (true) 
        { 
            System.out.println("1. Add Book");
            System.out.println("2. View All Books");
            System.out.println("3. Remove Book");
            System.out.println("4. Check if Book Exists");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            String choice = scanner.nextLine();

            switch (choice) 
            {
                case "1":
                    addBook();
                    break;
                case "2":
                    viewBooks();
                    break;
                case "3":
                    removeBook();
                    break;
                case "4":
                    checkBookExists();
                    break;
                case "5":
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
    
    static void addBook() 
    {
        try 
        {
            System.out.print("Enter Book ID: ");
            String id = scanner.nextLine();
            if (library.get(id) != null) 
            {
                System.out.println("Book ID already exists.");
                return;
            }
            System.out.print("Enter Book Name: ");
            String name = scanner.nextLine();
            System.out.print("Enter Author Name: ");
            String author = scanner.nextLine();
            System.out.print("Enter Price: ");
            double price = scanner.nextDouble();
            scanner.nextLine(); 

            Book book = new Book(id, name, author, price);
            library.put(id, book);
            System.out.println("Book added successfully.");
        } 
        catch (Exception e) 
        {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    static void viewBooks() 
    {
        if (library.isEmpty()) 
        {
            System.out.println("No books in the library.");
        } 
        else 
        {
            System.out.println("Books in Library:");
            for (Book book : library.values()) 
            {
                System.out.println(book);
            }
        }
    }
   
    static void removeBook() 
    {
        System.out.print("Enter Book ID to remove: ");
        String id = scanner.nextLine();
        if (library.remove(id) != null) 
        {
            System.out.println("Book removed successfully.");
        } 
        else 
        {
            System.out.println("Book not found.");
        }
    }

    static void checkBookExists() 
    {
        System.out.print("Enter Book ID to check: ");
        String id = scanner.nextLine();
        if (library.get(id) != null) 
        {
            System.out.println("Book exists in the library.");
        } 
        else 
        {
            System.out.println("Book does not exist.");
        }
    }
}

