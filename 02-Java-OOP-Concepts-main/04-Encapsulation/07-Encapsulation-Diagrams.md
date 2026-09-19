# Encapsulation Diagrams in Java

## Definition

An **Encapsulation Diagram** is a visual way to represent how data is wrapped inside a class and accessed only through controlled methods.

### Why it is important
- Makes the concept easier to understand
- Helps in notes, presentations, and repository documentation
- Shows the relationship between private data and public methods clearly

### How it helps Java
- Improves conceptual understanding
- Helps explain OOP design clearly
- Makes code structure easier to visualize

---

# 1. Basic Encapsulation Diagram

## Headline
Visual Representation of Encapsulation

## Why this diagram is used
This diagram is used to show how data and methods are grouped together inside a class.

## How this helps Java
This helps learners understand:
- the structure of a class
- how private data is protected
- how getters and setters provide access

## Diagram
```text
+----------------------+
|        Bank           |
|----------------------|
| - balance : int       |
|----------------------|
| + getBalance()        |
| + setBalance()        |
+----------------------+
```

## Explanation
- `- balance` means the data is **private**
- `+ getBalance()` is a **public getter**
- `+ setBalance()` is a **public setter**

## Summary
This diagram shows that the class contains both data and methods, and the data is protected.

---

# 2. Flow Diagram of Encapsulation

## Headline
How Encapsulation Works Step by Step

## Why this diagram is used
This flow diagram explains the process of reading and updating hidden data.

## How this helps Java
This helps learners understand:
- how access is controlled
- how methods communicate with private fields
- why outside code does not access data directly

## Flow Diagram
```text
Outside Code
    |
    v
Call getBalance() or setBalance()
    |
    v
Public method inside class
    |
    v
Access or update private variable
    |
    v
Return result or store new value
```

## Explanation
- Outside code cannot access the private field directly
- It must use a public method
- The class controls how the data is read or changed

## Summary
This diagram shows the flow of control in encapsulation.

---

# 3. Diagram Showing Direct Access Problem

## Headline
Problem When Data Is Not Encapsulated

## Why this diagram is used
This diagram is used to show what happens when data is directly exposed.

## How this helps Java
This helps learners understand:
- why direct access is risky
- why protection is needed
- how data can be modified accidentally

## Diagram
```text
Outside Code
    |
    v
Directly access balance
    |
    v
Possible wrong or unwanted changes
```

## Explanation
- If data is public, any class can change it directly
- This may lead to invalid or unsafe values

## Summary
This diagram highlights the danger of not using encapsulation.

---

# 4. Diagram Showing Encapsulation Correct Approach

## Headline
Correct Encapsulation Model

## Why this diagram is used
This diagram is used to show the proper way to protect data and allow controlled access.

## How this helps Java
This helps learners understand:
- the difference between hidden data and public methods
- how access is controlled safely

## Diagram
```text
Outside Code
    |
    v
Calls setBalance() or getBalance()
    |
    v
Public methods inside class
    |
    v
Private balance is accessed safely
```

## Explanation
- The private variable is protected
- Public methods act as the safe entry point
- The class controls the access

## Summary
This diagram shows the correct use of encapsulation.

---

# 5. Code Example for Encapsulation Diagram

## Headline
Example Program That Matches the Encapsulation Diagram

## Why this program is used
This program is used to connect the visual diagram to actual Java code.

## How this helps Java
This helps learners understand:
- how the diagram relates to real code
- how private data and public methods work together

## Code with comments on every line
```java
class Bank {                           // Line 1: Declares class Bank
    private int balance = 5000;        // Line 2: Declares private data

    public int getBalance() {          // Line 3: Declares getter method
        return balance;                 // Line 4: Returns private data
    }

    public void setBalance(int amount) {   // Line 5: Declares setter method
        balance = amount;                   // Line 6: Updates private data
    }
}

public class Main {                    // Line 7: Declares Main class
    public static void main(String[] args) {   // Line 8: Declares main method
        Bank b = new Bank();                    // Line 9: Creates object b
        System.out.println(b.getBalance());     // Line 10: Reads data using getter
        b.setBalance(7000);                     // Line 11: Updates data using setter
        System.out.println(b.getBalance());     // Line 12: Reads updated data
    }                                           // Line 13: Ends main method
}
```

## Explanation of every line
1. `class Bank {`  
   Starts the Bank class.

2. `private int balance = 5000;`  
   Declares the hidden variable.

3. `public int getBalance() {`  
   Declares the getter method.

4. `return balance;`  
   Returns the hidden value.

5. `}`  
   Ends the getter method.

6. `public void setBalance(int amount) {`  
   Declares the setter method.

7. `balance = amount;`  
   Updates the hidden value.

8. `}`  
   Ends the setter method.

9. `}`  
   Ends the Bank class.

10. `public class Main {`  
   Starts the Main class.

11. `public static void main(String[] args) {`  
   Declares the main method.

12. `Bank b = new Bank();`  
   Creates a Bank object.

13. `System.out.println(b.getBalance());`  
   Reads the value with getter.

14. `b.setBalance(7000);`  
   Changes the value using setter.

15. `System.out.println(b.getBalance());`  
   Reads the updated value.

16. `}`  
   Ends the main method.

17. `}`  
   Ends the Main class.

## Output
```text
5000
7000
```

## Pseudocode
```text
START
    CREATE class Bank
    DECLARE private balance = 5000

    DEFINE getBalance()
        RETURN balance

    DEFINE setBalance(amount)
        SET balance = amount

    CREATE main method
        CREATE object b
        PRINT b.getBalance()
        CALL b.setBalance(7000)
        PRINT b.getBalance()
END
```

## Summary
This code matches the encapsulation diagram and shows how private data is managed safely.

---

# 6. Diagram for Real-Life Encapsulation

## Headline
Real-World Analogy of Encapsulation

## Why this diagram is used
This diagram is used to explain encapsulation in simple real-life language.

## How this helps Java
This helps learners understand:
- how real-world systems protect data
- how users interact through safe interfaces

## Diagram
```text
User
 |
 v
Deposit / Withdraw methods
 |
 v
Bank Account System
 |
 v
Private Account Balance
```

## Explanation
- The user cannot directly change the balance
- The system provides methods to perform actions safely

## Summary
This is a practical way to understand encapsulation.

---

# Professional Summary

Encapsulation diagrams are useful because they show:

- how data and methods are grouped together
- how private data is hidden
- how public methods control access
- how object-oriented design works visually

## Main idea
> Encapsulation is shown visually as private data protected inside a class and accessed only through public methods.

---

# Final Revision Note

```text
Encapsulation diagrams represent private data inside a class and show that outside code must use public methods to access or update it.
```

---
