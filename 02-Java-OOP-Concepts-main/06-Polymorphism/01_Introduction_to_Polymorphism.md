# Polymorphism in Java

## 1. Introduction to Polymorphism

Definition:

* Polymorphism is one of the four major pillars of Object-Oriented Programming (OOP).
* The word "polymorphism" comes from Greek words:
* poly = many
* morph = forms


* So, polymorphism means "one thing having many forms".

Professional definition:

* In Java, Polymorphism is a piller / paradigm /  concept of Object Oriented Programming which enables to use one entity of class to exixtes in multiple forms.
* In other words polymorphism enables one entity to behave in multiple ways.
* Using polymorphism we can achieve code reduction as well as code flexibility.

Why polymorphism is important:

* It improves code readability.
* It reduces duplicate logic.
* It allows the same method name to be used in different situations.
* It helps in designing clean object-oriented systems.
* It supports runtime behavior changes in a controlled way.

How polymorphism helps Java:

* It allows developers to write code that works with multiple object types.
* It provides flexibility in method calling.
* It makes code easier to extend when new classes are added.
* It supports abstraction and loose coupling.

Real-world example:

* A single action like "makeSound()" can behave differently for a Dog, Cat, and Cow.
* The action is same, but behavior changes based on object type.

Important note:

* Polymorphism in Java is mainly achieved through:
1. Method Overloading
2. Method Overriding



---

## 2. Types of Polymorphism

A. Compile-Time Polymorphism

* Also called Static Polymorphism.
* The decision of which method to call is made at compile time.
* It is achieved using method overloading.

B. Runtime Polymorphism

* Also called Dynamic Polymorphism.
* The decision of which method to call is made at runtime.
* It is achieved using method overriding.

Difference between compile-time and runtime polymorphism:

* Compile-time polymorphism: method overloading
* Runtime polymorphism: method overriding

---

## 3. Core Concepts Related to Polymorphism

A. Method Overloading

* Same method name
* Different parameters
* Different number or types of parameters
* Happens in the same class

B. Method Overriding

* Same method name and signature
* Defined in parent and child class
* Child class provides its own implementation

C. Upcasting

* A child object can be assigned to a parent reference.

D. Dynamic Method Dispatch

* The JVM decides which overridden method to call at runtime.

---

## 4. Scenario 1: Method Overloading (Compile-Time Polymorphism)

Headline:
Method Overloading Demonstrates Compile-Time Polymorphism

Definition of this program:

* This program shows how the same method name can be used multiple times with different parameters.
* It helps in understanding compile-time polymorphism.

Why this program is used:

* To show that Java can decide which method to call based on the arguments passed.
* To reduce repeated method names for similar operations.

How this helps Java:

* It teaches how to write cleaner and more reusable code.
* It helps developers handle multiple forms of the same operation.
* It improves code organization.

Program 1: Method Overloading Example

Code with comments on every line:

```java
class Calculator {                                                // Line 1: Declares a class named Calculator
    int add(int a, int b) {                                        // Line 2: Declares add() with two integer parameters
        return a + b;                                              // Line 3: Returns the sum of a and b
    }                                                              // Line 4: Ends the first add() method

    int add(int a, int b, int c) {                                 // Line 5: Declares add() with three integer parameters
        return a + b + c;                                          // Line 6: Returns the sum of a, b and c
    }                                                              // Line 7: Ends the second add() method

    double add(double a, double b) {                                // Line 8: Declares add() with two double parameters
        return a + b;                                              // Line 9: Returns the sum of double values
    }                                                              // Line 10: Ends the third add() method
}

public class PolymorphismDemo1 {                                    // Line 11: Declares the main class
    public static void main(String[] args) {                       // Line 12: Declares the main method
        Calculator calc = new Calculator();                         // Line 13: Creates an object of Calculator

        System.out.println(calc.add(5, 3));                        // Line 14: Calls add(int, int)
        System.out.println(calc.add(5, 3, 2));                     // Line 15: Calls add(int, int, int)
        System.out.println(calc.add(2.5, 3.5));                   // Line 16: Calls add(double, double)
    }                                                              // Line 17: Ends the main method
}                                                                  // Line 18: Ends the PolymorphismDemo1 class

```

Explanation of every line:

1. `class Calculator {`
Declares a class named `Calculator` to hold overloaded methods.
2. `int add(int a, int b) {`
Declares a method named `add` that accepts two integers.
3. `return a + b;`
Returns the sum of the two integer values.
4. `}`
Closes the first `add` method.
5. `int add(int a, int b, int c) {`
Declares another `add` method with three integer parameters.
6. `return a + b + c;`
Returns the sum of three integers.
7. `}`
Closes the second `add` method.
8. `double add(double a, double b) {`
Declares a third overloaded method using double values.
9. `return a + b;`
Returns the sum of two doubles.
10. `}`
Closes the third `add` method.
11. `public class PolymorphismDemo1 {`
Declares the public class containing the program logic.
12. `public static void main(String[] args) {`
Declares the main method where program execution starts.
13. `Calculator calc = new Calculator();`
Creates an object of the `Calculator` class.
14. `System.out.println(calc.add(5, 3));`
Calls the version of `add` that accepts two integers.
15. `System.out.println(calc.add(5, 3, 2));`
Calls the version of `add` that accepts three integers.
16. `System.out.println(calc.add(2.5, 3.5));`
Calls the version of `add` that accepts two doubles.
17. `}`
Ends the main method.
18. `}`
Ends the class.

