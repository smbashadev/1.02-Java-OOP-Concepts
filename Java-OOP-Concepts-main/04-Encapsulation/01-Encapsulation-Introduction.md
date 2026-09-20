# Encapsulation in Java

## Introduction to Encapsulation

### Definition

Encapsulation is one of the fundamental pillars of Object-Oriented Programming (OOP). It focuses on providing security to a class's internal state by binding its data members (fields) and member functions (methods) into a single cohesive unit, while shielding the sensitive data from unauthorized external access.

### Why Encapsulation Matters

* **Data Protection:** Secures internal fields against arbitrary or unexpected outside modifications.
* **Controlled Access:** Allows structural read/write handling via precise application logic (Getters and Setters).
* **Flexibility and Maintainability:** Enables internal class modifications (like altering business or validation rules) without impacting external applications using the class.
* **Accidental Invalidation Safeguards:** Guarantees that objects always preserve a valid state.

---

## Scenario 1: Unrestricted Exposure (No Encapsulation)

### Conceptual Framework

This configuration demonstrates the issues associated with declaring internal class data fields with unrestricted (default or public) visibility. When fields are exposed directly, external classes can alter structural states without validating business logic constraints.

### Code Implementation

```java
class Bank {
    // Declares an instance variable accessible to any class within the same package
    int amt = 5000; 
}

class Hero {
    public static void main(String[] args) {
        // Instantiates the Bank class
        Bank b = new Bank();
        // Accesses and outputs the amt variable directly
        System.out.println(b.amt); 
    }
}

class Villian {
    public static void main(String[] args) {
        // Instantiates a separate Bank instance
        Bank b = new Bank();
        // Demonstrates that untrusted components also possess direct read/write privileges
        System.out.println(b.amt); 
    }
}

```

### Execution Output

```text
5000
5000

```

### High-Level Pseudocode

```text
START
    DEFINE Class Bank:
        DECLARE amt = 5000

    DEFINE Class Hero:
        EXECUTE main:
            INSTANTIATE Bank as b
            PRINT b.amt

    DEFINE Class Villian:
        EXECUTE main:
            INSTANTIATE Bank as b
            PRINT b.amt
END

```

### Architectural Verdict

While operational, this code lacks transactional control. Because `amt` is exposed directly, any entity could easily execute operations like `b.amt = -100000`, bypassing validation requirements and compromising data integrity.

---

## Scenario 2: Over-Restricted Scope (No Functional Access)

### Conceptual Framework

This model illustrates the opposite extreme. Restricting access by applying the `private` keyword protects the internal variable, but failing to provide a public interface isolates the resource, rendering it completely unusable by external systems.

### Code Implementation

```java
class Bank {
    // Restricts member access strictly to the Bank class boundary
    private int amt = 5000; 
}

class Hero {
    public static void main(String[] args) {
        Bank b = new Bank();
        // Compilation Failure: Direct reading is blocked by private access
        System.out.println(b.amt); 
    }
}

class Villian {
    public static void main(String[] args) {
        Bank b = new Bank();
        // Compilation Failure: Direct reading is blocked by private access
        System.out.println(b.amt); 
    }
}

```

### Compilation Diagnostic Output

```text
Alternative.java:10: error: amt has private access in Bank
        System.out.println(b.amt);
                            ^
Alternative.java:18: error: amt has private access in Bank
        System.out.println(b.amt);
                            ^
2 errors

```

### High-Level Pseudocode

```text
START
    DEFINE Class Bank:
        DECLARE PRIVATE amt = 5000

    DEFINE Class Hero:
        EXECUTE main:
            INSTANTIATE Bank as b
            TRY TO PRINT b.amt -> [TRIGGER COMPILATION ERROR]
END

```

### Architectural Verdict

Data isolation guarantees security but completely blocks functional utility. For an object to be useful, it must protect its variables while exposing controlled entry points for interaction.

---

## Scenario 3: Standard Encapsulation (Controlled Interface)

