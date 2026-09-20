# Constructor Overloading in Java

## Definition

**Constructor overloading** means creating **more than one constructor** in the same class with different parameter lists.

### Why it is important
- It allows one class to be initialized in different ways
- It improves flexibility and code reusability
- It helps create objects using different data combinations

### How it helps Java
- Makes programs more flexible
- Allows different object initialization styles
- Supports cleaner and professional code design

---

# Program 1: Basic Constructor Overloading

## Headline
Using Multiple Constructors in the Same Class

## Why this program is used
This program is used to show how one class can have more than one constructor, each with different parameters.

## How this helps Java
This helps learners understand:
- how constructors can be overloaded
- how Java chooses the correct constructor based on arguments
- how objects can be created in different ways

## Code with comments on every line
```java
class Student {                          // Line 1: Declares a class named Student
    String name;                         // Line 2: Declares a String variable name
    int age;                             // Line 3: Declares an int variable age

    Student() {                           // Line 4: Declares first constructor with no parameters
        name = "Unknown";                // Line 5: Assigns default name
        age = 0;                         // Line 6: Assigns default age
    }

    Student(String n, int a) {           // Line 7: Declares second constructor with parameters
        name = n;                        // Line 8: Assigns passed name
        age = a;                         // Line 9: Assigns passed age
    }

    void display() {                      // Line 10: Declares method display
        System.out.println("Name: " + name);   // Line 11: Prints the name
        System.out.println("Age: " + age);     // Line 12: Prints the age
    }
}

public class Main {                      // Line 13: Declares the public class Main
    public static void main(String[] args) {   // Line 14: Declares the main method
        Student s1 = new Student();            // Line 15: Creates object using no-argument constructor
        Student s2 = new Student("Alice", 20); // Line 16: Creates object using parameterized constructor

        s1.display();                          // Line 17: Displays details of s1
        System.out.println();                 // Line 18: Prints a blank line
        s2.display();                          // Line 19: Displays details of s2
    }
}
```

## Explanation of every line
1. `class Student {`  
   Starts the Student class.

2. `String name;`  
   Declares a variable to store the student’s name.

3. `int age;`  
   Declares a variable to store the student’s age.

4. `Student() {`  
   Defines the first constructor with no parameters.

5. `name = "Unknown";`  
   Assigns a default name.

6. `age = 0;`  
   Assigns a default age.

7. `}`  
   Ends the first constructor.

8. `Student(String n, int a) {`  
   Defines the second constructor with parameters.

9. `name = n;`  
   Copies the passed name into the field.

10. `age = a;`  
   Copies the passed age into the field.

11. `}`  
   Ends the second constructor.

12. `void display() {`  
   Declares a method to print the values.

13. `System.out.println("Name: " + name);`  
   Prints the value of name.

14. `System.out.println("Age: " + age);`  
   Prints the value of age.

15. `}`  
   Ends the display method.

16. `}`  
   Ends the Student class.

17. `public class Main {`  
   Starts the Main class.

18. `public static void main(String[] args) {`  
   Declares the main method.

19. `Student s1 = new Student();`  
   Creates an object using the no-argument constructor.

20. `Student s2 = new Student("Alice", 20);`  
   Creates an object using the parameterized constructor.

21. `s1.display();`  
   Calls display for object `s1`.

22. `System.out.println();`  
   Prints a blank line.

23. `s2.display();`  
   Calls display for object `s2`.

24. `}`  
   Ends the main method.

25. `}`  
   Ends the Main class.

## Output
```text
Name: Unknown
Age: 0

Name: Alice
Age: 20
```

## Pseudocode
```text
START
    CREATE class Student
    DECLARE name
    DECLARE age

    DEFINE constructor 1 with no parameters
        SET name = "Unknown"
        SET age = 0

    DEFINE constructor 2 with parameters n and a
        SET name = n
        SET age = a

    DEFINE display method
        PRINT name
        PRINT age

    CREATE main method
        CREATE s1 using Student()
        CREATE s2 using Student("Alice", 20)
        CALL s1.display()
        PRINT blank line
        CALL s2.display()
END
```

## Summary
This program shows that constructor overloading allows one class to have multiple constructors for different initialization needs.

---

# Program 2: Constructor Overloading with Different Parameter Types

## Headline
Overloading Constructors Using Different Argument Types

## Why this program is used
This program is used to show how Java identifies the correct constructor based on the type and number of arguments passed.

