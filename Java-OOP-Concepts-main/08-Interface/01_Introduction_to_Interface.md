# Java Interfaces: Single and Multiple Inheritance

---

## 1) Program Goal & Overview

This set of programs demonstrates the concept of **Interfaces** in Java.

An interface acts as a **Service Requirement Specification (SRS)** or a contract. It defines *what* a class should do, without specifying *how* it should do it. This promotes architectural standardization. Furthermore, since Java does not support multiple inheritance with classes to avoid ambiguity, interfaces provide a clean mechanism to achieve **multiple inheritance** by allowing a single concrete class to implement multiple interfaces simultaneously.

---

## 2) Definitions

### Interface

A reference type in Java that is a collection of abstract methods. It establishes a contract that any implementing class must fulfill.

### Multiple Inheritance

A feature where a class can inherit behaviors and features from more than one parent type. Java implements this solely through interfaces.

### Standardization (SRS)

Using interfaces to create consistent method signatures across completely different implementation classes, ensuring code uniformity and predictability across a development team.

---

## 3) Program 1: Basic Calculator Without Interfaces

This basic example shows a standard concrete class handling its own operations without adhering to an external contract or architectural rule.

### Complete Java Program

```java
class Calculator {
    public void add() {
        int a = 10;
        int b = 20;
        System.out.println("Addition Result: " + (a + b));
    }
    
    public void sub() {
        int a = 20;
        int b = 10;
        System.out.println("Substraction Result: " + (a - b));
    }
}

class Demo {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        c.add();
        c.sub();
    }
}

```

### Output

```text
Addition Result: 30
Substraction Result: 10

```

### Why the output appears this way

* **Execution Path**: The virtual machine triggers execution from the `main` method of the `Demo` class.
* **Instance Space**: An isolated `Calculator` object is allocated in memory.
* **Method Invocation**: Calling `c.add()` and `c.sub()` directly initializes localized primitives and streams the calculated arithmetic results straight to the console.

---

## 4) Program 2: Basic Calculator Using a Single Interface

This example demonstrates code standardization. A single `Calculator` interface sets the standard, and three separate classes (`Calci1`, `Calci2`, `Calci3`) implement it in their own unique ways (static values, separate assignment, and dynamic user console input).

### Complete Java Program

```java
import java.util.Scanner;

// Architectural specification for all calculator modules
interface Calculator {
    void add();
    void sub();
}

// Implementation Option 1: Direct inline initialization
class Calci1 implements Calculator {
    @Override
    public void add() {
        int a = 10;
        int b = 20;
        int sum = a + b;
        System.out.println("Sum: " + sum);
    }

    @Override
    public void sub() {
        int a = 10;
        int b = 20;
        int sub = b - a;
        System.out.println("Sub: " + sub);
    }
}

// Implementation Option 2: Declaration separated from assignment
class Calci2 implements Calculator {
    @Override
    public void add() {
        int a;
        int b;
        a = 10;
        b = 20;
        int sum = a + b;
        System.out.println("Sum: " + sum);
    }

    @Override
    public void sub() {
        int a;
        int b;
        a = 10;
        b = 20;
        int sub = b - a;
        System.out.println("Sub: " + sub);
    }
}

// Implementation Option 3: Dynamic interactive keyboard entry
class Calci3 implements Calculator {
    @Override
    public void add() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter first number: ");
        int a = sc.nextInt();
        System.out.print("Please enter second number: ");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("Sum: " + sum);
    }

    @Override
    public void sub() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter first number: ");
        int a = sc.nextInt();
        System.out.print("Please enter second number: ");
        int b = sc.nextInt();
        int sub = a - b;
        System.out.println("Substraction: " + sub);
    }
}

public class BasicCalculator {
    public static void main(String[] args) {
        // Executing standard static implementations
        Calci1 c1 = new Calci1();
        c1.add();
        c1.sub();

        Calci2 c2 = new Calci2();
        c2.add();
        c2.sub();

        // Executing dynamic interactive implementation
        Calci3 c3 = new Calci3();
        c3.add();
        c3.sub();
    }
}

```

### Pseudocode

```text
BEGIN
    Define Interface Calculator
        Declare abstract routines add() and sub()
    END

    Define Class Calci1 implementing Calculator
        Provide inline calculations for static values (10, 20)
    END

    Define Class Calci2 implementing Calculator
        Provide separate declaration/assignment blocks for static values
    END

    Define Class Calci3 implementing Calculator
        Instantiate Scanner console capture
        Extract inputs, evaluate formulas, print outputs
    END

    In main runner context:
        Instantiate c1, c2, c3 sequentially
        Trigger respective structural implementations
END

```

---

## 5) Program 3: Achieving Multiple Inheritance via Two Interfaces

This program proves that a single class can implement multiple separate interfaces at once. If there is a duplicate method signature across interfaces (such as `sub()`), the subclass implements it once, elegantly avoiding the compiler collisions typical of class-based multiple inheritance.

### Complete Java Program

```java
interface Calci1 {
    void add();
    void sub();
}

interface Calci2 {
    void mul();
    void sub();
}

// Concrete subclass successfully implementing multiple distinct interfaces
class Calculator implements Calci1, Calci2 {
    @Override
    public void add() {
        int a = 10;
        int b = 20;
        int sum = a + b;
        System.out.println("Sum: " + sum);
    }

    @Override
    public void sub() {
        int a = 10;
        int b = 20;
        int sub = b - a;
        System.out.println("Sub: " + sub);
    }

    @Override
    public void mul() {
        int a = 10;
        int b = 20;
        int mul = a * b;
        System.out.println("Mul: " + mul);
    }

    // Additional standalone routine unique to this concrete class
    public void div() {
        int a = 10;
        int b = 20;
        int div = b / a;
        System.out.println("Div: " + div);
    }
}

public class App {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        c1.add();
        c1.sub();
        c1.mul();
        c1.div();
    }
}

```

### Output

```text
Sum: 30
Sub: 10
Mul: 200
Div: 2

```

---

## 6) Architectural Advantages of Interfaces

* **Decoupling**: Separates system contracts from runtime behavioral execution rules.
* **Polymorphism**: Allows a single structural signature type to safely reference multiple target implementations.
* **No Ambiguity**: Resolves diamond inheritance issues by standardizing overlapping declarations to a single implementation block.

---

## 7) One-line takeaway

Interfaces establish uniform code standards and act as the sole mechanism for achieving safe multiple inheritance in Java.
