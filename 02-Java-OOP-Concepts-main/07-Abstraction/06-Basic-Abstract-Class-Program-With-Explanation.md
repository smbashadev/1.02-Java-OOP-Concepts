# Basic Abstract Class with One Abstract Method Implemented by a Child Class

---

## 1) Program Goal

This program demonstrates one of the most important concepts in Java Object-Oriented Programming: **abstraction**.

The main idea is:

* A parent class can declare a method without providing its full body.
* A child class must provide the implementation.
* This helps us define a common contract while hiding unnecessary implementation details.

---

## 2) Definitions

### Abstract Class

An **abstract class** is a class that cannot be instantiated directly.
It is used to provide a common structure or behavior for subclasses.

### Abstract Method

An **abstract method** is a method declared without a body.
It tells the subclass: "You must implement this method."

### Concrete Class

A **concrete class** is a normal class that can be instantiated.
It must provide implementations for all abstract methods inherited from its parent.

### Why this program is important

This program helps us understand:

* how abstraction works in Java,
* how a parent class declares a common behavior,
* how a child class provides the actual behavior,
* and how Java enforces implementation through inheritance.

---

## 3) Why we use this program

We use this example because it is the simplest way to understand:

* abstraction,
* inheritance,
* method overriding,
* and the role of a base class in a real application.

This program is useful for beginners because it shows how the parent class can define a rule and child classes can follow it.

---

## 4) How this helps Java developers

This program helps Java developers because it teaches a very important design principle:

> A developer can define what must happen, while leaving the exact implementation to the subclasses.

This improves:

* code clarity,
* maintainability,
* extensibility,
* and reusability.

---

## 5) Real-world analogy

Imagine a company has a rule that every employee must do the task `work()`.
The company defines the rule, but each employee performs it in their own way.

Similarly, in Java:

* the abstract class defines the contract,
* the child class provides the actual working logic.

---

## 6) Complete Java Program

```java
abstract class Shape {
    abstract void draw();
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a circle");
    }
}

public class Program_1_Basic_Abstract_Class {
    public static void main(String[] args) {
        Shape shape = new Circle();
        shape.draw();
    }
}

```

---

## 7) Line-by-line explanation

### Line 1

```java
abstract class Shape {

```

* `abstract` means the class is incomplete and cannot be directly created.
* `Shape` is the parent class.
* This class is used to define a common structure for all shapes.

### Line 2

```java
    abstract void draw();

```

* `abstract` means the method has no implementation yet.
* `void` means the method does not return a value.
* `draw()` is the method that every subclass must provide.
* This is a contract that child classes must follow.

### Line 3

```java
}

```

* This closes the `Shape` class.
* It marks the end of the abstract class definition.

### Line 4

```java
class Circle extends Shape {

```

* `Circle` is a child class.
* `extends Shape` means `Circle` inherits from `Shape`.
* Since `Shape` has an abstract method, `Circle` must implement it.

### Line 5

```java
    @Override

```

* `@Override` is an annotation.
* It tells Java that this method is intended to override a method from the parent class.
* It improves readability and helps catch mistakes.

### Line 6

```java
    void draw() {

```

* This is the implementation of the abstract method `draw()`.
* The method now has a body.
* The child class provides the actual behavior.

### Line 7

```java
        System.out.println("Drawing a circle");

```

* This line prints the message to the console.
* It shows the exact action performed by the circle.

### Line 8

```java
    }

```

* This closes the `draw()` method.

### Line 9

```java
}

```

* This closes the `Circle` class.

### Line 10

```java
public class Program_1_Basic_Abstract_Class {

```

* This is the public class that contains the main method.
* The class name must match the file name.

### Line 11

```java
    public static void main(String[] args) {

```

* `public` means the method can be accessed from anywhere.
* `static` means the method belongs to the class, not an object.
* `void` means the method returns nothing.
* `main` is the entry point of the program.
* `String[] args` stores command-line arguments.

### Line 12

```java
        Shape shape = new Circle();

```

* `Shape` is the reference type.
* `new Circle()` creates a real object of the child class.
* This is a very important abstraction concept.
* We are using the parent type to hold the child object.

### Line 13

```java
        shape.draw();

```

* This calls the `draw()` method.
* Even though the reference type is `Shape`, the actual object is `Circle`.
* So Java calls the overridden version from `Circle`.

### Line 14

```java
    }

```

* This closes the `main()` method.

### Line 15

```java
}

```

* This closes the main class.

---

## 8) Pseudocode

```text
BEGIN
    Create abstract class Shape
        Declare abstract method draw()
    END

    Create class Circle that extends Shape
        Implement draw()
            Print "Drawing a circle"
        END
    END

    In main method
        Create object of Circle using Shape reference
        Call draw()
    END
END

```

---

## 9) Step-by-step working

1. The program starts from `main()`.
2. A `Shape` reference is created.
3. That reference points to a `Circle` object.
4. The `draw()` method is called using the `Shape` reference.
5. Since the object is actually a `Circle`, Java executes the `Circle` version of `draw()`.

---

## 10) Output

```text
Drawing a circle

```

---

## 11) Why the output appears this way

The output appears because:

* the object created is actually a `Circle`,
* the `draw()` method is overridden in the child class,
* and the runtime chooses the child implementation.

---

## 12) Important concept learned

This program teaches that abstraction allows us to:

* define a common behavior,
* force subclasses to implement details,
* and write flexible code.

---

## 13) Advantages of this approach

* Reduces duplication of code.
* Makes the design cleaner.
* Supports future extension.
* Helps enforce a consistent structure.
* Allows the program to depend on a general idea instead of specific details.

---

## 14) Summary

This example shows the core concept of abstraction:

* the parent class defines what should happen,
* the child class decides how it happens.

It is a beginner-friendly program, but it is also a strong example of professional object-oriented design.

---

## 15) One-line takeaway

Abstraction lets us define what a class must do, while allowing subclasses to decide how to do it.
