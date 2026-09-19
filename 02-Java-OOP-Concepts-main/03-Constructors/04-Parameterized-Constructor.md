# Parameterized Constructor:

# Parameterized Constructor in Java

## Definition

A **parameterized constructor** is a constructor that accepts one or more values (parameters) while creating an object.  
These values are used to initialize the object immediately.

### Why it is important
- It allows us to create objects with different values
- It avoids manually assigning values after object creation
- It makes real-world programming easier

### How it helps Java
- Makes code more flexible
- Reduces repeated assignment work
- Improves readability and professional coding style

---

# Program 1: Basic Parameterized Constructor

## Headline
Using a Parameterized Constructor to Initialize Object Values

## Why this program is used
This program is used to show how values are passed into the constructor when an object is created.

## How this helps Java
This helps you understand:
- how constructor parameters work
- how an object can be initialized with user-provided values
- how code becomes simpler and cleaner

## Code with comments on every line
```java
class Student {                          // Line 1: Declares a class named Student
    String name;                         // Line 2: Declares a String variable name
    int age;                             // Line 3: Declares an int variable age

    Student(String n, int a) {           // Line 4: Declares a constructor with two parameters
        name = n;                        // Line 5: Copies the passed value of n into name
        age = a;                         // Line 6: Copies the passed value of a into age
    }

    void display() {                      // Line 7: Declares a method named display
        System.out.println("Name: " + name);   // Line 8: Prints the name
        System.out.println("Age: " + age);     // Line 9: Prints the age
    }
}

public class Main {                      // Line 10: Declares the public class Main
    public static void main(String[] args) {   // Line 11: Declares the main method
        Student s1 = new Student("Alice", 20); // Line 12: Creates object and passes values
        s1.display();                          // Line 13: Calls display method
    }
}
```

## Explanation of every line
1. `class Student {`  
   This starts the class definition.

2. `String name;`  
   This creates a variable named `name` that will store the student’s name.

3. `int age;`  
   This creates a variable named `age` that will store the student’s age.

4. `Student(String n, int a) {`  
   This defines a constructor that accepts two parameters: `n` and `a`.

5. `name = n;`  
   This assigns the value from parameter `n` into the field `name`.

6. `age = a;`  
   This assigns the value from parameter `a` into the field `age`.

7. `}`  
   This closes the constructor block.

8. `void display() {`  
   This declares a method that will display the values.

9. `System.out.println("Name: " + name);`  
   This prints the `name` value to the screen.

10. `System.out.println("Age: " + age);`  
   This prints the `age` value to the screen.

11. `}`  
   This closes the `display()` method.

12. `}`  
   This closes the `Student` class.

13. `public class Main {`  
   This starts the `Main` class.

14. `public static void main(String[] args) {`  
   This defines the entry point of the program.

15. `Student s1 = new Student("Alice", 20);`  
   This creates an object `s1` and passes `"Alice"` and `20` to the constructor.

16. `s1.display();`  
   This calls the method to print the values.

17. `}`  
   This closes the `main()` method.

18. `}`  
   This closes the `Main` class.

## Output
```text
Name: Alice
Age: 20
```

## Pseudocode
```text
START
    CREATE class Student
    DECLARE name
    DECLARE age

    DEFINE constructor with parameters n and a
        SET name = n
        SET age = a

    DEFINE display method
        PRINT name
        PRINT age

    CREATE main method
        CREATE object s1 using Student("Alice", 20)
        CALL display
END
```

## Summary
This program shows that a parameterized constructor lets us initialize object values directly while creating the object.

---

# Program 2: Parameterized Constructor with Two Different Objects

## Headline
Creating Multiple Objects Using One Parameterized Constructor

## Why this program is used
This program is used to show that one constructor can be used to create different objects with different values.

## How this helps Java
This helps learners understand:
- object flexibility
- how different instances can store different data
- how constructors improve code reuse

## Code with comments on every line
```java
class Person {                          // Line 1: Declares a class named Person
    String name;                         // Line 2: Declares a variable to store name
    int age;                             // Line 3: Declares a variable to store age

    Person(String n, int a) {            // Line 4: Declares a constructor with parameters
        name = n;                        // Line 5: Assigns name value
        age = a;                         // Line 6: Assigns age value
    }

    void show() {                        // Line 7: Declares a method named show
        System.out.println("Name: " + name);   // Line 8: Prints the name
        System.out.println("Age: " + age);     // Line 9: Prints the age
    }
}

public class Main {                      // Line 10: Declares the main class
    public static void main(String[] args) {   // Line 11: Starts the main method
        Person p1 = new Person("Rahul", 21);   // Line 12: Creates first object
        Person p2 = new Person("Meera", 19);   // Line 13: Creates second object

        p1.show();                             // Line 14: Calls show for p1
        System.out.println();                 // Line 15: Prints a blank line
        p2.show();                             // Line 16: Calls show for p2
    }
}
```

