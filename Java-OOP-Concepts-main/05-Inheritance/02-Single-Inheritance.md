# Single Inheritance in Java

## Introduction to Single Inheritance

### Definition

Single inheritance is a core Object-Oriented Programming (OOP) mechanism where a subclass (child class) inherits the state and behaviors of exactly one superclass (parent class). In Java, this structural relationship is strictly enforced using the `extends` keyword. A class can never have more than one direct parent class.

### Strategic Engineering Value

* **Code Reusability:** Derived classes immediately reuse compiled logic from the base class without copying code.
* **Streamlined Maintenance:** Universal system updates can be applied directly to the superclass, cascading down to all subclasses.
* **Polymorphic Foundations:** Single inheritance sets up a clear "IS-A" relationship (e.g., a `Dog` IS-A `Animal`), which forms the basis for runtime polymorphism and clean dynamic method dispatch.

---

## Technical Architecture

```
       ┌────────────────────────┐
       │   Superclass: Animal   │
       └───────────┬────────────┘
                   │
                   │ extends
                   ▼
       ┌────────────────────────┐
       │     Subclass: Dog      │
       └────────────────────────┘

```

### Member Inheritance Layout

* **Superclass `Animal` Surface:** Declares foundational actions like `eat()`.
* **Subclass `Dog` Surface:** Extends the parent's capabilities by adding specialized actions like `bark()`. At runtime, a `Dog` instance has access to both interfaces.

---

## Code Implementation: Single Inheritance Breakdown

### Implementation File

```java
// Base class providing generic state behaviors
class Animal {
    public void eat() {
        System.out.println("Animal eats food");
    }
}

// Derived class extending exactly one superclass
class Dog extends Animal {
    public void bark() {
        System.out.println("Dog barks");
    }
}

// Main execution entry point
public class SingleInheritanceDemo {
    public static void main(String[] args) {
        // Instantiates the child object in memory
        Dog d = new Dog();
        
        // Invokes inherited behavior from the parent class
        d.eat();
        
        // Invokes specialized behavior from the child class
        d.bark();
    }
}

```

### Execution Output

```text
Animal eats food
Dog barks

```

---

## Execution Logic and Step-by-Step Flow

### Operational Pipeline

```
  [Start Execution]
          │
          ▼
  [Instantiate Dog Object 'd' in Heap Space]
          │
          ▼
  [Invoke d.eat() via Superclass Reference Path]
          │
          ▼
  [Invoke d.bark() via Direct Subclass Reference Path]
          │
          ▼
   [End Execution]

```

### High-Level Pseudocode

```text
START
    DEFINE Class Animal:
        METHOD eat():
            PRINT "Animal eats food"

    DEFINE Class Dog EXTENDS Animal:
        METHOD bark():
            PRINT "Dog barks"

    DEFINE Execution Class SingleInheritanceDemo:
        EXECUTE main:
            ALLOCATE AND INSTANTIATE Dog object as 'd'
            EXECUTE d.eat()   // Inherited Lookup
            EXECUTE d.bark()  // Direct Lookup
END

```

---

## Architectural Summary

* **Explicit Parentage:** Java limits class-level hierarchies to single inheritance to prevent the complexity and conflicts of multiple inheritance (such as the famous "Diamond Problem").
* **Structural Is-A Relationship:** By using `class Dog extends Animal`, the `Dog` class implicitly receives all non-private fields and methods from `Animal` while keeping its own implementation clean.

> **Key Takeaway:** Single inheritance ensures a clean, single-parent lineage for every Java class. This keeps class relationships straightforward and prevents inheritance conflicts while maximizing code reuse.

---
