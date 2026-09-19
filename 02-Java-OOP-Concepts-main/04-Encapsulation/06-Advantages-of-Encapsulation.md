# Advantages of Encapsulation in Java

## Definition

**Encapsulation** is the concept of wrapping data and methods together in a class and allowing controlled access to that data.  
The main advantage of encapsulation is that it improves the security, reliability, and maintainability of the code.

### Why this topic is important
- It explains why encapsulation is widely used in OOP
- It helps learners understand the real benefits of designing clean classes
- It shows why private variables and public methods are preferred

### How this helps Java
- Makes code safer
- Reduces accidental errors
- Helps in building scalable and professional applications

---

# Program 1: Data Protection Advantage

## Headline
Protecting Data from Unwanted Access

## Why this program is used
This program is used to show that encapsulation prevents outside code from directly changing important data.

## How this helps Java
This helps learners understand:
- how hidden data remains safe
- why access control matters
- how accidental data corruption can be avoided

## Code with comments on every line
```java
class Bank {                           // Line 1: Declares class Bank
    private int balance = 5000;        // Line 2: Declares private balance
}

public class Main {                    // Line 3: Declares Main class
    public static void main(String[] args) {   // Line 4: Declares main method
        Bank b = new Bank();                    // Line 5: Creates object b
        // b.balance = 1000;                    // Line 6: This line is commented because direct access is not allowed
        System.out.println("Balance protected");   // Line 7: Prints message
    }                                               // Line 8: Ends main method
}
```

## Explanation of every line
1. `class Bank {`  
   Starts the `Bank` class.

2. `private int balance = 5000;`  
   Makes the balance hidden from outside access.

3. `}`  
   Ends the Bank class.

4. `public class Main {`  
   Starts the Main class.

5. `public static void main(String[] args) {`  
   Declares the main method.

6. `Bank b = new Bank();`  
   Creates an object of Bank.

7. `// b.balance = 1000;`  
   This line is commented because direct access is blocked.

8. `System.out.println("Balance protected");`  
   Prints a message showing that the data is protected.

9. `}`  
   Ends the main method.

10. `}`  
   Ends the Main class.

## Output
```text
Balance protected
```

## Pseudocode
```text
START
    CREATE class Bank
    DECLARE private balance = 5000

    CREATE main method
        CREATE object b
        DO NOT allow direct change
        PRINT "Balance protected"
END
```

## Summary
This program shows the advantage of data protection, which is one of the main benefits of encapsulation.

---

# Program 2: Controlled Access Advantage

## Headline
Allowing Safe Access Through Methods

## Why this program is used
This program is used to show that encapsulation allows access only through controlled methods.

## How this helps Java
This helps learners understand:
- why methods are useful for access
- how outside code can interact safely
- how the class remains in control of its data

## Code with comments on every line
```java
class Bank {                           // Line 1: Declares class Bank
    private int balance = 5000;        // Line 2: Declares hidden balance

    public int getBalance() {          // Line 3: Getter method
        return balance;                 // Line 4: Returns private value
    }

    public void setBalance(int amount) {   // Line 5: Setter method
        balance = amount;                   // Line 6: Updates value
    }
}

public class Main {                    // Line 7: Declares Main class
    public static void main(String[] args) {   // Line 8: Declares main method
        Bank b = new Bank();                    // Line 9: Creates object b
        System.out.println(b.getBalance());     // Line 10: Reads value safely
        b.setBalance(7000);                     // Line 11: Updates value safely
        System.out.println(b.getBalance());     // Line 12: Reads updated value safely
    }                                           // Line 13: Ends main method
}
```

## Explanation of every line
1. `class Bank {`  
   Starts the Bank class.

2. `private int balance = 5000;`  
   Keeps data hidden.

3. `public int getBalance() {`  
   Declares a getter method.

4. `return balance;`  
   Returns the hidden value.

5. `}`  
   Ends getter method.

6. `public void setBalance(int amount) {`  
   Declares setter method.

7. `balance = amount;`  
   Updates the hidden value.

8. `}`  
   Ends setter method.

9. `}`  
   Ends Bank class.

10. `public class Main {`  
   Starts Main class.

11. `public static void main(String[] args) {`  
   Declares main method.

12. `Bank b = new Bank();`  
   Creates object `b`.

13. `System.out.println(b.getBalance());`  
   Reads the value through getter.

14. `b.setBalance(7000);`  
   Updates the value through setter.

15. `System.out.println(b.getBalance());`  
   Reads updated value again.

16. `}`  
   Ends main method.

17. `}`  
   Ends Main class.

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
This shows the advantage of controlled access, which is one of the biggest benefits of encapsulation.

---

# Program 3: Validation Advantage

## Headline
Validating Input Before Changing Data

## Why this program is used
This program is used to show that encapsulation allows methods to validate values before updating data.

