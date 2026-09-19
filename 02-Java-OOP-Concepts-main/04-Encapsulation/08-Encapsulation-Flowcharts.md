# Encapsulation Flowcharts in Java

## Definition

An **Encapsulation Flowchart** is a visual representation of how a class protects its data and allows safe access through methods.

### Why it is important
- Explains how data is protected
- Shows the flow of method calls clearly
- Helps beginners understand OOP logic visually

### How it helps Java
- Makes class design easier to understand
- Shows why private data is used
- Helps connect theory with actual programming flow

---

# 1. Basic Encapsulation Flowchart

## Headline
Flow of Encapsulation Process

## Why this flowchart is used
This flowchart is used to show how outside code interacts with a class.

## How this helps Java
It helps learners understand:
- how private fields are protected
- how public methods provide access
- how object data is controlled

## Flowchart
```text
Start
  |
  v
Outside code wants to read or update data
  |
  v
Calls public getter/setter method
  |
  v
Method inside class accesses private data
  |
  v
Value is returned or updated
  |
  v
End
```

## Explanation
- Outside code cannot directly access private data
- Public methods act as a safe interface
- The class controls what happens to its data

## Summary
This is the core flow of encapsulation.

---

# 2. Flowchart for Data Hiding

## Headline
Flow of Data Hiding

## Why this flowchart is used
This flowchart shows how data is hidden from direct outside access.

## How this helps Java
It helps learners understand:
- why private variables are used
- how direct access is blocked
- how classes protect their internal state

## Flowchart
```text
Start
  |
  v
Outside code tries to access private variable
  |
  v
Java blocks direct access
  |
  v
Only methods inside the class can access it
  |
  v
End
```

## Summary
This flowchart describes the idea of **data hiding**.

---

# 3. Flowchart for Getter Method

## Headline
Flow of Getter Method

## Why this flowchart is used
This flowchart shows how a getter allows safe reading of data.

## How this helps Java
It helps learners understand:
- how private data is read
- how values are returned safely
- why getter methods are important

## Flowchart
```text
Start
  |
  v
Outside code calls getBalance()
  |
  v
Getter method runs
  |
  v
Getter reads private variable
  |
  v
Value is returned
  |
  v
End
```

## Summary
A getter provides controlled read access.

---

# 4. Flowchart for Setter Method

## Headline
Flow of Setter Method

## Why this flowchart is used
This flowchart explains how a setter updates hidden data safely.

## How this helps Java
It helps learners understand:
- how data is changed safely
- how validation can be applied
- how updates are controlled

## Flowchart
```text
Start
  |
  v
Outside code calls setBalance(value)
  |
  v
Setter receives input
  |
  v
Validation logic checks the new value
  |
  v
If valid, private field is updated
  |
  v
End
```

## Summary
A setter provides controlled write access.

---

# 5. Code Example Matching the Flowchart

## Headline
Example Program Showing Encapsulation Flow

## Why this program is used
This program is used to connect the flowchart with actual Java code.

## How this helps Java
It helps learners understand:
- how private data is protected
- how getters and setters are used
- how the flowchart matches real Java behavior

## Code with comments on every line
```java
class Bank {                           // Line 1: Declares class Bank
    private int balance = 5000;        // Line 2: Declares private data

    public int getBalance() {          // Line 3: Declares getter method
        return balance;                 // Line 4: Returns private value
    }

    public void setBalance(int amount) {   // Line 5: Declares setter method
        balance = amount;                   // Line 6: Updates private value
    }
}

public class Main {                    // Line 7: Declares public class Main
    public static void main(String[] args) {   // Line 8: Declares main method
        Bank b = new Bank();                    // Line 9: Creates object b
        System.out.println(b.getBalance());     // Line 10: Calls getter
        b.setBalance(7000);                     // Line 11: Calls setter
        System.out.println(b.getBalance());     // Line 12: Calls getter again
    }                                           // Line 13: Ends main method
}
```

## Explanation of every line
1. `class Bank {`  
   Starts the `Bank` class.

2. `private int balance = 5000;`  
   Declares a private variable.

3. `public int getBalance() {`  
   Declares a public getter.

4. `return balance;`  
   Returns the hidden value.

5. `}`  
   Ends the getter.

6. `public void setBalance(int amount) {`  
   Declares a public setter.

7. `balance = amount;`  
   Updates the private value.

8. `}`  
   Ends the setter.

9. `}`  
   Ends the class.

10. `public class Main {`  
   Starts the main class.

11. `public static void main(String[] args) {`  
   Declares the main method.

12. `Bank b = new Bank();`  
   Creates an object.

13. `System.out.println(b.getBalance());`  
   Reads data safely using getter.

14. `b.setBalance(7000);`  
   Updates data safely using setter.

15. `System.out.println(b.getBalance());`  
   Reads updated value again.

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
This code matches the encapsulation flowchart and shows how private data is accessed safely.

---

# 6. Flowchart for Validation in Encapsulation

## Headline
Flowchart for Setter Validation

## Why this flowchart is used
This flowchart shows how setter methods can reject bad input.

## How this helps Java
It helps learners understand:
- how validation improves data safety
- how classes control updates
- why encapsulation is useful in real-world programs

## Flowchart
```text
Start
  |
  v
Caller passes value to setter
  |
  v
Setter checks condition
  |
  v
If condition is true -> update private field
  |
  v
If condition is false -> print error
  |
  v
End
```

## Summary
This flowchart demonstrates that encapsulation can also enforce business rules.

---

# Final Professional Summary

Encapsulation flowcharts show that:

- private data is protected
- public methods control access
- getter methods provide safe reading
- setter methods provide safe updating
- validation can be applied inside the class

## One-line definition
> Encapsulation flowcharts represent how a class protects its data and allows controlled access through methods.

---
