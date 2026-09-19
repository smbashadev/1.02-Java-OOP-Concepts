// Program: Default Constructor

// Declaring Employee class
public class DefaultConstructor {

    // Instance variables
    int employeeId;
    String employeeName;
    String department;

    // Default Constructor
    DefaultConstructor() {

        // Initializing object data
        employeeId = 1001;
        employeeName = "Rahul";
        department = "Software Development";

        // Displaying constructor invocation message
        System.out.println("Default Constructor Executed Successfully");
    }

    // Method to display employee information
    void displayEmployeeDetails() {

        // Displaying employee details
        System.out.println("Employee ID   : " + employeeId);
        System.out.println("Employee Name : " + employeeName);
        System.out.println("Department    : " + department);
    }

    // Main method
    public static void main(String[] args) {

        // Creating object
        DefaultConstructor employee = new DefaultConstructor();

        // Calling method
        employee.displayEmployeeDetails();
    }
}
