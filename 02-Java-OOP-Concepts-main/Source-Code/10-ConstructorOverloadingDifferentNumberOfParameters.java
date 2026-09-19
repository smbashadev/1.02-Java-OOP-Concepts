// Program: Constructor Overloading with Different Number of Parameters

// Declaring Laptop class
class Laptop {

    // Instance variables
    int laptopId;
    String brand;
    double price;
    int ram;

    // Constructor 1
    // Accepts one parameter
    Laptop(int laptopId) {

        this.laptopId = laptopId;
        brand = "Unknown";
        price = 0.0;
        ram = 0;
    }

    // Constructor 2
    // Accepts two parameters
    Laptop(int laptopId, String brand) {

        this.laptopId = laptopId;
        this.brand = brand;
        price = 0.0;
        ram = 0;
    }

    // Constructor 3
    // Accepts three parameters
    Laptop(int laptopId, String brand, double price) {

        this.laptopId = laptopId;
        this.brand = brand;
        this.price = price;
        ram = 0;
    }

    // Constructor 4
    // Accepts four parameters
    Laptop(int laptopId, String brand, double price, int ram) {

        this.laptopId = laptopId;
        this.brand = brand;
        this.price = price;
        this.ram = ram;
    }

    // Method to display laptop details
    void displayLaptopDetails() {

        System.out.println("Laptop ID   : " + laptopId);
        System.out.println("Brand       : " + brand);
        System.out.println("Price       : ₹" + price);
        System.out.println("RAM         : " + ram + " GB");
        System.out.println();
    }
}

// Main class
public class ConstructorOverloadingDifferentNumberOfParameters {

    // Main method
    public static void main(String[] args) {

        // Creating object using constructor with one parameter
        Laptop laptop1 = new Laptop(101);

        // Creating object using constructor with two parameters
        Laptop laptop2 = new Laptop(102, "Dell");

        // Creating object using constructor with three parameters
        Laptop laptop3 = new Laptop(103, "HP", 68999.00);

        // Creating object using constructor with four parameters
        Laptop laptop4 = new Laptop(104, "Lenovo", 75999.00, 16);

        // Displaying laptop details
        laptop1.displayLaptopDetails();
        laptop2.displayLaptopDetails();
        laptop3.displayLaptopDetails();
        laptop4.displayLaptopDetails();
    }
}
