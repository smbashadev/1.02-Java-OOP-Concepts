// Program: Compile-Time Polymorphism

// Calculator class
class Calculator {

    // Method with two integer parameters
    public void add(int a, int b) {
        System.out.println("Addition of Integers : " + (a + b));
    }

    // Overloaded method with three integer parameters
    public void add(int a, int b, int c) {
        System.out.println("Addition of Three Integers : " + (a + b + c));
    }

    // Overloaded method with two double parameters
    public void add(double a, double b) {
        System.out.println("Addition of Double Values : " + (a + b));
    }
}

// Main class
public class CompileTimePolymorphism {

    // Main method
    public static void main(String[] args) {

        // Creating Calculator object
        Calculator calculator = new Calculator();

        // Calling overloaded methods
        calculator.add(10, 20);
        calculator.add(10, 20, 30);
        calculator.add(10.5, 20.5);
    }
}
