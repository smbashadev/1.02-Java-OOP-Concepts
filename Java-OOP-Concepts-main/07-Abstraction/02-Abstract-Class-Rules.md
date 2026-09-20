# Abstract Class Rules in Java

---

## 1. Definition

An abstract class is a class that cannot be instantiated directly.
It is used as a base class for other classes.

## 2. Use of the abstract keyword

The abstract keyword is used to declare:

* abstract classes
* abstract methods

## 3. Why abstract classes cannot be instantiated

An abstract class is incomplete by design.
It may contain abstract methods that do not have a body.
Because of that, Java does not allow creating objects of an abstract class directly.

## 4. Important rule

A class that contains at least one abstract method must be declared abstract.

## 5. Another important rule

A subclass of an abstract class must either:

* implement all abstract methods, or
* be declared abstract itself.

## 6. Abstract method rule

An abstract method has:

* no body
* only a declaration ending with a semicolon

Example:
`abstract void display();`

## 7. Concrete class rule

A class that implements all abstract methods becomes a concrete class and can be instantiated.

## 8. Example program

```java
abstract class Animal {
    abstract void sound();

    void sleep() {
        System.out.println("Animal sleeps");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class AbstractClassDemo {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
        d.sleep();
    }
}

```

## 9. Line-by-line explanation with comments

```java
abstract class Animal {                // Line 1: Declares an abstract class
    abstract void sound();              // Line 2: Declares abstract method with no body

    void sleep() {                      // Line 3: Normal method with body
        System.out.println("Animal sleeps"); // Line 4: Prints sleep message
    }
}

class Dog extends Animal {              // Line 5: Dog extends Animal
    @Override                           // Line 6: Overriding abstract method
    void sound() {                      // Line 7: Provides implementation for sound()
        System.out.println("Dog barks"); // Line 8: Prints bark message
    }
}

public class AbstractClassDemo {       // Line 9: Main class
    public static void main(String[] args) { // Line 10: Main method starts
        Dog d = new Dog();              // Line 11: Creates Dog object
        d.sound();                      // Line 12: Calls overridden sound()
        d.sleep();                      // Line 13: Calls inherited sleep()
    }
}

```

## 10. Output

```text
Dog barks
Animal sleeps

```

## 11. Why this example is important

It shows that abstract classes can define common behavior and force subclasses to provide specific behavior.

## 12. Pseudocode

```text
START
    DEFINE abstract class Animal
    DECLARE abstract method sound()
    DEFINE normal method sleep()

    DEFINE class Dog extends Animal
    IMPLEMENT sound()

    CREATE Dog object
    CALL sound()
    CALL sleep()
END

```

## 13. Summary

An abstract class cannot be instantiated because it may contain incomplete methods.
The abstract keyword is used to declare abstract classes and abstract methods.

## 14. Short one-line note

An abstract class is a blueprint that cannot be used to create objects directly.
