# Abstract Methods in Java – Deep Dive

---

## 1. Definition

An abstract method is a method that is declared without a body.
It only defines the method signature and tells the subclass what behavior must be provided.

## 2. Syntax of an abstract method

`abstract returnType methodName(parameters);`

Example:
`abstract void sound();`

## 3. Important rule

A method declared as abstract must not contain a body.
That means you must end it with a semicolon.

## 4. Why abstract methods are needed

Abstract methods are used when:

* the parent class knows the method name and purpose,
* but the exact implementation depends on the subclass.

Example:
Every animal can make a sound, but each animal makes a different sound.

## 5. Rule about abstract classes

If a class contains even one abstract method, the class must also be declared abstract.

## 6. What is a method signature?

The method signature includes:

* method name
* parameter list
* return type

Example:
`void sound()`

## 7. What is a method body?

The method body contains the actual code inside `{ }`.

Example:

```java
void sound() {
    System.out.println("Dog barks");
}

```

## 8. Difference between declaration and definition

* **Declaration:** tells Java the method exists
* **Definition:** gives the actual implementation

Abstract method:
`abstract void sound();`

Concrete method:

```java
void sound() {
    System.out.println("Dog barks");
}

```

## 9. Example program

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

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

public class AbstractMethodDemo {
    public static void main(String[] args) {
        Animal a1 = new Dog();
        Animal a2 = new Cat();

        a1.sound();
        a2.sound();
    }
}

```

## 10. Line-by-line explanation with comments

```java
abstract class Animal {               // Line 1: Declares abstract class Animal
    abstract void sound();             // Line 2: Declares abstract method with no body
}

class Dog extends Animal {             // Line 3: Dog inherits Animal
    @Override                          // Line 4: Indicates overriding
    void sound() {                      // Line 5: Provides implementation of sound()
        System.out.println("Dog barks"); // Line 6: Prints dog-specific behavior
    }
}

class Cat extends Animal {             // Line 7: Cat inherits Animal
    @Override                          // Line 8: Indicates overriding
    void sound() {                      // Line 9: Provides implementation of sound()
        System.out.println("Cat meows"); // Line 10: Prints cat-specific behavior
    }
}

public class AbstractMethodDemo {     // Line 11: Main class
    public static void main(String[] args) { // Line 12: Main method starts
        Animal a1 = new Dog();          // Line 13: Creates Dog object using Animal reference
        Animal a2 = new Cat();          // Line 14: Creates Cat object using Animal reference

        a1.sound();                     // Line 15: Calls Dog's sound()
        a2.sound();                     // Line 16: Calls Cat's sound()
    }
}

```

## 11. Output

```text
Dog barks
Cat meows

```

## 12. Why this is important

This example shows that the abstract method defines a contract,
while the subclasses provide the actual implementation.

## 13. Pseudocode

```text
START
    CREATE abstract class Animal
    DECLARE abstract method sound()

    CREATE class Dog extends Animal
    IMPLEMENT sound()

    CREATE class Cat extends Animal
    IMPLEMENT sound()

    CREATE Animal reference a1 = new Dog()
    CREATE Animal reference a2 = new Cat()
    CALL a1.sound()
    CALL a2.sound()
END

```

## 14. Summary

Abstract methods are methods without a body.
They tell subclasses what they must do.
The actual implementation is provided by the concrete subclasses.

## 15. Short note

An abstract method is a promise that the subclass must fulfill.
