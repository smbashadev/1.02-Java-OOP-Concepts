# Default Constructor in Java

## 1. Definition

A **default constructor** is a constructor that has **no parameters**.  
It is automatically called when an object is created using `new ClassName()`.

### Why it is important
- It helps initialize object fields
- It gives object variables a starting value
- It is useful when we want to create an object with standard/default values

### How it helps Java programming
- Reduces the chance of uninitialized values
- Makes code cleaner and easier to understand
- Helps beginners understand object creation and initialization

---

# 2. Important Characteristics of a Default Constructor

- Same name as the class
- No return type
- No parameters
- Called automatically during object creation
- If you do not write any constructor, Java creates one implicitly

---

# 3. Program 1 — Basic Default Constructor Example

## Program Headline
**Using a Default Constructor to Initialize Object Values**

## Why this program is used
This program shows the simplest use of a default constructor.  
It helps beginners understand how object variables receive initial values.

## How this helps Java
This program teaches:
- how constructors are written
- how constructors are called automatically
- how objects are initialized

## Full Program with comments on every line

```java
class Student { // Declares a class named Student
    String name; // Declares a String variable named name
    int age; // Declares an int variable named age

    Student() { // Declares a default constructor with no parameters
        name = "Unknown"; // Assigns the default value Unknown to name
        age = 0; // Assigns the default value 0 to age
    }

    void display() { // Declares a method named display
        System.out.println("Name: " + name); // Prints the value of name
        System.out.println("Age: " + age); // Prints the value of age
    }
}

public class Main { // Declares the public class Main
    public static void main(String[] args) { // Declares the main method
        Student s1 = new Student(); // Creates an object of Student using the default constructor
        s1.display(); // Calls the display method using object s1
    }
}
```

## Pseudocode

```text
START
    CREATE class Student
    DECLARE name
    DECLARE age

    DEFINE default constructor
        SET name = "Unknown"
        SET age = 0

    DEFINE display method
        PRINT name
        PRINT age

    CREATE main method
        CREATE object s1 using new Student()
        CALL s1.display()
END
```

## Explanation of every line

1. `class Student {`  
   - Starts the class definition for Student.

2. `String name;`  
   - Declares a variable to store the student’s name.

3. `int age;`  
   - Declares a variable to store the student’s age.

4. `Student() {`  
   - Defines the constructor of the Student class.

5. `name = "Unknown";`  
   - Sets the default name value.

6. `age = 0;`  
   - Sets the default age value.

7. `}`  
   - Ends the constructor block.

8. `void display() {`  
   - Starts a method that prints values.

9. `System.out.println("Name: " + name);`  
   - Prints the name stored in the object.

10. `System.out.println("Age: " + age);`  
   - Prints the age stored in the object.

11. `}`  
   - Ends the display method.

12. `}`  
   - Ends the Student class.

13. `public class Main {`  
   - Starts another class named Main.

14. `public static void main(String[] args) {`  
   - Declares the main method where program execution begins.

15. `Student s1 = new Student();`  
   - Creates an object s1 using the default constructor.

16. `s1.display();`  
   - Calls the display method on s1.

17. `}`  
   - Ends the main method.

18. `}`  
   - Ends the Main class.

## Output

```text
Name: Unknown
Age: 0
```

## Summary

This program shows that a default constructor can initialize object variables automatically when the object is created.

---

# 4. Program 2 — Java Automatically Provides Default Constructor

## Program Headline
**Understanding Java’s Implicit Default Constructor**

## Why this program is used
This program is used to show what happens when you do not write any constructor in a class.

## How this helps Java
It teaches:
- that Java automatically provides a constructor
- that fields get default values if not initialized

## Full Program with comments on every line

