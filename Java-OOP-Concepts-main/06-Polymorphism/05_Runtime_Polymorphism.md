# Runtime Polymorphism in Java

## 1. Introduction to Runtime Polymorphism

### Definition:

* Runtime polymorphism is a feature in Java that allows the same method call to behave differently at runtime.
* It is achieved through method overriding.
* The actual method that is executed is decided during program execution, not during compilation.

### Professional Definition:

* Runtime polymorphism means that a reference variable of a parent class can point to an object of a child class, and the JVM decides which overridden method to call at runtime.

### Why Runtime Polymorphism is Important:

* It helps write flexible and reusable programs.
* It allows one interface to be used for multiple implementations.
* It promotes loose coupling and clean object-oriented design.
* It improves maintainability and scalability of software systems.

### How Runtime Polymorphism Helps Java:

* It enables dynamic behavior in applications.
* It allows developers to design generic code that works with different object types.
* It supports abstraction and extensibility.

### Real-World Analogy:

* A single button named "Start" may behave differently in different machines.
* The same action name can produce different results depending on the object.

### Important Note:

* Runtime polymorphism is also called **Dynamic Method Dispatch**.
* It is resolved by the JVM at runtime.

---

## 2. Difference Between Compile-Time and Runtime Polymorphism

### Definition:

* Compile-time polymorphism is resolved during compilation.
* Runtime polymorphism is resolved during execution.

### Compile-Time Polymorphism:

* Achieved by method overloading.
* The compiler checks the method signature early.

### Runtime Polymorphism:

* Achieved by method overriding.
* The JVM decides the correct method at runtime.

### Why This Difference Matters:

* Understanding both helps developers choose the right design for software problems.
* It improves code quality and debugging skills.

---

## 3. Rules of Runtime Polymorphism

1. It is achieved through method overriding.
2. The method in the parent class and child class must have the same name.
3. The method signature must be the same.
4. The return type should be compatible.
5. The parent reference variable can hold child object references.
6. The actual method to execute is determined at runtime.
7. It is also known as dynamic binding.

### Example Concept:

* `Animal animal = new Dog();`
* `animal.sound();`
* The output depends on the object created at runtime.

---

## 4. Scenario 1: Basic Method Overriding

### Headline:

Using the Same Method Name in Parent and Child Classes

### Definition of This Program:

* This program demonstrates how a child class can override a method of a parent class.
* The same method name is used, but the child class provides its own behavior.

### Why This Program is Used:

* To explain the core concept of method overriding.
* To show how runtime polymorphism starts with inheritance.
* To help understand how Java chooses the overridden method dynamically.

### How This Helps Java:

* It teaches the foundation of object-oriented programming.
* It helps developers build flexible class hierarchies.
* It improves code reuse and design clarity.

### Program 1: Basic Method Overriding

#### Code with Comments on Every Line:

```java
class Animal {                                                // Line 1: Declares a parent class named Animal
    void sound() {                                            // Line 2: Declares a method sound() in Animal
        System.out.println("Animal makes a sound");           // Line 3: Prints a general message
    }                                                         // Line 4: Ends sound() in Animal
}

class Dog extends Animal {                                    // Line 5: Declares Dog class that extends Animal
    void sound() {                                            // Line 6: Declares sound() again in Dog
        System.out.println("Dog barks");                      // Line 7: Prints Dog-specific message
    }                                                         // Line 8: Ends sound() in Dog
}

public class RuntimePolymorphismDemo1 {                       // Line 9: Declares public class
    public static void main(String[] args) {                  // Line 10: Declares main method
        Animal a = new Animal();                              // Line 11: Creates Animal object
        Animal d = new Dog();                                 // Line 12: Creates Dog object using Animal reference

        a.sound();                                            // Line 13: Calls sound() on Animal object
        d.sound();                                            // Line 14: Calls sound() on Dog object
    }                                                         // Line 15: Ends main method
}                                                             // Line 16: Ends class

```

#### Explanation of Every Line:

1. `class Animal {`
Declares the base class.
2. `void sound() {`
Defines the method that will be overridden.
3. `System.out.println("Animal makes a sound");`
Prints the parent class behavior.
4. `}`
Ends the parent method.
5. `class Dog extends Animal {`
Declares the child class.
6. `void sound() {`
Defines the overridden method.
7. `System.out.println("Dog barks");`
Prints the child-specific behavior.
8. `}`
Ends the child method.
9. `public class RuntimePolymorphismDemo1 {`
Declares the main class.
10. `public static void main(String[] args) {`
Starts the execution point.
11. `Animal a = new Animal();`
Creates an object of the parent class.
12. `Animal d = new Dog();`
Creates a child object but stores it in a parent reference.
13. `a.sound();`
Calls the parent version.
14. `d.sound();`
Calls the overridden child version at runtime.
15. `}`
Ends the main method.
16. `}`
Ends the class.

