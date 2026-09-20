# Abstract Class with Both Abstract and Concrete Methods

---

## 1) Program Goal

This program demonstrates that an abstract class is not limited to only abstract methods. It can also contain normal, concrete methods that already have a body.

This helps us understand that abstraction can combine:

* A required contract (abstract methods)
* Shared, reusable behavior (concrete methods)

---

## 2) Definitions

### Abstract Method

An abstract method is declared without a body and must be implemented by subclasses.

### Concrete Method

A concrete method is a normal method that already has a complete body. It can be inherited and reused directly by subclasses.

### Abstract Class

An abstract class can contain both abstract and concrete methods. It may also contain fields, constructors, and other normal class members.

### Why this program is important

This program is important because it teaches a very practical point:

> An abstract class can define both the rules that must be followed and the common logic that all subclasses can share.

This is one of the key reasons abstraction is powerful in real-world Java applications.

---

## 3) Why we use this program

We use this program because it shows the difference between:

* What every subclass must implement
* What all subclasses can inherit as common behavior

This helps beginners understand that abstraction is not just about making methods incomplete; it is also about organizing code efficiently.

---

## 4) How this helps Java developers

This helps Java developers build cleaner systems where:

* Common functionality is written once to save time
* Subclasses only override what is different
* The overall design becomes much easier to maintain and extend

---

## 5) Real-world analogy

Imagine a vehicle manufacturing blueprint. All vehicles must have a `start()` mechanism, but the exact implementation differs for a car (push button), a motorcycle (kickstart), or a truck (heavy ignition). At the same time, every vehicle shares a common capability like turning on the hazard lights via a `stop()` routine.

The abstract class handles both constraints:

* The required unique actions
* The reusable shared logic

---

## 6) Complete Java Program

```java
abstract class Vehicle {
    abstract void start();

    void stop() {
        System.out.println("Vehicle stopped");
    }
}

class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Car started");
    }
}

public class Program_2_Abstract_and_Concrete_Methods {
    public static void main(String[] args) {
        Vehicle vehicle = new Car();
        vehicle.start();
        vehicle.stop();
    }
}

```

---

## 7) Line-by-line explanation

### Line 1

```java
abstract class Vehicle {

```

* `abstract` tells Java that this class cannot be instantiated directly.
* `Vehicle` is the parent abstract class.

### Line 2

```java
    abstract void start();

```

* `start()` is declared as abstract.
* It has no body because every vehicle type may start differently. Subclasses must implement it.

### Line 4

```java
    void stop() {

```

* `stop()` is a concrete method because it has a complete body.
* Every subclass can inherit this method without rewriting it.

### Line 5

```java
        System.out.println("Vehicle stopped");

```

* This prints a message to the console, defining the common stopping behavior.

### Line 8

```java
class Car extends Vehicle {

```

* `Car` is a subclass that inherits from `Vehicle`.
* Because `Vehicle` has an abstract method, `Car` must implement it.

### Line 9

```java
    @Override

```

* This tells Java that the method below is explicitly overriding a parent method. It helps prevent typos or mismatch errors.

### Line 10

```java
    void start() {

```

* This begins the mandatory implementation block for the abstract `start()` method.

### Line 11

```java
        System.out.println("Car started");

```

* This prints the specific startup behavior of a car.

### Line 16

```java
        Vehicle vehicle = new Car();

```

* A `Vehicle` reference type is created, pointing to a `Car` object in memory.
* This demonstrates polymorphism and abstraction working together.

### Line 17

```java
        vehicle.start();

```

* Calls the `start()` method. Since the underlying object is a `Car`, the child version runs.

### Line 18

```java
        vehicle.stop();

```

* Calls the inherited `stop()` method, which runs the shared logic defined directly within the abstract class.

---

## 8) Pseudocode

```text
BEGIN
    Create abstract class Vehicle
        Declare abstract method start()
        Declare concrete method stop()
            Print "Vehicle stopped"
    END

    Create class Car extends Vehicle
        Implement start()
            Print "Car started"
    END

    In main method
        Create Vehicle reference pointing to Car object
        Call start()
        Call stop()
    END
END

```

---

## 9) Step-by-step working

1. The program starts executing from the `main()` method.
2. A `Vehicle` reference is assigned to a newly allocated `Car` object.
3. `vehicle.start()` dynamically looks up the target object and calls the overridden `Car` implementation.
4. `vehicle.stop()` directly runs the shared implementation block written inside `Vehicle`.

---

## 10) Output

```text
Car started
Vehicle stopped

```

---

## 11) Why the output appears this way

The output is produced because:

* `start()` is abstract in the parent class and executed from the child class definition.
* `stop()` is already fully functional inside the abstract class and reused by the instance.

---

## 12) Important concept learned

This program teaches that abstract classes can provide:

* **Mandatory behavior rules** that subclasses must implement.
* **Reusable behavioral features** that subclasses can inherit directly without duplicating code.

---

## 13) Advantages of this design

* Eliminates code duplication.
* Keeps common base logic synchronized in one central place.
* Forces explicit structural compliance for critical actions.
* Simplifies scaling up the code when adding new subclasses.

---

## 14) Summary

This example shows that abstraction is not just about keeping methods incomplete. It is about designing a smart class hierarchy where some components are strictly enforced contracts and others are helpful, pre-built utilities.

---

## 15) One-line takeaway

An abstract class can define both structural rules and reusable logic for its subclasses.
