# Real-World Abstraction Example Using Payment Gateway System

---

## 1) Program Goal

This program demonstrates abstraction in a realistic software scenario.
It shows how a common base class can define a general contract while different subclasses implement their own behavior.

In this example:

* the base class represents a payment system,
* the subclasses represent different payment methods,
* and the program uses abstraction to handle them uniformly.

## 2) Definitions

### Abstraction

Abstraction means hiding unnecessary implementation details and showing only the essential behavior.

### Base Class / Abstract Class

A base class defines common structure and rules for all related classes.

### Subclass / Concrete Class

A subclass provides specific implementation for the abstract behavior.

## 3) Why this program is important

This is a practical example because real applications often use abstraction to manage multiple implementations of the same idea.
For example:

* payment by card,
* payment by UPI,
* payment by wallet.

All of them perform the same general action (`processPayment()`), but each one works differently internally.

## 4) Why we use this program

We use this program because it shows how abstraction helps in professional software design:

* one common interface-like contract,
* multiple implementations,
* and flexible code that can work with any payment method.

## 5) How this helps Java developers

This helps developers understand how abstraction is used in real projects such as:

* banking apps,
* e-commerce platforms,
* payment services,
* and enterprise applications.

## 6) Real-world analogy

Think of a payment gateway in an online shopping application.
The customer only needs to click "Pay".
The system does not care whether the payment is made by card, UPI, or wallet.
The specific logic is handled by the corresponding subclass.

## 7) Complete Java Program

```java
abstract class PaymentGateway {
    abstract void processPayment();
}

class CardPayment extends PaymentGateway {
    @Override
    void processPayment() {
        System.out.println("Processing card payment...");
    }
}

class UPIPayment extends PaymentGateway {
    @Override
    void processPayment() {
        System.out.println("Processing UPI payment...");
    }
}

public class Program_5_Realistic_Abstraction_Ecosystem {
    public static void main(String[] args) {
        PaymentGateway payment1 = new CardPayment();
        PaymentGateway payment2 = new UPIPayment();

        payment1.processPayment();
        payment2.processPayment();
    }
}

```

## 8) Line-by-line explanation

### Line 1

```java
package FIle7;

```

* Declares the package name.

### Line 3

```java
abstract class PaymentGateway {

```

* Declares an abstract class named `PaymentGateway`.
* This class acts as the common base for all payment types.

### Line 4

```java
    abstract void processPayment();

```

* Declares an abstract method.
* Every payment type must provide its own implementation.

### Line 7

```java
class CardPayment extends PaymentGateway {

```

* Creates a subclass for card-based payment.

### Line 8

```java
    @Override

```

* Indicates that the next method overrides the abstract method from the parent class.

### Line 9

```java
    void processPayment() {

```

* Provides the implementation for card payment.

### Line 10

```java
        System.out.println("Processing card payment...");

```

* Prints the specific behavior for card payment.

### Line 14

```java
class UPIPayment extends PaymentGateway {

```

* Creates another subclass for UPI payment.

### Line 16

```java
    void processPayment() {

```

* Provides the implementation for UPI payment.

### Line 17

```java
        System.out.println("Processing UPI payment...");

```

* Prints the UPI processing message.

### Line 23

```java
        PaymentGateway payment1 = new CardPayment();

```

* Creates an object of `CardPayment`.
* The reference type is `PaymentGateway`.
* This demonstrates abstraction and polymorphism together.

### Line 24

```java
        PaymentGateway payment2 = new UPIPayment();

```

* Creates an object of `UPIPayment` using the same parent reference type.

### Line 26

```java
        payment1.processPayment();

```

* Calls the `processPayment()` method on the first payment object.
* The card implementation runs.

### Line 27

```java
        payment2.processPayment();

```

* Calls the method on the second payment object.
* The UPI implementation runs.

## 9) Pseudocode

```text
BEGIN
    Create abstract class PaymentGateway
        Declare abstract method processPayment()
    END

    Create class CardPayment extends PaymentGateway
        Implement processPayment()
            Print "Processing card payment..."
        END
    END

    Create class UPIPayment extends PaymentGateway
        Implement processPayment()
            Print "Processing UPI payment..."
        END
    END

    In main method
        Create PaymentGateway reference to CardPayment object
        Create PaymentGateway reference to UPIPayment object
        Call processPayment() for both
    END
END

```

## 10) Step-by-step working

1. The program starts in `main()`.
2. Two payment objects are created.
3. Each object is stored in a `PaymentGateway` reference.
4. `processPayment()` is called on both references.
5. Java runs the version defined in the actual subclass object.

## 11) Output

```text
Processing card payment...
Processing UPI payment...

```

## 12) Why the output appears this way

The output appears this way because each object belongs to a different subclass.
Even though both have the same reference type, Java executes the correct subclass behavior.

## 13) Important concept learned

This program teaches that abstraction is extremely useful when multiple classes share one common action but differ in implementation.

## 14) Advantages of this design

* Keeps code flexible and scalable.
* Allows new payment methods to be added easily.
* Reduces duplication.
* Makes the design easier to maintain.
* Supports polymorphism in a professional way.

## 15) Summary

This real-world example shows how abstraction helps software systems work with many related implementations without exposing all details.
It is a strong example of professional Java design.

## 16) One-line takeaway

Abstraction lets different classes share a common contract while each one handles the details in its own way.
