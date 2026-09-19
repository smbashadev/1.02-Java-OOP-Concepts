# Understanding Constructors in Abstract Classes

---

## 1) Program Goal

This program demonstrates how constructors behave in abstract classes.
It shows that:

* An abstract class can have a constructor
* The constructor is used to initialize common fields
* When a subclass object is created, the parent constructor is executed automatically using constructor chaining via `super()`

---

## 2) Definitions

### Constructor

A constructor is a special block of code used to initialize objects when they are created.

### Abstract Class Constructor

Even though an abstract class cannot be instantiated directly, it can still have a constructor. This constructor is called during the object lifecycle creation of a concrete subclass instance.

### `super()`

`super()` is a keyword used inside a subclass constructor to call the parent class constructor.

### Why this program is important

This program is important because many beginners think abstract classes cannot have constructors. In reality, they are widely used to safely initialize instance fields shared by multiple child classes.

---

## 3) Why we use this program

We use this program to understand:

* How constructors in abstract classes operate
* How inheritance affects object memory allocation and initialization order
* Why `super()` is necessary when the parent class lacks a default constructor

---

## 4) How this helps Java developers

This helps developers design classes in a professional way. It teaches that common initialization logic can be written once in the abstract parent class and safely reused by all subclasses, maintaining clean and unified data records.

---

## 5) Real-world analogy

Think of an official company directory system where every employee profile must record an ID and name. Instead of copying that initialization profile script into every subclass, the abstract base class handles it once during registration.

---

## 6) Complete Java Program

```java
abstract class Animal {
    String name;

    Animal(String name) {
        this.name = name;
        System.out.println("Animal constructor called");
    }

    void display() {
        System.out.println("Animal name: " + name);
    }
}

class Dog extends Animal {
    Dog(String name) {
        super(name);
        System.out.println("Dog constructor called");
    }
}

public class Program_3_Abstract_Class_with_Constructors {
    public static void main(String[] args) {
        Dog dog = new Dog("Tommy");
        dog.display();
    }
}

```

---

## 7) Line-by-line explanation

### Line 1

```java
abstract class Animal {

```

* Declares an abstract class named `Animal` that serves as our blueprint.

### Line 2

```java
    String name;

```

* Declares an instance field named `name` to store the animal's identity data.

### Line 4

```java
    Animal(String name) {

```

* This is the parameterized constructor of our abstract class.

### Line 5

```java
        this.name = name;

```

* Assigns the value of the parameter to the local variable field using `this` reference.

### Line 6

```java
        System.out.println("Animal constructor called");

```

* Prints a message verifying that the base parent block has initialized.

### Line 9

```java
    void display() {

```

* Declares a normal, concrete method that prints the assigned variable state.

### Line 10

```java
        System.out.println("Animal name: " + name);

```

* Concatenates and prints the assigned string representation.

### Line 14

```java
class Dog extends Animal {

```

* Declares a subclass called `Dog` which inherits structural features from `Animal`.

### Line 15

```java
    Dog(String name) {

```

* Parameterized constructor of the `Dog` class.

### Line 16

```java
        super(name);

```

* Explicitly invokes the parent constructor, tracking parameters upstream.

### Line 17

```java
        System.out.println("Dog constructor called");

```

* Prints a message indicating that the child-specific block has successfully completed execution.

### Line 21

```java
public class Program_3_Abstract_Class_with_Constructors {

```

* Declares the entry wrapper class.

### Line 22

```java
    public static void main(String[] args) {

```

* Starts the execution runtime path.

### Line 23

```java
        Dog dog = new Dog("Tommy");

```

* Creates a `Dog` instance. Java chains execution to the parent constructor before finishing the subclass constructor block.

### Line 24

```java
        dog.display();

```

* Invokes the inherited utility method on the created object reference.

---

## 8) Pseudocode

```text
BEGIN
    Create abstract class Animal
        Declare field name
        Create constructor Animal(name)
            Set name
            Print "Animal constructor called"
        END

        Create method display()
            Print name
        END
    END

    Create class Dog extends Animal
        Create constructor Dog(name)
            Call super(name)
            Print "Dog constructor called"
        END
    END

    In main method
        Create Dog object with name "Tommy"
        Call display()
    END
END

```

---

## 9) Step-by-step working

1. The execution stack targets the `main()` container logic.
2. The runtime tries to construct an instance of `Dog` with `"Tommy"`.
3. The stack points immediately to `super(name)` within `Dog`'s constructor.
4. `Animal` constructor executes, logging its tracking output first.
5. Control drops back to finalize the subclass execution path.
6. The compiled `display()` routine runs, querying the stored instance strings.

---

## 10) Output

```text
Animal constructor called
Dog constructor called
Animal name: Tommy

```

---

## 11) Why the output appears this way

The output appears in this order because:

* The parent constructor runs completely before the child execution sequence block finishes
* Java guarantees the memory map configuration belonging to the superclass is initialized safely first

---

## 12) Important concept learned

This program teaches that abstract classes can still be responsible for initialization. It also shows the absolute structural requirement of constructor chaining using the `super` statement reference tool.

---

## 13) Advantages of this design

* Prevents initialization repetition inside cascading child hierarchies
* Promotes encapsulation by keeping the variables localized to the logical base script
* Guarantees parent setup properties exist safely before subroutines invoke them

---

## 14) Summary

This program clearly shows that abstract classes are not just empty templates. They can contain constructors, fields, and shared methods that help all subclasses work correctly.

---

## 15) One-line takeaway

An abstract class can initialize shared data through its constructor, and subclasses use `super()` to invoke it.
