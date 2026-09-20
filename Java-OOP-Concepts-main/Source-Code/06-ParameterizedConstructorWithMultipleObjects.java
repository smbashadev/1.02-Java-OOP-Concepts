// Program: Parameterized Constructor with Multiple Objects

// Declaring Product class
class Product {

    // Instance variables
    int productId;
    String productName;
    double productPrice;

    // Parameterized Constructor
    // Initializes object with values passed during object creation
    Product(int productId, String productName, double productPrice) {

        // Initializing instance variables using constructor parameters
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
    }

    // Method to display product details
    void displayProductDetails() {

        // Displaying product information
        System.out.println("Product ID    : " + productId);
        System.out.println("Product Name  : " + productName);
        System.out.println("Product Price : ₹" + productPrice);
        System.out.println();
    }
}

// Main class
public class ParameterizedConstructorWithMultipleObjects {

    // Main method
    public static void main(String[] args) {

        // Creating first Product object
        Product product1 = new Product(101, "Laptop", 65000.00);

        // Creating second Product object
        Product product2 = new Product(102, "Smartphone", 28000.00);

        // Creating third Product object
        Product product3 = new Product(103, "Wireless Headphones", 4500.00);

        // Displaying first product details
        product1.displayProductDetails();

        // Displaying second product details
        product2.displayProductDetails();

        // Displaying third product details
        product3.displayProductDetails();
    }
}
