// Program: Creating Single Object

// Declaring a class named CreatingSingleObject
public class CreatingSingleObject {

    // Declaring instance variable to store student name
    String studentName = "John";

    // Declaring instance variable to store student age
    int studentAge = 21;

    // Method to display student details
    void displayDetails() {

        // Printing student name
        System.out.println("Student Name : " + studentName);

        // Printing student age
        System.out.println("Student Age  : " + studentAge);
    }

    // Main method - program execution starts here
    public static void main(String[] args) {

        // Creating a single object of CreatingSingleObject class
        CreatingSingleObject student = new CreatingSingleObject();

        // Calling displayDetails() method using the created object
        student.displayDetails();
    }
}
