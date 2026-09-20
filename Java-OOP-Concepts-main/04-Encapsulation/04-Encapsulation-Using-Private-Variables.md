# Encapsulation Using Private Variables in Java

## Definition

**Encapsulation using private variables** means making class data members `private` so they cannot be accessed directly from outside the class.  
Only controlled methods such as getters and setters are allowed to access them.

### Why it is important
- Protects sensitive data
- Prevents accidental modification
- Allows controlled access
- Improves security and maintainability

### How it helps Java
- Supports proper object-oriented design
- Keeps class data safe
- Makes code cleaner and more reliable

---

# Program 1: Private Variable Example

## Headline
Protecting Data with a Private Variable

## Why this program is used
This program is used to show how a private variable hides data from direct outside access.

## How this helps Java
This helps learners understand:
- the role of `private`
- data hiding
- the basic idea of encapsulation

## Code with comments on every line
```java
class Bank {                           // Line 1: Declares class Bank
    private int balance = 5000;        // Line 2: Declares private variable balance
}

public class Main {                    // Line 3: Declares Main class
    public static void main(String[] args) {   // Line 4: Declares main method
        Bank b = new Bank();                    // Line 5: Creates object b
        System.out.println(b.balance);         // Line 6: Tries to access private variable
    }                                           // Line 7: Ends main method
}
```

## Explanation of every line
1. `class Bank {`  
   Starts the `Bank` class.

2. `private int balance = 5000;`  
   Declares `balance` as private so it is hidden from outside access.

3. `}`  
   Ends the class.

4. `public class Main {`  
   Starts the `Main` class.

5. `public static void main(String[] args) {`  
   Declares the main method.

6. `Bank b = new Bank();`  
   Creates an object of `Bank`.

7. `System.out.println(b.balance);`  
   Tries to read the private variable directly.

8. `}`  
   Ends the main method.

9. `}`  
   Ends the Main class.

## Output
```text
Compile-time error
```

## Expected Error
```text
balance has private access in Bank
```

## Pseudocode
```text
START
    CREATE class Bank
    DECLARE private balance = 5000

    CREATE main method
        CREATE object b
        TRY TO PRINT b.balance
END
```

## Summary
This program shows that private variables cannot be accessed directly from outside the class.

---

# Program 2: Accessing Private Variable Using Getter

## Headline
Reading a Private Variable Through a Getter Method

## Why this program is used
This program is used to show how a private variable can be accessed safely using a method.

## How this helps Java
This helps learners understand:
- how getters provide controlled access
- why private variables are useful
- how encapsulation allows safe reading

## Code with comments on every line
```java
class Bank {                           // Line 1: Declares class Bank
    private int balance = 5000;        // Line 2: Declares private variable balance

    public int getBalance() {          // Line 3: Declares getter method
        return balance;                 // Line 4: Returns the private value
    }
}

public class Main {                    // Line 5: Declares Main class
    public static void main(String[] args) {   // Line 6: Declares main method
        Bank b = new Bank();                    // Line 7: Creates object b
        System.out.println(b.getBalance());     // Line 8: Calls getter to print value
    }                                           // Line 9: Ends main method
}
```

## Explanation of every line
1. `class Bank {`  
   Starts the `Bank` class.

2. `private int balance = 5000;`  
   Keeps the data hidden.

3. `public int getBalance() {`  
   Declares a public getter method.

4. `return balance;`  
   Returns the hidden value.

5. `}`  
   Ends the getter method.

6. `}`  
   Ends the Bank class.

7. `public class Main {`  
   Starts the `Main` class.

8. `public static void main(String[] args) {`  
   Declares the main method.

9. `Bank b = new Bank();`  
   Creates a `Bank` object.

10. `System.out.println(b.getBalance());`  
   Accesses the private data through the getter.

11. `}`  
   Ends the main method.

12. `}`  
   Ends the Main class.

## Output
```text
5000
```

## Pseudocode
```text
START
    CREATE class Bank
    DECLARE private balance = 5000

    DEFINE getBalance()
        RETURN balance

    CREATE main method
        CREATE object b
        PRINT b.getBalance()
END
```

## Summary
This program shows that private variables are still accessible indirectly through a getter method.

---

# Program 3: Updating Private Variable Using Setter

## Headline
Changing a Private Variable Through a Setter Method

## Why this program is used
This program is used to show how a private variable can be updated safely.

