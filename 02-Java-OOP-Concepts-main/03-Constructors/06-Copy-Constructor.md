# Copy Constructor in Java

## Definition

A **copy constructor** is a constructor that creates a new object by copying the values of another object of the same class.

### Why it is important
- It helps create a duplicate object with the same data
- It is useful when we want to preserve the state of one object into another
- It improves code clarity when copying object values

### How it helps Java
- Makes object duplication easier
- Helps avoid manually assigning values one by one
- Supports safe object initialization

---

# Program 1: Basic Copy Constructor Example

## Headline
Using a Copy Constructor to Duplicate an Object

## Why this program is used
This program is used to show how one object’s values can be copied into another object of the same class.

## How this helps Java
This helps learners understand:
- how a new object can be created from an existing object
- how object values are copied
- why copy constructors are useful

## Code with comments on every line
```java
class Student {                          // Line 1: Declares a class named Student
    String name;                         // Line 2: Declares a String variable name
    int age;                             // Line 3: Declares an int variable age

    Student(String n, int a) {           // Line 4: Declares a parameterized constructor
        name = n;                        // Line 5: Assigns value of n to name
        age = a;                         // Line 6: Assigns value of a to age
    }

    Student(Student s) {                  // Line 7: Declares a copy constructor
        name = s.name;                   // Line 8: Copies name from existing object
        age = s.age;                     // Line 9: Copies age from existing object
    }

    void display() {                      // Line 10: Declares method display
        System.out.println("Name: " + name);   // Line 11: Prints name
        System.out.println("Age: " + age);     // Line 12: Prints age
    }
}

public class Main {                      // Line 13: Declares public class Main
    public static void main(String[] args) {   // Line 14: Declares main method
        Student s1 = new Student("Alice", 20); // Line 15: Creates first object
        Student s2 = new Student(s1);           // Line 16: Creates second object by copying s1

        s1.display();                          // Line 17: Displays first object
        System.out.println();                 // Line 18: Prints blank line
        s2.display();                          // Line 19: Displays copied object
    }
}
```

## Explanation of every line
1. `class Student {`  
   Starts the Student class.

2. `String name;`  
   Declares a variable to store the student name.

3. `int age;`  
   Declares a variable to store the student age.

4. `Student(String n, int a) {`  
   Declares a constructor that accepts values.

5. `name = n;`  
   Assigns the passed name to the object field.

6. `age = a;`  
   Assigns the passed age to the object field.

7. `}`  
   Ends the constructor block.

8. `Student(Student s) {`  
   Declares the copy constructor.

9. `name = s.name;`  
   Copies the name from the existing object.

10. `age = s.age;`  
   Copies the age from the existing object.

11. `}`  
   Ends the copy constructor.

12. `void display() {`  
   Declares a method to print details.

13. `System.out.println("Name: " + name);`  
   Prints the name.

14. `System.out.println("Age: " + age);`  
   Prints the age.

15. `}`  
   Ends the display method.

16. `}`  
   Ends the Student class.

17. `public class Main {`  
   Starts the Main class.

18. `public static void main(String[] args) {`  
   Starts the main method.

19. `Student s1 = new Student("Alice", 20);`  
   Creates object `s1` with values.

20. `Student s2 = new Student(s1);`  
   Creates object `s2` by copying `s1`.

21. `s1.display();`  
   Displays the original object.

22. `System.out.println();`  
   Prints a blank line.

23. `s2.display();`  
   Displays the copied object.

24. `}`  
   Ends the main method.

25. `}`  
   Ends the Main class.

## Output
```text
Name: Alice
Age: 20

Name: Alice
Age: 20
```

## Pseudocode
```text
START
    CREATE class Student
    DECLARE name
    DECLARE age

    DEFINE constructor with n and a
        SET name = n
        SET age = a

    DEFINE copy constructor with object s
        SET name = s.name
        SET age = s.age

    DEFINE display method
        PRINT name
        PRINT age

    CREATE main method
        CREATE s1 using Student("Alice", 20)
        CREATE s2 using Student(s1)
        CALL s1.display()
        PRINT blank line
        CALL s2.display()
END
```

## Summary
This program shows how a copy constructor is used to create a new object with the same values as an existing object.

---

# Program 2: Copy Constructor with Different Objects

## Headline
Using Copy Constructor to Create Separate but Same-Value Objects

## Why this program is used
This program is used to show that two different objects can have identical values without sharing memory references.