## How this helps Java
This helps learners understand:
- how invalid data can be avoided
- how classes can protect business rules
- why encapsulation improves code quality

## Code with comments on every line
```java
class Bank {                           // Line 1: Declares class Bank
    private int balance = 5000;        // Line 2: Declares private balance

    public void setBalance(int amount) {   // Line 3: Setter method
        if(amount >= 0) {                   // Line 4: Checks if amount is valid
            balance = amount;               // Line 5: Updates balance
        } else {                            // Line 6: Starts else block
            System.out.println("Invalid amount");   // Line 7: Prints message
        }                                   // Line 8: Ends else block
    }

    public int getBalance() {          // Line 9: Getter method
        return balance;                 // Line 10: Returns balance
    }
}

public class Main {                    // Line 11: Declares Main class
    public static void main(String[] args) {   // Line 12: Declares main method
        Bank b = new Bank();                    // Line 13: Creates object b
        b.setBalance(7000);                     // Line 14: Calls setter with valid value
        System.out.println(b.getBalance());     // Line 15: Prints updated balance
        b.setBalance(-50);                      // Line 16: Calls setter with invalid value
        System.out.println(b.getBalance());     // Line 17: Prints unchanged value
    }                                           // Line 18: Ends main method
}
```

## Explanation of every line
1. `class Bank {`  
   Starts the Bank class.

2. `private int balance = 5000;`  
   Keeps data hidden.

3. `public void setBalance(int amount) {`  
   Declares a setter.

4. `if(amount >= 0) {`  
   Checks whether the input amount is valid.

5. `balance = amount;`  
   Assigns the value only if valid.

6. `} else {`  
   Runs when value is invalid.

7. `System.out.println("Invalid amount");`  
   Shows a message for invalid input.

8. `}`  
   Ends else block.

9. `}`  
   Ends setter method.

10. `public int getBalance() {`  
   Declares getter.

11. `return balance;`  
   Returns the current value.

12. `}`  
   Ends getter method.

13. `}`  
   Ends Bank class.

14. `public class Main {`  
   Starts Main class.

15. `public static void main(String[] args) {`  
   Starts main method.

16. `Bank b = new Bank();`  
   Creates object.

17. `b.setBalance(7000);`  
   Calls setter with valid value.

18. `System.out.println(b.getBalance());`  
   Prints updated value.

19. `b.setBalance(-50);`  
   Calls setter with invalid value.

20. `System.out.println(b.getBalance());`  
   Prints the value again.

21. `}`  
   Ends main method.

22. `}`  
   Ends Main class.

## Output
```text
7000
7000
```

## Pseudocode
```text
START
    CREATE class Bank
    DECLARE private balance = 5000

    DEFINE setBalance(amount)
        IF amount >= 0
            SET balance = amount
        ELSE
            PRINT "Invalid amount"

    DEFINE getBalance()
        RETURN balance

    CREATE main method
        CREATE object b
        CALL b.setBalance(7000)
        PRINT b.getBalance()
        CALL b.setBalance(-50)
        PRINT b.getBalance()
END
```

## Summary
This shows the advantage of validation, which is an important benefit of encapsulation.

---

# Program 4: Easy Maintenance Advantage

## Headline
Making Code Easier to Maintain

## Why this program is used
This program is used to show that encapsulation makes future changes easier.

## How this helps Java
This helps learners understand:
- why hiding logic inside methods is useful
- how classes can be updated without affecting external code
- how maintainable code is built

## Code with comments on every line
```java
class Bank {                           // Line 1: Declares class Bank
    private int balance = 5000;        // Line 2: Declares private balance

    public int getBalance() {          // Line 3: Getter method
        return balance;                 // Line 4: Returns balance
    }

    public void setBalance(int amount) {   // Line 5: Setter method
        balance = amount;                   // Line 6: Updates balance
    }
}

public class Main {                    // Line 7: Declares Main class
    public static void main(String[] args) {   // Line 8: Declares main method
        Bank b = new Bank();                    // Line 9: Creates object
        b.setBalance(9000);                     // Line 10: Updates value
        System.out.println(b.getBalance());     // Line 11: Prints value
    }                                           // Line 12: Ends main method
}
```

## Output
```text
9000
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
        CALL b.setBalance(9000)
        PRINT b.getBalance()
END
```

## Summary
This shows the advantage of maintainability: changes are localized inside the class.

---

# Professional Summary

The main advantages of encapsulation are:

- **Data protection**  
  Prevents direct access to sensitive data

- **Controlled access**  
  Uses getters and setters to manage access

- **Validation**  
  Ensures only valid values are stored

- **Code maintainability**  
  Makes future changes easier

- **Better software design**  
  Supports clean and professional OOP structure

---

# Final Revision Note

```text
The advantages of encapsulation are data protection, controlled access, validation, maintainability, and better software design.
```

---
