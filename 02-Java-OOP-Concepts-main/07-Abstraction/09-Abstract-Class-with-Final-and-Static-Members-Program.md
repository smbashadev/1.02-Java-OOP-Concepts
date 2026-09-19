# Understanding Static and Final Methods in Abstract Classes

---

## 1) Program Goal

This program demonstrates how an abstract class can contain:

* A `static` method
* A `final` method
* An abstract method that must be implemented by subclasses

The goal is to show how abstraction and method behavior rules can work together smoothly within a single design.

---

## 2) Definitions

### Static Method

A `static` method belongs to the class itself, rather than to any specific instance object. It can be invoked directly using the class name.

### Final Method

A `final` method cannot be overridden by any subclass. It guarantees that a specific behavior remains locked and unchanged throughout the inheritance chain.

### Abstract Method

An abstract method has no body definition and serves as a strict structural rule that subclasses must implement.

### Why this program is important

This program is important because it clarifies a common point of confusion:

* Abstract methods are designed to be overridden and implemented.
* Final methods are designed to completely block overriding.
* Static methods are designed to exist independently of instance creation.

---

## 3) Why we use this program

We use this program to show that abstract classes are highly flexible containers. They can house different kinds of methods, where each keyword plays a distinct structural role in managing code behavior.

---

## 4) How this helps Java developers

This helps developers understand how to choose the correct method modifiers when designing an architecture. It teaches solid object-oriented design decisions by balancing customization with immutability.

---

## 5) Real-world analogy

Imagine a banking network:

* `calculateInterest()` varies depending on the account type (Savings, Current), so it must be abstract.
* `displayBankRules()` must remain exactly the same for legal compliance across all departments, so it is final.
* `getBankNetworkCode()` is general utility information shared globally, making it static.

---

## 6) Complete Java Program

```java
abstract class Bank {
    static String bankName = "ABC Bank";

    static void showBankName() {
        System.out.println("Bank Name: " + bankName);
    }

    final void showRules() {
        System.out.println("Every account must follow bank rules.");
    }

    abstract void interestRate();
}

class SavingsAccount extends Bank {
    @Override
    void interestRate() {
        System.out.println("Savings account interest rate is 4%.");
    }
}

public class Program_4_Abstract_Class_with_Final_and_Static {
    public static void main(String[] args) {
        Bank.showBankName();

        Bank account = new SavingsAccount();
        account.showRules();
        account.interestRate();
    }
}

```

---

## 7) Line-by-line explanation

### Line 1

```java
abstract class Bank {

```

* Declares an abstract base class called `Bank` which cannot be instantiated directly.

### Line 2

```java
    static String bankName = "ABC Bank";

```

* Declares a static variable that is allocated once in memory and shared across the entire class ecosystem.

### Line 4

```java
    static void showBankName() {

```

* Declares a static utility method that operates at the class level.

### Line 5

```java
        System.out.println("Bank Name: " + bankName);

```

* Accesses and prints the static class field data.

### Line 8

```java
    final void showRules() {

```

* Declares a final method, preventing any child class from changing this exact enforcement routine.

### Line 9

```java
        System.out.println("Every account must follow bank rules.");

```

* Outputs the mandatory, unalterable regulatory notice.

### Line 12

```java
    abstract void interestRate();

```

* Declares an abstract method signature, pushing the responsibility of implementation onto child subclasses.

### Line 15

```java
class SavingsAccount extends Bank {

```

* Establishes a concrete subclass named `SavingsAccount` that inherits from `Bank`.

### Line 16

```java
    @Override

```

* Explicitly states that the following method provides the concrete implementation for the parent's abstract template.

### Line 17

```java
    void interestRate() {

```

* Implements the custom `interestRate()` details for this specific account type.

### Line 18

```java
        System.out.println("Savings account interest rate is 4%.");

```

* Prints the unique interest metrics.

### Line 23

```java
        Bank.showBankName();

```

* Invokes the static method using the class name reference directly, without constructing an object.

### Line 25

```java
        Bank account = new SavingsAccount();

```

* Allocates a concrete `SavingsAccount` object inside a polymorphic `Bank` reference.

### Line 26

```java
        account.showRules();

```

* Executes the inherited final method directly from the parent definition block.

### Line 27

```java
        account.interestRate();

```

* Invokes the implemented logic, which dynamically resolves to the child execution block at runtime.

---

## 8) Pseudocode

```text
BEGIN
    Create abstract class Bank
        Declare static variable bankName
        Create static method showBankName()
            Print bankName
        END

        Create final method showRules()
            Print fixed bank rule message
        END

        Create abstract method interestRate()
    END

    Create class SavingsAccount extends Bank
        Implement interestRate()
            Print savings interest rate
        END
    END

    In main method
        Call Bank.showBankName()
        Create Bank reference to SavingsAccount object
        Call showRules()
        Call interestRate()
    END
END

```

---

## 9) Step-by-step working

1. The execution path hits `main()`.
2. The runtime instantly routes to `Bank.showBankName()`, fetching the class-bound variables.
3. A `SavingsAccount` instance is allocated under a `Bank` reference variable type.
4. The application reads `account.showRules()`, jumping to the fixed parent routine block.
5. The application triggers `account.interestRate()`, mapping directly to the overridden subclass business logic.

---

## 10) Output

```text
Bank Name: ABC Bank
Every account must follow bank rules.
Savings account interest rate is 4%.

```

---

## 11) Why the output appears this way

The output matches this sequence because static methods execute via class context boundaries, the final logic cleanly streams its inherited text without alteration, and the dynamic lookup process yields the active child calculation.

---

## 12) Important concept learned

This program highlights how keywords establish architectural rules:

* `static` establishes global class-level access boundaries.
* `final` seals logic away from accidental or malicious modification.
* `abstract` forces a distributed workflow where child classes customize behavior.

---

## 13) Advantages of this design

* Centralizes invariant logic to eliminate redundant code updates.
* Protects core administrative structures from being overridden or corrupted.
* Guarantees that essential branch features are explicitly customized by subclasses.

---

## 14) Summary

This example shows how abstraction works alongside other Java keywords. It teaches that each keyword has a clear responsibility in building a good object-oriented design.

---

## 15) One-line takeaway

Static methods are shared, final methods are protected from change, and abstract methods must be implemented by subclasses.
