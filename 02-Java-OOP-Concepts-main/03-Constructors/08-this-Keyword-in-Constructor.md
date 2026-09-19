# `this` Keyword in Constructor

## Definition

The `this` keyword in Java is used to refer to the **current object**.  
Inside a constructor, it is commonly used to call another constructor or to distinguish instance variables from parameters.

### Why it is important
- It helps remove confusion between variables and parameters
- It allows constructor chaining
- It improves code readability and correctness

### How it helps Java
- Makes code clearer
- Avoids naming conflicts
- Helps manage object state properly

---

# Program 1: Using `this` to Differentiate Variables

## Headline
Using `this` to Refer to the Current Object

## Why this program is used
This program is used to show how `this` helps when constructor parameters have the same name as instance variables.

## How this helps Java
This helps learners understand:
- how `this` refers to the current object
- how Java resolves naming conflicts
- how instance data is assigned correctly

## Code with comments on every line
```java
class Student {                          // Line 1: Declares a class named Student
    String name;                         // Line 2: Declares instance variable name
    int age;                             // Line 3: Declares instance variable age

    Student(String name, int age) {      // Line 4: Constructor with parameters same as fields
        this.name = name;                // Line 5: Assigns parameter value to instance variable
        this.age = age;                  // Line 6: Assigns parameter value to instance variable
    }

    void display() {                      // Line 7: Declares display method
        System.out.println("Name: " + this.name);   // Line 8: Prints name using this
        System.out.println("Age: " + this.age);     // Line 9: Prints age using this
    }
}

public class Main {                      // Line 10: Declares public class Main
    public static void main(String[] args) {   // Line 11: Declares main method
        Student s1 = new Student("Alice", 20); // Line 12: Creates object with values
        s1.display();                          // Line 13: Calls display method
    }
}
```

## Explanation of every line
1. `class Student {`  
   Starts the `Student` class.

2. `String name;`  
   Declares the instance variable `name`.

3. `int age;`  
   Declares the instance variable `age`.

4. `Student(String name, int age) {`  
   Defines a constructor with parameters named `name` and `age`.

5. `this.name = name;`  
   Uses `this` to assign the parameter value to the current object’s `name`.

6. `this.age = age;`  
   Uses `this` to assign the parameter value to the current object’s `age`.

7. `}`  
   Ends the constructor.

8. `void display() {`  
   Declares a method to display object data.

9. `System.out.println("Name: " + this.name);`  
   Prints the object’s `name` using `this`.

10. `System.out.println("Age: " + this.age);`  
   Prints the object’s `age` using `this`.

11. `}`  
   Ends the display method.

12. `}`  
   Ends the Student class.

13. `public class Main {`  
   Starts the `Main` class.

14. `public static void main(String[] args) {`  
   Starts the main method.

15. `Student s1 = new Student("Alice", 20);`  
   Creates an object and passes values to the constructor.

16. `s1.display();`  
   Calls the display method.

17. `}`  
   Ends the main method.

18. `}`  
   Ends the Main class.

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

    DEFINE constructor with parameters name and age
        SET this.name = name
        SET this.age = age

    DEFINE display method
        PRINT this.name
        PRINT this.age

    CREATE main method
        CREATE object s1 using Student("Alice", 20)
        CALL s1.display()
END
```

## Summary
This program shows how `this` is used to refer to the current object and differentiate between instance variables and constructor parameters.

---

# Program 2: Using `this()` for Constructor Chaining

## Headline
Calling One Constructor from Another Using `this()`

## Why this program is used
This program is used to show how `this()` is used to chain constructors in the same class.

## How this helps Java
This helps learners understand:
- how to reuse initialization logic
- how one constructor can call another
- how `this` simplifies constructor design

## Code with comments on every line
```java
class Employee {                        // Line 1: Declares class Employee
    String name;                        // Line 2: Declares instance variable name
    int id;                             // Line 3: Declares instance variable id

    Employee() {                         // Line 4: Declares no-argument constructor
        this("Unknown", 0);              // Line 5: Calls parameterized constructor
    }

    Employee(String name, int id) {     // Line 6: Declares parameterized constructor
        this.name = name;                // Line 7: Assigns value to instance variable
        this.id = id;                    // Line 8: Assigns value to instance variable
    }

    void display() {                     // Line 9: Declares display method
        System.out.println("Name: " + this.name);   // Line 10: Prints name
        System.out.println("ID: " + this.id);       // Line 11: Prints id
    }
}

