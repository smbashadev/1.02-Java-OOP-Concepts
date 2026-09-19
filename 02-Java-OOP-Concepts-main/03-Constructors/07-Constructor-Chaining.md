# Constructor Chaining in Java

## Definition

**Constructor chaining** is the process of calling one constructor from another constructor in the same class or from a parent class using `this(...)` or `super(...)`.

### Why it is important
- It avoids duplicate code
- It improves code readability
- It helps initialize objects in a structured and organized way

### How it helps Java
- Reduces repetition
- Makes initialization consistent
- Improves maintainability of code

---

# Program 1: Constructor Chaining Using `this()`

## Headline
Using `this()` to Call One Constructor from Another

## Why this program is used
This program is used to show how one constructor can call another constructor in the same class.

## How this helps Java
This helps learners understand:
- how repeated initialization logic can be reused
- how constructor calls are managed
- why constructor chaining makes code cleaner

## Code with comments on every line
```java
class Student {                          // Line 1: Declares a class named Student
    String name;                         // Line 2: Declares a String variable name
    int age;                             // Line 3: Declares an int variable age

    Student() {                           // Line 4: Declares first constructor with no parameters
        this("Unknown", 0);              // Line 5: Calls another constructor using this()
    }

    Student(String n, int a) {           // Line 6: Declares second constructor with parameters
        name = n;                        // Line 7: Assigns passed name
        age = a;                         // Line 8: Assigns passed age
    }

    void display() {                      // Line 9: Declares display method
        System.out.println("Name: " + name);   // Line 10: Prints name
        System.out.println("Age: " + age);     // Line 11: Prints age
    }
}

public class Main {                      // Line 12: Declares public class Main
    public static void main(String[] args) {   // Line 13: Declares main method
        Student s1 = new Student();            // Line 14: Creates object using no-argument constructor
        s1.display();                          // Line 15: Calls display method
    }
}
```

## Explanation of every line
1. `class Student {`  
   Starts the Student class.

2. `String name;`  
   Declares the `name` field.

3. `int age;`  
   Declares the `age` field.

4. `Student() {`  
   Declares the first constructor with no arguments.

5. `this("Unknown", 0);`  
   Calls the second constructor using `this(...)`.

6. `Student(String n, int a) {`  
   Declares the constructor that accepts two parameters.

7. `name = n;`  
   Assigns the passed name.

8. `age = a;`  
   Assigns the passed age.

9. `}`  
   Ends the second constructor.

10. `void display() {`  
   Declares a method to print the values.

11. `System.out.println("Name: " + name);`  
   Prints the student name.

12. `System.out.println("Age: " + age);`  
   Prints the student age.

13. `}`  
   Ends the display method.

14. `}`  
   Ends the Student class.

15. `public class Main {`  
   Starts the Main class.

16. `public static void main(String[] args) {`  
   Starts the main method.

17. `Student s1 = new Student();`  
   Creates object using the no-argument constructor.

18. `s1.display();`  
   Calls the display method.

19. `}`  
   Ends the main method.

20. `}`  
   Ends the Main class.

## Output
```text
Name: Unknown
Age: 0
```

## Pseudocode
```text
START
    CREATE class Student
    DECLARE name
    DECLARE age

    DEFINE constructor 1
        CALL constructor 2 with ("Unknown", 0)

    DEFINE constructor 2 with n and a
        SET name = n
        SET age = a

    DEFINE display method
        PRINT name
        PRINT age

    CREATE main method
        CREATE object s1 using Student()
        CALL s1.display()
END
```

## Summary
This program shows how constructor chaining allows one constructor to reuse another constructor.

---

# Program 2: Constructor Chaining with Different Parameter Values

## Headline
Using Constructor Chaining to Initialize Objects in Multiple Ways

## Why this program is used
This program is used to show how one constructor can call another constructor with different arguments.

## How this helps Java
This helps learners understand:
- how constructor chaining makes object creation easier
- how code duplication is avoided

## Code with comments on every line
```java
class Person {                          // Line 1: Declares a class named Person
    String name;                         // Line 2: Declares name variable
    int age;                             // Line 3: Declares age variable

    Person() {                           // Line 4: Declares no-argument constructor
        this("Anonymous", 18);           // Line 5: Calls parameterized constructor
    }

    Person(String n, int a) {            // Line 6: Declares parameterized constructor
        name = n;                        // Line 7: Assigns name
        age = a;                         // Line 8: Assigns age
    }

    void show() {                        // Line 9: Declares show method
        System.out.println("Name: " + name);   // Line 10: Prints name
        System.out.println("Age: " + age);     // Line 11: Prints age
    }
}

public class Main {                      // Line 12: Declares Main class
    public static void main(String[] args) {   // Line 13: Declares main method
        Person p1 = new Person();              // Line 14: Creates object using no-arg constructor
        p1.show();                             // Line 15: Calls show method
    }
}
```

## Output
```text
Name: Anonymous
Age: 18
```

## Pseudocode
```text
START
    CREATE class Person
    DECLARE name
    DECLARE age

    DEFINE constructor 1
        CALL constructor 2 with ("Anonymous", 18)

    DEFINE constructor 2 with n and a
        SET name = n
        SET age = a

    DEFINE show method
        PRINT name
        PRINT age

    CREATE main method
        CREATE p1 using Person()
        CALL p1.show()
END
```

## Summary
This program shows how constructor chaining can give default values to an object automatically.

---

# Program 3: Constructor Chaining Using Different Constructors

## Headline
Combining Constructor Overloading and Chaining

## Why this program is used
This program is used to show how constructor overloading and constructor chaining can work together.

## How this helps Java
This helps learners understand:
- how multiple constructors can be organized
- how one constructor can delegate work to another

## Code with comments on every line
```java
class Employee {                        // Line 1: Declares class Employee
    String name;                        // Line 2: Declares name variable
    int id;                             // Line 3: Declares id variable

    Employee() {                         // Line 4: No-argument constructor
        this("Unknown", 0);              // Line 5: Calls another constructor
    }

    Employee(String n, int i) {          // Line 6: Constructor with two parameters
        name = n;                        // Line 7: Assigns name
        id = i;                          // Line 8: Assigns id
    }

    void display() {                     // Line 9: Declares display method
        System.out.println("Name: " + name);   // Line 10: Prints name
        System.out.println("ID: " + id);       // Line 11: Prints id
    }
}

public class Main {                      // Line 12: Declares Main class
    public static void main(String[] args) {   // Line 13: Declares main method
        Employee e1 = new Employee();          // Line 14: Creates object using no-arg constructor
        e1.display();                          // Line 15: Calls display method
    }
}
```

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

    DEFINE constructor with n and i
        SET name = n
        SET id = i

    DEFINE display method
        PRINT name
        PRINT id

    CREATE main method
        CREATE e1 using Employee()
        CALL e1.display()
END
```

## Summary
This program shows that constructor chaining helps keep initialization logic consistent across multiple constructors.

---

# Professional Summary

**Constructor chaining** is the process where one constructor calls another constructor.  
It is mainly used to avoid repeating code and to keep initialization logic clean.

## Benefits
- Removes duplicate code
- Makes constructor logic reusable
- Improves readability
- Keeps object setup consistent

## Main idea
When you want one constructor to use another constructor’s logic, constructor chaining is the correct approach.

---

# Final Revision Note

```text
Constructor chaining is the technique of calling one constructor from another constructor using this(...) to reuse initialization logic.
```

---