#### Pseudocode:

```
START
    CREATE Animal class with sound()
    CREATE Dog class overriding sound()
    CREATE Animal reference a = new Animal()
    CREATE Animal reference d = new Dog()
    CALL a.sound()
    CALL d.sound()
END

```

#### Output:

```
Animal makes a sound
Dog barks

```

#### Summary:

* This program shows basic method overriding.
* It proves that Java can call different versions of the same method depending on the object.
* It is the simplest example of runtime polymorphism.

---

## 5. Scenario 2: Dynamic Method Dispatch

### Headline:

Using Parent Reference to Call Child Behavior

### Definition of This Program:

* This program demonstrates dynamic method dispatch.
* A superclass reference is used to point to a subclass object.

### Why This Program is Used:

* To show how Java decides which overridden method to run during execution.
* To explain the real mechanism behind runtime polymorphism.

### How This Helps Java:

* It teaches the practical use of polymorphism in code design.
* It shows how one reference can represent multiple object behaviors.

### Program 2: Dynamic Method Dispatch

#### Code with Comments on Every Line:

```java
class Vehicle {                                             // Line 1: Declares parent class Vehicle
    void start() {                                          // Line 2: Declares start() in Vehicle
        System.out.println("Vehicle is starting");          // Line 3: Prints generic vehicle message
    }                                                       // Line 4: Ends start() in Vehicle
}

class Car extends Vehicle {                                 // Line 5: Declares Car class extending Vehicle
    void start() {                                          // Line 6: Declares overridden start() in Car
        System.out.println("Car is starting");              // Line 7: Prints car-specific message
    }                                                       // Line 8: Ends start() in Car
}

class Bike extends Vehicle {                                // Line 9: Declares Bike class extending Vehicle
    void start() {                                          // Line 10: Declares overridden start() in Bike
        System.out.println("Bike is starting");             // Line 11: Prints bike-specific message
    }                                                       // Line 12: Ends start() in Bike
}

public class RuntimePolymorphismDemo2 {                      // Line 13: Declares public class
    public static void main(String[] args) {                 // Line 14: Declares main method
        Vehicle v1 = new Car();                             // Line 15: Creates Car object and stores in Vehicle reference
        Vehicle v2 = new Bike();                            // Line 16: Creates Bike object and stores in Vehicle reference

        v1.start();                                         // Line 17: Calls start() using v1 reference
        v2.start();                                         // Line 18: Calls start() using v2 reference
    }                                                       // Line 19: Ends main method
}                                                           // Line 20: Ends class

```

#### Explanation of Every Line:

1. `class Vehicle {`
Declares the base class.
2. `void start() {`
Declares the method to be overridden.
3. `System.out.println("Vehicle is starting");`
Prints a generic message.
4. `}`
Ends the base method.
5. `class Car extends Vehicle {`
Declares a subclass.
6. `void start() {`
Overriding the parent method.
7. `System.out.println("Car is starting");`
Prints the specific behavior of Car.
8. `}`
Ends the Car method.
9. `class Bike extends Vehicle {`
Declares another subclass.
10. `void start() {`
Overriding the parent method.
11. `System.out.println("Bike is starting");`
Prints the specific behavior of Bike.
12. `}`
Ends the Bike method.
13. `public class RuntimePolymorphismDemo2 {`
Declares the main class.
14. `public static void main(String[] args) {`
Starts the program.
15. `Vehicle v1 = new Car();`
Uses a parent reference to point to a Car object.
16. `Vehicle v2 = new Bike();`
Uses a parent reference to point to a Bike object.
17. `v1.start();`
Calls the start method of the actual object.
18. `v2.start();`
Calls the start method of the actual object.
19. `}`
Ends main method.
20. `}`
Ends class.

#### Pseudocode:

```
START
    CREATE Vehicle with start()
    CREATE Car extends Vehicle and overrides start()
    CREATE Bike extends Vehicle and overrides start()
    CREATE Vehicle reference v1 = new Car()
    CREATE Vehicle reference v2 = new Bike()
    CALL v1.start()
    CALL v2.start()
END

```

#### Output:

```
Car is starting
Bike is starting

```

#### Summary:

* This program shows the actual working of runtime polymorphism.
* Java selects the correct method based on the object created at runtime.
* It is a strong example of dynamic method dispatch.

---

