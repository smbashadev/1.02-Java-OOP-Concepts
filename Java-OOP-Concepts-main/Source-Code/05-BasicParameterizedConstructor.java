// Program: Basic Parameterized Constructor

// Declaring Customer class
class Customer {

    // Instance variables
    int customerId;
    String customerName;
    String city;

    // Parameterized Constructor
    // Initializes object with values received as arguments
    Customer(int customerId, String customerName, String city) {

        // Initializing instance variables using constructor parameters
        this.customerId = customerId;
        this.customerName = customerName;
        this.city = city;
    }

    // Method to display customer details
    void displayCustomerDetails() {

        // Displaying customer information
        System.out.println("Customer ID   : " + customerId);
        System.out.println("Customer Name : " + customerName);
        System.out.println("City          : " + city);
    }
}

// Main class
public class BasicParameterizedConstructor {

    // Main method
    public static void main(String[] args) {

        // Creating Customer object using parameterized constructor
        Customer customer = new Customer(1001, "Ananya", "Hyderabad");

        // Calling method to display customer details
        customer.displayCustomerDetails();
    }
}
