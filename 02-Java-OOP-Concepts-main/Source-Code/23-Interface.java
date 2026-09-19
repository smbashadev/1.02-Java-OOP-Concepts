// Importing Scanner class for user input
import java.util.Scanner;

// Interface containing abstract methods
interface Calculator {

    // Abstract method for addition
    void add();

    // Abstract method for subtraction
    void sub();
}

// First implementation class
class Calculator1 implements Calculator {

    // Implementing add() method
    @Override
    public void add() {

        // Declaring and initializing variables
        int a = 10;
        int b = 5;

        // Displaying addition result
        System.out.println("Addition : " + (a + b));
    }

    // Implementing sub() method
    @Override
    public void sub() {

        // Declaring and initializing variables
        int x = 10;
        int y = 5;

        // Displaying subtraction result
        System.out.println("Subtraction : " + (x - y));
    }
}

// Second implementation class
class Calculator2 implements Calculator {

    // Implementing add() method
    @Override
    public void add() {

        // Declaring variables
        int a;
        int b;

        // Assigning values
        a = 20;
        b = 10;

        // Displaying addition result
        System.out.println("Addition : " + (a + b));
    }

    // Implementing sub() method
    @Override
    public void sub() {

        // Declaring variables
        int x;
        int y;

        // Assigning values
        x = 20;
        y = 10;

        // Displaying subtraction result
        System.out.println("Subtraction : " + (x - y));
    }
}

// Third implementation class
class Calculator3 implements Calculator {

    // Creating Scanner object
    Scanner scanner = new Scanner(System.in);

    // Implementing add() method
    @Override
    public void add() {

        // Accepting first number
        System.out.print("Enter First Number : ");
        int a = scanner.nextInt();

        // Accepting second number
        System.out.print("Enter Second Number : ");
        int b = scanner.nextInt();

        // Displaying addition result
        System.out.println("Addition : " + (a + b));
    }

    // Implementing sub() method
    @Override
    public void sub() {

        // Accepting first number
        System.out.print("Enter First Number : ");
        int x = scanner.nextInt();

        // Accepting second number
        System.out.print("Enter Second Number : ");
        int y = scanner.nextInt();

        // Displaying subtraction result
        System.out.println("Subtraction : " + (x - y));
    }
}

// Main class
public class Interface {

    // Main method
    public static void main(String[] args) {

        // Creating Calculator1 object
        Calculator1 calculator1 = new Calculator1();

        // Calling Calculator1 methods
        calculator1.add();
        calculator1.sub();

        // Displaying separator
        System.out.println();

        // Creating Calculator2 object
        Calculator2 calculator2 = new Calculator2();

        // Calling Calculator2 methods
        calculator2.add();
        calculator2.sub();

        // Displaying separator
        System.out.println();

        // Creating Calculator3 object
        Calculator3 calculator3 = new Calculator3();

        // Calling Calculator3 methods
        calculator3.add();
        calculator3.sub();
    }
}
