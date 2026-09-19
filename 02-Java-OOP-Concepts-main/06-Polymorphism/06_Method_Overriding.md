# Method Overriding in Java

## 1. Definition

* **Primary Definition:** Method overriding is a feature in Java where a child class provides its own implementation of a method that is already defined in the parent class. The method name, return type, and parameters must exactly match the parent method.
* **One-Line Definition:** Method overriding is when a subclass provides a new implementation of a method already present in the superclass.

---

## 2. Why This Concept is Used

* It allows a child class to change inherited behavior.
* It helps in implementing polymorphism.
* It makes code more specific and meaningful for the child class.
* It improves code flexibility and readability.

---

## 3. How This Helps Java Programming

* Lets subclasses customize inherited behavior.
* Helps in writing cleaner object-oriented programs.
* Supports runtime behavior based on the actual object type.
* Makes real-world modeling easier.

---

## 4. Important Theory

* The method in the child class **must** have the same signature as the parent method.
* The return type should be compatible.
* The `@Override` annotation is optional but highly recommended (it helps the compiler catch errors).
* Overriding is the core mechanism used for **runtime polymorphism**.
* **Important Note:** The overriding method must always have the exact same name and parameters as the parent method.

---

## 5. Example Idea

* An `Animal` class has a method `sound()`.
* A `Dog` class inherits from `Animal` but overrides `sound()` with a different, specific behavior (e.g., barking).

---

## 6. Program 1: Method Overriding Example

### Headline:

Customizing Inherited Behavior in a Child Class

### Definition of This Program:

* This program is used to show how a child class can replace the behavior of a parent method.
* It helps developers understand overriding clearly in a practical scenario.

### How This Program Helps in Java Learning:

* Shows the exact difference between parent and child behavior.
* Helps explain runtime polymorphism.
* Makes Object-Oriented Programming (OOP) concepts easier to understand.

#### Code with Comments on Every Line:

```java
class Animal {                                           // Line 1: Declares the parent class Animal
    void sound() {                                       // Line 2: Declares the sound() method in Animal
        System.out.println("Animal makes a sound");      // Line 3: Prints a message for Animal
    }                                                    // Line 4: Ends the sound() method
}                                                        // Line 5: Ends the Animal class

class Dog extends Animal {                               // Line 6: Dog inherits from Animal
    @Override                                            // Line 7: Shows that this method overrides a parent method
    void sound() {                                       // Line 8: Declares the same sound() method in Dog
        System.out.println("Dog barks");                 // Line 9: Prints a dog-specific message
    }                                                    // Line 10: Ends the sound() method
}                                                        // Line 11: Ends the Dog class

public class MethodOverridingDemo {                      // Line 12: Declares the main class
    public static void main(String[] args) {             // Line 13: Starts the main method
        Animal a = new Animal();                         // Line 14: Creates an Animal object
        Dog d = new Dog();                               // Line 15: Creates a Dog object

        a.sound();                                       // Line 16: Calls Animal's sound() method
        d.sound();                                       // Line 17: Calls Dog's overridden sound() method
    }                                                    // Line 18: Ends the main method
}                                                        // Line 19: Ends the class

```

#### Explanation of Every Line:

1. `class Animal {`
Declares the parent class Animal.
2. `void sound() {`
Declares the `sound()` method in Animal.
3. `System.out.println("Animal makes a sound");`
Prints a generic message for Animal.
4. `}`
Ends the `sound()` method.
5. `}`
Ends the `Animal` class.
6. `class Dog extends Animal {`
Declares the `Dog` class, which inherits from `Animal`.
7. `@Override`
An annotation indicating this method overrides a parent method.
8. `void sound() {`
Declares the same `sound()` method in Dog.
9. `System.out.println("Dog barks");`
Prints a dog-specific message.
10. `}`
Ends the overridden `sound()` method.
11. `}`
Ends the `Dog` class.
12. `public class MethodOverridingDemo {`
Declares the main class.
13. `public static void main(String[] args) {`
Starts the main method.
14. `Animal a = new Animal();`
Creates an `Animal` object.
15. `Dog d = new Dog();`
Creates a `Dog` object.
16. `a.sound();`
Calls the `Animal` class's original `sound()` method.
17. `d.sound();`
Calls the `Dog` class's overridden `sound()` method.
18. `}`
Ends the main method.
19. `}`
Ends the class.

#### Pseudocode:

```text
START
    CREATE class Animal
    DEFINE sound()

    CREATE class Dog extends Animal
    OVERRIDE sound()

    CREATE main method
    CREATE Animal object
    CREATE Dog object
    CALL a.sound()
    CALL d.sound()
END

```

#### Output:

```text
Animal makes a sound
Dog barks

```

#### Summary:

Method overriding allows a child class to provide a specific implementation of a method already defined in the parent class. In this example, `Dog` successfully overrides the `sound()` method of `Animal`.

---

## 7. Visualizing Method Overriding

### Class Hierarchy & Override Structure:

```text
  Animal
    │
    │ inherits
    ▼
   Dog

Animal has:
 - sound()

Dog has:
 - sound()   <-- overridden

```

### Simple Execution Flow Diagram:

```text
          Start
            │
            ▼
   Create Animal object
            │
            ▼
 Call sound() from Animal
            │
            ▼
    Create Dog object
            │
            ▼
 Call sound() from Dog (overridden)
            │
            ▼
           End

```