## How this helps Java
This helps learners understand:
- how duplicate data is created
- how object values can be copied safely

## Code with comments on every line
```java
class Employee {                        // Line 1: Declares class Employee
    String name;                        // Line 2: Declares name variable
    int id;                             // Line 3: Declares id variable

    Employee(String n, int i) {         // Line 4: Declares parameterized constructor
        name = n;                        // Line 5: Assigns passed name
        id = i;                          // Line 6: Assigns passed id
    }

    Employee(Employee e) {               // Line 7: Declares copy constructor
        name = e.name;                   // Line 8: Copies name from object e
        id = e.id;                       // Line 9: Copies id from object e
    }

    void show() {                        // Line 10: Declares show method
        System.out.println("Name: " + name);   // Line 11: Prints name
        System.out.println("ID: " + id);       // Line 12: Prints id
    }
}

public class Main {                      // Line 13: Declares Main class
    public static void main(String[] args) {   // Line 14: Declares main method
        Employee e1 = new Employee("Raj", 101); // Line 15: Creates first object
        Employee e2 = new Employee(e1);         // Line 16: Creates second object by copy

        e1.show();                              // Line 17: Displays first object
        System.out.println();                 // Line 18: Prints blank line
        e2.show();                              // Line 19: Displays copied object
    }
}
```

## Output
```text
Name: Raj
ID: 101

Name: Raj
ID: 101
```

## Pseudocode
```text
START
    CREATE class Employee
    DECLARE name
    DECLARE id

    DEFINE constructor with n and i
        SET name = n
        SET id = i

    DEFINE copy constructor with object e
        SET name = e.name
        SET id = e.id

    DEFINE show method
        PRINT name
        PRINT id

    CREATE main method
        CREATE e1 using Employee("Raj", 101)
        CREATE e2 using Employee(e1)
        CALL e1.show()
        PRINT blank line
        CALL e2.show()
END
```

## Summary
This program shows how a copy constructor can create another object with the same content as an existing object.

---

# Program 3: Copy Constructor for Rectangle

## Headline
Using Copy Constructor to Duplicate Dimensions

## Why this program is used
This program is used to show how object values used for calculations can be copied safely.

## How this helps Java
This helps learners understand:
- how object fields are duplicated
- how calculations remain consistent for copied objects

## Code with comments on every line
```java
class Rectangle {                       // Line 1: Declares class Rectangle
    int length;                          // Line 2: Declares length variable
    int breadth;                         // Line 3: Declares breadth variable

    Rectangle(int l, int b) {            // Line 4: Declares constructor with parameters
        length = l;                      // Line 5: Assigns length
        breadth = b;                     // Line 6: Assigns breadth
    }

    Rectangle(Rectangle r) {             // Line 7: Declares copy constructor
        length = r.length;               // Line 8: Copies length
        breadth = r.breadth;             // Line 9: Copies breadth
    }

    void area() {                        // Line 10: Declares area method
        System.out.println("Area = " + (length * breadth));   // Line 11: Prints area
    }
}

public class Main {                      // Line 12: Declares Main class
    public static void main(String[] args) {   // Line 13: Declares main method
        Rectangle r1 = new Rectangle(6, 4);     // Line 14: Creates first object
        Rectangle r2 = new Rectangle(r1);       // Line 15: Creates copied object

        r1.area();                              // Line 16: Displays area of r1
        System.out.println();                 // Line 17: Prints blank line
        r2.area();                              // Line 18: Displays area of r2
    }
}
```

## Output
```text
Area = 24

Area = 24
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

    DEFINE copy constructor with object r
        SET length = r.length
        SET breadth = r.breadth

    DEFINE area method
        PRINT length * breadth

    CREATE main method
        CREATE r1 using Rectangle(6, 4)
        CREATE r2 using Rectangle(r1)
        CALL r1.area()
        PRINT blank line
        CALL r2.area()
END
```

## Summary
This program shows how a copy constructor helps duplicate object data used for calculation.

---

# Professional Summary

A **copy constructor** is a constructor that creates a new object by copying values from another object of the same class.

## Benefits
- Makes object duplication simple
- Preserves the state of another object
- Helps avoid repetitive code
- Useful in object-based programming

## Key idea
A copy constructor is used when you want one object to be created with the same values as another object.

---

# Final Revision Note

```text
A copy constructor is a constructor that creates a new object by copying the values of an existing object of the same class.
```

---
