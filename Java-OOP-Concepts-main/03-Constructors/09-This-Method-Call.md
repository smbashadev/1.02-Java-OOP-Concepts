# this Method Call in Java

## Definition

A **this method call** means using the `this` keyword to call another method of the same class from within a method or constructor.

The `this` keyword refers to the **current object**, and `this.methodName()` explicitly invokes a method belonging to the same object.

---

## Why this Method Call is Important

* Improves code readability.
* Clearly indicates that the method belongs to the current object.
* Helps organize code by separating functionality into multiple methods.
* Makes programs easier to understand and maintain.

---

## Characteristics of this Method Call

* Uses `this.methodName()`.
* Refers to the current object.
* Can call any non-static method of the same class.
* Improves code clarity.
* Optional in many cases, but recommended for readability.

---

# Program 1

## Headline

Using this to Call Another Method of the Same Class

### Why this Program is Used

This program demonstrates how a method can invoke another method using `this`.

### Java Program with Comments on Each Step

```java
class Student {

    String name;

    int age;

    Student(String name, int age) {

        this.name = name;

        this.age = age;
    }

    void showInfo() {

        this.display();
    }

    void display() {

        System.out.println("Name: " + this.name);

        System.out.println("Age: " + this.age);
    }
}

public class Main {

    public static void main(String[] args) {

        Student s1 = new Student("Alice", 20);

        s1.showInfo();
    }
}
```

### Output

```text
Name: Alice
Age: 20
```

### Pseudocode

```text
START

CREATE Student class

DECLARE name

DECLARE age

DEFINE constructor

SET name

SET age

DEFINE showInfo()

CALL this.display()

DEFINE display()

PRINT name

PRINT age

CREATE object

CALL showInfo()

END
```

### Code Explanation

* `this.display()` calls another method of the current object.
* `showInfo()` delegates work to `display()`.
* `this.name` and `this.age` access instance variables.
* The current object executes both methods.

### Summary

This program demonstrates how `this.methodName()` invokes another method of the same object.

---

# Program 2

## Headline

Using this to Organize Method Calls

### Why this Program is Used

This program demonstrates how one method can call another method using `this` for better organization.

### Java Program with Comments on Each Step

```java
class Calculator {

    int a;

    int b;

    Calculator(int a, int b) {

        this.a = a;

        this.b = b;
    }

    void add() {

        this.printSum();
    }

    void printSum() {

        System.out.println("Sum = " + (this.a + this.b));
    }
}

public class Main {

    public static void main(String[] args) {

        Calculator c1 = new Calculator(5, 3);

        c1.add();
    }
}
```

### Output

```text
Sum = 8
```

### Pseudocode

```text
START

CREATE Calculator class

DECLARE a

DECLARE b

DEFINE constructor

SET this.a

SET this.b

DEFINE add()

CALL this.printSum()

DEFINE printSum()

PRINT sum

CREATE object

CALL add()

END
```

### Explanation

* `add()` delegates its work to `printSum()`.
* `this.printSum()` clearly indicates that the method belongs to the current object.
* Instance variables are accessed using `this.a` and `this.b`.

### Summary

This program demonstrates how `this` improves readability when methods call one another.

---

# Program 3

## Headline

Calling Multiple Methods Using this

### Why this Program is Used

This program demonstrates that one method can invoke multiple methods of the same object using `this`.

### Java Program with Comments on Each Step

```java
class Employee {

    String name;

    int id;

    Employee(String name, int id) {

        this.name = name;

        this.id = id;
    }

    void show() {

        this.printName();

        this.printId();
    }

    void printName() {

        System.out.println("Name: " + this.name);
    }

    void printId() {

        System.out.println("ID: " + this.id);
    }
}

public class Main {

    public static void main(String[] args) {

        Employee e1 = new Employee("Rahul", 101);

        e1.show();
    }
}
```

### Output

```text
Name: Rahul
ID: 101
```

### Explanation

* `this.printName()` calls the first method.
* `this.printId()` calls the second method.
* Both methods operate on the same object.
* The `show()` method coordinates multiple actions.

### Summary

This program demonstrates multiple method calls using the `this` keyword.

---

# Advantages of this Method Call

1. Improves readability.
2. Makes code more organized.
3. Clarifies method ownership.
4. Supports modular programming.
5. Reduces confusion in large classes.
6. Helps beginners understand object-oriented programming.

---

# Important Interview Points

* `this` refers to the current object.
* `this.methodName()` calls a method of the same object.
* Static methods cannot use `this`.
* Using `this` is optional for method calls but improves readability.
* `this()` and `this.method()` are different:

  * `this()` calls another constructor.
  * `this.method()` calls another method.

---

# Difference Between this() and this.method()

| this()                    | this.method()                        |
| ------------------------- | ------------------------------------ |
| Calls another constructor | Calls another method                 |
| Used only in constructors | Used inside methods and constructors |
| Must be first statement   | Can appear anywhere                  |
| Constructor chaining      | Method invocation                    |

---

# Final Revision Notes

```text
this Method Call

- Refers to current object
- Calls another method of same class
- Uses syntax: this.methodName()
- Improves readability
- Makes code organized
- Supports modular design
```

---

## One Line Summary

A this method call means invoking another method of the current object using `this.methodName()`.
