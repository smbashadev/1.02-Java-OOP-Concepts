# Interface-vs-Abstract-Class

---

## 1. What is an Interface?

An interface in Java is a contract that defines what a class must do.
It describes behavior without giving full implementation.
Interfaces are mainly used for abstraction and multiple inheritance of type.

---

## 2. What is an Abstract Class?

An abstract class is a class that cannot be instantiated directly.
It may contain both abstract methods and concrete methods.
It is used when classes share common behavior and also need some common implementation.

---

## 3. Why this topic is important?

Many beginners get confused between interface and abstract class.
Both are used for abstraction, but they are different in rules and usage.
Understanding the difference helps you write better object-oriented code.

---

## 4. Main Differences Between Interface and Abstract Class

| Feature | Interface | Abstract Class |
| --- | --- | --- |
| **Keyword** | interface | abstract class |
| **Instantiation** | Cannot be instantiated | Cannot be instantiated |
| **Methods** | Can contain abstract methods and default/static/private methods | Can contain abstract and concrete methods |
| **Fields** | Only public static final constants | Can have normal fields and constructors |
| **Inheritance** | A class can implement many interfaces | A class can extend only one abstract class |
| **Purpose** | Defines contract/behavior | Defines partial implementation |
| **Multiple inheritance** | Supported through interfaces | Not supported |
| **Access modifiers** | Methods are public by default | Methods can have any access modifier |

---

## 5. Program 1: Example of Interface

**Headline:** Demonstrating how an interface defines behavior without implementation.

### Why this program is used:

This example shows how an interface tells the class what methods it must provide.
It is helpful when different classes need to follow the same contract.

### Program Code:

```java
interface Vehicle {
    void start();
    void stop();
}

class Car implements Vehicle {
    public void start() {
        System.out.println("Car started");
    }

    public void stop() {
        System.out.println("Car stopped");
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        Vehicle v = new Car();
        v.start();
        v.stop();
    }
}

```

### Detailed explanation:

* Vehicle is an interface.
* It declares start() and stop() methods.
* Car implements the interface and defines both methods.
* The main method creates a Vehicle reference pointing to a Car object.

### Pseudocode:

1. Create interface Vehicle.
2. Declare start() and stop().
3. Create class Car implementing Vehicle.
4. Define start() and stop().
5. In main, create Car object using Vehicle reference.
6. Call start() and stop().

### Output:

```text
Car started
Car stopped

```

### Summary:

This example shows that an interface defines behavior that different classes can implement.

---

## 6. Program 2: Example of Abstract Class

**Headline:** Demonstrating how an abstract class provides partial implementation.

### Why this program is used:

This example shows that an abstract class can contain common code as well as abstract methods.
It is useful when several classes share the same base logic.

### Program Code:

```java
abstract class Animal {
    public void eat() {
        System.out.println("Animal is eating");
    }

    abstract void sound();
}

class Dog extends Animal {
    public void sound() {
        System.out.println("Dog barks");
    }
}

public class AbstractClassExample {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.eat();
        a.sound();
    }
}

```

### Detailed explanation:

* Animal is an abstract class.
* It has a concrete method eat() and an abstract method sound().
* Dog extends Animal and implements sound().
* The main method calls both methods.

### Pseudocode:

1. Create abstract class Animal.
2. Add concrete method eat().
3. Add abstract method sound().
4. Create Dog class extending Animal.
5. Implement sound().
6. In main, create Dog object using Animal reference.
7. Call eat() and sound().

### Output:

```text
Animal is eating
Dog barks

```

### Summary:

This example shows that an abstract class can share common implementation while leaving some behavior to subclasses.

---

## 7. When to Use Interface?

Use an interface when:

* You want to define a contract.
* Multiple unrelated classes need to follow the same behavior.
* You want to support multiple inheritance of type.
* You want loose coupling.

---

## 8. When to Use Abstract Class?

Use an abstract class when:

* You want to share common code among related classes.
* You want to provide some implemented methods and some abstract methods.
* You want to use constructors or fields in the base class.

---

## 9. Real-world Analogy

Think of an interface as a rulebook.
It tells you what actions must be available.
Think of an abstract class as a partially completed template.
It gives some ready-made instructions and leaves some work for the subclass.

---

## 10. Final Conclusion

An interface and an abstract class both support abstraction, but they are used for different purposes.
Use an interface when you want a contract for behavior.
Use an abstract class when you want shared implementation along with abstraction.
A strong understanding of both helps in writing professional Java programs.
