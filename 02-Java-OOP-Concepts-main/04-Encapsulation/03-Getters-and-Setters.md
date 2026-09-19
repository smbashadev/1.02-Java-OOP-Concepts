# Getters and Setters in Java

## Definition

**Getters** and **Setters** are methods used to access and modify private data of a class.

- A **getter** is used to **read** the value
- A **setter** is used to **update** the value

### Why they are important
- They provide controlled access to private fields
- They help protect data from invalid changes
- They are commonly used in encapsulation

### How they help Java
- Improve data security
- Make code cleaner and more professional
- Allow validation before changing values

---

# Program 1: Basic Getter and Setter Example

## Headline
Using Getter and Setter Methods to Access Private Data

## Why this program is used
This program is used to show how private data can be read and updated safely.

## How this helps Java
This helps learners understand:
- the use of private variables
- the role of getter methods
- the role of setter methods
- how encapsulation works in practice

## Code with comments on every line
```java
class Student {                          // Line 1: Declares class Student
    private String name;                 // Line 2: Declares private variable name

    public String getName() {            // Line 3: Declares getter method
        return name;                     // Line 4: Returns the value of name
    }

    public void setName(String n) {      // Line 5: Declares setter method
        name = n;                        // Line 6: Assigns new value to name
    }
}

public class Main {                      // Line 7: Declares public class Main
    public static void main(String[] args) {   // Line 8: Declares main method
        Student s = new Student();             // Line 9: Creates object s
        s.setName("Alice");                    // Line 10: Calls setter to assign value
        System.out.println(s.getName());       // Line 11: Calls getter to print value
    }                                           // Line 12: Ends main method
}
```

## Explanation of every line
1. `class Student {`  
   Starts the Student class.

2. `private String name;`  
   Declares `name` as private so it cannot be accessed directly.

3. `public String getName() {`  
   Declares a getter method to read the value.

4. `return name;`  
   Returns the current value of `name`.

5. `}`  
   Ends the getter method.

6. `public void setName(String n) {`  
   Declares a setter method to assign a new value.

7. `name = n;`  
   Assigns the passed value to the private variable.

8. `}`  
   Ends the setter method.

9. `}`  
   Ends the Student class.

10. `public class Main {`  
   Starts the Main class.

11. `public static void main(String[] args) {`  
   Declares the main method.

12. `Student s = new Student();`  
   Creates an object of Student.

13. `s.setName("Alice");`  
   Uses the setter to set the name.

14. `System.out.println(s.getName());`  
   Uses the getter to display the name.

15. `}`  
   Ends the main method.

16. `}`  
   Ends the Main class.

## Output
```text
Alice
```

## Pseudocode
```text
START
    CREATE class Student
    DECLARE private name

    DEFINE getName()
        RETURN name

    DEFINE setName(n)
        SET name = n

    CREATE main method
        CREATE object s
        CALL s.setName("Alice")
        PRINT s.getName()
END
```

## Summary
This program demonstrates how getters and setters allow controlled access to private data.

---

# Program 2: Getter and Setter with Age Validation

## Headline
Using Setter to Validate Data Before Updating

## Why this program is used
This program is used to show how a setter can control invalid values.

## How this helps Java
This helps learners understand:
- how validation works in setters
- how bad values can be rejected
- how encapsulation improves data integrity

## Code with comments on every line
```java
class Person {                          // Line 1: Declares class Person
    private int age;                    // Line 2: Declares private age

    public int getAge() {               // Line 3: Declares getter method
        return age;                     // Line 4: Returns age
    }

    public void setAge(int a) {         // Line 5: Declares setter method
        if(a >= 0) {                    // Line 6: Checks if age is valid
            age = a;                    // Line 7: Assigns value if valid
        } else {                        // Line 8: Starts else block
            System.out.println("Invalid age");   // Line 9: Prints error message
        }                               // Line 10: Ends else block
    }
}

public class Main {                      // Line 11: Declares Main class
    public static void main(String[] args) {   // Line 12: Declares main method
        Person p = new Person();               // Line 13: Creates object p
        p.setAge(25);                           // Line 14: Calls setter with valid value
        System.out.println(p.getAge());         // Line 15: Prints age
        p.setAge(-5);                           // Line 16: Calls setter with invalid value
    }                                           // Line 17: Ends main method
}
```

