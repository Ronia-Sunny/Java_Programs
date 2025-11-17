package Day4Programs;

class myexception extends Exception {
    public myexception(String message) {
        super(message);
    }
}

public class p7_customexception {
    public static void main(String[] args) {
        int a = -10;
        try {
            if (a < 0) {
                throw new myexception("A can't be negative");
            } else {
                System.out.println("A is valid");
            }
        } catch (myexception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Rest of the code");
    }
}

