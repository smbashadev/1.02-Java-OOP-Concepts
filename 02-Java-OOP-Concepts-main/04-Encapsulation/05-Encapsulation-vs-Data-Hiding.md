# Encapsulation vs Data Hiding in Java

## Definition

### Encapsulation
**Encapsulation** is the concept of wrapping data and methods together inside a class and controlling access to that data.

### Data Hiding
**Data hiding** is the technique of preventing direct access to data from outside the class, usually by using `private`.

### Why this topic is important
- Many learners confuse encapsulation and data hiding
- Both are related but not exactly the same
- Understanding the difference improves object-oriented design

### How this helps Java
- Teaches proper class design
- Explains why private variables are used
- Shows how controlled access improves code quality

---

# Program 1: Example of Data Hiding Only

## Headline
Showing Data Hiding Using a Private Variable

## Why this program is used
This program is used to show that data hiding is about protecting data from direct outside access.

## How this helps Java
This helps learners understand:
- how private variables stop direct access
- how data can be protected
- why data hiding is important

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
   Starts the Bank class.

2. `private int balance = 5000;`  
   Hides the balance variable from outside access.

3. `}`  
   Ends the Bank class.

4. `public class Main {`  
   Starts the Main class.

5. `public static void main(String[] args) {`  
   Declares the main method.

6. `Bank b = new Bank();`  
   Creates an object of Bank.

7. `System.out.println(b.balance);`  
   Tries to access the hidden variable directly.

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
This shows **data hiding** because the private field cannot be accessed directly from outside.

---

# Program 2: Example of Encapsulation

## Headline
Using Getter and Setter to Achieve Encapsulation

## Why this program is used
This program is used to show that encapsulation is not just hiding data, but also controlling its access.

## How this helps Java
This helps learners understand:
- how private variables are protected
- how public methods control access
- how data can be read and updated safely

## Code with comments on every line
```java
class Bank {                           // Line 1: Declares class Bank
    private int balance = 5000;        // Line 2: Declares private variable

    public int getBalance() {          // Line 3: Getter method
        return balance;                 // Line 4: Returns private value
    }

    public void setBalance(int amount) {   // Line 5: Setter method
        balance = amount;                   // Line 6: Updates private value
    }
}

public class Main {                    // Line 7: Declares Main class
    public static void main(String[] args) {   // Line 8: Declares main method
        Bank b = new Bank();                    // Line 9: Creates object b
        System.out.println(b.getBalance());     // Line 10: Reads value using getter
        b.setBalance(7000);                     // Line 11: Updates value using setter
        System.out.println(b.getBalance());     // Line 12: Prints updated value
    }                                           // Line 13: Ends main method
}
```

## Explanation of every line
1. `class Bank {`  
   Starts the Bank class.

2. `private int balance = 5000;`  
   Hides the data.

3. `public int getBalance() {`  
   Declares a getter method.

4. `return balance;`  
   Returns the hidden value.

5. `}`  
   Ends the getter method.

6. `public void setBalance(int amount) {`  
   Declares a setter method.

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
   Reads the private value using getter.

14. `b.setBalance(7000);`  
   Updates the private value using setter.

15. `System.out.println(b.getBalance());`  
   Prints the updated value.

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
This shows **encapsulation** because the class controls access to its data through methods.

---

# Program 3: Comparing Both Concepts

## Headline
Understanding the Difference Between Encapsulation and Data Hiding

## Why this program is used
This program is used to show the difference between the two concepts clearly.

## How this helps Java
This helps learners understand:
- that data hiding is one part
- encapsulation includes both hiding and controlled access
- why both are important in OOP

## Comparison Table

| Concept | Meaning | Focus |
|--------|---------|-------|
| Data Hiding | Preventing direct access to data | Security / Protection |
| Encapsulation | Wrapping data + methods and controlling access | Design / Control / Safety |

## Summary
- **Data hiding** is about protecting data
- **Encapsulation** is about protecting data and controlling how it is used

---

# Program 4: Real-World Analogy

## Headline
Real-Life Meaning of Encapsulation vs Data Hiding

## Why this program is used
This program is used to explain the concepts in simple real-world terms.

## How this helps Java
This helps learners understand:
- the practical meaning of both ideas
- how OOP concepts match real-world thinking

## Analogy
```text
A bank account:
- The balance is hidden from direct access
- Only methods like deposit() and withdraw() can change it
```

## Summary
This is a perfect example of encapsulation, where data hiding is one part of the whole idea.

---

# Professional Summary

## Data Hiding
- Focuses on protecting data from direct access
- Usually done using `private`

## Encapsulation
- Focuses on combining data and methods together
- Uses private data and public methods for controlled access

## Important point
> Data hiding is a part of encapsulation, but encapsulation is a bigger concept.

---

# Final Revision Note

```text
Data hiding is the technique of protecting data; encapsulation is the broader concept of binding data with methods and controlling access to it.
```

---
