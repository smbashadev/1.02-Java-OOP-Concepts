// Program: Abstract Methods in Interface

// Interface containing abstract methods
interface Shape {

    // Abstract method to calculate area
    void area();

    // Abstract method to calculate perimeter
    void perimeter();
}

// Rectangle class implements Shape interface
class Rectangle implements Shape {

    // Implementing area() method
    @Override
    public void area() {

        // Declaring and initializing length and breadth
        int length = 10;
        int breadth = 5;

        // Calculating and displaying area
        System.out.println("Area of Rectangle : " + (length * breadth));
    }

    // Implementing perimeter() method
    @Override
    public void perimeter() {

        // Declaring and initializing length and breadth
        int length = 10;
        int breadth = 5;

        // Calculating and displaying perimeter
        System.out.println("Perimeter of Rectangle : " + (2 * (length + breadth)));
    }
}

// Circle class implements Shape interface
class Circle implements Shape {

    // Implementing area() method
    @Override
    public void area() {

        // Declaring and initializing radius
        double radius = 7;

        // Calculating and displaying area
        System.out.println("Area of Circle : " + (3.14 * radius * radius));
    }

    // Implementing perimeter() method
    @Override
    public void perimeter() {

        // Declaring and initializing radius
        double radius = 7;

        // Calculating and displaying circumference
        System.out.println("Perimeter of Circle : " + (2 * 3.14 * radius));
    }
}

// Main class
public class AbstractMethodsInInterface {

    // Main method
    public static void main(String[] args) {

        // Creating Rectangle object
        Rectangle rectangle = new Rectangle();

        // Calling Rectangle methods
        rectangle.area();
        rectangle.perimeter();

        // Displaying separator
        System.out.println();

        // Creating Circle object
        Circle circle = new Circle();

        // Calling Circle methods
        circle.area();
        circle.perimeter();
    }
}