## Explanation of every line
1. `class Person {`  
   Starts the Person class.

2. `String name;`  
   Declares the name field.

3. `int age;`  
   Declares the age field.

4. `Person(String n, int a) {`  
   Declares a parameterized constructor.

5. `name = n;`  
   Stores the value of `n` into `name`.

6. `age = a;`  
   Stores the value of `a` into `age`.

7. `}`  
   Closes the constructor.

8. `void show() {`  
   Declares the method to display the values.

9. `System.out.println("Name: " + name);`  
   Prints the name.

10. `System.out.println("Age: " + age);`  
   Prints the age.

11. `}`  
   Closes the method.

12. `}`  
   Closes the class.

13. `public class Main {`  
   Starts the main class.

14. `public static void main(String[] args) {`  
   Starts the main method.

15. `Person p1 = new Person("Rahul", 21);`  
   Creates object `p1` with values Rahul and 21.

16. `Person p2 = new Person("Meera", 19);`  
   Creates object `p2` with values Meera and 19.

17. `p1.show();`  
   Calls the method to print the first object values.

18. `System.out.println();`  
   Prints a blank line for readability.

19. `p2.show();`  
   Calls the method to print the second object values.

20. `}`  
   Closes the main method.

21. `}`  
   Closes the Main class.

## Output
```text
Name: Rahul
Age: 21

Name: Meera
Age: 19
```

## Pseudocode
```text
START
    CREATE class Person
    DECLARE name
    DECLARE age

    DEFINE constructor with n and a
        SET name = n
        SET age = a

    DEFINE show method
        PRINT name
        PRINT age

    CREATE main method
        CREATE p1 using Person("Rahul", 21)
        CREATE p2 using Person("Meera", 19)
        CALL p1.show()
        PRINT blank line
        CALL p2.show()
END
```

## Summary
This program shows that one parameterized constructor can be used to create different objects with different data.

---

# Program 3: Parameterized Constructor for Rectangle

## Headline
Using a Parameterized Constructor to Perform Calculations

## Why this program is used
This program is used to show how constructor parameters can help calculate values in a class.

## How this helps Java
This helps learners understand:
- how constructor values can be used for logic
- how real-world calculations are performed using objects

## Code with comments on every line
```java
class Rectangle {                       // Line 1: Declares class Rectangle
    int length;                          // Line 2: Declares length variable
    int breadth;                         // Line 3: Declares breadth variable

    Rectangle(int l, int b) {            // Line 4: Declares constructor with two parameters
        length = l;                      // Line 5: Assigns passed length
        breadth = b;                     // Line 6: Assigns passed breadth
    }

    void area() {                        // Line 7: Declares method area
        System.out.println("Area = " + (length * breadth));   // Line 8: Prints area
    }
}

public class Main {                      // Line 9: Declares public class Main
    public static void main(String[] args) {   // Line 10: Declares main method
        Rectangle r1 = new Rectangle(5, 4);     // Line 11: Creates object with values
        r1.area();                              // Line 12: Calls area method
    }
}
```

## Explanation of every line
1. `class Rectangle {`  
   Starts the Rectangle class.

2. `int length;`  
   Declares the length field.

3. `int breadth;`  
   Declares the breadth field.

4. `Rectangle(int l, int b) {`  
   Defines a constructor with two parameters.

5. `length = l;`  
   Stores the first parameter into `length`.

6. `breadth = b;`  
   Stores the second parameter into `breadth`.

7. `}`  
   Ends the constructor.

8. `void area() {`  
   Declares a method to calculate area.

9. `System.out.println("Area = " + (length * breadth));`  
   Prints the product of length and breadth.

10. `}`  
   Closes the area method.

11. `}`  
   Closes the class.

12. `public class Main {`  
   Starts the Main class.

13. `public static void main(String[] args) {`  
   Starts the main method.

14. `Rectangle r1 = new Rectangle(5, 4);`  
   Creates object `r1` with values `5` and `4`.

15. `r1.area();`  
   Calls the method to print the area.

16. `}`  
   Ends the main method.

17. `}`  
   Ends the Main class.

## Output
```text
Area = 20
```

## Pseudocode
```text
START
    CREATE class Rectangle
    DECLARE length
    DECLARE breadth

    DEFINE constructor with l and b
        SET length = l
        SET breadth = b

    DEFINE area method
        PRINT length * breadth

    CREATE main method
        CREATE object r1 using Rectangle(5, 4)
        CALL r1.area()
END
```

## Summary
This program shows that a parameterized constructor can initialize values that are used in calculations.

---

# Professional Final Summary

A **parameterized constructor** is used when we want to pass values while creating an object.  
It is one of the most important concepts in Java because it makes objects more useful and realistic.

## Main benefits
- Accepts values during object creation
- Reduces manual initialization
- Helps create different object states
- Improves code quality and readability

## Short definition
A parameterized constructor is a constructor that takes arguments to initialize an object with specific values.

---