```java
class Car { // Declares a class named Car
    String brand; // Declares a String variable brand
    int speed; // Declares an int variable speed

    void show() { // Declares a method named show
        System.out.println("Brand: " + brand); // Prints the value of brand
        System.out.println("Speed: " + speed); // Prints the value of speed
    }
}

public class Main { // Declares the public class Main
    public static void main(String[] args) { // Declares the main method
        Car c1 = new Car(); // Creates an object of Car using Java-provided default constructor
        c1.show(); // Calls the show method
    }
}
```

## Pseudocode

```text
START
    CREATE class Car
    DECLARE brand
    DECLARE speed

    DEFINE show method
        PRINT brand
        PRINT speed

    CREATE main method
        CREATE object c1 using new Car()
        CALL c1.show()
END
```

## Explanation of every line

1. `class Car {`  
   - Starts the Car class.

2. `String brand;`  
   - Declares a variable to store brand name.

3. `int speed;`  
   - Declares a variable to store speed.

4. `void show() {`  
   - Defines a method to display values.

5. `System.out.println("Brand: " + brand);`  
   - Prints the brand value.

6. `System.out.println("Speed: " + speed);`  
   - Prints the speed value.

7. `}`  
   - Ends the show method.

8. `}`  
   - Ends the Car class.

9. `public class Main {`  
   - Starts the Main class.

10. `public static void main(String[] args) {`  
   - Declares the main method.

11. `Car c1 = new Car();`  
   - Creates object c1 using the default constructor.

12. `c1.show();`  
   - Calls show to print the values.

13. `}`  
   - Ends the main method.

14. `}`  
   - Ends the Main class.

## Output

```text
Brand: null
Speed: 0
```

## Summary

This program shows that if no constructor is written, Java provides one automatically and assigns default values.

---

# 5. Program 3 — User-Defined Default Constructor

## Program Headline
**Creating a Custom Default Constructor**

## Why this program is used
This program shows how a programmer can define a default constructor manually to initialize values.

## How this helps Java
It helps developers understand:
- how to control object initialization
- how to set meaningful values at object creation time

## Full Program with comments on every line

```java
class Box { // Declares a class named Box
    int l; // Declares an int variable l
    int b; // Declares an int variable b

    Box() { // Declares a user-defined default constructor
        l = 10; // Assigns value 10 to l
        b = 20; // Assigns value 20 to b
    }

    void printArea() { // Declares a method printArea
        System.out.println("Area = " + (l * b)); // Prints the area using l and b
    }
}

public class Main { // Declares the public class Main
    public static void main(String[] args) { // Declares the main method
        Box b1 = new Box(); // Creates object b1 using the default constructor
        b1.printArea(); // Calls printArea method
    }
}
```

## Pseudocode

```text
START
    CREATE class Box
    DECLARE l
    DECLARE b

    DEFINE default constructor
        SET l = 10
        SET b = 20

    DEFINE printArea method
        PRINT l * b

    CREATE main method
        CREATE object b1
        CALL b1.printArea()
END
```

## Explanation of every line

1. `class Box {`  
   - Begins the Box class.

2. `int l;`  
   - Declares variable l.

3. `int b;`  
   - Declares variable b.

4. `Box() {`  
   - Defines the default constructor.

5. `l = 10;`  
   - Assigns initial length.

6. `b = 20;`  
   - Assigns initial breadth.

7. `}`  
   - Ends constructor.

8. `void printArea() {`  
   - Begins method to calculate area.

9. `System.out.println("Area = " + (l * b));`  
   - Prints area.

10. `}`  
   - Ends method.

11. `}`  
   - Ends class Box.

12. `public class Main {`  
   - Declares Main class.

13. `public static void main(String[] args) {`  
   - Begins main method.

14. `Box b1 = new Box();`  
   - Creates object b1.

15. `b1.printArea();`  
   - Calls the method.

16. `}`  
   - Ends main method.

17. `}`  
   - Ends Main class.

## Output

```text
Area = 200
```

## Summary

This program shows how a custom default constructor can initialize values in a meaningful way.

---