Pseudocode:
START
CREATE Calculator class
DEFINE add(int, int)
DEFINE add(int, int, int)
DEFINE add(double, double)

```
CREATE object calc
CALL add(5, 3)
CALL add(5, 3, 2)
CALL add(2.5, 3.5)

```

END

Output:
8
10
6.0

Summary:

* This program clearly demonstrates compile-time polymorphism.
* The method name `add` is reused with different parameter lists.
* Java selects the correct method based on the arguments passed.

---

## 5. Scenario 2: Method Overriding (Runtime Polymorphism)

Headline:
Method Overriding Demonstrates Runtime Polymorphism

Definition of this program:

* This program shows how a child class can redefine a parent class method.
* The actual method called is determined at runtime.

Why this program is used:

* To explain how the same method name behaves differently in parent and child classes.
* To show how Java supports dynamic behavior.

How this helps Java:

* It helps in creating flexible software designs.
* It supports abstraction and inheritance.
* It makes code easier to extend without changing existing logic.

Program 2: Method Overriding Example

Code with comments on every line:

```java
class Animal {                                                   // Line 1: Declares a parent class named Animal
    void sound() {                                                // Line 2: Declares sound() method in Animal
        System.out.println("Animal makes a sound");             // Line 3: Prints a default message
    }                                                             // Line 4: Ends the sound() method
}

class Dog extends Animal {                                        // Line 5: Declares a child class Dog
    void sound() {                                                // Line 6: Overrides sound() in Dog
        System.out.println("Dog barks");                       // Line 7: Prints dog-specific behavior
    }                                                             // Line 8: Ends the overridden sound() method
}

class Cat extends Animal {                                        // Line 9: Declares another child class Cat
    void sound() {                                                // Line 10: Overrides sound() in Cat
        System.out.println("Cat meows");                       // Line 11: Prints cat-specific behavior
    }                                                             // Line 12: Ends the overridden sound() method
}

public class PolymorphismDemo2 {                                  // Line 13: Declares the main class
    public static void main(String[] args) {                      // Line 14: Declares the main method
        Animal a1 = new Animal();                                 // Line 15: Creates Animal object
        Animal a2 = new Dog();                                    // Line 16: Creates Dog object using Animal reference
        Animal a3 = new Cat();                                    // Line 17: Creates Cat object using Animal reference

        a1.sound();                                               // Line 18: Calls Animal's sound()
        a2.sound();                                               // Line 19: Calls Dog's overridden sound()
        a3.sound();                                               // Line 20: Calls Cat's overridden sound()
    }                                                             // Line 21: Ends the main method
}                                                                 // Line 22: Ends the class

```

Explanation of every line:

1. `class Animal {`
Declares the parent class.
2. `void sound() {`
Declares a method named `sound()`.
3. `System.out.println("Animal makes a sound");`
Prints the default behavior.
4. `}`
Ends the method.
5. `class Dog extends Animal {`
Declares a child class that inherits from Animal.
6. `void sound() {`
Re-declares `sound()` in the child class.
7. `System.out.println("Dog barks");`
Prints specialized behavior for Dog.
8. `}`
Ends the overridden method.
9. `class Cat extends Animal {`
Declares another child class.
10. `void sound() {`
Declares `sound()` again in the child class.
11. `System.out.println("Cat meows");`
Prints cat-specific behavior.
12. `}`
Ends the overridden method.
13. `public class PolymorphismDemo2 {`
Declares the public class containing the program.
14. `public static void main(String[] args) {`
Main method starts execution.
15. `Animal a1 = new Animal();`
Creates an Animal object.
16. `Animal a2 = new Dog();`
Creates a Dog object and stores it in Animal reference.
17. `Animal a3 = new Cat();`
Creates a Cat object and stores it in Animal reference.
18. `a1.sound();`
Calls Animal version.
19. `a2.sound();`
Calls Dog version at runtime.
20. `a3.sound();`
Calls Cat version at runtime.
21. `}`
Ends main method.
22. `}`
Ends class.

Pseudocode:
START
CREATE Animal class with sound()
CREATE Dog class overriding sound()
CREATE Cat class overriding sound()

```
CREATE a1 as Animal object
CREATE a2 as Animal reference to Dog object
CREATE a3 as Animal reference to Cat object

CALL a1.sound()
CALL a2.sound()
CALL a3.sound()

```

END

Output:
Animal makes a sound
Dog barks
Cat meows

Summary:

* This program demonstrates runtime polymorphism.
* The same method name `sound()` behaves differently depending on the actual object.
* This is also known as dynamic method dispatch.

---

## 6. Scenario 3: Parent Reference Can Hold Child Object

Headline:
Dynamic Behavior Through Parent Reference and Child Object

