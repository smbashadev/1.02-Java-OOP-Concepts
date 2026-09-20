// Program: Parameterized Constructor - Rectangle

// Declaring Rectangle class
class Rectangle {

    // Instance variables
    double length;
    double width;

    // Parameterized Constructor
    // Initializes the rectangle dimensions
    Rectangle(double length, double width) {

        // Initializing instance variables using constructor parameters
        this.length = length;
        this.width = width;
    }

    // Method to calculate rectangle area
    double calculateArea() {

        // Returning the calculated area
        return length * width;
    }

    // Method to display rectangle details
    void displayRectangleDetails() {

        // Displaying rectangle dimensions
        System.out.println("Length          : " + length);
        System.out.println("Width           : " + width);

        // Displaying calculated area
        System.out.println("Area            : " + calculateArea());
    }
}

// Main class
public class ParameterizedConstructorRectangle {

    // Main method
    public static void main(String[] args) {

        // Creating Rectangle object using parameterized constructor
        Rectangle rectangle = new Rectangle(12.5, 8.0);

        // Calling method to display rectangle details
        rectangle.displayRectangleDetails();
    }
}