# 6. Program 4 — Multiple Objects Using the Same Default Constructor

## Program Headline
**Using Default Constructor for Multiple Objects**

## Why this program is used
This program demonstrates that the same constructor can initialize many objects.

## How this helps Java
It teaches:
- object creation multiple times
- constructor reuse
- same initial values across different objects

## Full Program with comments on every line

```java
class Employee { // Declares a class named Employee
    String name; // Declares a String variable name
    int id; // Declares an int variable id

    Employee() { // Declares a default constructor
        name = "Not Assigned"; // Assigns default name
        id = 0; // Assigns default id
    }

    void display() { // Declares a display method
        System.out.println("Name: " + name); // Prints the name
        System.out.println("ID: " + id); // Prints the id
    }
}

public class Main { // Declares the Main class
    public static void main(String[] args) { // Declares main method
        Employee e1 = new Employee(); // Creates first Employee object
        Employee e2 = new Employee(); // Creates second Employee object

        System.out.println("Employee 1"); // Prints label for first object
        e1.display(); // Calls display for first object

        System.out.println("Employee 2"); // Prints label for second object
        e2.display(); // Calls display for second object
    }
}
```

## Pseudocode

```text
START
    CREATE class Employee
    DECLARE name
    DECLARE id

    DEFINE default constructor
        SET name = "Not Assigned"
        SET id = 0

    DEFINE display method
        PRINT name
        PRINT id

    CREATE main method
        CREATE e1 using Employee()
        CREATE e2 using Employee()

        PRINT Employee 1
        CALL e1.display()

        PRINT Employee 2
        CALL e2.display()
END
```

## Explanation of every line

1. `class Employee {`  
   - Begins Employee class.

2. `String name;`  
   - Declares name variable.

3. `int id;`  
   - Declares id variable.

4. `Employee() {`  
   - Defines default constructor.

5. `name = "Not Assigned";`  
   - Assigns default value.

6. `id = 0;`  
   - Assigns default id.

7. `}`  
   - Closes constructor.

8. `void display() {`  
   - Begins display method.

9. `System.out.println("Name: " + name);`  
   - Prints the employee name.

10. `System.out.println("ID: " + id);`  
   - Prints the employee id.

11. `}`  
   - Closes display method.

12. `}`  
   - Closes class.

13. `public class Main {`  
   - Begins Main class.

14. `public static void main(String[] args) {`  
   - Begins main function.

15. `Employee e1 = new Employee();`  
   - Creates first object.

16. `Employee e2 = new Employee();`  
   - Creates second object.

17. `System.out.println("Employee 1");`  
   - Prints label.

18. `e1.display();`  
   - Prints first object details.

19. `System.out.println("Employee 2");`  
   - Prints label.

20. `e2.display();`  
   - Prints second object details.

21. `}`  
   - Closes main.

22. `}`  
   - Closes Main class.

## Output

```text
Employee 1
Name: Not Assigned
ID: 0

Employee 2
Name: Not Assigned
ID: 0
```

## Summary

This program shows how one default constructor can be used to initialize multiple objects in the same way.

---

# 7. Short Professional Summary

## Definition
A default constructor is a constructor with **no arguments** used to initialize an object.

## Main purpose
It ensures that objects start with valid values.

## Best use cases
- When you want to give default values
- When you want a simple object creation process
- When you want to teach object initialization clearly

## Key point
If you do not create any constructor, Java creates one for you automatically.

---

# 8. Final Repository-Style Note

```text
Default Constructor:
- same name as class
- no parameters
- no return type
- called automatically
- initializes object fields
- helps create clean and safe objects
```

---

If you want, I can now do **one more advanced version** for your GitHub repository where I will provide:

- a **full markdown file format**
- **exam-style notes**
- **diagram-based explanation**
- **real-world Java examples**
- **short revision notes**
- **all content ready to copy directly into your repo**

-------------------------------------------------------------------------------



