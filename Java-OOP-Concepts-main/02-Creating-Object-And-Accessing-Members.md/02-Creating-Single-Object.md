
# Definition

This program shows how to create an object of a class, store values in its variables,
print those values, and call its methods.

Java Program with comments on each step
```

// Demonstrates creating a single object and accessing its data members and methods.

public class CreatingSingleObject {

    public static void main(String[] args) {

        // Create a Student object
        Student student = new Student();

        // Assign values to data members
        student.name = "Apple";
        student.age = 18;
        student.gender = "Male";

        // Display student information
        System.out.println("Name   : " + student.name);
        System.out.println("Age    : " + student.age);
        System.out.println("Gender : " + student.gender);

        // Invoke student behaviors
        student.coming();
        student.eat();
        student.go();
    }
}

// Represents a student with basic attributes and behaviors.
class Student {

    String name;
    int age;
    String gender;

    public void coming() {
        System.out.println("Student is coming to school.");
    }

    public void eat() {
        System.out.println("Student is eating food.");
    }

    public void go() {
        System.out.println("Student is going home.");
    }
}

```

## Output:
Name: Apple
Age: 18
Gender: Male
Student is coming to school
Student is eating food
Student is going home

## Explanation

- `Student s = new Student();` creates a new object.
- `s.name`, `s.age`, and `s.gender` store the student's details.
- `System.out.println(...)` prints the values.
- The methods `comming()`, `eat()`, and `go()` display messages.

## Pseudocode

START
    create object s of Student
    set s.name = "Apple"
    print s.name
    set s.age = 18
    print s.age
    set s.gender = "Male"
    print s.gender
    call s.comming()
    call s.eat()
    call s.go()
END

## Code Explanation

- `public class StudentApp` is the main class.
- `main()` is the starting point of the program.
- `Student` is a user-defined class.
- Fields (`name`, `age`, `gender`) store data.
- Methods define actions.

## Important Points

- A class is a blueprint.
- An object is an instance of a class.
- `String` is used for text values.
- `int` is used for integer values.
- The method name `comming()` is spelled as written in the code.

## Summary

This program demonstrates object creation, data storage, printing values,
and calling methods in Java.


```