public class Main {                      // Line 12: Declares Main class
    public static void main(String[] args) {   // Line 13: Declares main method
        Employee e1 = new Employee();          // Line 14: Creates object using no-arg constructor
        e1.display();                          // Line 15: Calls display method
    }
}
```

## Explanation of every line
1. `class Employee {`  
   Starts the Employee class.

2. `String name;`  
   Declares the `name` field.

3. `int id;`  
   Declares the `id` field.

4. `Employee() {`  
   Defines the no-argument constructor.

5. `this("Unknown", 0);`  
   Calls another constructor of the same class.

6. `Employee(String name, int id) {`  
   Defines the parameterized constructor.

7. `this.name = name;`  
   Assigns the parameter value to the object field.

8. `this.id = id;`  
   Assigns the parameter value to the object field.

9. `}`  
   Ends the parameterized constructor.

10. `void display() {`  
   Declares the display method.

11. `System.out.println("Name: " + this.name);`  
   Prints the employee’s name.

12. `System.out.println("ID: " + this.id);`  
   Prints the employee’s id.

13. `}`  
   Ends the display method.

14. `}`  
   Ends the Employee class.

15. `public class Main {`  
   Starts the Main class.

16. `public static void main(String[] args) {`  
   Starts the main method.

17. `Employee e1 = new Employee();`  
   Creates object using the no-arg constructor.

18. `e1.display();`  
   Calls the display method.

19. `}`  
   Ends the main method.

20. `}`  
   Ends the Main class.

## Output
```text
Name: Unknown
ID: 0
```

## Pseudocode
```text
START
    CREATE class Employee
    DECLARE name
    DECLARE id

    DEFINE no-argument constructor
        CALL constructor with ("Unknown", 0)

    DEFINE constructor with name and id
        SET this.name = name
        SET this.id = id

    DEFINE display method
        PRINT this.name
        PRINT this.id

    CREATE main method
        CREATE object e1 using Employee()
        CALL e1.display()
END
```

## Summary
This program shows how `this()` is used to call another constructor and reduce repeated initialization logic.

---

# Program 3: Using `this` in Constructor for Object Reference

## Headline
Understanding `this` as the Current Object Reference

## Why this program is used
This program is used to show that `this` refers to the current object being created.

## How this helps Java
This helps learners understand:
- the meaning of current object reference
- how object methods can be called inside class code
- how `this` improves clarity

## Code with comments on every line
```java
class Car {                             // Line 1: Declares class Car
    String brand;                        // Line 2: Declares brand variable
    int speed;                           // Line 3: Declares speed variable

    Car(String brand, int speed) {       // Line 4: Constructor with parameters
        this.brand = brand;              // Line 5: Assigns brand to current object
        this.speed = speed;              // Line 6: Assigns speed to current object
    }

    void show() {                        // Line 7: Declares show method
        System.out.println("Brand: " + this.brand);   // Line 8: Prints brand
        System.out.println("Speed: " + this.speed);   // Line 9: Prints speed
    }
}

public class Main {                      // Line 10: Declares Main class
    public static void main(String[] args) {   // Line 11: Declares main method
        Car c1 = new Car("Toyota", 120);       // Line 12: Creates object with values
        c1.show();                             // Line 13: Calls show method
    }
}
```

## Output
```text
Brand: Toyota
Speed: 120
```

## Pseudocode
```text
START
    CREATE class Car
    DECLARE brand
    DECLARE speed

    DEFINE constructor with brand and speed
        SET this.brand = brand
        SET this.speed = speed

    DEFINE show method
        PRINT this.brand
        PRINT this.speed

    CREATE main method
        CREATE c1 using Car("Toyota", 120)
        CALL c1.show()
END
```

## Summary
This program shows that `this` represents the current object and can be used to access its fields.

---

# Professional Summary

The `this` keyword is used inside a class to refer to the **current object**.  
In constructors, it is especially useful to:

- avoid variable-name conflicts
- call another constructor using `this(...)`
- clearly reference object fields

## Main benefits
- Improves code readability
- Prevents confusion between parameters and fields
- Helps in constructor chaining

## Short definition
`this` is a reference variable that points to the current object.

---

# Final Revision Note

```text
The this keyword in Java refers to the current object and is used in constructors to access fields, avoid naming conflicts, and call another constructor.
```

---