## How this helps Java
This helps learners understand:
- how setter methods modify hidden data
- how encapsulation protects data while allowing updates

## Code with comments on every line
```java
class Bank {                           // Line 1: Declares class Bank
    private int balance = 5000;        // Line 2: Declares private variable

    public void setBalance(int amount) {   // Line 3: Declares setter method
        balance = amount;                   // Line 4: Updates private variable
    }

    public int getBalance() {          // Line 5: Declares getter method
        return balance;                 // Line 6: Returns updated value
    }
}

public class Main {                    // Line 7: Declares Main class
    public static void main(String[] args) {   // Line 8: Declares main method
        Bank b = new Bank();                    // Line 9: Creates object b
        b.setBalance(7000);                     // Line 10: Calls setter
        System.out.println(b.getBalance());     // Line 11: Prints updated value
    }                                           // Line 12: Ends main method
}
```

## Explanation of every line
1. `class Bank {`  
   Starts the Bank class.

2. `private int balance = 5000;`  
   Keeps the data hidden.

3. `public void setBalance(int amount) {`  
   Declares a public setter method.

4. `balance = amount;`  
   Updates the private variable.

5. `}`  
   Ends the setter method.

6. `public int getBalance() {`  
   Declares a getter method.

7. `return balance;`  
   Returns the current value.

8. `}`  
   Ends the getter method.

9. `}`  
   Ends the Bank class.

10. `public class Main {`  
   Starts the Main class.

11. `public static void main(String[] args) {`  
   Declares the main method.

12. `Bank b = new Bank();`  
   Creates a Bank object.

13. `b.setBalance(7000);`  
   Calls the setter to update the value.

14. `System.out.println(b.getBalance());`  
   Calls the getter to print the updated value.

15. `}`  
   Ends the main method.

16. `}`  
   Ends the Main class.

## Output
```text
7000
```

## Pseudocode
```text
START
    CREATE class Bank
    DECLARE private balance = 5000

    DEFINE setBalance(amount)
        SET balance = amount

    DEFINE getBalance()
        RETURN balance

    CREATE main method
        CREATE object b
        CALL b.setBalance(7000)
        PRINT b.getBalance()
END
```

## Summary
This program shows that private variables can be updated safely using a setter method.

---

# Program 4: Validation Using Private Variable

## Headline
Protecting Data with Validation Inside Setter

## Why this program is used
This program is used to show how a setter can avoid invalid updates.

## How this helps Java
This helps learners understand:
- how validation can be added
- how private variables improve data safety
- how encapsulation prevents bad values

## Code with comments on every line
```java
class Bank {                           // Line 1: Declares class Bank
    private int balance = 5000;        // Line 2: Declares private variable

    public void setBalance(int amount) {   // Line 3: Declares setter
        if(amount >= 0) {                   // Line 4: Checks whether amount is valid
            balance = amount;               // Line 5: Updates balance
        } else {                            // Line 6: Starts else block
            System.out.println("Invalid amount");   // Line 7: Prints error
        }                                   // Line 8: Ends else block
    }

    public int getBalance() {          // Line 9: Declares getter
        return balance;                 // Line 10: Returns balance
    }
}

public class Main {                    // Line 11: Declares Main class
    public static void main(String[] args) {   // Line 12: Declares main method
        Bank b = new Bank();                    // Line 13: Creates object b
        b.setBalance(8000);                     // Line 14: Valid update
        System.out.println(b.getBalance());     // Line 15: Prints updated value
        b.setBalance(-50);                      // Line 16: Invalid update attempt
        System.out.println(b.getBalance());     // Line 17: Prints unchanged value
    }                                           // Line 18: Ends main method
}
```

## Output
```text
8000
8000
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
        CALL b.setBalance(8000)
        PRINT b.getBalance()
        CALL b.setBalance(-50)
        PRINT b.getBalance()
END
```

## Summary
This program shows that private variables combined with validation provide strong protection for object data.

---

# Professional Summary

**Encapsulation using private variables** means keeping data private and allowing controlled access through methods.

## Benefits
- hides data from outside access
- prevents accidental misuse
- supports validation logic
- improves software quality

## Core idea
> Private variables + public methods = safe and professional Java code

---

# Final Revision Note

```text
Encapsulation using private variables means protecting class data with private access and allowing safe access only through controlled methods.
```

---
