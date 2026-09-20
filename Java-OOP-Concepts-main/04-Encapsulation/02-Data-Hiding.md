# Data Hiding in Java

## Definition

**Data hiding** is the concept of restricting direct access to an object’s data so that outside code cannot access or modify it directly.  
It is usually achieved using the `private` access modifier.

### Why it is important
- Protects important data
- Prevents accidental changes
- Keeps the class in control of its internal state
- Improves security and reliability

### How it helps Java
- Encourages safe coding practices
- Reduces bugs caused by unwanted modification
- Supports good object-oriented design

---

# Program 1: Without Data Hiding

## Headline
Showing Why Data Hiding Is Needed

## Why this program is used
This program is used to demonstrate what happens when object data is accessible directly from outside the class.

## How this helps Java
This helps learners understand:
- why direct access is risky
- why data should be protected
- how uncontrolled access can cause problems

## Code with comments on every line
```java
class Bank {                           // Line 1: Declares a class named Bank
    int balance = 5000;                // Line 2: Declares balance variable directly
}

public class Main {                    // Line 3: Declares the public class Main
    public static void main(String[] args) {   // Line 4: Declares the main method
        Bank b = new Bank();                    // Line 5: Creates an object of Bank
        System.out.println(b.balance);         // Line 6: Prints balance directly
    }                                           // Line 7: Ends main method
}
```

## Explanation of every line
1. `class Bank {`  
   Starts the `Bank` class.

2. `int balance = 5000;`  
   Declares a variable named `balance` and gives it a value.

3. `}`  
   Ends the `Bank` class.

4. `public class Main {`  
   Starts the `Main` class.

5. `public static void main(String[] args) {`  
   Declares the main method.

6. `Bank b = new Bank();`  
   Creates an object `b` of class `Bank`.

7. `System.out.println(b.balance);`  
   Accesses the `balance` directly from outside the class.

8. `}`  
   Ends the main method.

9. `}`  
   Ends the Main class.

## Output
```text
5000
```

## Pseudocode
```text
START
    CREATE class Bank
    DECLARE balance = 5000

    CREATE main method
        CREATE object b
        PRINT b.balance
END
```

## Summary
This program shows that direct access to data is possible without any restriction.

---

# Program 2: Using `private` to Hide Data

## Headline
Protecting Data with the `private` Keyword

## Why this program is used
This program is used to show how data hiding is achieved by making fields private.

## How this helps Java
This helps learners understand:
- how access modifiers protect data
- why private fields cannot be accessed directly
- why a class should control its own data

## Code with comments on every line
```java
class Bank {                           // Line 1: Declares class Bank
    private int balance = 5000;        // Line 2: Declares balance as private
}

public class Main {                    // Line 3: Declares Main class
    public static void main(String[] args) {   // Line 4: Declares main method
        Bank b = new Bank();                    // Line 5: Creates object b
        System.out.println(b.balance);         // Line 6: Tries to access private field
    }                                           // Line 7: Ends main method
}
```

## Explanation of every line
1. `class Bank {`  
   Starts the `Bank` class.

2. `private int balance = 5000;`  
   Declares `balance` as private so outside code cannot access it directly.

3. `}`  
   Ends the `Bank` class.

4. `public class Main {`  
   Starts the `Main` class.

5. `public static void main(String[] args) {`  
   Declares the main method.

6. `Bank b = new Bank();`  
   Creates a `Bank` object.

7. `System.out.println(b.balance);`  
   Tries to print the private field directly.

8. `}`  
   Ends the main method.

9. `}`  
   Ends the `Main` class.

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
This program shows that data hiding prevents outside code from accessing private data directly.

---

# Program 3: Controlled Access Using Public Methods

## Headline
Using Methods to Access Hidden Data Safely

## Why this program is used
This program is used to show how hidden data can be accessed safely using public methods.

## How this helps Java
This helps learners understand:
- why getter and setter methods are important
- how real-world systems control access
- how encapsulation and data hiding work together