## How this helps Java
This helps learners understand:
- how method resolution works with constructors
- how overloaded constructors improve flexibility

## Code with comments on every line
```java
class Box {                              // Line 1: Declares a class named Box
    int x;                               // Line 2: Declares integer variable x
    double y;                            // Line 3: Declares double variable y

    Box(int a) {                         // Line 4: Constructor with one int parameter
        x = a;                           // Line 5: Assigns integer value
        y = 0.0;                         // Line 6: Assigns default double value
    }

    Box(double b) {                      // Line 7: Constructor with one double parameter
        x = 0;                           // Line 8: Assigns default int value
        y = b;                           // Line 9: Assigns double value
    }

    void display() {                      // Line 10: Declares display method
        System.out.println("x = " + x);   // Line 11: Prints x
        System.out.println("y = " + y);   // Line 12: Prints y
    }
}

public class Main {                      // Line 13: Declares Main class
    public static void main(String[] args) {   // Line 14: Declares main method
        Box b1 = new Box(5);                   // Line 15: Calls constructor with int
        Box b2 = new Box(5.5);                 // Line 16: Calls constructor with double

        b1.display();                          // Line 17: Displays b1 values
        System.out.println();                 // Line 18: Prints blank line
        b2.display();                          // Line 19: Displays b2 values
    }
}
```

## Output
```text
x = 5
y = 0.0

x = 0
y = 5.5
```

## Pseudocode
```text
START
    CREATE class Box
    DECLARE x
    DECLARE y

    DEFINE constructor with int a
        SET x = a
        SET y = 0.0

    DEFINE constructor with double b
        SET x = 0
        SET y = b

    DEFINE display method
        PRINT x
        PRINT y

    CREATE main method
        CREATE b1 using Box(5)
        CREATE b2 using Box(5.5)
        CALL b1.display()
        PRINT blank line
        CALL b2.display()
END
```

## Summary
This program shows that constructors can be overloaded based on data type, allowing different initialization behaviors.

---

# Program 3: Constructor Overloading with Different Number of Parameters

## Headline
Using Constructors with Different Numbers of Arguments

## Why this program is used
This program is used to show how constructors can be overloaded by changing the number of parameters.

## How this helps Java
This helps learners understand:
- how Java decides which constructor to call
- how flexible initialization can be done with different input sizes

## Code with comments on every line
```java
class Circle {                           // Line 1: Declares class Circle
    double radius;                       // Line 2: Declares radius variable

    Circle() {                            // Line 3: Constructor with no arguments
        radius = 1.0;                     // Line 4: Assigns default radius
    }

    Circle(double r) {                    // Line 5: Constructor with one argument
        radius = r;                       // Line 6: Assigns passed radius
    }

    void display() {                      // Line 7: Declares display method
        System.out.println("Radius = " + radius);   // Line 8: Prints radius
    }
}

public class Main {                      // Line 9: Declares Main class
    public static void main(String[] args) {   // Line 10: Declares main method
        Circle c1 = new Circle();              // Line 11: Creates object using no-argument constructor
        Circle c2 = new Circle(3.5);           // Line 12: Creates object using one-argument constructor

        c1.display();                          // Line 13: Displays c1
        System.out.println();                 // Line 14: Prints blank line
        c2.display();                          // Line 15: Displays c2
    }
}
```

## Output
```text
Radius = 1.0

Radius = 3.5
```

## Pseudocode
```text
START
    CREATE class Circle
    DECLARE radius

    DEFINE constructor with no parameters
        SET radius = 1.0

    DEFINE constructor with one parameter r
        SET radius = r

    DEFINE display method
        PRINT radius

    CREATE main method
        CREATE c1 using Circle()
        CREATE c2 using Circle(3.5)
        CALL c1.display()
        PRINT blank line
        CALL c2.display()
END
```

## Summary
This program shows that overloaded constructors can differ by the number of arguments they accept.

---

# Professional Summary

**Constructor overloading** is the technique of defining multiple constructors in the same class with different parameter lists.

## Benefits
- Allows different object initialization styles
- Improves flexibility
- Makes programs cleaner and easier to maintain
- Helps choose constructor based on given values

## Main idea
If the class needs to be created in more than one way, constructor overloading is very useful.

---

# Final Revision Note

```text
Constructor overloading means having multiple constructors in one class with different parameter lists, so Java can choose the appropriate one during object creation.
```

---