### Conceptual Framework

This scenario presents the industry standard for proper encapsulation. The internal state fields are marked `private`, while validation rules are bundled inside public accessor methods (`getAmt` and `setAmt`). This guarantees that modifications and data lookups can only occur if the correct credential (`pin`) is provided.

### Code Implementation

```java
package learning;

class Bank {
    // Private properties hide the data safely inside the class
    private int amt = 5000;
    private int pin = 1234;

    // Public setter with built-in validation logic
    public void setAmt(int pass, int amount) {
        if (pass == pin) {
            amt = amount; // Updates field value only if credentials match
        } else {
            System.out.println("Invalid pin");
        }
    }

    // Public getter with built-in validation logic
    public int getAmt(int pass) {
        if (pass == pin) {
            return amt; // Grants read access only if credentials match
        } else {
            System.out.println("Invalid Pin");
            return 0;
        }
    }
}

public class Hero {
    public static void main(String[] args) {
        Bank b = new Bank();
        int pass = 1234;
        int amount = 5000;
        
        // Uses the public setter interface to update data
        b.setAmt(pass, amount);
        // Uses the public getter interface to read data
        System.out.println("The balance is: " + b.getAmt(pass));
    }
}

class Villian {
    public static void main(String[] args) {
        Bank b = new Bank();
        int pass = 1243; // Incorrect access token
        int amount = 5000;
        
        // Fails validation due to invalid credentials
        b.setAmt(pass, amount);
        System.out.println("The balance is: " + b.getAmt(pass));
    }
}

```

### Execution Output

```text
The balance is: 5000
Invalid pin
Invalid Pin
The balance is: 0

```

### High-Level Pseudocode

```text
START
    DEFINE Class Bank:
        DECLARE PRIVATE amt = 5000
        DECLARE PRIVATE pin = 1234

        METHOD setAmt(pass, amount):
            IF pass EQUALS pin THEN SET amt = amount
            ELSE PRINT "Invalid pin"

        METHOD getAmt(pass):
            IF pass EQUALS pin THEN RETURN amt
            ELSE PRINT "Invalid Pin"; RETURN 0

    DEFINE Class Hero:
        EXECUTE main:
            INSTANTIATE Bank as b
            CALL b.setAmt(1234, 5000)
            PRINT "The balance is: " + b.getAmt(1234)

    DEFINE Class Villian:
        EXECUTE main:
            INSTANTIATE Bank as b
            CALL b.setAmt(1243, 5000)
            PRINT "The balance is: " + b.getAmt(1243)
END

```

### Architectural Verdict

This approach implements proper encapsulation. The internal state fields are hidden, and all reading or updating actions are controlled by public interfaces that enforce business rules.

---

## Architectural Summary

### Core Mechanics

```
   ┌────────────────────────────────────────────────────────┐
   │                       BANK CLASS                       │
   │                                                        │
   │      Public Methods (Controlled Entry Points)          │
   │      ┌───────────────┐          ┌───────────────┐      │
   │  ───>│  getAmt(pin)  │          │ setAmt(pin,v) │<───  │
   │      └───────┬───────┘          └───────┬───────┘      │
   │              │ Internal Validation      │              │
   │              ▼                          ▼              │
   │        ┌──────────────────────────────────────┐        │
   │        │     Private Fields (Hidden Data)     │        │
   │        │       - amt = 5000                   │        │
   │        │       - pin = 1234                   │        │
   │        └──────────────────────────────────────┘        │
   └────────────────────────────────────────────────────────┘

```

* **Data Hiding:** Declaring variables with the `private` access modifier prevents direct external reads and accidental modifications.
* **Unified Interface:** Exposing functionality through public getter and setter methods provides a clean API for interacting with the object's data.
* **State Validation:** Moving security and validation checks inside accessor methods ensures the object can reject bad data and maintain a valid internal state.

> **Key Takeaway:** Encapsulation hides an object's internal data fields and forces all interactions to go through secure, public validation methods.

---
