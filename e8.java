package Day2Programs;
//class rectangle with instance variables length and width;
//imlement parametrized constructor and a copy constructor that initializes a new object
//using the values of an existing object. Print the values of the variables.

	class Rectangle 
	{
    double length;
    double width;

    
        Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
       // System.out.println("Parameterized constructor called.");
        printDimensions();
    }

    
         Rectangle(Rectangle r1) {
       length = r1.length;
        width = r1.width;
        //System.out.println("Copy constructor called.");
        printDimensions();
    }

   
    void printDimensions() {
        System.out.println("Length: " +length + ", Width: " +width);
    }
	}
    
    public class e8 {

    public static void main(String[] args) {
       
        Rectangle rect1 = new Rectangle(10.0, 5.0);

        
        Rectangle rect2 = new Rectangle(rect1);

        
        Rectangle rect3 = new Rectangle(7.0, 3.0);
    }
}