## Explanation of every line
1. `class Person {`  
   Starts the Person class.

2. `private int age;`  
   Declares `age` as private.

3. `public int getAge() {`  
   Declares getter method.

4. `return age;`  
   Returns the age value.

5. `}`  
   Ends the getter method.

6. `public void setAge(int a) {`  
   Declares a setter method.

7. `if(a >= 0) {`  
   Checks whether age is valid.

8. `age = a;`  
   Assigns the age if valid.

9. `} else {`  
   Runs if age is invalid.

10. `System.out.println("Invalid age");`  
   Prints message for invalid value.

11. `}`  
   Ends the else block.

12. `}`  
   Ends the setter method.

13. `}`  
   Ends the Person class.

14. `public class Main {`  
   Starts the Main class.

15. `public static void main(String[] args) {`  
   Declares the main method.

16. `Person p = new Person();`  
   Creates a Person object.

17. `p.setAge(25);`  
   Calls setter with a valid value.

18. `System.out.println(p.getAge());`  
   Prints the value using getter.

19. `p.setAge(-5);`  
   Calls setter with invalid input.

20. `}`  
   Ends the main method.

21. `}`  
   Ends the Main class.

## Output
```text
25
Invalid age
```

## Pseudocode
```text
START
    CREATE class Person
    DECLARE private age

    DEFINE getAge()
        RETURN age

    DEFINE setAge(a)
        IF a >= 0
            SET age = a
        ELSE
            PRINT "Invalid age"

    CREATE main method
        CREATE object p
        CALL p.setAge(25)
        PRINT p.getAge()
        CALL p.setAge(-5)
END
```

## Summary
This program shows that setters can validate values, preventing invalid data from being stored.

---

# Program 3: Getter and Setter with String Data

## Headline
Using Getter and Setter for String Fields

## Why this program is used
This program is used to demonstrate how getter and setter methods work with string values.

## How this helps Java
This helps learners understand:
- how private string data is controlled
- how values are updated and retrieved safely

## Code with comments on every line
```java
class Employee {                        // Line 1: Declares class Employee
    private String name;                // Line 2: Declares private name

    public String getName() {           // Line 3: Declares getter
        return name;                    // Line 4: Returns name
    }

    public void setName(String n) {     // Line 5: Declares setter
        name = n;                       // Line 6: Assigns new value
    }
}

public class Main {                      // Line 7: Declares Main class
    public static void main(String[] args) {   // Line 8: Declares main method
        Employee e = new Employee();           // Line 9: Creates object e
        e.setName("Rahul");                    // Line 10: Calls setter
        System.out.println(e.getName());       // Line 11: Calls getter
    }                                           // Line 12: Ends main method
}
```

## Output
```text
Rahul
```

## Pseudocode
```text
START
    CREATE class Employee
    DECLARE private name

    DEFINE getName()
        RETURN name

    DEFINE setName(n)
        SET name = n

    CREATE main method
        CREATE object e
        CALL e.setName("Rahul")
        PRINT e.getName()
END
```

## Summary
This program shows how getters and setters are used to handle string fields in a controlled way.

---

# Professional Summary

**Getters** and **setters** are methods that allow safe access to private attributes of a class.

## Getter
- Used to read data
- Usually starts with `get`

## Setter
- Used to modify data
- Usually starts with `set`

## Why they are useful
- protect private data
- allow validation
- follow encapsulation principles

---

# Final Revision Note

```text
Getters and setters are public methods used to read and update private fields safely.
```

---
