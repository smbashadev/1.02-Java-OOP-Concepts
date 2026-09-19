// Program: Basic Constructor Overloading

// Declaring Employee class
class Employee {

    // Instance variables
    int employeeId;
    String employeeName;
    String department;

    // No-Argument Constructor
    // Initializes object with default values
    Employee() {

        employeeId = 1001;
        employeeName = "Not Assigned";
        department = "General";
    }

    // Parameterized Constructor
    // Initializes object with user-defined values
    Employee(int employeeId, String employeeName, String department) {

        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.department = department;
    }

    // Method to display employee details
    void displayEmployeeDetails() {

        System.out.println("Employee ID   : " + employeeId);
        System.out.println("Employee Name : " + employeeName);
        System.out.println("Department    : " + department);
        System.out.println();
    }
}

// Main class
public class BasicConstructorOverloading {

    // Main method
    public static void main(String[] args) {

        // Creating object using no-argument constructor
        Employee employee1 = new Employee();

        // Creating object using parameterized constructor
        Employee employee2 = new Employee(1002, "Rahul", "Software Development");

        // Displaying details of first employee
        System.out.println("Employee Created Using No-Argument Constructor");
        employee1.displayEmployeeDetails();

        // Displaying details of second employee
        System.out.println("Employee Created Using Parameterized Constructor");
        employee2.displayEmployeeDetails();
    }
}
