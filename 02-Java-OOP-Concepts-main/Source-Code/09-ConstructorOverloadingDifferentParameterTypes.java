// Program: Constructor Overloading with Different Parameter Types

// Declaring Student class
class Student {

    // Instance variables
    int studentId;
    String studentName;
    double percentage;

    // Constructor 1
    // Accepts only student ID
    Student(int studentId) {

        this.studentId = studentId;
        studentName = "Not Available";
        percentage = 0.0;
    }

    // Constructor 2
    // Accepts student ID and student name
    Student(int studentId, String studentName) {

        this.studentId = studentId;
        this.studentName = studentName;
        percentage = 0.0;
    }

    // Constructor 3
    // Accepts student ID, student name, and percentage
    Student(int studentId, String studentName, double percentage) {

        this.studentId = studentId;
        this.studentName = studentName;
        this.percentage = percentage;
    }

    // Method to display student details
    void displayStudentDetails() {

        System.out.println("Student ID         : " + studentId);
        System.out.println("Student Name       : " + studentName);
        System.out.println("Percentage         : " + percentage + "%");
        System.out.println();
    }
}

// Main class
public class ConstructorOverloadingDifferentParameterTypes {

    // Main method
    public static void main(String[] args) {

        // Creating object using constructor with one parameter
        Student student1 = new Student(101);

        // Creating object using constructor with two parameters
        Student student2 = new Student(102, "Anjali");

        // Creating object using constructor with three parameters
        Student student3 = new Student(103, "Karthik", 91.8);

        // Displaying student details
        student1.displayStudentDetails();
        student2.displayStudentDetails();
        student3.displayStudentDetails();
    }
}
