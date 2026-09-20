// Program: Default Methods in Interface

// Interface containing abstract and default methods
interface Calculator {

    // Abstract method for addition
    void add();

    // Abstract method for subtraction
    void sub();

    // Default method for multiplication
    default void multiply() {

        // Declaring and initializing variables
        int a = 10;
        int b = 5;

        // Displaying multiplication result
        System.out.println("Multiplication : " + (a * b));
    }

    // Default method for division
    default void divide() {

        // Declaring and initializing variables
        int a = 10;
        int b = 5;

        // Displaying division result
        System.out.println("Division : " + (a / b));
    }
}

// Calculator class implementing the interface
class SimpleCalculator implements Calculator {

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
        int a = 10;
        int b = 5;

        // Displaying subtraction result
        System.out.println("Subtraction : " + (a - b));
    }
}

// Main class
public class DefaultMethodsInInterface {

    // Main method
    public static void main(String[] args) {

        // Creating object of implementation class
        SimpleCalculator calculator = new SimpleCalculator();

        // Calling implemented abstract method
        calculator.add();

        // Calling implemented abstract method
        calculator.sub();

        // Calling inherited default method
        calculator.multiply();

        // Calling inherited default method
        calculator.divide();
    }
}