Definition of this program:

* This program shows that a parent class reference can point to a child class object.
* The JVM executes the overridden child method at runtime.

Why this program is used:

* To explain the real mechanism behind runtime polymorphism.
* To show how object references are flexible in Java.

How this helps Java:

* It helps in writing reusable code for different child classes.
* It allows one method to work with many subclasses.
* It makes system design more scalable.

Program 3: Parent Reference Example

Code with comments on every line:

```java
class Shape {                                                   // Line 1: Declares parent class Shape
    void draw() {                                                // Line 2: Declares draw() method
        System.out.println("Drawing a shape");                 // Line 3: Prints generic shape message
    }                                                             // Line 4: Ends draw() method
}

class Circle extends Shape {                                     // Line 5: Declares child class Circle
    void draw() {                                                // Line 6: Overrides draw() method
        System.out.println("Drawing a circle");                // Line 7: Prints circle-specific message
    }                                                             // Line 8: Ends overridden draw() method
}

class Rectangle extends Shape {                                  // Line 9: Declares child class Rectangle
    void draw() {                                                // Line 10: Overrides draw() method
        System.out.println("Drawing a rectangle");             // Line 11: Prints rectangle-specific message
    }                                                             // Line 12: Ends overridden draw() method
}

public class PolymorphismDemo3 {                                 // Line 13: Declares public class
    public static void main(String[] args) {                     // Line 14: Declares main method
        Shape s1 = new Circle();                                 // Line 15: Assigns Circle object to Shape reference
        Shape s2 = new Rectangle();                              // Line 16: Assigns Rectangle object to Shape reference

        s1.draw();                                               // Line 17: Calls Circle's draw()
        s2.draw();                                               // Line 18: Calls Rectangle's draw()
    }                                                             // Line 19: Ends main method
}                                                                 // Line 20: Ends class

```

Explanation of every line:

1. `class Shape {`
Declares the base class.
2. `void draw() {`
Declares the method with generic behavior.
3. `System.out.println("Drawing a shape");`
Prints a general message.
4. `}`
Ends the method.
5. `class Circle extends Shape {`
Declares a child class.
6. `void draw() {`
Overrides the parent method.
7. `System.out.println("Drawing a circle");`
Prints circle-specific output.
8. `}`
Ends overridden method.
9. `class Rectangle extends Shape {`
Declares another child class.
10. `void draw() {`
Overrides the method again.
11. `System.out.println("Drawing a rectangle");`
Prints rectangle-specific output.
12. `}`
Ends the method.
13. `public class PolymorphismDemo3 {`
Declares the main class.
14. `public static void main(String[] args) {`
Starts execution of the program.
15. `Shape s1 = new Circle();`
Stores a child object in a parent reference.
16. `Shape s2 = new Rectangle();`
Stores another child object in a parent reference.
17. `s1.draw();`
Calls circle-specific behavior.
18. `s2.draw();`
Calls rectangle-specific behavior.
19. `}`
Ends the main method.
20. `}`
Ends the class.

Pseudocode:
START
CREATE Shape class with draw()
CREATE Circle class overriding draw()
CREATE Rectangle class overriding draw()

```
CREATE s1 as Shape reference to Circle object
CREATE s2 as Shape reference to Rectangle object

CALL s1.draw()
CALL s2.draw()

```

END

Output:
Drawing a circle
Drawing a rectangle

Summary:

* This program proves that one reference type can represent multiple forms of objects.
* This is a very important concept in Java polymorphism.

---

### 7. Difference Between Overloading and Overriding

Method Overloading:

* Same method name
* Different parameter list
* Happens within same class
* Compile-time polymorphism
* Example: add(int, int), add(double, double)

Method Overriding:

* Same method name and signature
* Happens in parent and child class
* Runtime polymorphism
* Example: Animal.sound() and Dog.sound()

---

### 8. Advantages of Polymorphism

* Makes code flexible
* Reduces duplication of code
* Improves maintainability
* Allows easy extension of programs
* Supports abstraction and inheritance
* Helps in writing clean object-oriented design

---

### 9. Disadvantages / Things to Remember

* Too much polymorphism can make code harder to read if not properly designed.
* Runtime polymorphism may require a clear understanding of inheritance.
* Developers must use proper access modifiers and method signatures.

---

### 10. Important Interview Questions on Polymorphism

1. What is polymorphism in Java?
2. What is the difference between method overloading and overriding?
3. What is compile-time polymorphism?
4. What is runtime polymorphism?
5. What is dynamic method dispatch?
6. Why is polymorphism useful in OOP?
7. Can a parent reference hold a child object?
8. What happens if a method is overridden in a subclass?

---

### 11. Final Conclusion

Polymorphism is a powerful concept in Java that allows one thing to take many forms.
It helps Java programs become more flexible, scalable, reusable, and object-oriented.
The two main forms of polymorphism are:

* Compile-time polymorphism through method overloading
* Runtime polymorphism through method overriding

In simple words:

* Polymorphism means one method or object can behave differently in different situations.
* It is one of the most important ideas in Java programming.
