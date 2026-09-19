# Abstraction in Java — Final Revision Notes

---

## 1) One-line definition

Abstraction means hiding the implementation details and showing only the essential behavior.

## 2) Why abstraction is used

* Reduces complexity
* Improves readability
* Makes code reusable
* Helps in maintainability
* Supports good software design

## 3) Abstract class

An abstract class is a class that cannot be instantiated directly.
It may contain:

* abstract methods
* concrete methods
* fields
* constructors

## 4) Abstract method

An abstract method has no body and must be implemented by subclasses.

## 5) Concrete method

A concrete method already has a complete body and can be reused.

## 6) Important rules

* A class containing an abstract method must be declared abstract.
* A subclass must implement all abstract methods unless it is also abstract.
* Abstract classes cannot be instantiated.
* Abstract methods cannot be private.
* Abstract methods cannot be final or static.
* A class cannot be both final and abstract.

## 7) Abstract class vs interface

| Feature | Abstract Class | Interface |
| --- | --- | --- |
| **Can have fields** | Yes | Only public static final constants |
| **Can have constructors** | Yes | No |
| **Can have concrete methods** | Yes | Yes (default/static in newer versions) |
| **Multiple inheritance** | No | Yes |
| **Instantiation** | Not allowed | Not allowed |

## 8) Abstract class vs encapsulation

* Abstraction hides complexity.
* Encapsulation hides data and controls access.
* Abstraction is about behavior.
* Encapsulation is about data protection.

## 9) Abstract class vs polymorphism

* Abstraction defines the common contract.
* Polymorphism allows one interface to represent different implementations.

## 10) Real-world example

A `PaymentGateway` class can define `processPayment()`, and different payment types like `CardPayment` and `UPIPayment` implement it differently.

## 11) Example syntax

```java
abstract class Animal {
    abstract void sound();
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

```

## 12) Constructor behavior in abstract classes

* Abstract classes can have constructors.
* Child constructors call the parent constructor using `super()`.

## 13) Static and final methods in abstract classes

* `static` methods belong to the class.
* `final` methods cannot be overridden.
* `abstract` methods must be implemented.

## 14) Interview answer template

Abstraction is a concept in OOP where we hide implementation details and expose only the important behavior. In Java, abstract classes and abstract methods are used to define a common structure while allowing subclasses to provide specific implementations. This improves code readability, maintainability, and flexibility.

## 15) Quick memory trick

Think:

* Abstraction = "What"
* Encapsulation = "How protected"
* Inheritance = "Reusing"
* Polymorphism = "Many forms"

## 16) Short summary

Abstraction helps us focus on the essential behavior of an object while hiding unnecessary details. It is one of the most important concepts in Java OOP.
