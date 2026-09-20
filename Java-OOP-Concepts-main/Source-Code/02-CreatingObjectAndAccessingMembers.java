// Program: Creating Object and Accessing Members

// Declaring a class named CreatingObjectAndAccessingMembers
public class CreatingObjectAndAccessingMembers {

    // Instance variable to store student ID
    int studentId = 101;

    // Instance variable to store student name
    String studentName = "Mahaboob";

    // Instance variable to store student course
    String course = "Java Full Stack";

    // Method to display student information
    void displayStudentDetails() {

        // Printing student ID
        System.out.println("Student ID     : " + studentId);

        // Printing student name
        System.out.println("Student Name   : " + studentName);

        // Printing student course
        System.out.println("Course         : " + course);
    }

    // Main method - execution starts here
    public static void main(String[] args) {

        // Creating an object of CreatingObjectAndAccessingMembers class
        CreatingObjectAndAccessingMembers student = new CreatingObjectAndAccessingMembers();

        // Accessing instance variable using object
        System.out.println("Accessing Data Members:");
        System.out.println("Student ID     : " + student.studentId);
        System.out.println("Student Name   : " + student.studentName);
        System.out.println("Course         : " + student.course);

        // Printing a blank line for better readability
        System.out.println();

        // Accessing instance method using object
        System.out.println("Accessing Member Method:");
        student.displayStudentDetails();
    }
}