## Code with comments on every line
```java
class Bank {                           // Line 1: Declares class Bank
    private int balance = 5000;        // Line 2: Hides the data using private

    public int getBalance() {          // Line 3: Declares public getter method
        return balance;                 // Line 4: Returns the private value
    }

    public void setBalance(int amount) {   // Line 5: Declares public setter method
        balance = amount;                   // Line 6: Updates the private value
    }
}

public class Main {                    // Line 7: Declares Main class
    public static void main(String[] args) {   // Line 8: Declares main method
        Bank b = new Bank();                    // Line 9: Creates object b
        System.out.println(b.getBalance());     // Line 10: Prints value using getter
        b.setBalance(7000);                     // Line 11: Updates value using setter
        System.out.println(b.getBalance());     // Line 12: Prints updated value
    }                                           // Line 13: Ends main method
}
```

## Explanation of every line
1. `class Bank {`  
   Starts the Bank class.

2. `private int balance = 5000;`  
   Declares the data as private.

3. `public int getBalance() {`  
   Declares a public method to read the value.

4. `return balance;`  
   Returns the private balance.

5. `}`  
   Ends the getter method.

6. `public void setBalance(int amount) {`  
   Declares a public method to modify the value.

7. `balance = amount;`  
   Updates the private variable.

8. `}`  
   Ends the setter method.

9. `}`  
   Ends the Bank class.

10. `public class Main {`  
   Starts the Main class.

11. `public static void main(String[] args) {`  
   Declares the main method.

12. `Bank b = new Bank();`  
   Creates object `b`.

13. `System.out.println(b.getBalance());`  
   Calls the getter to read the value.

14. `b.setBalance(7000);`  
   Calls the setter to change the value.

15. `System.out.println(b.getBalance());`  
   Calls the getter again to print the new value.

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
This program shows that hidden data can still be accessed safely through public methods.  
This is the real use of data hiding.

---

# Program 4: Data Hiding with Validation

## Headline
Using Data Hiding to Protect and Validate Data

## Why this program is used
This program is used to show that data hiding can also help control invalid updates.

## How this helps Java
This helps learners understand:
- how methods can validate values
- how data can be protected from wrong input
- how class logic can ensure correctness

## Code with comments on every line
```java
class Bank {                           // Line 1: Declares class Bank
    private int balance = 5000;        // Line 2: Declares private balance

    public void setBalance(int amount) {   // Line 3: Declares setter method
        if(amount >= 0) {                   // Line 4: Checks if amount is valid
            balance = amount;               // Line 5: Updates balance
        } else {                            // Line 6: Starts else block
            System.out.println("Invalid amount");   // Line 7: Prints error message
        }                                   // Line 8: Ends else block
    }

    public int getBalance() {          // Line 9: Declares getter method
        return balance;                 // Line 10: Returns balance
    }
}

public class Main {                    // Line 11: Declares Main class
    public static void main(String[] args) {   // Line 12: Declares main method
        Bank b = new Bank();                    // Line 13: Creates object
        b.setBalance(7000);                     // Line 14: Valid update
        System.out.println(b.getBalance());     // Line 15: Prints updated value
        b.setBalance(-100);                     // Line 16: Invalid update attempt
        System.out.println(b.getBalance());     // Line 17: Prints unchanged value
    }                                           // Line 18: Ends main method
}
```

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
        CALL b.setBalance(-100)
        PRINT b.getBalance()
END
```

## Summary
This program shows that data hiding allows the class to validate values before changing data.

---

# Professional Summary

**Data hiding** is the practice of preventing direct access to class data from outside the class.  
It is usually done using the `private` access modifier.

## Benefits of data hiding
- prevents accidental modification
- keeps data secure
- allows controlled access
- improves code quality

## Main idea
> Data hiding means protecting data so only the class itself can decide how the data is accessed.

---

# Final Revision Note

```text
Data hiding is the concept of keeping class data protected from direct outside access and allowing access only through controlled methods.
```

---