## 6. Scenario 3: Runtime Polymorphism with Abstract Class

### Headline:

Using Polymorphism Through Abstraction

### Definition of This Program:

* This program shows runtime polymorphism using an abstract class.
* Different subclasses provide their own implementation of the same method.

### Why This Program is Used:

* To explain how abstraction and polymorphism work together.
* To show a real-world design style used in large applications.

### How This Helps Java:

* It teaches better software architecture.
* It allows the same operation to be performed for different shapes or entities.
* It improves maintainability and code organization.

### Program 3: Runtime Polymorphism with Abstract Class

#### Code with Comments on Every Line:

```java
abstract class Shape {                                      // Line 1: Declares abstract class Shape
    abstract void draw();                                   // Line 2: Declares abstract method draw()
}

class Circle extends Shape {                                 // Line 3: Declares Circle subclass
    void draw() {                                            // Line 4: Implements draw() in Circle
        System.out.println("Drawing Circle");             // Line 5: Prints circle message
    }                                                       // Line 6: Ends draw() in Circle
}

class Rectangle extends Shape {                              // Line 7: Declares Rectangle subclass
    void draw() {                                            // Line 8: Implements draw() in Rectangle
        System.out.println("Drawing Rectangle");          // Line 9: Prints rectangle message
    }                                                       // Line 10: Ends draw() in Rectangle
}

public class RuntimePolymorphismDemo3 {                       // Line 11: Declares public class
    public static void main(String[] args) {                 // Line 12: Declares main method
        Shape s1 = new Circle();                             // Line 13: Stores Circle object in Shape reference
        Shape s2 = new Rectangle();                          // Line 14: Stores Rectangle object in Shape reference

        s1.draw();                                           // Line 15: Calls draw() on Circle object
        s2.draw();                                           // Line 16: Calls draw() on Rectangle object
    }                                                       // Line 17: Ends main method
}                                                            // Line 18: Ends class

```

#### Explanation of Every Line:

1. `abstract class Shape {`
Declares an abstract base class.
2. `abstract void draw();`
Declares a method without implementation.
3. `class Circle extends Shape {`
Declares a subclass.
4. `void draw() {`
Provides implementation for draw().
5. `System.out.println("Drawing Circle");`
Prints the circle behavior.
6. `}`
Ends the draw method.
7. `class Rectangle extends Shape {`
Declares another subclass.
8. `void draw() {`
Provides implementation for draw().
9. `System.out.println("Drawing Rectangle");`
Prints the rectangle behavior.
10. `}`
Ends the draw method.
11. `public class RuntimePolymorphismDemo3 {`
Declares the main class.
12. `public static void main(String[] args) {`
Starts program execution.
13. `Shape s1 = new Circle();`
Uses a Shape reference to point to Circle object.
14. `Shape s2 = new Rectangle();`
Uses a Shape reference to point to Rectangle object.
15. `s1.draw();`
Calls the overridden draw() method for Circle.
16. `s2.draw();`
Calls the overridden draw() method for Rectangle.
17. `}`
Ends main method.
18. `}`
Ends class.

#### Pseudocode:

```
START
    CREATE abstract Shape with abstract draw()
    CREATE Circle overriding draw()
    CREATE Rectangle overriding draw()
    CREATE Shape reference s1 = new Circle()
    CREATE Shape reference s2 = new Rectangle()
    CALL s1.draw()
    CALL s2.draw()
END

```

#### Output:

```
Drawing Circle
Drawing Rectangle

```

#### Summary:

* This program shows runtime polymorphism with abstraction.
* The same method name works differently for different shapes.
* It is a professional way to design extensible systems.

---

## 7. Advantages of Runtime Polymorphism

* Helps create flexible and reusable code
* Supports method overriding
* Allows one interface to represent many behaviors
* Improves maintainability and readability
* Makes large applications easier to extend
* Promotes clean object-oriented design

---

## 8. Common Interview Questions

1. What is runtime polymorphism in Java?
2. What is method overriding?
3. How is runtime polymorphism different from compile-time polymorphism?
4. What is dynamic method dispatch?
5. Why is runtime polymorphism called dynamic binding?
6. Can a parent reference hold a child object?
7. What is the role of the JVM in runtime polymorphism?

---

## 9. Final Conclusion

Runtime polymorphism is one of the most important concepts in Java. It allows the same method call to behave differently depending on the actual object at runtime. This concept is mainly achieved using method overriding and parent-child class relationships.

In simple words:

* Same method name
* Different behavior
* Decided at runtime

This is a very powerful concept in object-oriented programming because it makes software flexible, scalable, and professional.
