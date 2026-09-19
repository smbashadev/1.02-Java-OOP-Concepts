// Program: Static Methods in Interface

// Interface containing abstract and static methods
interface Calculator {

    // Abstract method for addition
    void add();

    // Abstract method for subtraction
    void sub();

    // Static method for multiplication
    static void multiply() {

        // Declaring and initializing variables
        int a = 10;
        int b = 5;

        // Displaying multiplication result
        System.out.println("Multiplication : " + (a * b));
    }

    // Static method for division
    static void divide() {

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
public class StaticMethodsInInterface {

    // Main method
    public static void main(String[] args) {

        // Creating object of implementation class
        SimpleCalculator calculator = new SimpleCalculator();

        // Calling implemented abstract methods
        calculator.add();
        calculator.sub();

        // Calling static method using interface name
        Calculator.multiply();

        // Calling static method using interface name
        Calculator.divide();
    }
}
